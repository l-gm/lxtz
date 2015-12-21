package cn.dosy.platform.customer.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <p>
 * 个人求职
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
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月16日；
 */
@Entity
@Table(name = "TBL_LXTZ_STUDENT_JOB")
public class StudentJob extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3917810899528110595L;
	
	/**
	 * 标题
	 * */
	private String title;
	
	/**
	 * 内容
	 * */
	private String content;
	
	/**
	 * 学生
	 * */
	private Student student; 
	
	/**
	 * 禁用
	 * */
	private Boolean forbidden;
	
	
	public StudentJob() {
		super(true);
		this.forbidden = false;
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

	/**
	 * 获取  学生
	 * 
	 * @return
	 * */
	@JsonIgnore 
	@ManyToOne(cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	public Student getStudent() {
		return student;
	}

	/**
	 * 设置  学生
	 * 
	 * @param student
	 * */
	public void setStudent(Student student) {
		this.student = student;
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
	
	
}
