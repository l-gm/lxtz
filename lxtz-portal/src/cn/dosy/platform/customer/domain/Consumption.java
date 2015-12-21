package cn.dosy.platform.customer.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 消费贷款
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
@Table(name = "TBL_LXTZ_CONSUMPTION")
public class Consumption extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -528532972552152895L;
	
	/**
	 * 商品名称
	 * */
	private String goodsName;
	
	/**
	 * 商品品牌
	 * */
	private String brand;
	
	/**
	 * 商品价格
	 * */
	private Integer goodsPrice;
	
	/**
	 * 申请贷款总金额
	 * */
	private Integer applyMoney;
	
	/**
	 * 申请时间
	 * */
	private Date applyTime;
	
	/**
	 * 业务时间
	 * */
	private Date bizTime;
	
	/**
	 * 还款分期
	 * */
	private Integer months;
	
	/**
	 * 信审部意见
	 * */
	private String comment;
	
	/**
	 * 是否同意
	 * */
	private Boolean agree;
	
	/**
	 * 申请人Id
	 * */
	private String studentId;
	
	/**
	 * 申请人姓名
	 * */
	private String studentName;
	
	/**
	 * 备注
	 * */
	private String note;
	
	
	public Consumption() {
		super(true);
	}


	/**
	 * 获取   商品名称
	 * 
	 * @return
	 * */
	@Column(name = "GOODS_NAME")
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * 设置  商品名称
	 * 
	 * @param goodsName
	 * */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * 获取   商品品牌
	 * 
	 * @return
	 * */
	@Column(name = "BRAND")
	public String getBrand() {
		return brand;
	}

	/**
	 * 设置  商品品牌
	 * 
	 * @param brand
	 * */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 获取   商品价格
	 * 
	 * @return
	 * */
	@Column(name = "GOODS_PRICE")
	public Integer getGoodsPrice() {
		return goodsPrice;
	}

	/**
	 * 设置  商品价格
	 * 
	 * @param goodsPrice
	 * */
	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	/**
	 * 获取   申请贷款总金额
	 * 
	 * @return
	 * */
	@Column(name = "APPLY_MONEY")
	public Integer getApplyMoney() {
		return applyMoney;
	}

	/**
	 * 设置  申请贷款总金额
	 * 
	 * @param applyMoney
	 * */
	public void setApplyMoney(Integer applyMoney) {
		this.applyMoney = applyMoney;
	}

	/**
	 * 获取   申请时间
	 * 
	 * @return
	 * */
	@Column(name = "APPLY_TIME")
	public Date getApplyTime() {
		return applyTime;
	}

	/**
	 * 设置  申请时间
	 * 
	 * @param applyTime
	 * */
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * 获取   业务时间
	 * 
	 * @return
	 * */
	@Column(name = "BIZ_TIME")
	public Date getBizTime() {
		return bizTime;
	}

	/**
	 * 设置  业务时间
	 * 
	 * @param bizTime
	 * */
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	/**
	 * 获取   还款分期
	 * 
	 * @return
	 * */
	@Column(name = "MONTHS")
	public Integer getMonths() {
		return months;
	}

	/**
	 * 设置  还款分期
	 * 
	 * @param months
	 * */
	public void setMonths(Integer months) {
		this.months = months;
	}

	/**
	 * 获取   信审部意见
	 * 
	 * @return
	 * */
	@Column(name = "COMMENT")
	public String getComment() {
		return comment;
	}

	/**
	 * 设置  信审部意见
	 * 
	 * @param comment
	 * */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 获取   是否同意
	 * 
	 * @return
	 * */
	@Column(name = "AGREE")
	public Boolean getAgree() {
		return agree;
	}

	/**
	 * 设置  是否同意
	 * 
	 * @param agree
	 * */
	public void setAgree(Boolean agree) {
		this.agree = agree;
	}

	/**
	 * 获取   申请人Id
	 * 
	 * @return
	 * */
	@Column(name = "STUDENT_ID")
	public String getStudentId() {
		return studentId;
	}

	/**
	 * 设置  申请人Id
	 * 
	 * @param studentId
	 * */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * 获取   申请人姓名
	 * 
	 * @return
	 * */
	@Column(name = "STUDENT_NAME")
	public String getStudentName() {
		return studentName;
	}

	/**
	 * 设置  申请人姓名
	 * 
	 * @param studentName
	 * */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * 获取  备注
	 * 
	 * @return
	 * */
	@Column(name = "NOTE")
	public String getNote() {
		return note;
	}

	/**
	 * 设置  备注
	 * 
	 * @param note
	 * */
	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	

}
