package cn.dosy.platform.admin.web;

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

import cn.dosy.platform.admin.domain.Blogroll;
import cn.dosy.platform.admin.domain.CompanyProfile;
import cn.dosy.platform.admin.domain.ContactUs;
import cn.dosy.platform.admin.domain.ConversionLayout;
import cn.dosy.platform.admin.domain.Employment;
import cn.dosy.platform.admin.service.IBlogrollManager;
import cn.dosy.platform.admin.service.ICompanyProfileManager;
import cn.dosy.platform.admin.service.IContactUsManager;
import cn.dosy.platform.admin.service.IConversionLayoutManager;
import cn.dosy.platform.admin.service.IEmploymentManager;
import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.utils.CollectionUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.security.domain.User;

@Controller
@RequestMapping(value = "admin/system")
@SessionAttributes({"blogroll","contact","companyProfile","employment","conversionLayout"})
public class SystemController extends BaseController<Auditable> {

	@Resource(name = "blogrollManager")
	private IBlogrollManager blogrollManager;
	
	@Resource(name = "contactUsManager")
	private IContactUsManager contactUsManager;
	
	@Resource(name = "companyProfileManager")
	private ICompanyProfileManager companyProfileManager;
	
	@Resource(name = "employmentManager")
	private IEmploymentManager employmentManager;
	
	@Resource(name = "conversionLayoutManager")
	private IConversionLayoutManager conversionLayoutManager;
	
	
	@RequestMapping(value = "companyProfile",method = RequestMethod.GET)
	public String view_companyProfile(Model model, final SessionStatus status) {
		List<CompanyProfile> companyPro = companyProfileManager.findAll();
		if (CollectionUtils.isNotEmpty(companyPro)) {
			model.addAttribute("companyProfile", companyPro.get(0));
		}
		status.setComplete();
		return getRelativePath("/view_companyProfile");
	}
	
	@RequestMapping(value = "companyProfile/update/{id}")
	public String updateCompanyProfile(@PathVariable("id")String id, Model model) {
		
		CompanyProfile companyProfile = companyProfileManager.findById(id);
		model.addAttribute("companyProfile", companyProfile);
		return getRelativePath("/update_companyProfile");
	}
	
	@RequestMapping(value = "companyProfile/update")
	public String update_companyProfile(CompanyProfile companyProfile, HttpServletRequest request, final SessionStatus status){
		CompanyProfile companyPro = (CompanyProfile) request.getSession().getAttribute("companyProfile");
		
		companyPro.setContent(companyProfile.getContent());
		
		companyProfileManager.update(companyPro);
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/companyProfile";
	}
	

	@RequestMapping(value = "blogroll", method = RequestMethod.GET)
	public String list_blogroll(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/list_blogroll");
	}

	@RequestMapping(value = "blogroll/add", method = RequestMethod.GET)
	public String add_blogroll(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_blogroll");
	}

	@RequestMapping(value = "blogroll/save", method = RequestMethod.POST)
	public String save_blogroll(Blogroll blogroll, HttpServletRequest request,
			final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		blogroll.setCreatedBy(user.getAccount());
		blogroll.setLastModifiedBy(user.getAccount());
		blogrollManager.add(blogroll);
		
		//刷新容器的友情链接
		List<Blogroll> blo = blogrollManager.findAll();
		if (CollectionUtils.isNotEmpty(blo)) {
			request.getServletContext().setAttribute("portalBlogroll", blo);
		} else {
			request.getServletContext().setAttribute("portalBlogroll", null);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/blogroll";
	}
	
	@RequestMapping(value = "blogroll/update/{id}")
	public String updateBlogroll(@PathVariable("id")String id, Model model) {
		
		Blogroll blogroll = blogrollManager.findById(id);
		model.addAttribute("blogroll", blogroll);
		return getRelativePath("/update_blogroll");
	}
	
	@RequestMapping(value = "blogroll/update")
	public String update_blogroll(Blogroll blogroll, HttpServletRequest request, final SessionStatus status){
		Blogroll blogrolls = (Blogroll) request.getSession().getAttribute("blogroll");
		
		blogrolls.setWord(blogroll.getWord());
		blogrolls.setLink(blogroll.getLink());
		
		blogrollManager.update(blogrolls);
		
		//刷新容器的友情链接
		List<Blogroll> blo = blogrollManager.findAll();
		if (CollectionUtils.isNotEmpty(blo)) {
			request.getServletContext().setAttribute("portalBlogroll", blo);
		} else {
			request.getServletContext().setAttribute("portalBlogroll", null);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/blogroll";
	}


	@RequestMapping(value = "blogroll/del/{id}", method = RequestMethod.GET)
	public String del_blogroll(@PathVariable("id")String id, final SessionStatus status, HttpServletRequest request) {
		blogrollManager.removeById(id);
		
		//刷新容器的友情链接
		List<Blogroll> blo = blogrollManager.findAll();
		if (CollectionUtils.isNotEmpty(blo)) {
			request.getServletContext().setAttribute("portalBlogroll", blo);
		} else {
			request.getServletContext().setAttribute("portalBlogroll", null);
		}
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/blogroll";
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

	@RequestMapping(value = "employment/add", method = RequestMethod.GET)
	public String add_employment(final SessionStatus status) {
		status.setComplete();
		
		return getRelativePath("/add_employment");
	}

	@RequestMapping(value = "employment/save", method = RequestMethod.POST)
	public String save_employment(Employment employment, HttpServletRequest request,
			final SessionStatus status) {
		User user = (User) request.getSession().getAttribute("principal");

		employment.setCreatedBy(user.getAccount());
		employmentManager.add(employment);
		status.setComplete();

		return CONTROLLER_REDIRECT + "/admin/system/employment";
	}
	
	@RequestMapping(value = "employment/update/{id}")
	public String update_Employment(@PathVariable("id")String id, Model model) {
		
		Employment employment = employmentManager.findById(id);
		model.addAttribute("employment", employment);
		return getRelativePath("/update_employment");
	}
	@RequestMapping(value = "employment/view/{id}")
	public String view_Employment(@PathVariable("id")String id, Model model, final SessionStatus status) {
		
		Employment employment = employmentManager.findById(id);
		model.addAttribute("employment", employment);
		status.setComplete();
		return getRelativePath("/view_employment");
	}
	
	@RequestMapping(value = "employment/update")
	public String update_employment(Employment employment, HttpServletRequest request, final SessionStatus status){
		Employment employments = (Employment) request.getSession().getAttribute("employment");
		
		employments.setContent(employment.getContent());
		employments.setPositionmonthlysalary(employment.getPositionmonthlysalary());
		employments.setWorkingplace(employment.getWorkingplace());
		employments.setNatureofwork(employment.getNatureofwork());
		employments.setWorkexperience(employment.getWorkexperience());
		employments.setMinimumdegree(employment.getMinimumdegree());
		employments.setHiringnum(employment.getHiringnum());
		employments.setJobcategory(employment.getJobcategory());
		employments.setResponsibility(employment.getResponsibility());
		employments.setQualifications(employment.getQualifications());
		
		employmentManager.update(employments);
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/employment";
	}


	@RequestMapping(value = "employment/del/{id}", method = RequestMethod.GET)
	public String del_employment(@PathVariable("id")String id, final SessionStatus status) {
		employmentManager.removeById(id);
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/employment";
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
	
	@RequestMapping(value = "contactUs/update/{id}")
	public String updateContactUs(@PathVariable("id")String id, Model model) {
		
		ContactUs contact = contactUsManager.findById(id);
		model.addAttribute("contact", contact);
		return getRelativePath("/update_contactUs");
	}
	
	@RequestMapping(value = "contactUs/update")
	public String update_contactUs(ContactUs contactUs, HttpServletRequest request, final SessionStatus status){
		ContactUs contact = (ContactUs) request.getSession().getAttribute("contact");
		
		contact.setCustomerservicehotline(contactUs.getCustomerservicehotline());
		contact.setCompanyswitchboard(contactUs.getCompanyswitchboard());
		contact.setFax(contactUs.getFax());
		contact.setQq(contactUs.getQq());
		contact.setAddress(contactUs.getAddress());
		contact.setEmail(contactUs.getEmail());
		
		contactUsManager.update(contact);
		status.setComplete();
		return CONTROLLER_REDIRECT + "/admin/system/contactUs";
	}
	
	@RequestMapping(value = "conversionLayout",method = RequestMethod.GET)
	public String view_conversionLayout(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/view_conversionLayout");
	}
	
	@RequestMapping(value = "conversionLayout/update")
	public String updateConversionLayout(Model model, HttpServletRequest request) {
		
		ConversionLayout conversionLayout = (ConversionLayout)request.getServletContext().getAttribute("portalConversionLayout");
		if (conversionLayout != null) {
			if (conversionLayout.getIsHidden()) {
				conversionLayout.setIsHidden(false);
			}
			else{
				conversionLayout.setIsHidden(true);
			}
			conversionLayoutManager.update(conversionLayout);
			request.getServletContext().setAttribute("portalConversionLayout", conversionLayout);
			model.addAttribute("result", "设置成功");
		} else {
			model.addAttribute("result", "系统异常");
		}
		
		return getRelativePath("/view_conversionLayout");
	}
}
