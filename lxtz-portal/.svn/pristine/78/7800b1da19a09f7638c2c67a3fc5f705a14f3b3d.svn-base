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
import cn.dosy.platform.admin.domain.UsingHelp;
import cn.dosy.platform.admin.service.IMessageAttachmentManager;
import cn.dosy.platform.admin.service.IUsingHelpManager;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.utils.FileUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;

@Controller
@RequestMapping(value = "portal/usingHelp")
public class UsingHelpController extends BaseController<UsingHelp>{

	@Resource(name = "messageAttachmentManager")
	private IMessageAttachmentManager messageAttachmentManager;
	
	@Resource(name = "usingHelpManager")
	private IUsingHelpManager usingHelpManager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String list_usingHelp(Model model, final SessionStatus status, Page<UsingHelp> pageRequest) {
		status.setComplete();
		
		UsingHelp usingHelp = new UsingHelp();
		pageRequest.setVo(usingHelp);
		Page<UsingHelp> page = usingHelpManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_usingHelp");
	}
	
	@RequestMapping(value = "view/{id}", method = RequestMethod.GET)
	public String view_usingHelp(Model model, @PathVariable(value = "id") String id) {
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
	
}
