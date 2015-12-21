package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 联系我们
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月08日
 * </p>
 * 
 * @author TM
 * @history 创建文档；Mender:TM；Date:2014年12月08日；
 */
@Entity
@Table(name = "TBL_LXTZ_CONTACTUS")
public class ContactUs extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 客服热线
	 * */
	private String customerservicehotline;
	
	/**
	 * 公司总机
	 * */
	private String companyswitchboard;
	
	/**
	 * 传真
	 * */
	private String fax;
	
	/**
	 * QQ
	 * */
	private String qq;
	
	/**
	 * 地址
	 * */
	private String address;
	
	/**
	 * 联系我们
	 */
	private String email;
	
	public ContactUs() {
		super(true);
	}
	

	/**
	 * 获取  客服热线
	 * 
	 * @return
	 * */
	@Column(name = "CUSTOMER_SERVICE_HOTLINE")
	public String getCustomerservicehotline() {
		return customerservicehotline;
	}

	/**
	 * 设置  客服热线
	 * 
	 * @param customer_service_hotline
	 * */
	public void setCustomerservicehotline(String customerservicehotline) {
		this.customerservicehotline = customerservicehotline;
	}


	/**
	 * 获取 公司总机
	 * @return
	 */
	@Column(name = "COMPANY_SWITCH_BOARD")
	public String getCompanyswitchboard() {
		return companyswitchboard;
	}


	/**
	 * 设置 公司总机
	 * @param company_switch_board
	 */
	public void setCompanyswitchboard(String companyswitchboard) {
		this.companyswitchboard = companyswitchboard;
	}


	/**
	 * 获取 传真
	 * @return
	 */
	@Column(name = "FAX")
	public String getFax() {
		return fax;
	}


	/**
	 * 设置 传真
	 * @param fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}


	/**
	 * 获取 QQ
	 * @return
	 */
	@Column(name = "QQ")
	public String getQq() {
		return qq;
	}


	/**
	 * 设置 QQ
	 * @param qq
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}


	/**
	 * 获取 地址
	 * @return
	 */
	@Column(name = "ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * 设置 地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * 获取 邮箱
	 * @return
	 */
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}


	/**
	 * 设置 邮箱
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
