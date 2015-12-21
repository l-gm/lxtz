package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;


/**
 * <p>
 * 门户音乐
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
@Table(name = "TBL_LXTZ_ADV_MUSIC")
public class AdvMusic extends AbstractDomainEntity implements Serializable{

	private static final long serialVersionUID = -1249966706410187217L;

	/**
	 * 音乐名称
	 */
	private String musicName;
	
	/**
	 * 音乐数据
	 */
	private byte[] musicData;
	
	public AdvMusic() {
		super(true);
	}

	/**
	 * 获取 音乐名称
	 * @return
	 */
	@Column(name = "MUSIC_NAME")
	public String getMusicName() {
		return musicName;
	}

	/**
	 * 设置 音乐名称
	 * @param musicName
	 */
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	/**
	 * 获取 音乐数据
	 * @return
	 */
	@Column(name = "MUSIC_DATA")
	public byte[] getMusicData() {
		return musicData;
	}

	/**
	 * 设置 音乐数据
	 * @param musicData
	 */
	public void setMusicData(byte[] musicData) {
		this.musicData = musicData;
	}

	
}
