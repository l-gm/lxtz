package cn.dosy.platform.core.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.dosy.platform.admin.domain.Blogroll;
import cn.dosy.platform.admin.domain.ContactUs;
import cn.dosy.platform.admin.domain.ConversionLayout;
import cn.dosy.platform.admin.service.IBlogrollManager;
import cn.dosy.platform.admin.service.IContactUsManager;
import cn.dosy.platform.admin.service.IConversionLayoutManager;
import cn.dosy.platform.core.utils.CollectionUtils;


/**
 * <p>
 * 启动监听类
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
public class PlatformContextListener implements ServletContextListener{

	static final Logger logger = LoggerFactory
			.getLogger(PlatformContextListener.class);

	public void contextDestroyed(ServletContextEvent event) {
		
	}

	public void contextInitialized(ServletContextEvent event) {
		
		String contextPath =  event.getServletContext().getContextPath();
		event.getServletContext().setAttribute("ctx", contextPath);
		logger.info("contextPath===========" + contextPath);
		
		String resourcePath = contextPath + "/resources";
		event.getServletContext().setAttribute("resourcePath", resourcePath);
		logger.info("resourcePath============" + resourcePath);
	
		//联系我们
		IContactUsManager contactUsManager = (IContactUsManager)this.getObjectFromApplication(event.getServletContext(), "contactUsManager");  
		if (contactUsManager != null) {
			List<ContactUs> contact = contactUsManager.findAll();
			if (CollectionUtils.isNotEmpty(contact)) {
				event.getServletContext().setAttribute("portalContactUs", contact.get(0));
			} else {
				event.getServletContext().setAttribute("portalContactUs", null);
			}
		}
		
		//友情链接
		IBlogrollManager blogrollManager = (IBlogrollManager)this.getObjectFromApplication(event.getServletContext(), "blogrollManager");
		if (blogrollManager != null) {
			List<Blogroll> blo = blogrollManager.findAll();
			if (CollectionUtils.isNotEmpty(blo)) {
				event.getServletContext().setAttribute("portalBlogroll", blo);
			} else {
				event.getServletContext().setAttribute("portalBlogroll", null);
			}
		}
		
		//版面转换
		IConversionLayoutManager conversionLayoutManager = (IConversionLayoutManager)this.getObjectFromApplication(event.getServletContext(), "conversionLayoutManager");
		if (conversionLayoutManager != null) {
			List<ConversionLayout> conversionLay = conversionLayoutManager.findAll();
			if (CollectionUtils.isNotEmpty(conversionLay)) {
				event.getServletContext().setAttribute("portalConversionLayout", conversionLay.get(0));
			} else {
				event.getServletContext().setAttribute("portalConversionLayout", null);
			}
		}
		
	}
	
	/**
	 * 通过WebApplicationContextUtils 得到Spring容器的实例。根据bean的名称返回bean的实例。
	 * 
	 * @param servletContext
	 *            ：ServletContext上下文。
	 * @param beanName
	 *            :要取得的Spring容器中Bean的名称。
	 * @return 返回Bean的实例。
	 */
	private Object getObjectFromApplication(ServletContext servletContext,
			String beanName) {
		// 通过WebApplicationContextUtils 得到Spring容器的实例。
		ApplicationContext application = WebApplicationContextUtils
				.getWebApplicationContext(servletContext);
		// 返回Bean的实例。
		Object bean = application.getBean(beanName);
		return bean;
	}

	

}
