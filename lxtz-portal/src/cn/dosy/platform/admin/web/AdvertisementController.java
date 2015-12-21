package cn.dosy.platform.admin.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import jxl.Sheet;
import jxl.Workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import cn.dosy.platform.admin.domain.AdvImg;
import cn.dosy.platform.admin.domain.AdvMail;
import cn.dosy.platform.admin.domain.AdvShortMessage;
import cn.dosy.platform.admin.domain.AdvVideo;
import cn.dosy.platform.admin.service.IAdvImgManager;
import cn.dosy.platform.admin.service.IAdvMailManager;
import cn.dosy.platform.admin.service.IAdvMusicManager;
import cn.dosy.platform.admin.service.IAdvShortMessageManager;
import cn.dosy.platform.admin.service.IAdvVideoManager;
import cn.dosy.platform.config.domain.SimpleSms;
import cn.dosy.platform.config.utils.JavaMailUtil;
import cn.dosy.platform.config.utils.SmsUtil;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.core.web.vo.SelectItem;
import cn.dosy.platform.customer.domain.Student;
import cn.dosy.platform.customer.service.IStudentManager;

@Controller
@RequestMapping(value = "/admin/advertisement")
public class AdvertisementController extends BaseController<Auditable>{

	@Resource(name = "advMailManager")
	private IAdvMailManager advMailManager;
	
	@Resource(name = "advShortMessageManager")
	private IAdvShortMessageManager advShortMessageManager;
	
	@Resource(name = "advVideoManager")
	private IAdvVideoManager advVideoManager;
	
	@Resource(name = "advImgManager")
	private IAdvImgManager advImgManager;
	
	@Resource(name = "advMusicManager")
	private IAdvMusicManager advMusicManager;
	
	@Resource(name = "studentManager")
	protected IStudentManager studentManager;
	
	
	@RequestMapping(value = "advMail", method = RequestMethod.GET)
	public String list_advMail(Model model, AdvMail advMail, final SessionStatus status, Page<AdvMail> pageRequest) {
		
		if (advMail == null) {
			advMail = new AdvMail();
		}
		pageRequest.setVo(advMail);
		Page<AdvMail> advMails = advMailManager.query(pageRequest);
		model.addAttribute("page", advMails);
		status.setComplete();
		
		return getRelativePath("/list_advMail");
	}
	
	@RequestMapping(value = "advMail/add")
	public String add_advMail(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_advMail");
	}
	
	@RequestMapping(value = "advMail/save")
	public String save_advMail(AdvMail advMail, Model model, MultipartFile file) {
		if (!(file.getOriginalFilename().endsWith("xls") || file.getOriginalFilename().endsWith("xlsx")) ) {
			model.addAttribute("result", "请导入excel格式的文件");
			return getRelativePath("/add_advMail");
		}
		
		int total = 0;									//录入总邮件数
		Set<String> send = new HashSet<String>();		//有效邮件总数
		try {
			Workbook book = Workbook.getWorkbook(file.getInputStream());
			Sheet sheet = book.getSheet(0);
			if (sheet.getRows() < 1){
				model.addAttribute("result", "没有可用数据");
				return getRelativePath("/add_advMail");
			}
			total = sheet.getRows();
			
			String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";  
			Pattern regex = Pattern.compile(check);  
			for (int i=0; i < total; i++){
				String mail = sheet.getCell(0, i).getContents();
				Matcher matcher = regex.matcher(mail); 
				if (matcher.matches()) {
					send.add(mail);
					System.out.println(mail);
				}
			}
			String content = "<div style=\"background-color: #d0d0d0;padding: 40px;text-align: center;width=100%;\">" + 
					"<div style=\"padding:30px;background-color: #ffffff;width:500px;margin: 0 auto;text-align: left;line-height: 1.5;word-wrap: break-word;word-break: break-all;-webkit-border-radius: 10px;-moz-border-radius: 10px;border-radius: 10px;\">" +  
						"您好!<br/><br/>" + advMail.getContent() + "<br/><br/> " +
						"<div style=\"text-align: right;\">Thanks<br/>朗鑫门户</div></div></div>";
			JavaMailUtil.setHtmlMail(advMail.getContent(), content, send);
			
			advMail.setNum(send.size());				//保存历史发送记录
			advMailManager.add(advMail);
			
			model.addAttribute("result", "发送成功，本次录入邮箱" + total + "个,有效发送" + send.size() + "个");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("result", "未知异常。");
		}
		return getRelativePath("/add_advMail");
	}
	
	@RequestMapping(value = "advMail/del/{id}")
	public String del_advMail(@PathVariable("id")String id) {
		if (StringUtils.isNotBlank(id)) {
			advMailManager.del(id);
		}
		return CONTROLLER_REDIRECT + "/admin/advertisement/advMail";
	}
	
	@RequestMapping(value = "advShortMessage",method = RequestMethod.GET)
	public String list_advShortMessage(Model model, AdvShortMessage advShortMessage, final SessionStatus status, Page<AdvShortMessage> pageRequest) {
		status.setComplete();
		
		if (advShortMessage == null) {
			advShortMessage = new AdvShortMessage();
		}
		pageRequest.setVo(advShortMessage);
		Page<AdvShortMessage> advShortMessages = advShortMessageManager.query(pageRequest);
		
		SimpleSms sms = SmsUtil.getNum();
		
		model.addAttribute("sms", sms);
		model.addAttribute("page", advShortMessages);
		return getRelativePath("/list_advShortMessage");
	}
	
	@RequestMapping(value = "advShortMessage/add")
	public String add_advShortMessage(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_advShortMessage");
	}
	
	@RequestMapping(value = "getStudentPhone", method = RequestMethod.GET) 
	@ResponseBody
	public List<SelectItem> getStudentPhone() {
		List<SelectItem> item = new ArrayList<SelectItem>();
		
		List<Student> students = studentManager.getStudentPhone();
		if (CollectionUtils.isNotEmpty(students)) {
			for (Student s:students) {
				String name = s.getName() == null ? "" : s.getName();
				String universityName =  s.getUniversityName() == null ? "" : s.getUniversityName();
				item.add(new SelectItem(s.getPhone(), universityName + "(" + name + ")" + s.getPhone()));
			}
		}
		return item;
	}
	
	@RequestMapping(value = "advShortMessage/save")
	public String save_advShortMessage(String multiBoxValue, String content) {
		Integer num = 0;
		
		if (StringUtils.isNotBlank(multiBoxValue)) {
			String[] phones = multiBoxValue.split(",");
			num = phones.length;
		}
		
		AdvShortMessage advShortMessage = new AdvShortMessage();
		advShortMessage.setNum(num);
		advShortMessage.setContent(content);
		advShortMessageManager.add(advShortMessage);
		
		return CONTROLLER_REDIRECT + "/admin/advertisement/advShortMessage";
	}
	
	@RequestMapping(value = "advShortMessage/del/{id}")
	public String del_advShortMessage(@PathVariable("id")String id) {
		if (StringUtils.isNotBlank(id)) {
			advShortMessageManager.del(id);
		}
		return CONTROLLER_REDIRECT + "/admin/advertisement/advShortMessage";
	}
	
	@RequestMapping(value = "advVideo",method = RequestMethod.GET)
	public String list_advVideo(final SessionStatus status, Model model) {
		List<AdvVideo> advVideos = advVideoManager.queryAll();
		if (CollectionUtils.isNotEmpty(advVideos)) {
			model.addAttribute("entity", advVideos.get(0));
		}
		status.setComplete();
		return getRelativePath("/list_advVideo");
	}
	
	@RequestMapping(value = "advVideo/update", method = RequestMethod.GET)
	public String update_advVideo(final SessionStatus status, Model model) {
		List<AdvVideo> advVideos = advVideoManager.queryAll();
		if (CollectionUtils.isNotEmpty(advVideos)) {
			model.addAttribute("entity", advVideos.get(0));
		}
		status.setComplete();
		return getRelativePath("/update_advVideo");
	}
	
	@RequestMapping(value = "advVideo/update", method = RequestMethod.POST)
	public String update_advVideo(String content, HttpServletRequest request) {
		AdvVideo advVideo = null;
		
		List<AdvVideo> advVideos = advVideoManager.queryAll();
		if (CollectionUtils.isNotEmpty(advVideos)) {
			advVideo = advVideos.get(0);
		}
		if (advVideo != null) {
			if (StringUtils.isNotBlank(content)) {
				System.out.println(content);
				int width = content.indexOf("width");
				if (width != -1) {
					String widthStr1 = content.substring(0, width+7);
					String widthStr2 = content.substring(width+7, content.length());
					widthStr2 = widthStr2.substring(widthStr2.indexOf("\""), widthStr2.length());
					content = widthStr1 + 300 + widthStr2;
				}
				System.out.println(content);
				int height = content.indexOf("height");
				if (height != -1) {
					String heightStr1 = content.substring(0, height+8);
					String heightStr2 = content.substring(height+8, content.length());
					heightStr2 = heightStr2.substring(heightStr2.indexOf("\""), heightStr2.length());
					content = heightStr1 + 284 + heightStr2;
				}
				System.out.println(content);
			}
			advVideo.setContent(content.trim());
			advVideoManager.update(advVideo);
			request.getServletContext().setAttribute("portalAdvVideo", advVideo);
		}
		return CONTROLLER_REDIRECT + "/admin/advertisement/advVideo";
	}
	
	@RequestMapping(value = "advImg",method = RequestMethod.GET)
	public String list_advImg(Model model, final SessionStatus status) {
		List<AdvImg> advImgS = advImgManager.queryAll();
		model.addAttribute("advImg", advImgS);
		status.setComplete();
		return getRelativePath("/list_advImg");
	}
	
	@RequestMapping(value = "advImg/add", method = RequestMethod.GET)
	public String add_advImg(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_advImg");
	}
	
	@RequestMapping(value = "advImg/save", method = RequestMethod.POST)
	public String save_advImg(MultipartFile file, Integer located, Model model) {
		if (!file.getOriginalFilename().endsWith(".jpg") &&
				!file.getOriginalFilename().endsWith(".jpeg") &&
				!file.getOriginalFilename().endsWith(".gif") &&
				!file.getOriginalFilename().endsWith(".png") ) {
			model.addAttribute("result", "图片文件类型不符合，请上传jpg,jpeg,gif,png类型图片文件");
			return getRelativePath("/add_advImg");
		}
		if (file.getSize() > 1024 * 1024 * 10) {
			model.addAttribute("result", "图片文件大于10M,请重新选择");
			return getRelativePath("/add_advImg");
		}
		
		try {
			AdvImg advImg = new AdvImg();
			advImg.setImgData(file.getBytes());
			advImg.setImgName(file.getOriginalFilename());
			advImg.setLocated(located);
			advImgManager.add(advImg);
			
			String resourcePath = ApplicationContext.getApplicationPath();
			String type = FileUtils.getSuffix(file.getOriginalFilename());
			FileUtils.SaveFileFromInputStream(new ByteArrayInputStream(file.getBytes()),
					resourcePath + "/resources/img/portal/adv", "p_img_" + located + "." + type);
		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute("result", "上传成功");
		return getRelativePath("/add_advImg");
	}
	
	@RequestMapping(value = "advImg/del/{id}", method = RequestMethod.GET)
	public String del_advImg(final SessionStatus status, @PathVariable("id")String id) {
		AdvImg advImg = advImgManager.findById(id);
		if (advImg != null) {
			advImgManager.del(id);
			//删除项目中的图片
			String resourcePath = ApplicationContext.getApplicationPath();
			String type = FileUtils.getSuffix(advImg.getImgName());
			FileUtils.deleteFile(resourcePath + "/resources/img/portal/adv", "p_img_" + advImg.getLocated() + "." + type);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/advertisement/advImg";
	}
	
	@RequestMapping(value = "advMusic",method = RequestMethod.GET)
	public String list_advMusic(Model model, final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_advMusic");
	}
	
	@RequestMapping(value = "advMusic/save", method = RequestMethod.POST)
	public String save_advMusic(MultipartFile file, Model model) {
		if (!file.getOriginalFilename().endsWith(".mp3")) {
			model.addAttribute("result", "音乐文件类型不符合，请上传mp3音乐文件");
			return getRelativePath("/add_advMusic");
		}
		if (file.getSize() > 1024 * 1024 * 10) {
			model.addAttribute("result", "音乐文件大于10M,请重新选择");
			return getRelativePath("/add_advMusic");
		}
		
		try {
			String resourcePath = ApplicationContext.getApplicationPath();
			FileUtils.SaveFileFromInputStream(new ByteArrayInputStream(file.getBytes()),
					resourcePath + "/resources/media", "p_music.mp3");
		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute("result", "上传成功");
		return getRelativePath("/add_advMusic");
	}
	
}
