package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.MessageAttachment;

public interface IMessageAttachmentDAO {
	
	/**
	 * 添加文章附件
	 * 
	 * @param messageAttachment
	 * 				文章附件
	 * */
	public void add(MessageAttachment messageAttachment);
	
	/**
	 * 查询对应文章的附件
	 * 
	 * @param messageId
	 * 				文章唯一标识
	 * @return
	 * */
	public List<MessageAttachment> findByMessageId(String messageId);

	/**
	 * 删除对应文章的附件
	 * 
	 * @param messageId
	 * 				文章唯一标识
	 * */
	public void removeByMessageId(String messageId);
	
	/**
	 * 删除文章附件
	 * 
	 * @param id
	 * 			唯一标识
	 * */
	public void removeById(String id);
	
}
