package cn.dosy.platform.customer.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cn.dosy.platform.core.domain.Auditable;
import cn.dosy.platform.core.web.BaseController;

/**
 * <p>
 *  用户退出 Controller
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月18日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月18日；
 */
@Controller
@RequestMapping(value = "logout")
public class UserLogoutController extends BaseController<Auditable> {

	/**
	 * 个人账号退出，删除session中的缓存
	 * 
	 * @param status
	 * 				清楚容器中的缓存
	 * @param request
	 * 				调用application级别容器，使整个容器销毁当前个人信息
	 * */
	@RequestMapping(value = "student", method = RequestMethod.GET)
	public String studentLogout(final SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		request.getSession().setAttribute("studentPrincipal", null);
		return "redirect:/";
	}
	
	/**
	 * 企业账号退出，删除session中的缓存
	 * 
	 * @param status
	 * 				清楚容器中的缓存
	 * @param request
	 * 				调用application级别容器，使整个容器销毁当前企业信息
	 * */
	@RequestMapping(value = "merchant", method = RequestMethod.GET)
	public String merchantLogout(final SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		request.getSession().setAttribute("merchantPrincipal", null);
		return "redirect:/";
	}
	
	
}
