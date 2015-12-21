package cn.dosy.platform.customer.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.web.BaseController;
import cn.dosy.platform.customer.domain.Merchant;
import cn.dosy.platform.customer.domain.Student;
import cn.dosy.platform.customer.service.IMerchantManager;
import cn.dosy.platform.customer.service.IStudentManager;

/**
 * <p>
 *  用户登录 Controller
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月15日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月15日；
 */
@Controller
@RequestMapping(value = "login")
public class UserLoginController extends BaseController<Auditable> {

	@Resource(name = "studentManager")
	protected IStudentManager studentManager;
	
	@Resource(name = "merchantManager")
	protected IMerchantManager merchantManager;
	
	@RequestMapping(value = "student", method = RequestMethod.GET)
	public String studentLogin(final SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		
		Student student = (Student)request.getSession().getAttribute("studentPrincipal");
		if (student != null) {
			return "redirect:/portal/infoCenter/student/basic";
		}
		return "/loginStudent";
	}
	
	@RequestMapping(value = "student", method = RequestMethod.POST)
	public String studentLogin(String account, String password, Model model, HttpServletRequest request) {
		
		Student student = studentManager.findByAccountAndPassword(account, password);
		
		if (student != null) {
			
			request.getSession().setAttribute("studentPrincipal", student);
			request.getSession().setAttribute("merchantPrincipal", null);
			
		} else {
			
			request.getSession().setAttribute("studentPrincipal", null);
			
			model.addAttribute("loginMessage", "账号密码错误");
			
			return "/loginStudent";
			
		}
		
		model.addAttribute("studentPrincipal", student);
		
		return "redirect:/portal/infoCenter/student/basic";
	}
	
	
	@RequestMapping(value = "merchant", method = RequestMethod.GET)
	public String merchantLogin(final SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		
		Merchant merchant = (Merchant)request.getSession().getAttribute("merchantPrincipal");
		if (merchant != null) {
			return "redirect:/portal/infoCenter/merchant/basic";
		}
		return "/loginMerchant";
	}
	
	
	@RequestMapping(value = "merchant", method = RequestMethod.POST)
	public String merchantLogin(String account, String password, Model model, HttpServletRequest request) {
		
		Merchant merchant = merchantManager.findByAccountAndPassword(account, password);
		
		if (merchant != null) {
			
			request.getSession().setAttribute("merchantPrincipal", merchant);
			request.getSession().setAttribute("studentPrincipal", null);
			
		} else {
			
			request.getSession().setAttribute("merchantPrincipal", null);
			
			model.addAttribute("loginMessage", "账号密码错误");
			
			return "/loginMerchant";
			
		}
		
		model.addAttribute("merchantPrincipal", merchant);
		
		return "redirect:/portal/infoCenter/merchant/basic";
	}
	
}
