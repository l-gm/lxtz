package cn.dosy.platform.admin.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.admin.domain.Financial;
import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.admin.domain.MessageAttachment;
import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.admin.domain.Notice;
import cn.dosy.platform.admin.domain.UsingHelp;
import cn.dosy.platform.admin.service.IExampleManager;
import cn.dosy.platform.admin.service.IFinancialManager;
import cn.dosy.platform.admin.service.IInvestmentManager;
import cn.dosy.platform.admin.service.IMessageAttachmentManager;
import cn.dosy.platform.admin.service.IMindChickenSoupManager;
import cn.dosy.platform.admin.service.INoticeManager;
import cn.dosy.platform.admin.service.IUsingHelpManager;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.security.domain.User;

@Controller
@RequestMapping(value = "admin/article")
@SessionAttributes({"example", "notice", "financial", "investment", "mindChickenSoup", "usingHelp"})
public class ArticleController extends BaseController<Auditable> {
	
	@Resource(name = "noticeManager")
	private INoticeManager noticeManager;

	@Resource(name = "financialManager")
	private IFinancialManager financialManager;

	@Resource(name = "investmentManager")
	private IInvestmentManager investmentManager;

	@Resource(name = "mindChickenSoupManager")
	private IMindChickenSoupManager mindChickenSoupManager;

	@Resource(name = "exampleManager")
	private IExampleManager exampleManager;

	@Resource(name = "messageAttachmentManager")
	private IMessageAttachmentManager messageAttachmentManager;
	
	@Resource(name = "usingHelpManager")
	private IUsingHelpManager usingHelpManager;

	@RequestMapping(value = "notice", method = RequestMethod.GET)
	public String list_notice(Model model, String searchFilter,
			final SessionStatus status, Page<Notice> pageRequest) {
		status.setComplete();
		
		Notice notice = new Notice();
		notice.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			notice.setTitle(searchFilter);
		}
		pageRequest.setVo(notice);
		Page<Notice> page = noticeManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_notice");
	}

	@RequestMapping(value = "notice/add", method = RequestMethod.GET)
	public String add_notice(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_notice");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "notice/save", method = RequestMethod.POST)
	public String save_notice(Notice notice, HttpServletRequest request,
			final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		notice.setCreatedBy(user.getAccount());
		notice.setLastModifiedBy(user.getAccount());
		
		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (notice.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(notice.getId());
				messageAttachmentManager.add(m);
			}
		}
		
		noticeManager.add(notice);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/notice";
	}

	@RequestMapping(value = "notice/view/{id}", method = RequestMethod.GET)
	public String view_notice(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
		status.setComplete();
		Notice entity = noticeManager.findById(id);
		
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
		return getRelativePath("/view_notice");
	}

	@RequestMapping(value = "notice/del/{id}", method = RequestMethod.GET)
	public String del_notice(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		noticeManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/notice";
	}
	
	@RequestMapping(value = "notice/setHot/{id}", method = RequestMethod.GET)
	public String setHot_notice(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Notice entity = noticeManager.findById(id);
		if (entity != null) {
			if (entity.getIsHot() != null && entity.getIsHot()) {
				entity.setIsHot(false);
			} else {
				entity.setIsHot(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			noticeManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/notice";
	}
	
	@RequestMapping(value = "notice/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_notice(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Notice entity = noticeManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			noticeManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/notice";
	}
	
	@RequestMapping(value = "notice/update/{id}", method = RequestMethod.GET)
	public String update_notice(@PathVariable("id") String id, Model model) {
		Notice notice = noticeManager.findById(id);
		model.addAttribute("notice", notice);
		return getRelativePath("/update_notice");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "notice/update", method = RequestMethod.POST)
	public String update_notice(Notice newNotice, HttpServletRequest request, Model model) {
		Notice notice = (Notice)request.getSession().getAttribute("notice");
		if (notice != null) {
			notice.setTitle(newNotice.getTitle());
			notice.setSource(newNotice.getSource());
			notice.setContent(newNotice.getContent());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(notice.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!notice.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (notice.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(notice.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			noticeManager.update(notice);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/notice";
	}

	
	@RequestMapping(value = "financial", method = RequestMethod.GET)
	public String list_financial(Model model, String searchFilter,
			final SessionStatus status, Page<Financial> pageRequest) {
		status.setComplete();
		
		Financial financial = new Financial();
		financial.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			financial.setTitle(searchFilter);
		}
		pageRequest.setVo(financial);
		Page<Financial> page = financialManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_financial");
	}

	@RequestMapping(value = "financial/add", method = RequestMethod.GET)
	public String add_financial(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_financial");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "financial/save", method = RequestMethod.POST)
	public String save_Financial(Financial financial,
			HttpServletRequest request, final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		financial.setCreatedBy(user.getAccount());
		financial.setLastModifiedBy(user.getAccount());
		
		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (financial.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(financial.getId());
				messageAttachmentManager.add(m);
			}
		}
		
		financialManager.add(financial);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/financial";
	}

	@RequestMapping(value = "financial/view/{id}", method = RequestMethod.GET)
	public String view_financial(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
		status.setComplete();
		Financial entity = financialManager.findById(id);
		
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
		return getRelativePath("/view_financial");
	}

	@RequestMapping(value = "financial/del/{id}", method = RequestMethod.GET)
	public String del_financial(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		financialManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/financial";
	}
	@RequestMapping(value = "financial/setHot/{id}", method = RequestMethod.GET)
	public String setHot_financial(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Financial entity = financialManager.findById(id);
		if (entity != null) {
			if (entity.getIsHot() != null && entity.getIsHot()) {
				entity.setIsHot(false);
			} else {
				entity.setIsHot(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			financialManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/financial";
	}
	
	@RequestMapping(value = "financial/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_financial(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Financial entity = financialManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			financialManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/financial";
	}
	
	@RequestMapping(value = "financial/update/{id}", method = RequestMethod.GET)
	public String update_financial(@PathVariable("id") String id, Model model) {
		Financial financial = financialManager.findById(id);
		model.addAttribute("financial", financial);
		return getRelativePath("/update_financial");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "financial/update", method = RequestMethod.POST)
	public String update_financial(Financial newFinancial, HttpServletRequest request, Model model) {
		Financial financial = (Financial)request.getSession().getAttribute("financial");
		if (financial != null) {
			financial.setTitle(newFinancial.getTitle());
			financial.setSource(newFinancial.getSource());
			financial.setContent(newFinancial.getContent());
			financial.setFinancialAbstract(newFinancial.getFinancialAbstract());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(financial.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!financial.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (financial.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(financial.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			financialManager.update(financial);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/financial";
	}
	
	
	@RequestMapping(value = "investment", method = RequestMethod.GET)
	public String list_investment(Model model, String searchFilter,
			final SessionStatus status, Page<Investment> pageRequest) {
		status.setComplete();
		
		Investment investment = new Investment();
		investment.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			investment.setTitle(searchFilter);
		}
		pageRequest.setVo(investment);
		Page<Investment> page = investmentManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_investment");
	}

	@RequestMapping(value = "investment/add", method = RequestMethod.GET)
	public String add_investment(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_investment");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "investment/save", method = RequestMethod.POST)
	public String save_Investment(Investment investment,
			HttpServletRequest request, final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		investment.setCreatedBy(user.getAccount());
		investment.setLastModifiedBy(user.getAccount());
		
		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (investment.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(investment.getId());
				messageAttachmentManager.add(m);
			}
		}
		
		investmentManager.add(investment);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/investment";
	}

	@RequestMapping(value = "investment/view/{id}", method = RequestMethod.GET)
	public String view_investment(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
		status.setComplete();
		Investment entity = investmentManager.findById(id);
		
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
		return getRelativePath("/view_investment");
	}

	@RequestMapping(value = "investment/del/{id}", method = RequestMethod.GET)
	public String del_investment(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		investmentManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/investment";
	}
	@RequestMapping(value = "investment/setHot/{id}", method = RequestMethod.GET)
	public String setHot_investment(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Investment entity = investmentManager.findById(id);
		if (entity != null) {
			if (entity.getIsHot() != null && entity.getIsHot()) {
				entity.setIsHot(false);
			} else {
				entity.setIsHot(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			investmentManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/investment";
	}
	
	@RequestMapping(value = "investment/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_investment(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Investment entity = investmentManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			investmentManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/investment";
	}
	
	@RequestMapping(value = "investment/update/{id}", method = RequestMethod.GET)
	public String update_investment(@PathVariable("id") String id, Model model) {
		Investment investment = investmentManager.findById(id);
		model.addAttribute("investment", investment);
		return getRelativePath("/update_investment");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "investment/update", method = RequestMethod.POST)
	public String update_investment(Investment newInvestment, HttpServletRequest request, Model model) {
		Investment investment = (Investment)request.getSession().getAttribute("investment");
		if (investment != null) {
			investment.setTitle(newInvestment.getTitle());
			investment.setSource(newInvestment.getSource());
			investment.setContent(newInvestment.getContent());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(investment.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!investment.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (investment.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(investment.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			investmentManager.update(investment);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/investment";
	}
	

	@RequestMapping(value = "mindChickenSoup", method = RequestMethod.GET)
	public String list_mindChickenSoup(Model model,
			String searchFilter, final SessionStatus status,
			Page<MindChickenSoup> pageRequest) {
		status.setComplete();
		
		MindChickenSoup mindChickenSoup = new MindChickenSoup();
		mindChickenSoup.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			mindChickenSoup.setTitle(searchFilter);
		}
		pageRequest.setVo(mindChickenSoup);
		Page<MindChickenSoup> page = mindChickenSoupManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_mindChickenSoup");
	}

	@RequestMapping(value = "mindChickenSoup/add", method = RequestMethod.GET)
	public String add_mindChickenSoup(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_mindChickenSoup");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "mindChickenSoup/save", method = RequestMethod.POST)
	public String save_MindChickenSoup(MindChickenSoup mindChickenSoup,
			HttpServletRequest request, final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		mindChickenSoup.setCreatedBy(user.getAccount());
		mindChickenSoup.setLastModifiedBy(user.getAccount());
		
		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (mindChickenSoup.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(mindChickenSoup.getId());
				messageAttachmentManager.add(m);
			}
		}
		
		mindChickenSoupManager.add(mindChickenSoup);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/mindChickenSoup";
	}

	@RequestMapping(value = "mindChickenSoup/view/{id}", method = RequestMethod.GET)
	public String view_mindChickenSoup(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
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

	@RequestMapping(value = "mindChickenSoup/del/{id}", method = RequestMethod.GET)
	public String del_mindChickenSoup(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		mindChickenSoupManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/mindChickenSoup";
	}
	
	@RequestMapping(value = "mindChickenSoup/setHot/{id}", method = RequestMethod.GET)
	public String setHot_mindChickenSoup(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		MindChickenSoup entity = mindChickenSoupManager.findById(id);
		if (entity != null) {
			if (entity.getIsHot() != null && entity.getIsHot()) {
				entity.setIsHot(false);
			} else {
				entity.setIsHot(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			mindChickenSoupManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/mindChickenSoup";
	}
	
	@RequestMapping(value = "mindChickenSoup/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_mindChickenSoup(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		MindChickenSoup entity = mindChickenSoupManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			mindChickenSoupManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/mindChickenSoup";
	}
	
	@RequestMapping(value = "mindChickenSoup/update/{id}", method = RequestMethod.GET)
	public String update_mindChickenSoup(@PathVariable("id") String id, Model model) {
		MindChickenSoup mindChickenSoup = mindChickenSoupManager.findById(id);
		model.addAttribute("mindChickenSoup", mindChickenSoup);
		return getRelativePath("/update_mindChickenSoup");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "mindChickenSoup/update", method = RequestMethod.POST)
	public String update_mindChickenSoup(MindChickenSoup newMindChickenSoup, HttpServletRequest request, Model model) {
		MindChickenSoup mindChickenSoup = (MindChickenSoup)request.getSession().getAttribute("mindChickenSoup");
		if (mindChickenSoup != null) {
			mindChickenSoup.setTitle(newMindChickenSoup.getTitle());
			mindChickenSoup.setSource(newMindChickenSoup.getSource());
			mindChickenSoup.setContent(newMindChickenSoup.getContent());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(mindChickenSoup.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!mindChickenSoup.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (mindChickenSoup.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(mindChickenSoup.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			mindChickenSoupManager.update(mindChickenSoup);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/mindChickenSoup";
	}
	

	@RequestMapping(value = "example", method = RequestMethod.GET)
	public String list_Example(Model model, String searchFilter,
			final SessionStatus status, Page<Example> pageRequest) {
		status.setComplete();
		
		Example example = new Example();
		example.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			example.setTitle(searchFilter);
		}
		pageRequest.setVo(example);
		Page<Example> page = exampleManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_example");
	}

	@RequestMapping(value = "example/add", method = RequestMethod.GET)
	public String add_example(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_example");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "example/save", method = RequestMethod.POST)
	public String save_Example(Example example, HttpServletRequest request,
			final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		example.setCreatedBy(user.getAccount());
		example.setLastModifiedBy(user.getAccount());

		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (example.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(example.getId());
				messageAttachmentManager.add(m);
			}
		}

		exampleManager.add(example);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/example";
	}

	@RequestMapping(value = "example/view/{id}", method = RequestMethod.GET)
	public String view_example(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
		status.setComplete();
		Example entity = exampleManager.findById(id);

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
		return getRelativePath("/view_example");
	}

	@RequestMapping(value = "example/del/{id}", method = RequestMethod.GET)
	public String del_example(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		exampleManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/example";
	}

	@RequestMapping(value = "example/setHot/{id}", method = RequestMethod.GET)
	public String setHot_example(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Example entity = exampleManager.findById(id);
		if (entity != null) {
			if (entity.getIsHot() != null && entity.getIsHot()) {
				entity.setIsHot(false);
			} else {
				entity.setIsHot(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			exampleManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/example";
	}
	
	@RequestMapping(value = "example/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_example(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		Example entity = exampleManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			exampleManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/example";
	}
	
	@RequestMapping(value = "example/update/{id}", method = RequestMethod.GET)
	public String update_example(@PathVariable("id") String id, Model model) {
		Example example = exampleManager.findById(id);
		model.addAttribute("example", example);
		return getRelativePath("/update_example");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "example/update", method = RequestMethod.POST)
	public String update_example(Example newExample, HttpServletRequest request, Model model) {
		Example example = (Example)request.getSession().getAttribute("example");
		if (example != null) {
			example.setTitle(newExample.getTitle());
			example.setSource(newExample.getSource());
			example.setContent(newExample.getContent());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(example.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!example.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (example.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(example.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			exampleManager.update(example);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/example";
	}
	
	@RequestMapping(value = "usingHelp", method = RequestMethod.GET)
	public String list_usingHelp(Model model, String searchFilter,
			final SessionStatus status, Page<UsingHelp> pageRequest) {
		status.setComplete();
		
		UsingHelp usingHelp = new UsingHelp();
		usingHelp.setIsHidden(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			usingHelp.setTitle(searchFilter);
		}
		pageRequest.setVo(usingHelp);
		Page<UsingHelp> page = usingHelpManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_usingHelp");
	}

	@RequestMapping(value = "usingHelp/add", method = RequestMethod.GET)
	public String add_usingHelp(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_usingHelp");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "usingHelp/save", method = RequestMethod.POST)
	public String save_usingHelp(UsingHelp usingHelp, HttpServletRequest request,
			final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		usingHelp.setCreatedBy(user.getAccount());
		usingHelp.setLastModifiedBy(user.getAccount());

		List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
				.getSession().getAttribute("atta_pic");
		if (CollectionUtils.isNotEmpty(atta_pic)) {
			List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
			for (MessageAttachment m : atta_pic) {
				if (usingHelp.getContent().contains(m.getFileName())) {
					save_pic.add(m);
				}
			}
			for (MessageAttachment m : save_pic) {
				m.setMessageId(usingHelp.getId());
				messageAttachmentManager.add(m);
			}
		}

		usingHelpManager.add(usingHelp);

		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/usingHelp";
	}

	@RequestMapping(value = "usingHelp/view/{id}", method = RequestMethod.GET)
	public String view_usingHelp(final SessionStatus status, Model model,
			@PathVariable(value = "id") String id) {
		status.setComplete();
		UsingHelp entity = usingHelpManager.findById(id);

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
		return getRelativePath("/view_usingHelp");
	}

	@RequestMapping(value = "usingHelp/del/{id}", method = RequestMethod.GET)
	public String del_usingHelp(final SessionStatus status,
			@PathVariable("id") String id) {
		List<MessageAttachment> save_pic = messageAttachmentManager
				.findByMessageId(id);
		String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
		if (CollectionUtils.isNotEmpty(save_pic)) {
			for (MessageAttachment m : save_pic) {
				FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
			}
		}
		messageAttachmentManager.removeByMessageId(id); // 删除数据库图片
		usingHelpManager.removeById(id); // 删除案例

		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/usingHelp";
	}

	@RequestMapping(value = "usingHelp/setHidden/{id}", method = RequestMethod.GET)
	public String setHidden_UsingHelp(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		UsingHelp entity = usingHelpManager.findById(id);
		if (entity != null) {
			if (entity.getIsHidden() != null && entity.getIsHidden()) {
				entity.setIsHidden(false);
			} else {
				entity.setIsHidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			usingHelpManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/article/usingHelp";
	}
	
	@RequestMapping(value = "usingHelp/update/{id}", method = RequestMethod.GET)
	public String update_usingHelp(@PathVariable("id") String id, Model model) {
		UsingHelp usingHelp = usingHelpManager.findById(id);
		model.addAttribute("usingHelp", usingHelp);
		return getRelativePath("/update_usingHelp");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "usingHelp/update", method = RequestMethod.POST)
	public String update_usingHelp(UsingHelp newUsingHelp, HttpServletRequest request, Model model) {
		UsingHelp usingHelp = (UsingHelp)request.getSession().getAttribute("usingHelp");
		if (usingHelp != null) {
			usingHelp.setTitle(newUsingHelp.getTitle());
			usingHelp.setSource(newUsingHelp.getSource());
			usingHelp.setContent(newUsingHelp.getContent());
			
			String ATTA_FILE_PATH = ApplicationContext.getApplicationPath() +  "/resources/attachment/message/";
			//对比删除旧的
			List<MessageAttachment> old_pic = messageAttachmentManager
					.findByMessageId(usingHelp.getId());
			if (CollectionUtils.isNotEmpty(old_pic)) {
				for (MessageAttachment m : old_pic) {
					if (!usingHelp.getContent().contains(m.getFileName())) {
						System.out.println("删除图片：" + m.getFileName());
						messageAttachmentManager.removeById(m.getId());
						FileUtils.deleteFile(ATTA_FILE_PATH, m.getFileName()); // 删除image路径下的图片
					}
				}
			}
			
			//添加新的
			List<MessageAttachment> atta_pic = (List<MessageAttachment>) request
					.getSession().getAttribute("atta_pic");
			if (CollectionUtils.isNotEmpty(atta_pic)) {
				List<MessageAttachment> save_pic = new ArrayList<MessageAttachment>();
				for (MessageAttachment m : atta_pic) {
					if (usingHelp.getContent().contains(m.getFileName())) {
						System.out.println("添加图片：" + m.getFileName());
						save_pic.add(m);
					}
				}
				for (MessageAttachment m : save_pic) {
					m.setMessageId(usingHelp.getId());
					messageAttachmentManager.add(m);
				}
			}
			//更新
			usingHelpManager.update(usingHelp);

		}
		
		request.getSession().setAttribute("atta_pic", null);
		return CONTROLLER_REDIRECT + "/admin/article/usingHelp";
	}

}
