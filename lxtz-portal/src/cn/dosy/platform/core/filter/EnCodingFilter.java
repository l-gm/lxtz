package cn.dosy.platform.core.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * <p>
 * 编码过滤器
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
public class EnCodingFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		((ServletRequest) response).setCharacterEncoding("utf-8");
		filter.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
