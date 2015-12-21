package cn.dosy.platform.portal.web;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dosy.platform.admin.domain.AdvVideo;
import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.admin.domain.Financial;
import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.admin.domain.Notice;
import cn.dosy.platform.admin.service.IAdvVideoManager;
import cn.dosy.platform.admin.service.IExampleManager;
import cn.dosy.platform.admin.service.IFinancialManager;
import cn.dosy.platform.admin.service.IInvestmentManager;
import cn.dosy.platform.admin.service.IMindChickenSoupManager;
import cn.dosy.platform.admin.service.INoticeManager;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Comment;
import cn.dosy.platform.customer.domain.MerchantJob;
import cn.dosy.platform.customer.domain.StudentJob;
import cn.dosy.platform.customer.service.ICommentManager;
import cn.dosy.platform.customer.service.IMerchantJobManager;
import cn.dosy.platform.customer.service.IStudentJobManager;

@Controller
public class IndexController extends BaseController<Auditable>{

	@Resource(name = "noticeManager")
	private INoticeManager noticeManager;
	
	@Resource(name = "advVideoManager")
	private IAdvVideoManager advVideoManager;
	
	@Resource(name = "financialManager")
	private IFinancialManager financialManager;
	
	@Resource(name = "merchantJobManager")
	protected IMerchantJobManager merchantJobManager;
	
	@Resource(name = "studentJobManager")
	protected IStudentJobManager studentJobManager;
	
	@Resource(name = "commentManager")
	protected ICommentManager commentManager;
	
	@Resource(name = "mindChickenSoupManager")
	private IMindChickenSoupManager mindChickenSoupManager;
	
	@Resource(name = "exampleManager")
	private IExampleManager exampleManager;
	
	@Resource(name = "investmentManager")
	private IInvestmentManager investmentManager;
	
	
	@RequestMapping(value = "/")
	public String index() {
		
		
		return getRelativePath("/index");
	}
	
	@RequestMapping(value="getNotice", method = RequestMethod.GET)
	@ResponseBody
	public List<Notice> getNotice() {
		Notice notice = new Notice();
		Page<Notice> page = new Page<Notice>();
		page.setVo(notice);
		Page<Notice> notices = noticeManager.query(page);
		return notices.getContent();
	}
	
	@RequestMapping(value="getAdvVideo", method = RequestMethod.GET)
	@ResponseBody
	public AdvVideo getAdvVideo() {
		List<AdvVideo> advVideos = advVideoManager.queryAll();
		if (CollectionUtils.isNotEmpty(advVideos)) {
			return advVideos.get(0);
		} 
		return null;
	}
	
	@RequestMapping(value = "getFinancial", method = RequestMethod.GET)
	@ResponseBody
	public List<Financial> financial() {
		Financial financial = new Financial();
		financial.setIsHidden(false);
		financial.setIsHot(null);
		Page<Financial> page = new Page<Financial>();
		page.setPageSize(3);
		page.setVo(financial);
		Page<Financial> financials = financialManager.query(page);
		return financials.getContent();
	}
	
	@RequestMapping(value = "getMerchantJob", method = RequestMethod.GET)
	@ResponseBody
	public List<MerchantJob> getMerchantJob() {
		MerchantJob merchantJob = new MerchantJob();
		Page<MerchantJob> page = new Page<MerchantJob>();
		page.setPageSize(6);
		page.setVo(merchantJob);
		Page<MerchantJob> merchantJobs = merchantJobManager.query(page);
		return merchantJobs.getContent();
	}
	
	@RequestMapping(value = "getStudentJob", method = RequestMethod.GET)
	@ResponseBody
	public List<StudentJob> getStudentJob() {
		StudentJob studentJob = new StudentJob();
		Page<StudentJob> page = new Page<StudentJob>();
		page.setPageSize(6);
		page.setVo(studentJob);
		Page<StudentJob> studentJobs = studentJobManager.query(page);
		return studentJobs.getContent();
	}
	
	@RequestMapping(value = "getComment", method = RequestMethod.GET)
	@ResponseBody
	public List<Comment> getComment() {
		Comment comment = new Comment();
		Page<Comment> page = new Page<Comment>();
		page.setVo(comment);
		Page<Comment> comments = commentManager.query(page);
		if (comments != null) {
			for (Comment c:comments.getContent()) {
				c.setIconsName(c.getStudent().getIconsName());
				if (!"person_male.gif".equalsIgnoreCase(c.getStudent().getIconsName())) {
					try {
						String resourcePath = ApplicationContext.getApplicationPath();
						FileUtils.SaveFileFromInputStream(new ByteArrayInputStream(c.getStudent().getIconsPicture()),
								resourcePath + "/resources/img/portal/icons", c.getStudent().getIconsName());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return comments.getContent();
	}
	
	@RequestMapping(value = "getMindChickenSoup", method = RequestMethod.GET)
	@ResponseBody
	public List<MindChickenSoup> getMindChickenSoup() {
		MindChickenSoup mindChickenSoup = new MindChickenSoup();
		mindChickenSoup.setIsHot(null);
		Page<MindChickenSoup> page = new Page<MindChickenSoup>();
		page.setVo(mindChickenSoup);
		Page<MindChickenSoup> mindChickenSoups = mindChickenSoupManager.query(page);
		return mindChickenSoups.getContent();
	}
	
	@RequestMapping(value = "getExample", method = RequestMethod.GET)
	@ResponseBody
	public List<Example> getExample() {
		Example example = new Example();
		example.setIsHidden(null);
		Page<Example> page = new Page<Example>();
		page.setVo(example);
		page.setPageSize(4);
		Page<Example> examples = exampleManager.query(page);
		return examples.getContent();
	}
	
	@RequestMapping(value = "getInvestment", method = RequestMethod.GET)
	@ResponseBody
	public List<Investment> getInvestment() {
		Investment investment = new Investment();
		investment.setIsHot(null);
		Page<Investment> page = new Page<Investment>();
		page.setVo(investment);
		page.setPageSize(4);
		Page<Investment> investments = investmentManager.query(page);
		return investments.getContent();
	}
	
}
