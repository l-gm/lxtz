package cn.dosy.platform.customer.web;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.config.utils.JavaMailUtil;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.customer.domain.Merchant;
import cn.dosy.platform.customer.domain.MerchantJob;
import cn.dosy.platform.customer.service.IMerchantJobManager;
import cn.dosy.platform.customer.service.IMerchantManager;

@Controller
@RequestMapping(value = "portal/infoCenter/merchant")
@SessionAttributes({ "merchantJob", "email" })
public class MerchantController extends BaseController<Merchant>{

	@Resource(name = "merchantManager")
	protected IMerchantManager merchantManager;
	
	@Resource(name = "merchantJobManager")
	protected IMerchantJobManager merchantJobManager;
	
	@RequestMapping(value = "basic")
	public String basic(HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		return getRelativePath("/basic");
	}
	
	@RequestMapping(value = "merchantJob")
	public String merchantJob(HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		MerchantJob query = new MerchantJob();
		query.setForbidden(null);
		List<MerchantJob> list = merchantJobManager.query(query);
		
		model.addAttribute("list", list);
		return getRelativePath("/list_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/add")
	public String add_merchantJob(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/add_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/save", method = RequestMethod.POST)
	public String save_merchantJob(MerchantJob merchantJob, HttpServletRequest request) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant != null) {
			merchantJobManager.add(merchantJob);
		}
		return CONTROLLER_REDIRECT + "/portal/infoCenter/merchant/merchantJob";
	}
	
	@RequestMapping(value = "updatePsd", method = RequestMethod.GET)
	public String updatePsd(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/updatePsd");
	}
	
	@RequestMapping(value = "updatePsd", method = RequestMethod.POST)
	public String updatePsd(String oldPsd, String newPsd, HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		if (!merchant.getPassword().equals(oldPsd)) {
			model.addAttribute("errorMessage", "原密码错误，修改密码失败");
			return getRelativePath("/updatePsd");
		}
		merchant.setPassword(newPsd);
		merchantManager.update(merchant);
		
		request.getSession().setAttribute("merchantPrincipal", merchant);
		return CONTROLLER_REDIRECT + "/portal/infoCenter/merchant/basic";
	}
	
	@RequestMapping(value = "updateBasic", method = RequestMethod.GET)
	public String updateBasic(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/updateBasic");
	}
	
	@RequestMapping(value = "updateBasic", method = RequestMethod.POST)
	public String updateBasic(Merchant updateMerchant, HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		merchant.setName(updateMerchant.getName());
		merchant.setCity(updateMerchant.getCity());
		merchant.setAddress(updateMerchant.getAddress());
		merchant.setContacts(updateMerchant.getContacts());
		merchant.setTelephone(updateMerchant.getTelephone());
		merchant.setPhone(updateMerchant.getPhone());
		merchant.setProfile(updateMerchant.getProfile());
		merchantManager.update(merchant);
		
		request.getSession().setAttribute("merchantPrincipal", merchant);
		return CONTROLLER_REDIRECT + "/portal/infoCenter/merchant/basic";
	}
	
	@RequestMapping(value = "merchantJob/view/{id}", method = RequestMethod.GET)
	public String view_merchantJob(final SessionStatus status, Model model, @PathVariable("id")String id) {
		status.setComplete();
		model.addAttribute("entity", merchantJobManager.findById(id));
		return getRelativePath("/view_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/forbidden/{id}", method = RequestMethod.GET)
	public String forbidden(final SessionStatus status, Model model, @PathVariable("id")String id) {
		status.setComplete();
		MerchantJob entity = merchantJobManager.findById(id);
		
		entity.setForbidden(true);
		merchantJobManager.update(entity);
		
		model.addAttribute("entity", entity);
		return getRelativePath("/view_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/update/{id}", method = RequestMethod.GET)
	public String update_merchantJob(Model model, @PathVariable("id")String id) {
		model.addAttribute("merchantJob", merchantJobManager.findById(id));
		return getRelativePath("/update_merchantJob");
	}
	
	@RequestMapping(value = "merchantJob/update", method = RequestMethod.POST)
	public String update_merchantJob(final SessionStatus status,MerchantJob updateMerchantJob, HttpServletRequest request, Model model) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		MerchantJob merchantJob = (MerchantJob)request.getSession().getAttribute("merchantJob");
		merchantJob.setJobTitle(updateMerchantJob.getJobTitle());
		merchantJob.setMerchantName(updateMerchantJob.getMerchantName());
		merchantJob.setNum(updateMerchantJob.getNum());
		merchantJob.setEffectiveTime(updateMerchantJob.getEffectiveTime());
		merchantJob.setSalaryLevel(updateMerchantJob.getSalaryLevel());
		merchantJob.setPhone(updateMerchantJob.getPhone());
		merchantJob.setPartTime(updateMerchantJob.getPartTime());
		merchantJob.setWorkArea(updateMerchantJob.getWorkArea());
		merchantJob.setAddress(updateMerchantJob.getAddress());
		merchantJob.setJobResponsibilities(updateMerchantJob.getJobResponsibilities());
		merchantJob.setCompanyProfile(updateMerchantJob.getCompanyProfile());
		merchantJobManager.update(merchantJob);
		
		model.addAttribute("entity", merchantJob);
		status.setComplete();
		return getRelativePath("/view_merchantJob");
	}
	
	@RequestMapping(value = "updateMail", method = RequestMethod.GET)
	public String updateMail(final SessionStatus status) {
		status.setComplete();
		return getRelativePath("/updateMail1");
	}
	
	@RequestMapping(value = "updateMail", method = RequestMethod.POST)
	public String updateMail(String email, Model model, HttpServletRequest request) {
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant == null) {
			model.addAttribute("loginMessage", "未登录");
			return "/loginMerchant";
		}
		String checkCode = UUID.randomUUID().toString();
		merchant.setCheckCode(checkCode);
		
		//send check mail
		String title = "朗鑫门户邮箱校验";
		String content = "<div style=\"background-color: #d0d0d0;padding: 40px;text-align: center;width=100%;\">" + 
								"<div style=\"padding:30px;background-color: #ffffff;width:500px;margin: 0 auto;text-align: left;line-height: 1.5;word-wrap: break-word;word-break: break-all;-webkit-border-radius: 10px;-moz-border-radius: 10px;border-radius: 10px;\">" +  
									"您好!<br/><br/>" + 
				"感谢你使用朗鑫门户平台。 <br/>" + 
				"你的登录邮箱为：" + email + "。请点击以下链接激活帐号：<br/><br/>" + 
				request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + 
				"/portal/infoCenter/merchant/s_checkCode?checkCode=" + checkCode + " <br/>" + 
				"如果以上链接无法点击，请将上面的地址复制到你的浏览器(如IE)的地址栏进入朗鑫门户平台。 <br/><br/> " +
				"此邮件为系统所发，请勿直接回复。 <br/><br/> " +
				"<div style=\"text-align: right;\">Thanks<br/>朗鑫门户</div></div></div>";
		
		JavaMailUtil.setHtmlMail(title, content, email);
		
		model.addAttribute("email", email);
		return getRelativePath("/updateMail2");
	}
	
	@RequestMapping(value = "s_checkCode", method = RequestMethod.GET)
	public String merchant_register3(@RequestParam(value="checkCode")String checkCode, HttpServletRequest request, Model model) {
		String registerResult = "1";
		
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		String email = (String)request.getSession().getAttribute("email");
		if (StringUtils.isBlank(email)) {
			registerResult = "2";
		} else {
			if (!merchant.getCheckCode().equals(checkCode)) {
				registerResult = "4";
			} else {
				merchant.setEmail(email);
				merchantManager.update(merchant);
				request.getSession().setAttribute("merchantPrincipal", merchant);
			}
		}
		
		model.addAttribute("registerResult", registerResult);
		return getRelativePath("/updateMail3");
	}
	
	
	
}
