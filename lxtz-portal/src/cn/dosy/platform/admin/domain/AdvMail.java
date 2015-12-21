package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;


/**
 * <p>
 * 邮件
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月20日
 * </p>
 * 
 * @author TM
 * @history 创建文档；Mender:TM；Date:2014年12月20日；
 */

@Entity
@Table(name = "TBL_LXTZ_ADV_MAIL")
public class AdvMail extends AbstractDomainEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 邮件标题
	 */
	private String title;
	
	/**
	 * 邮件内容
	 */
	
	private String content;
	
	/**
	 * 接收人数
	 */
	private Integer num;
	
	public AdvMail() {
		super(true);
	}

	/**
	 * 获取 邮件标题
	 * @return
	 */
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}

	/**
	 * 设置 邮件标题
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取 邮件内容
	 * @return
	 */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * 设置 邮件内容
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取 发送人数
	 * @return
	 */
	@Column(name = "NUM")
	public Integer getNum() {
		return num;
	}

	/**
	 * 设置 发送人数
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
}
