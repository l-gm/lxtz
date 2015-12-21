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

import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.admin.domain.MessageAttachment;
import cn.dosy.platform.admin.domain.Notice;
import cn.dosy.platform.admin.service.IExampleManager;
import cn.dosy.platform.admin.service.IInvestmentManager;
import cn.dosy.platform.admin.service.IMessageAttachmentManager;
import cn.dosy.platform.admin.service.INoticeManager;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Comment;
import cn.dosy.platform.customer.service.ICommentManager;

@Controller
@RequestMapping(value = "portal/newDynamic")
public class NewDynamicManager extends BaseController<Auditable>{

	@Resource(name = "noticeManager")
	private INoticeManager noticeManager;
	
	@Resource(name = "investmentManager")
	private IInvestmentManager investmentManager;
	
	@Resource(name = "exampleManager")
	private IExampleManager exampleManager;
	
	@Resource(name = "commentManager")
	protected ICommentManager commentManager;
	
	@Resource(name = "messageAttachmentManager")
	private IMessageAttachmentManager messageAttachmentManager;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String list_notice(Model model, String searchFilter,
			final SessionStatus status, Page<Notice> pageRequest) {
		status.setComplete();
		
		Notice notice = new Notice();
		notice.setIsHidden(null);
		notice.setIsHot(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			notice.setTitle(searchFilter);
		}
		pageRequest.setVo(notice);
		Page<Notice> page = noticeManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_notice");
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
	
	@RequestMapping(value = "investment", method = RequestMethod.GET)
	public String list_investment(Model model, String searchFilter,
			final SessionStatus status, Page<Investment> pageRequest) {
		status.setComplete();
		
		Investment investment = new Investment();
		investment.setIsHidden(null);
		investment.setIsHot(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			investment.setTitle(searchFilter);
		}
		pageRequest.setVo(investment);
		Page<Investment> page = investmentManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_investment");
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
	
	@RequestMapping(value = "example", method = RequestMethod.GET)
	public String list_Example(Model model, String searchFilter,
			final SessionStatus status, Page<Example> pageRequest) {
		status.setComplete();
		
		Example example = new Example();
		example.setIsHidden(null);
		example.setIsHot(null);
		if (StringUtils.isNotBlank(searchFilter)) {
			example.setTitle(searchFilter);
		}
		pageRequest.setVo(example);
		Page<Example> page = exampleManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_example");
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
	
	@RequestMapping(value = "comment", method = RequestMethod.GET)
	public String comment(Model model, String searchFilter,
			final SessionStatus status, Page<Comment> pageRequest) {
		status.setComplete();
		Comment comment = new Comment();
		if (StringUtils.isNotBlank(searchFilter)) {
			comment.setContent(searchFilter);
		}
		pageRequest.setVo(comment);
		Page<Comment> page = commentManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_comment");
	}
	
	
}
