package cn.dosy.platform.admin.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 文章附件
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月02日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月02日；
 */
@Entity
@Table(name = "TBL_LXTZ_MESSAGE_ATTACHMENT")
public class MessageAttachment extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4128911709134902638L;
	
	/**
	 * 附件名称
	 * */
	private String fileName;
	
	/**
	 * 附件路径
	 * */
	private String filePath;
	
	/**
	 * 附件内容
	 * */
	private byte[] fileData;
	
	/**
	 * 所属文章id
	 * */
	private String messageId;
	
	
	public MessageAttachment() {
		super(true);
	}


	/**
	 * 获取  附件名称
	 * 
	 * @return
	 * */
	@Column(name = "FILE_NAME")
	public String getFileName() {
		return fileName;
	}

	/**
	 * 设置  附件名称
	 * 
	 * @param fileName
	 * */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 获取  附件路径
	 * 
	 * @return
	 * */
	@Column(name = "FILE_PATH")
	public String getFilePath() {
		return filePath;
	}

	/**
	 * 设置  附件路径
	 * 
	 * @param  filePath
	 * */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * 获取  附件内容
	 * 
	 * @return
	 * */
	@Column(name = "FILE_DATA")
	public byte[] getFileData() {
		return fileData;
	}

	/**
	 * 设置 附件内容
	 * 
	 * @param fileData
	 * */
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	/**
	 * 获取  所属文章id
	 * 
	 * @return
	 * */
	@Column(name = "MESSAGE_ID")
	public String getMessageId() {
		return messageId;
	}

	/**
	 * 设置 所属文章id
	 * 
	 * @param messageId
	 * */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	

}
