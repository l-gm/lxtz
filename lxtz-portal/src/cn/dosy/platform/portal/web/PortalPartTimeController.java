package cn.dosy.platform.portal.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.MerchantJob;
import cn.dosy.platform.customer.domain.StudentJob;
import cn.dosy.platform.customer.service.IMerchantJobManager;
import cn.dosy.platform.customer.service.IStudentJobManager;

@Controller
@RequestMapping("portal/partTime")
public class PortalPartTimeController extends BaseController<Auditable>{

	@Resource(name = "merchantJobManager")
	protected IMerchantJobManager merchantJobManager;
	
	@Resource(name = "studentJobManager")
	protected IStudentJobManager studentJobManager;
	
	@RequestMapping(value = "merchantJob", method = RequestMethod.GET )
	public String merchantJob(Model model, String searchMerchantJob, final SessionStatus status, Page<MerchantJob> pageRequest) {
		status.setComplete();
		MerchantJob merchantJob = new MerchantJob();
		merchantJob.setForbidden(null);
		if (StringUtils.isNotBlank(searchMerchantJob)) {
			merchantJob.setJobTitle(searchMerchantJob);
			merchantJob.setJobResponsibilities(searchMerchantJob);
		}
		
		pageRequest.setVo(merchantJob);
		//pageRequest.setPageSize(20);
		Page<MerchantJob> page = merchantJobManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/view/{id}", method = RequestMethod.GET)
	public String view_merchantJob(final SessionStatus status, Model model, @PathVariable("id")String id) {
		status.setComplete();
		model.addAttribute("entity", merchantJobManager.findById(id));
		return getRelativePath("/view_merchantJob");
	}
	
	@RequestMapping(value = "studentJob", method = RequestMethod.GET )
	public String studentJob(Model model, String searchStudentJob, final SessionStatus status, Page<StudentJob> pageRequest) {
		status.setComplete();
		StudentJob studentJob = new StudentJob();
		studentJob.setForbidden(null);
		if (StringUtils.isNotBlank(searchStudentJob)) {
			studentJob.setTitle(searchStudentJob);
			studentJob.setContent(searchStudentJob);
		}
		
		pageRequest.setVo(studentJob);
		//pageRequest.setPageSize(20);
		Page<StudentJob> page = studentJobManager.query(pageRequest);
		model.addAttribute("page", page);
		return getRelativePath("/list_studentJob");
	}
	
	@RequestMapping(value = "studentJob/view/{id}", method = RequestMethod.GET )
	public String view_studentJob(final SessionStatus status, Model model, @PathVariable("id")String id) {
		status.setComplete();
		model.addAttribute("entity", studentJobManager.findById(id));
		return getRelativePath("/view_studentJob");
	}
	
}
