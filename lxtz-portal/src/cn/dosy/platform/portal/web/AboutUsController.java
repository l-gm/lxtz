package cn.dosy.platform.portal.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.admin.domain.CompanyProfile;
import cn.dosy.platform.admin.domain.ContactUs;
import cn.dosy.platform.admin.domain.Employment;
import cn.dosy.platform.admin.service.ICompanyProfileManager;
import cn.dosy.platform.admin.service.IContactUsManager;
import cn.dosy.platform.admin.service.IEmploymentManager;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;

@Controller
@RequestMapping(value = "/portal/aboutUs")
public class AboutUsController extends BaseController<Auditable>{

	@Resource(name = "contactUsManager")
	private IContactUsManager contactUsManager;
	
	@Resource(name = "companyProfileManager")
	private ICompanyProfileManager companyProfileManager;
	
	@Resource(name = "employmentManager")
	private IEmploymentManager employmentManager;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String view_companyProfile(Model model, final SessionStatus status) {
		List<CompanyProfile> companyPro = companyProfileManager.findAll();
		if (CollectionUtils.isNotEmpty(companyPro)) {
			model.addAttribute("companyProfile", companyPro.get(0));
		}
		status.setComplete();
		return getRelativePath("/view_companyProfile");
	}
	
	@RequestMapping(value = "contactUs", method = RequestMethod.GET)
	public String contactUs(Model model, final SessionStatus status){
		List<ContactUs> contact = contactUsManager.findAll();
		if (CollectionUtils.isNotEmpty(contact)) {
			model.addAttribute("contactUs", contact.get(0));
		}
		status.setComplete();
		return getRelativePath("/view_contactUs");
		
	}
	
	@RequestMapping(value = "employment", method = RequestMethod.GET)
	public String list_employment(Employment employment, Model model, final SessionStatus status, Page<Employment> pageRequest) {
		
		if (employment == null) {
			employment = new Employment();
		}
		pageRequest.setVo(employment);
		Page<Employment> employ = employmentManager.query(pageRequest);
		model.addAttribute("page", employ);
		status.setComplete();
		return getRelativePath("/list_employment");
	}
	
	@RequestMapping(value = "employment/view/{id}")
	public String view_Employment(@PathVariable("id")String id, Model model, final SessionStatus status) {
		
		Employment employment = employmentManager.findById(id);
		model.addAttribute("entity", employment);
		status.setComplete();
		return getRelativePath("/view_employment");
	}
	
}
