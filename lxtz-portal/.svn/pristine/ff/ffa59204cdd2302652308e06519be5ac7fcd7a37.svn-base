package cn.dosy.platform.customer.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 商家招聘
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月16日
 * </p>
 * 
 * @author TM
 * @history 创建文档；Mender:MM；Date:2014年12月20日；
 */
@Entity
@Table(name = "TBL_LXTZ_MERCHANT_JOB")
public class MerchantJob extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2714902034166389086L;
	
	/**
	 * 兼职标题
	 * */
	private String jobTitle;
	
	/**
	 * 招聘人数
	 */
	private Integer num;
	
	/**
	 * 有效时间
	 * */
	private String effectiveTime;
	
	/**
	 * 薪资水平
	 */
	private String salaryLevel;
	
	/**
	 * 联系电话
	 */
	private String phone;
	
	/**
	 * 兼职时间
	 */
	private String partTime;
	
	/**
	 * 工作区域
	 */
	private String workArea;
	
	/**
	 * 详细地址
	 */
	private String address;
	
	/**
	 * 岗位职责
	 */
	private String jobResponsibilities;
	
	/**
	 * 公司简介
	 */
	private String companyProfile;
	
	/**
	 * 企业Id
	 * */
	private String merchantId;
	
	/**
	 * 企业名称
	 * */
	private String merchantName;
	
	/**
	 * 禁用
	 * */
	private Boolean forbidden;
	
	/**
	 * 浏览人数
	 * */
	private Integer readNum;
	
	
	public MerchantJob() {
		super(true);
		this.forbidden = false;
		this.readNum = 0;
	}

	/**
	 * 获取 兼职标题
	 * @return
	 */
	@Column(name = "JOB_TITLE")
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * 设置 兼职标题
	 * @param jobTitle
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * 获取 招聘人数
	 * @return
	 */
	@Column(name = "NUM")
	public Integer getNum() {
		return num;
	}

	/**
	 * 设置 招聘人数
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	
	/**
	 * 获取 薪资水平
	 * @return
	 */
	@Column(name = "SALARY_LEVEL")
	public String getSalaryLevel() {
		return salaryLevel;
	}

	/**
	 * 设置 薪资水平
	 * @param salaryLevel
	 */
	public void setSalaryLevel(String salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	/**
	 * 获取 联系电话
	 * @return
	 */
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置 联系电话
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取 工作区域
	 * @return
	 */
	@Column(name = "WORK_AREA")
	public String getWorkArea() {
		return workArea;
	}

	/**
	 * 设置 工作区域
	 * @param workArea
	 */
	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}

	/**
	 * 获取 详细地址
	 * @return
	 */
	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * 设置 详细地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取岗位职责
	 * @return
	 */
	@Column(name = "JOB_RESPONSIBILITIES")
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}

	/**
	 * 设置 岗位职责
	 * @param jobResponsibilities
	 */
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}

	/**
	 * 获取 公司简介
	 */
	@Column(name = "COMPANY_PROFILE")
	public String getCompanyProfile() {
		return companyProfile;
	}

	/**
	 * 设置 公司简介
	 * @param companyProfile
	 */
	public void setCompanyProfile(String companyProfile) {
		this.companyProfile = companyProfile;
	}

	/**
	 * 获取  企业ID
	 * 
	 * @return
	 * */
	@Column(name = "MERCHANT_ID")
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * 设置  企业ID
	 * 
	 * @param merchantId
	 * */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * 获取  企业名称
	 * 
	 * @return
	 * */
	@Column(name = "MERCHANT_NAME")
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * 设置  企业名称
	 * 
	 * @param merchantName
	 * */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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
	 * 获取  有效时间
	 * 
	 * @return 
	 * */
	@Column(name = "EFFECTIVE_TIME")
	public String getEffectiveTime() {
		return effectiveTime;
	}

	/**
	 * 设置  
	 * 
	 * @param  effectiveTime
	 * */
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	/**
	 * 获取  兼职时间
	 * 
	 * @return 
	 * */
	@Column(name = "PART_TIME")
	public String getPartTime() {
		return partTime;
	}

	/**
	 * 设置  
	 * 
	 * @param  partTime
	 * */
	public void setPartTime(String partTime) {
		this.partTime = partTime;
	}

	/**
	 * 获取  查阅人数
	 * 
	 * @return 
	 * */
	@Column(name = "READ_NUM")
	public Integer getReadNum() {
		return readNum;
	}

	/**
	 * 设置  查阅人数
	 * 
	 * @param  readNum
	 * */
	public void setReadNum(Integer readNum) {
		this.readNum = readNum;
	}

	
	
}
