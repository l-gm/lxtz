package cn.dosy.platform.customer.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 商家
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月07日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月07日；
 */
@Entity
@Table(name = "TBL_LXTZ_MERCHANT")
public class Merchant extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2670379603083615646L;
	
	/**
	 * 用户名
	 * */
	private String account;
	
	/**
	 * 密码
	 * */
	private String password;
	
	/**
	 * 公司名称
	 * */
	private String name;
	
	/**
	 * 城市
	 * */
	private String city;
	
	/**
	 * 详细地址
	 * */
	private String address;
	
	/**
	 * 联系人
	 * */
	private String contacts;
	
	/**
	 * 联系电话
	 * */
	private String telephone;
	
	/**
	 * 手机号码
	 * */
	private String phone;
	
	/**
	 * 电子邮箱
	 * */
	private String email;
	
	/**
	 * 公司简介
	 * */
	private String profile;
	
	/**
	 * 禁用
	 * */
	private Boolean forbidden;
	/**
	 * 商家评价
	 * */
	private Integer rating;
	
	
	public Merchant() {
		super(true);
		this.forbidden = false;
	}

	
	/**
	 * 获取  用户名
	 * 
	 * @return
	 * */
	@Column(name = "ACCOUNT")
	public String getAccount() {
		return account;
	}

	/**
	 * 设置  用户名
	 * 
	 * @param account
	 * */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 获取  密码
	 * 
	 * @return
	 * */
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	/**
	 * 设置  密码
	 * 
	 * @param password
	 * */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取  公司名称
	 * 
	 * @return
	 * */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * 设置  公司名称
	 * 
	 * @param name
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取  城市
	 * 
	 * @return
	 * */
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}
	
	/**
	 * 设置  城市
	 * 
	 * @param city
	 * */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获取  详细地址
	 * 
	 * @return
	 * */
	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * 设置  详细地址
	 * 
	 * @param address
	 * */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取  联系人
	 * 
	 * @return
	 * */
	@Column(name = "CONTACTS")
	public String getContacts() {
		return contacts;
	}

	/**
	 * 设置 联系人
	 * 
	 * @param contacts
	 * */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	/**
	 * 获取  联系电话
	 * 
	 * @return
	 * */
	@Column(name = "TELEPHONE")
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置   联系电话
	 * 
	 * @param telephone
	 * */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * 获取  手机号码
	 * 
	 * @return
	 * */
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置  手机号码
	 * 
	 * @param phone
	 * */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取  电子邮箱
	 * 
	 * @return
	 * */
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	/**
	 * 设置  电子邮箱
	 * 
	 * @param email
	 * */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 获取 公司简介
	 * 
	 * @return
	 * */
	@Column(name = "PROFILE")
	public String getProfile() {
		return profile;
	}

	/**
	 * 设置  公司简介
	 * 
	 * @param profile
	 * */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * 获取  是否禁用
	 * 
	 * @return 
	 * */
	@Column(name = "FORBIDDEN")
	public Boolean getForbidden() {
		return forbidden;
	}

	/**
	 * 设置  是否禁用
	 * 
	 * @param forbidden
	 * */
	public void setForbidden(Boolean forbidden) {
		this.forbidden = forbidden;
	}
	
	
	
	/**
	 * 邮箱校验码
	 * */
	private String checkCode;

	/**
	 * 获取  邮箱校验码
	 * 
	 * @return
	 * */
	@Transient
	public String getCheckCode() {
		return checkCode;
	}

	/**
	 * 设置  邮箱校验码
	 * 
	 * @param checkCode
	 * */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}


	/**
	 * 获取 商家评价
	 * @return
	 */
	@Column(name = "RATING")
	public Integer getRating() {
		return rating;
	}


	/**
	 * 设置 商家评价
	 * @param rating
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	

}
