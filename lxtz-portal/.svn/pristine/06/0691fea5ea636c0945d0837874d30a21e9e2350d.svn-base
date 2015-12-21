package cn.dosy.platform.security.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 用户
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
@Entity
@Table(name = "TBL_LXTZ_SEC_USER")
public class User extends AbstractDomainEntity implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7562630550290270840L;
	
	
	/**
	 * 账号
	 * */	
	private String account;
	
	/**
	 * 密码
	 * */
	private String password;
	
	/**
	 * 名称
	 * */
	private String name;
	
	/**
	 * 是否可用
	 * */
	private Boolean enabled;
	
	/**
	 * 性别
	 * */
	private Boolean sex;
	
	/**
	 * 用户角色
	 * */
	private UserRole userRole;
	
	/**
	 * QQ
	 * */
	private String qq;
	
	/**
	 * 联系方式
	 * */
	private String phone;
	
	/**
	 * 邮箱
	 * */
	private String email;
	
	
	public User() {
		super(true);
	}



	/**
	 * 获取  账号
	 * 
	 * @return  account 账号
	 * */
	@Column(name = "ACCOUNT")
	public String getAccount() {
		return account;
	}



	/**
	 * 设置 账号
	 * 
	 * @param  account 账号
	 * */
	public void setAccount(String account) {
		this.account = account;
	}



	/**
	 * 获取  密码
	 * 
	 * @return  password 密码
	 * */
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}



	/**
	 * 设置 密码
	 * 
	 * @param  password 密码
	 * */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * 获取  用户名
	 * 
	 * @return  name 用户名
	 * */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}



	/**
	 * 设置  用户名
	 * 
	 * @param  name 用户名
	 * */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * 获取  是否可用
	 * 
	 * @return  enabled 是否可用
	 * */
	@Column(name = "ENABLED")
	public Boolean isEnabled() {
		return enabled;
	}



	/**
	 * 设置 是否可用
	 * 
	 * @param  enabled 是否可用
	 * */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	
	
	/**
	 * 获取  性别
	 * 
	 * @return  sex 性别
	 * */
	@Column(name = "SEX")
	public Boolean getSex() {
		return sex;
	}



	/**
	 * 设置 性别
	 * 
	 * @param  sex 性别
	 * */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}


	/**
	 * 获取  用户角色
	 * 
	 * @return  userRole 用户角色
	 * */
	@Column(name = "USERROLE")
	@Enumerated
	public UserRole getUserRole() {
		return userRole;
	}



	/**
	 * 设置 用户角色
	 * 
	 * @param  userRole 用户角色
	 * */
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}



	/**
	 * 获取  QQ
	 * 
	 * @return  QQ QQ
	 * */
	@Column(name = "QQ")
	public String getQq() {
		return qq;
	}



	/**
	 * 设置  QQ
	 * 
	 * @param  QQ QQ
	 * */
	public void setQq(String qq) {
		this.qq = qq;
	}



	/**
	 * 获取  联系电话
	 * 
	 * @return  phone 联系电话
	 * */
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}



	/**
	 * 设置  联系电话
	 * 
	 * @param  phone 联系电话
	 * */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * 获取  邮箱
	 * 
	 * @return  email 邮箱
	 * */
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}



	/**
	 * 设置  邮箱
	 * 
	 * @param  email 邮箱
	 * */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
