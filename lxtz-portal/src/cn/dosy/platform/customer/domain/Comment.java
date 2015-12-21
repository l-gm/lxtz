package cn.dosy.platform.customer.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;


import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 学生反馈
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月11日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月11日；
 */
@Entity
@Table(name = "TBL_LXTZ_COMMENT")
public class Comment extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4804559895171838787L;
	
	/**
	 * 内容
	 * */
	private String content;
	
	/**
	 * 取消
	 * */
	private Boolean isCancle;
	
	/**
	 * 禁用
	 * */
	private Boolean forbidden;
	
	/**
	 * 学生
	 * */
	private Student student; 
	
	/**
	 * 获取 学生名称
	 */
	private String studentName;
	
	
	public Comment() {
		super(true);
		this.isCancle = false;
		this.forbidden = false;
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
	 * 获取  是否取消
	 * 
	 * @return
	 * */
	@Column(name = "IS_CANCLE")
	public Boolean getIsCancle() {
		return isCancle;
	}

	/**
	 * 设置  是否取消
	 * 
	 * @param isCancle
	 * */
	public void setIsCancle(Boolean isCancle) {
		this.isCancle = isCancle;
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
	 * 获取 学生名称
	 * @return
	 */
	@Transient
	public String getStudentName() {
		return studentName;
	}


	/**
	 * 设置 学生名称
	 * @param studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	private String iconsName;

	@Transient
	public String getIconsName() {
		return iconsName;
	}

	public void setIconsName(String iconsName) {
		this.iconsName = iconsName;
	}
	
	
	
	

}
