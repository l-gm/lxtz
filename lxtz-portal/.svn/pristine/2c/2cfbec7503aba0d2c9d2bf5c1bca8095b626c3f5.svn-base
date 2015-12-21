package cn.dosy.platform.config.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.dosy.platform.config.domain.Menu;
import cn.dosy.platform.config.service.ApplicationConfig;
import cn.dosy.platform.core.ApplicationContext;
import cn.dosy.platform.core.utils.CollectionUtils;

/**
 * <p>
 * 菜单帮助类
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年09月01日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年09月01日；
 */
public class MenuUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static final Logger logger = LoggerFactory.getLogger(MenuUtils.class);

	/**
	 * 根据URL匹配获取LeftMenu TODO:需要根据当前用户权限判断
	 * 
	 */
	public static void findURLMappingLeftMenus() {
		HttpServletRequest request = ApplicationContext.getRequest();

		ApplicationConfig applicationConfig = ApplicationContext.getBean(ApplicationConfig.class);
		List<Menu> menus = applicationConfig.getRootMenu().getChildren();
		if (CollectionUtils.isNotEmpty(menus)) {

			String url = (String) request.getAttribute("javax.servlet.forward.request_uri");

			if (url == null) {
				url = request.getRequestURI();

			}

			url = url.replaceFirst(request.getContextPath(), "");
			logger.debug("url:" + url);
			request.setAttribute("activeMenu", null);
			Menu activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());

			// 去掉最后一个\，匹配上一个url
			if (activeMenu == null) {
				while (activeMenu == null) {
					if (url.lastIndexOf("/") > 0) {
						url = url.substring(0, url.lastIndexOf("/"));
						activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());

					} else {
						break;
					}
				}
			}

			List<Menu> displayMenus = getDisplayMenus(activeMenu);// 获取全部的左边栏
			if (activeMenu != null) {
				logger.debug("activeMenu:" + activeMenu.getMenuURI());
			}

			Menu activeLeftMenu = getActiveLeftMenu(activeMenu);// 获取对应的topMenu
			
			setActiveFlag(activeLeftMenu, displayMenus);

			logger.debug("displayMenus:" + displayMenus.size());
			request.setAttribute("currentMenus", displayMenus);
		}

	}

	/**
	 * 根据URL匹配获取TopMenu
	 * 
	 */
	public static void findURLMappingTopMenus() {
		HttpServletRequest request = ApplicationContext.getRequest();

		ApplicationConfig applicationConfig = ApplicationContext.getBean(ApplicationConfig.class);
		List<Menu> menus = applicationConfig.getRootMenu().getChildren();// topMenu列表
		if (CollectionUtils.isNotEmpty(menus)) {

			String url = (String) request.getAttribute("javax.servlet.forward.request_uri");

			if (url == null) {
				url = request.getRequestURI();

			}

			url = url.replaceFirst(request.getContextPath(), "");
			logger.debug("url:" + url);
			request.setAttribute("topMenus", null);
			Menu activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());// 根据url获取对应的菜单项

			// 去掉最后一个\，匹配上一个url
			if (activeMenu == null) {
				while (activeMenu == null) {
					if (url.lastIndexOf("/") > 0) {
						url = url.substring(0, url.lastIndexOf("/"));
						activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());

					} else {
						break;
					}
				}
			}

			Menu activeTopMenu = getActiveTopMenu(activeMenu);// 获取对应的topMenu
			
			setActiveFlag(activeTopMenu, menus);// 设置对应的topMenu高亮
			if (activeMenu != null) {
				logger.debug("activeMenu:" + activeMenu.getMenuURI());
			}
			
			request.setAttribute("topMenus", menus);
		}

	}

	/**
	 * 根据URL匹配获取BreadCrumb
	 * 
	 */
	public static void findURLMappingBreadCrumb() {
		HttpServletRequest request = ApplicationContext.getRequest();

		ApplicationConfig applicationConfig = ApplicationContext.getBean(ApplicationConfig.class);
		List<Menu> menus = applicationConfig.getRootMenu().getChildren();// topMenu列表

		if (CollectionUtils.isNotEmpty(menus)) {

			String url = (String) request.getAttribute("javax.servlet.forward.request_uri");

			if (url == null) {
				url = request.getRequestURI();

			}

			url = url.replaceFirst(request.getContextPath(), "");
			request.setAttribute("breadCrumb", null);
			Menu activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());// 根据url获取对应的菜单项

			// 去掉最后一个\，匹配上一个url
			if (activeMenu == null) {
				while (activeMenu == null) {
					if (url.lastIndexOf("/") > 0) {
						url = url.substring(0, url.lastIndexOf("/"));
						activeMenu = getActiveMenu(url, applicationConfig.getRootMenu());

					} else {
						break;
					}
				}
			}
			HashMap<Integer, Menu> breadCrumbHashMap = new HashMap<Integer, Menu>();
			breadCrumbHashMap = getbreadCrumb(1, activeMenu, breadCrumbHashMap);

			List<Menu> breadCrumbMenu = new ArrayList<Menu>();
			for (int i = breadCrumbHashMap.size(), j = 0; i > 0; i--, j++) {// 排序
				breadCrumbMenu.add(j, breadCrumbHashMap.get(i));
			}

			request.setAttribute("breadCrumb", breadCrumbMenu);
		}
	}

	/**
	 * 设置菜单高亮
	 * 
	 * @param activeMenu
	 * @param displayMenus
	 */
	private static void setActiveFlag(Menu activeMenu, List<Menu> displayMenus) {
		if (activeMenu == null)
			return;
		for (Menu menu : displayMenus) {
			if (activeMenu.getMenuURI().equals(menu.getMenuURI())) {
				menu.setActive(true);
			} else {
				menu.setActive(false);
			}
			if (CollectionUtils.isNotEmpty(menu.getChildren())) {

				setActiveFlag(activeMenu, menu.getChildren());
			}
		}
	}

	/**
	 * 获取匹配URL的菜单
	 * 
	 * @param url
	 * @param activeMenu
	 * @param menu
	 * @return
	 */
	private static Menu getActiveMenu(String url, Menu menu) {
		if (url.equals(menu.getMenuURI())) {
			return menu;
		}

		if (CollectionUtils.isNotEmpty(menu.getChildren())) {
			for (Menu subMenu : menu.getChildren()) {
				Menu activeMenu = getActiveMenu(url, subMenu);
				if (activeMenu != null)
					return activeMenu;
			}
		}
		return null;
	}

	/**
	 * 根据当前匹配URL的菜单，获取左边菜单组
	 * 
	 * @param activeMenu
	 * @return
	 */
	private static List<Menu> getDisplayMenus(Menu activeMenu) {
		if (activeMenu == null)
			return new ArrayList<Menu>();
		if (activeMenu.getLevel() == 1) {
			return activeMenu.getChildren();

		} else if (activeMenu.getLevel() == 2) {
			if (activeMenu.getParent() != null)
				return activeMenu.getParent().getChildren();

		} else if (activeMenu.getLevel() == 3) {
			if (activeMenu.getParent() != null) {
				if (activeMenu.getParent().getParent() != null)
					return activeMenu.getParent().getParent().getChildren();
			}
		} else if (activeMenu.getLevel() == 4) {
			if (activeMenu.getParent() != null) {
				if (activeMenu.getParent().getParent() != null) {
					if (activeMenu.getParent().getParent().getParent() != null)
						return activeMenu.getParent().getParent().getParent().getChildren();
				}
			}
		}

		return new ArrayList<Menu>();
	}

	/**
	 * 获取匹配URL的topMenu
	 * 
	 * @param activeMenu
	 * @return
	 */
	private static Menu getActiveTopMenu(Menu activeMenu) {
		if (activeMenu == null) {
			return null;
		} else if (activeMenu.getLevel() == 1) {
			return activeMenu;
		} else if (activeMenu.getLevel() == 2) {
			return activeMenu.getParent();
		} else if (activeMenu.getLevel() == 3) {
			if (activeMenu.getParent() != null) {
				return activeMenu.getParent().getParent();
			}
		} else if (activeMenu.getLevel() == 4) {
			if (activeMenu.getParent() != null) {
				if (activeMenu.getParent().getParent() != null) {
					return activeMenu.getParent().getParent().getParent();
				}
			}
		}
		return null;
	}

	
	/**
	 * 获取匹配URL的leftMenu
	 * 
	 * @param activeMenu
	 * @return
	 */
	private static Menu getActiveLeftMenu(Menu activeMenu) {
		/**
		 * 前三级对应，后面找到第三级，最多支持6级
		 */
		if (activeMenu == null) {
			return null;
		} else if (activeMenu.getLevel() <= 3) {
			return activeMenu;
		} else if (activeMenu.getLevel() == 4) {
			return activeMenu.getParent();
		}
		else if (activeMenu.getLevel() == 5) {
			if (activeMenu.getParent() != null) {
				return activeMenu.getParent().getParent();
			}
		}
		else if (activeMenu.getLevel() == 6) {
			if (activeMenu.getParent() != null) {
				if (activeMenu.getParent().getParent() != null) {
					return activeMenu.getParent().getParent().getParent();
				}
			}
		}
		return null;
	}
	/**
	 * 获取匹配URL的痕迹导航
	 * 
	 * @param activeMenu
	 * @return
	 */
	private static HashMap<Integer, Menu> getbreadCrumb(int i, Menu activeMenu, HashMap<Integer, Menu> breadCrumbHashMap) {
		if (activeMenu == null) {
			return new HashMap<Integer, Menu>();
		}
		breadCrumbHashMap.put(i, activeMenu);
		if (activeMenu.getParent() != null) {
			i++;
			getbreadCrumb(i, activeMenu.getParent(), breadCrumbHashMap);
		}
		return breadCrumbHashMap;
	}

	/**
	 * 检测leftMenu的分组权限控制
	 * 
	 * @param displayMenus
	 * @return hasPermDisplayMenus
	 */
	private static List<Menu> checkPermission(List<Menu> checkPermissionMenus) {
		List<Menu> displayMenus = new ArrayList<Menu>();
		for (Menu checkPermissionMenu : checkPermissionMenus) {
			Menu displayMenu = (Menu) checkPermissionMenu.clone();
			displayMenus.add(displayMenu);
		}
		List<Menu> noPermDisplayMenus = new ArrayList<Menu>();
		for (int i = 0; i < displayMenus.size(); i++) { // 遍历模块
			List<Menu> displayMenu = new ArrayList<Menu>(checkLeftMenuPermission(displayMenus.get(i).getChildren()));
			if (displayMenu.size() == 0) {
				noPermDisplayMenus.add(displayMenus.get(i));// 如果管理对象为0，那么删除分组
			} else {
				displayMenus.get(i).setChildren(displayMenu);
			}
		}
		displayMenus.removeAll(noPermDisplayMenus);
		return displayMenus;
	}

	/**
	 * 检测leftMenu的管理对象权限控制
	 * 
	 * @param displayMenus
	 * @return menuChilds
	 */
	private static List<Menu> checkLeftMenuPermission(List<Menu> displayMenu) {
		List<Menu> menuChilds = new ArrayList<Menu>(displayMenu);
		if (displayMenu == null) {
			return menuChilds;
		}
		List<Menu> noPermMenu = new ArrayList<Menu>();
		/*Subject suject = SecurityUtils.getSubject();
		if (suject != null) {
			for (Menu menu : menuChilds) {// 遍历管理对象
				if (StringUtils.isNotBlank(menu.getPermissionCodeConfig())
						&& !suject.isPermitted(menu.getPermissionCodeConfig())) {// 判断权限
					logger.debug(menu.getPermissionCodeConfig()
							+ "+++suject.isPermitted(menu.getPermissionCodeConfig())+++"
							+ suject.isPermitted(menu.getPermissionCodeConfig()));
					noPermMenu.add(menu);
				}
			}
			menuChilds.removeAll(noPermMenu);
		}*/
		return menuChilds;
	}
	
	/**
	 * 检测topMenu权限控制
	 * 
	 * @param Menus
	 * @return 
	 */
	private static List<Menu> checkTopMenuPermission(List<Menu> menus) {
		List<Menu> hasPermissionTopMenu = new ArrayList<Menu>();
		/*Subject suject = SecurityUtils.getSubject();

		for (Menu menu:menus) {
			if (CollectionUtils.isNotEmpty(menu.getChildren())) {
				jump:
				for (Menu childMenu:menu.getChildren()) {
					if (CollectionUtils.isNotEmpty(childMenu.getChildren())) {
						for (Menu leftMenu:childMenu.getChildren()) {
							if (StringUtils.isBlank(leftMenu.getPermissionCodeConfig())
									|| suject.isPermitted(leftMenu.getPermissionCodeConfig())) {
								hasPermissionTopMenu.add(menu);
								break jump;
							}
						}
					}
				}
			}else{
				hasPermissionTopMenu.add(menu);//首页
			}
		}*/
		return hasPermissionTopMenu;
	}
	
	/**
	 * 获取当前用户信息
	 * 
	 */
	public static void getWebPrincipal() {
		HttpServletRequest request = ApplicationContext.getRequest();
	/*	WebPrincipal webPrincipal = (WebPrincipal) SecurityUtils.getWebPrincipal();
		
		if(webPrincipal.getUserAccount() != null )
		{
			UserAccountBase userAccount = (UserAccountBase)webPrincipal.getUserAccount();
			request.setAttribute("currentAccount", userAccount.getAccount());
			request.setAttribute("currentName", userAccount.getName());
		}*/
	}

}
