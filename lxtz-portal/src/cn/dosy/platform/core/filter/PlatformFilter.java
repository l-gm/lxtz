package cn.dosy.platform.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import cn.dosy.platform.admin.domain.ConversionLayout;

/**
 * <p>
 * 平台过滤器（登陆操作）
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年09月19日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年09月19日；
 */
public class PlatformFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		String contextPath = req.getContextPath();
		String admin = contextPath + "/admin";

		String url = req.getRequestURI();
		
		String resourcePath = contextPath + "/resources";
		
		String login = contextPath + "/login";
		String logout = contextPath + "/logout";
		ConversionLayout conversionLayout = (ConversionLayout)request.getServletContext().getAttribute("portalConversionLayout");
		if (conversionLayout != null) {
			if (conversionLayout.getIsHidden() &&
					!url.startsWith(admin) &&
					!url.equalsIgnoreCase(login) &&
					!url.equalsIgnoreCase(logout) &&
					!url.startsWith(resourcePath)) {
				request.getRequestDispatcher("/WEB-INF/views/maintenance.jsp").forward(
						request, response);
			}
		}

		if (req.getSession().getAttribute("principal") != null
				|| contextPath.equals(url) || !url.startsWith(admin)) {
			filter.doFilter(request, response);
		} else {
			request.setAttribute("loginMessage", "登陆异常，请重新登陆！！！");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
					request, response);
		}

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
