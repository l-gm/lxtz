package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;


/**
 * <p>
 * 商家广告
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
@Table(name = "TBL_LXTZ_ADV_IMG")
public class AdvImg extends AbstractDomainEntity implements Serializable{
	
	private static final long serialVersionUID = -1249966706410187219L;

	/**
	 * 图片名称
	 */
	private String imgName;
	
	/**
	 * 图片数据
	 */
	private byte[] imgData;
	
	/**
	 * 图片标识
	 */
	private Integer located;

	public AdvImg() {
		super(true);
	}

	/**
	 * 获取 图片名称
	 * @return
	 */
	@Column(name = "IMG_NAME")
	public String getImgName() {
		return imgName;
	}

	/**
	 * 设置 图片名称
	 * @param imgName
	 */
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	/**
	 * 获取 图片数据
	 * @return
	 */
	@Column(name = "IMG_DATA")
	public byte[] getImgData() {
		return imgData;
	}

	/**
	 * 设置 图片数据
	 * @param imgData
	 */
	public void setImgData(byte[] imgData) {
		this.imgData = imgData;
	}

	/**
	 * 获取 图片标识
	 * @return
	 */
	@Column(name = "LOCATED")
	public Integer getLocated() {
		return located;
	}

	/**
	 * 设置 图片标识
	 * @param located
	 */
	public void setLocated(Integer located) {
		this.located = located;
	}
	
	
}
