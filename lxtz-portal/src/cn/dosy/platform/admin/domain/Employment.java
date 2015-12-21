package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 招聘信息
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
@Table(name = "TBL_LXTZ_EMPLOY_MENT")
public class Employment extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 内容
	 * */
	private String content;
	
	/**
	 * 职位月薪
	 */
	private String positionmonthlysalary;
	
	/**
	 * 工作地点
	 */
	private String workingplace;
	
	/**
	 * 工作性质
	 */
	private String natureofwork;
	
	/**
	 * 工作经验
	 */
	private String workexperience;
	
	/**
	 * 最低学历
	 */
	private String minimumdegree;
	
	/**
	 * 招聘人数
	 */
	private String hiringnum;
	
	/**
	 * 职位类别
	 */
	private String jobcategory;
	
	/**
	 * 岗位职责
	 */
	private String responsibility;
	
	/**
	 * 任职资格
	 */
	private String qualifications;
	
	public Employment() {
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

	/**
	 * 获取 职位月薪
	 * @return
	 */
	@Column(name = "POSITION_MONTHLY_SALARY")
	public String getPositionmonthlysalary() {
		return positionmonthlysalary;
	}

	/**
	 * 设置 职位月薪
	 * @param positionmonthlysalary
	 */
	public void setPositionmonthlysalary(String positionmonthlysalary) {
		this.positionmonthlysalary = positionmonthlysalary;
	}

	/**
	 * 获取 工作地点
	 * @return
	 */
	@Column(name = "WORKING_PLACE")
	public String getWorkingplace() {
		return workingplace;
	}

	/**
	 * 设置 工作地点
	 * @param working_place
	 */
	public void setWorkingplace(String workingplace) {
		this.workingplace = workingplace;
	}

	/**
	 * 获取 工作性质
	 * @return
	 */
	@Column(name = "NATURE_OFWORK")
	public String getNatureofwork() {
		return natureofwork;
	}

	/**
	 * 设置 工作性质
	 * @param natureofwork
	 */
	public void setNatureofwork(String natureofwork) {
		this.natureofwork = natureofwork;
	}

	/**
	 * 获取 工作经验
	 * @return
	 */
	@Column(name = "WORK_EXPERIENCE")
	public String getWorkexperience() {
		return workexperience;
	}

	/**
	 * 设置 工作经验
	 * @param workexperience
	 */
	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}

	/**
	 * 获取 最低学历
	 * @return
	 */
	@Column(name = "MINIMUM_DEGREE")
	public String getMinimumdegree() {
		return minimumdegree;
	}

	/**
	 * 设置 最低学历
	 * @param minimum_degree
	 */
	public void setMinimumdegree(String minimumdegree) {
		this.minimumdegree = minimumdegree;
	}

	/**
	 * 获取 招聘人数
	 * @return
	 */
	@Column(name = "HIRING_NUM")
	public String getHiringnum() {
		return hiringnum;
	}

	/**
	 * 设置 招聘人数
	 * @param hiringnum
	 */
	public void setHiringnum(String hiringnum) {
		this.hiringnum = hiringnum;
	}

	/**
	 * 获取 职位类别
	 * @return
	 */
	@Column(name = "JOB_CATEGORY")
	public String getJobcategory() {
		return jobcategory;
	}

	/**
	 * 设置 职位类别
	 * @param jobcategory
	 */
	public void setJobcategory(String jobcategory) {
		this.jobcategory = jobcategory;
	}

	/**
	 * 获取 岗位职责
	 * @return
	 */
	@Column(name = "RESPONSIBILITY")
	public String getResponsibility() {
		return responsibility;
	}

	/**
	 * 设置 岗位职责
	 * @param responsibility
	 */
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	/**
	 * 获取 任职资格
	 * @return
	 */
	@Column(name = "QUALIFICATIONS")
	public String getQualifications() {
		return qualifications;
	}

	/**
	 * 设置 任职资格
	 * @param qualifications
	 */
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	
	

}
