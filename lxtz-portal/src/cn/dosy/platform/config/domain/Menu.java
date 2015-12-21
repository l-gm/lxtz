package cn.dosy.platform.config.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.dosy.platform.core.domain.Named;
import cn.dosy.platform.core.domain.Structured;
import cn.dosy.platform.core.utils.StringUtils;

/**
 * <p>
 * 功能菜单
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
public class Menu implements Named, Structured<Menu> ,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menu() {
		this.children = new ArrayList<Menu>();;
		this.active = false;
	}

	protected Menu parent;

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Structured#getParent()
	 */
	public Menu getParent() {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.platform.core.domain.Structured#setParent(java.lang.Object)
	 */
	public void setParent(Menu parent) {
		this.parent = parent;
	}

	protected List<Menu> children;

	/*
	 * (non-Javadoc)
	 * 
	 * @see gov.platform.core.domain.Structured#getChildren()
	 */
	public List<Menu> getChildren() {
		return this.children;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * gov.platform.core.domain.Structured#setChildren(java.util.List)
	 */
	public void setChildren(List<Menu> children) {
		this.children = children;
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

	protected String permissionCodeConfig;

	/**
	 * 获取属性：操作权限代码配置
	 * 
	 * @return permissionCodeConfig
	 */
	public String getPermissionCodeConfig() {
		return this.permissionCodeConfig;
	}

	/**
	 * 属性设置：操作权限代码配置
	 * 
	 * @param permissionCodeConfig
	 */
	public void setPermissionCodeConfig(String permissionCodeConfig) {
		this.permissionCodeConfig = permissionCodeConfig;
	}
	
	/**
	 * 获取属性：操作权限代码配置
	 * 
	 * @return permissionCodeConfig
	 */
	public List<String> getPermissionCodes() {
		if(StringUtils.isNotBlank(this.permissionCodeConfig))
		{
			return Arrays.asList(this.permissionCodeConfig.replace(" ", "").split("||"));
		}
		return null;
	}

	protected int level;

	/**
	 * 获取属性 层级
	 * 1、模块，2、分组，3、管理对象
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * 设置属性层级
	 * 
	 * 
	 * @param level
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	protected int ordered;

	/**
	 * 获取属性：排序
	 * 
	 * @return ordered
	 */
	public int getOrdered() {
		return this.ordered;
	}

	/**
	 * 属性设置：排序
	 * 
	 * @param ordered
	 */
	public void setOrdered(int ordered) {
		this.ordered = ordered;
	}

	protected String cssClass;

	/**
	 * 设置 菜单样式风格
	 * 
	 * @param cssClass
	 *            菜单样式风格
	 */
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

	/**
	 * 获取 菜单样式风格
	 * 
	 * @return 菜单样式风格
	 */
	public String getCssClass() {
		return this.cssClass;
	}

	protected String iconURI;

	/**
	 * 设置 图片URI
	 * 
	 * @param iconURI
	 *            
	 */
	public void setIconURI(String iconURI) {
		this.iconURI = iconURI;
	}

	/**
	 * 获取 图片URI
	 * 
	 * @return 
	 */
	public String getIconURI() {
		return this.iconURI;
	}
	
	protected String menuURI;

	/**
	 * 获取属性：菜单URI
	 * 
	 * @return menuURI
	 */
	public String getMenuURI() {
		return this.menuURI;
	}

	/**
	 * 属性设置：菜单URI
	 * 
	 * @param menuURI
	 */
	public void setMenuURI(String menuURI) {
		this.menuURI = menuURI;
	}
	
	protected String description;

	/**
	 * 获取属性：描述
	 * 
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * 属性设置：描述
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	private Boolean active;

	/**
	 * 获取属性：description
	 * 
	 * @return isActive
	 */
	public Boolean getActive() {
		return this.active;
	}

	/**
	 * 属性设置：description
	 * 
	 * @param isActive
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	public Object clone(){    
	     Object obj=null;    
	     try{    
	    	 obj=(Menu)super.clone();    
	      }catch(CloneNotSupportedException e) {    
	           e.printStackTrace();
	      }    
	      return obj;    
	 }    
	
	
}
