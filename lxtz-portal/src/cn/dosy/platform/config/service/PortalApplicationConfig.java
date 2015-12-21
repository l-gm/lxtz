package cn.dosy.platform.config.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import cn.dosy.platform.config.domain.Menu;
import cn.dosy.platform.core.domain.Named;
import cn.dosy.platform.core.service.Refreshable;
import cn.dosy.platform.core.utils.CollectionUtils;


public class PortalApplicationConfig implements Named, Refreshable, InitializingBean, DisposableBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PortalApplicationConfig() {
		
	}

	protected String name;

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Named#getName()
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Named#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	protected String code;

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Named#getCode()
	 */
	public String getCode() {
		return this.code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Named#setCode(java.lang.String)
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	private String menuLocation;

	/**
	 * 获取属性：菜单配置位置
	 * 
	 * @return menuLocation
	 */
	public String getMenuLocation() {
		return this.menuLocation;
	}

	/**
	 * 属性设置：菜单配置位置
	 * 
	 * @param menuLocation
	 */
	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}


	private Menu rootMenu;

	/**
	 * 获取属性：根菜单
	 * 
	 * @return rootMenu
	 */
	public Menu getRootMenu() {
		return this.rootMenu;
	}

	/**
	 * 属性设置：根菜单
	 * 
	 * @param rootMenu
	 */
	public void setRootMenu(Menu rootMenu) {
		this.rootMenu = rootMenu;
	}

	public void afterPropertiesSet() throws Exception {

		refresh();

	}

	
	/**
	 * @return
	 */
	private List<String> fetchMenuConfigFile() {
		List<String> contextFiles = new ArrayList<String>();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		String lookup = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + this.menuLocation; // "/security/menu/*-permission.xml";
		String path = this.menuLocation.substring(0, this.menuLocation.lastIndexOf("/")+1);
		try {
			org.springframework.core.io.Resource[] resources = resolver.getResources(lookup);
			for (org.springframework.core.io.Resource resource : resources) {
				contextFiles.add(path + resource.getFilename());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return contextFiles;
	}

	public void destroy() throws Exception {

	}

	public boolean refresh() {
		loadMenuConfig();
		return true;
	}
	
	/**
	 * 
	 */
	private void loadMenuConfig() {
		List<String> contextFiles = fetchMenuConfigFile();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				contextFiles.toArray(new String[contextFiles.size()]));
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			Object beanObject = context.getBean(beanName);
			if(beanObject instanceof Menu)
			{
				Menu menu = (Menu) beanObject;
				menu.setLevel(1);
				
				setChildrenMenu(menu, menu.getChildren());
				
				rootMenu.getChildren().add(menu);
			}
			
		}
		context.close();
	}

	/**
	 * @param parentMenu
	 * @param children
	 */
	private void setChildrenMenu(Menu parentMenu, List<Menu> children) {
		if(CollectionUtils.isNotEmpty(children))
		{
			for (Menu subMenu : children) {
				subMenu.setLevel(parentMenu.getLevel() +1);
				subMenu.setParent(parentMenu);
				
				setChildrenMenu(subMenu, subMenu.getChildren());
			}
			
		}
	}

}
