package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;


/**
 * <p>
 * 视频
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
@Table(name = "TBL_LXTZ_ADV_VIDEO")
public class AdvVideo extends AbstractDomainEntity implements Serializable{

	private static final long serialVersionUID = -1249966706410187218L;

	/**
	 * 视频内容
	 */
	private String content;
	

	public AdvVideo() {
		super(true);
	}

	/**
	 * 获取 视频内容
	 * @return
	 */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * 设置 视频内容
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	
	
}
