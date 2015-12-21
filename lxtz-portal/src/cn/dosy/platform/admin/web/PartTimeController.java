package cn.dosy.platform.admin.web;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
import cn.dosy.platform.security.domain.User;

@Controller
@RequestMapping(value = "/admin/partTime")
public class PartTimeController  extends BaseController<Auditable>{
	
	@Resource(name = "merchantJobManager")
	protected IMerchantJobManager merchantJobManager;
	@Resource(name = "studentJobManager")
	protected IStudentJobManager studentJobManager;
	
	@RequestMapping(value = "merchant")
	public String merchant(Model model, String searchMerchantJob, final SessionStatus status,Page<MerchantJob> pageRequest) {
		status.setComplete();
		MerchantJob merchantJob = new MerchantJob();
		merchantJob.setForbidden(null);
		if (StringUtils.isNotBlank(searchMerchantJob)) {
			merchantJob.setJobTitle(searchMerchantJob);
			merchantJob.setJobResponsibilities(searchMerchantJob);
		}
		pageRequest.setVo(merchantJob);
		Page<MerchantJob> page = merchantJobManager.query(pageRequest);
		model.addAttribute("page", page);
		
		return getRelativePath("/merchant/list_merchant");
	}
	
	@RequestMapping(value = "merchant/view/{id}", method = RequestMethod.GET)
	public String view_pmerchant(@PathVariable(value = "id") String id, HttpServletRequest request, Model model) {
		
		MerchantJob merchantJob = merchantJobManager.findById(id);
		model.addAttribute("merchant", merchantJob);
		
		return getRelativePath("/merchant/view_merchant");
	}
	
	@RequestMapping(value = "student")
	public String student(Model model, String searchStudentJob, final SessionStatus status,Page<StudentJob> pageRequest) {
		status.setComplete();
		StudentJob studentJob = new StudentJob();
		studentJob.setForbidden(null);
		if (StringUtils.isNotBlank(searchStudentJob)) {
			studentJob.setTitle(searchStudentJob);
			studentJob.setContent(searchStudentJob);
		}
		pageRequest.setVo(studentJob);
		Page<StudentJob> page = studentJobManager.query(pageRequest);
		model.addAttribute("page", page);
		
		return getRelativePath("/student/list_student");
	}
	
	@RequestMapping(value = "student/view/{id}", method = RequestMethod.GET)
	public String view_pstudent(@PathVariable(value = "id") String id, HttpServletRequest request, Model model) {
		
		StudentJob studentJob = studentJobManager.findById(id);
		model.addAttribute("student", studentJob);
		
		return getRelativePath("/student/view_student");
	}
	
	@RequestMapping(value = "student/setForbidden/{id}", method = RequestMethod.GET)
	public String setForbidden_student(final SessionStatus status,
			@PathVariable("id") String id, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("principal");
		StudentJob entity = studentJobManager.findById(id);
		if (entity != null) {
			if (entity.getForbidden() != null && entity.getForbidden()) {
				entity.setForbidden(false);
			} else {
				entity.setForbidden(true);
			}
			entity.setLastModifiedDate(new Date());
			entity.setLastModifiedBy(user.getAccount());
			studentJobManager.update(entity);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/partTime/student";
	}

}
