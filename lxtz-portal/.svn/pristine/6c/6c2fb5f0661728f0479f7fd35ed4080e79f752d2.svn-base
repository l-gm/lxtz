package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 公司简介
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
@Table(name = "TBL_LXTZ_COMPANY_PROFILE")
public class CompanyProfile extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 内容
	 * */
	private String content;
	
	public CompanyProfile() {
		super(true);
	}
	
	/**
	 * 获取  内容
	 * 
	 * @return
	 * */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * 设置  内容
	 * 
	 * @param content
	 * */
	public void setContent(String content) {
		this.content = content;
	}

}
