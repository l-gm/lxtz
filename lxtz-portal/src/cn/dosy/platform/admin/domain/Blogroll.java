package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 友情链接
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
@Table(name = "TBL_LXTZ_BLOGROLL")
public class Blogroll extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 链接名称
	 */
	private String word;
	
	/**
	 * 链接
	 */
	private String link;
	
	public Blogroll() {
		super(true);
	}
	
	/**
	 * 获取  链接名称
	 * 
	 * @return
	 * */
	@Column(name = "WORD")
	public String getWord() {
		return word;
	}

	/**
	 * 设置  链接名称
	 * 
	 * @param word
	 * */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * 获取  链接
	 * @return
	 */
	@Column(name = "LINK")
	public String getLink() {
		return link;
	}

	/**
	 * 设置链接
	 * @param link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	
	
}
