package cn.dosy.platform.security.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.dosy.platform.security.domain.User;
import cn.dosy.platform.security.service.IUserManager;

@Controller
public class LoginController {

	@Resource(name="userManager")
	private IUserManager userManager;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		User principal = (User)request.getSession().getAttribute("principal");
		
		if (principal != null) {
			return "/admin/index";
		}
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user, Model model, HttpServletRequest request) {
		
		User principal = userManager.getUser(user.getAccount(), user.getPassword());
		
		if (principal != null) {
			
			request.getSession().setAttribute("principal", principal);
			
			model.addAttribute("principal", principal);
		} else {
			
			request.getSession().setAttribute("principal", null);
			
			model.addAttribute("loginMessage", "账号密码错误");
			
			return "login";
			
		}
		
		model.addAttribute("principal", principal);
		
		return "/admin/index";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		
		request.getSession().setAttribute("principal", null);
		
		return "login";
	}
	
}
