package cn.dosy.platform.portal.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.admin.domain.MessageAttachment;
import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.admin.service.IMessageAttachmentManager;
import cn.dosy.platform.admin.service.IMindChickenSoupManager;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;

@Controller
@RequestMapping(value = "portal/mindChickenSoup")
public class MindChickenSoupController extends BaseController<MindChickenSoup>{

	@Resource(name = "mindChickenSoupManager")
	private IMindChickenSoupManager mindChickenSoupManager;
	
	@Resource(name = "messageAttachmentManager")
	private IMessageAttachmentManager messageAttachmentManager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String mindChickenSoup(Model model, String search, final SessionStatus status, Page<MindChickenSoup> pageRequest) {
		status.setComplete();
		MindChickenSoup mindChickenSoup = new MindChickenSoup();
		mindChickenSoup.setIsHidden(false);
		if (StringUtils.isNotBlank(search)) {
			mindChickenSoup.setTitle(search);
			mindChickenSoup.setContent(search);
		}
		pageRequest.setVo(mindChickenSoup);
		Page<MindChickenSoup> page = mindChickenSoupManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_mindChickenSoup");
	}
	
	@RequestMapping(value = "view/{id}")
	public String view(@PathVariable("id")String id, Model model, final SessionStatus status) {
		status.setComplete();
		MindChickenSoup entity = mindChickenSoupManager.findById(id);
		
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(entity.getId());
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				try {
					InputStream is = new ByteArrayInputStream(m.getFileData());
					FileUtils.SaveFileFromInputStream2(is, ATTA_FILE_PATH,
							m.getFileName());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		model.addAttribute("entity", entity);
		return getRelativePath("/view_mindChickenSoup");
	}
}
