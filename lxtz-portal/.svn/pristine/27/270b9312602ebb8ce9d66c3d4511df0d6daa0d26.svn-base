package cn.dosy.platform.admin.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 理财频道
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
 * @author TM
 * @history 创建文档；Mender:TM；Date:2014年12月07日；
 */
@Entity
@Table(name = "TBL_LXTZ_FINANCIAL")
public class Financial extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 标题
	 * */
	private String title;
	
	/**
	 * 新闻摘要
	 * */
	private String financialAbstract;
	
	/**
	 * 文章内容
	 * */
	private String content;
	
	/**
	 * 来源
	 * */
	private String source;
	
	/**
	 * 是否热点
	 * */
	private Boolean isHot;
	
	/**
	 * 是否隐藏
	 * */
	private Boolean isHidden;
	
	/**
	 * 附件列表
	 * */
	private Set<MessageAttachment> attachments;
	
	
	public Financial() {
		super(true);
		this.isHot = false;
		this.isHidden = false;
	}
	
	public Financial(String id, String title, String financialAbstract, String source, Boolean isHot, Boolean isHidden, Date lastModifiedDate) {
		this.id = id;
		this.title = title;
		this.financialAbstract = financialAbstract;
		this.source = source;
		this.isHot = isHot;
		this.isHidden = isHidden;
		this.lastModifiedDate = lastModifiedDate;
	}


	/**
	 * 获取  标题
	 * 
	 * @return
	 * */
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}

	/**
	 * 设置  标题
	 * 
	 * @param title
	 * */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取  文章内容
	 * 
	 * @return
	 * */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * 设置  文章内容
	 * 
	 * @param content
	 * */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取  来源
	 * 
	 * @return
	 * */
	@Column(name = "SOURCE")
	public String getSource() {
		return source;
	}

	/**
	 * 设置  来源
	 * 
	 * @param source
	 * */
	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * 获取  附件列表
	 * 
	 * @return
	 * */
	@Transient
	public Set<MessageAttachment> getAttachments() {
		return attachments;
	}

	/**
	 * 设置  附件列表
	 * 
	 * @param attachments
	 * */
	public void setAttachments(Set<MessageAttachment> attachments) {
		this.attachments = attachments;
	}

	/**
	 * 获取  是否热点
	 * 
	 * @return
	 * */
	@Column(name = "IS_HOT")
	public Boolean getIsHot() {
		return isHot;
	}

	/**
	 * 设置  是否热点
	 * 
	 * @param isHot
	 * */
	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	/**
	 * 获取  
	 * 
	 * @return
	 * */
	@Column(name = "IS_HIDDEN")
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * 设置  是否隐藏
	 * 
	 * @param isHidden
	 * */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * 获取  理财摘要
	 * 
	 * @return
	 * */
	@Column(name = "FINANCIAL_ABSTRACT")
	public String getFinancialAbstract() {
		return financialAbstract;
	}

	/**
	 * 设置  理财摘要
	 * 
	 * @param financialAbstract
	 * */
	public void setFinancialAbstract(String financialAbstract) {
		this.financialAbstract = financialAbstract;
	}
	
	
	

}
