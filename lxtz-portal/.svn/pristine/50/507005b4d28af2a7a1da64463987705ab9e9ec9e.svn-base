package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 版面转换
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
@Table(name = "TBL_LXTZ_CONVERSION_LAYOUT")
public class ConversionLayout extends AbstractDomainEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1249966706410187218L;
	
	/**
	 * 是否隐藏
	 */
	private Boolean isHidden;
	
	public ConversionLayout() {
		super(true);
	}

	/**
	 * 获取 是否隐藏
	 * @return
	 */
	@Column(name = "ISHIDDEN")
	public Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * 设置 是否隐藏
	 * @param isHidden
	 */
	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}
	

}
