package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IMessageAttachmentDAO;
import cn.dosy.platform.admin.domain.MessageAttachment;

public class MessageAttachmentManager implements IMessageAttachmentManager{
	
	public IMessageAttachmentDAO messageAttachmentDAO;

	public void setMessageAttachmentDAO(IMessageAttachmentDAO messageAttachmentDAO) {
		this.messageAttachmentDAO = messageAttachmentDAO;
	}
	

	@Override
	public void add(MessageAttachment messageAttachment) {
		messageAttachmentDAO.add(messageAttachment);
	}

	@Override
	public List<MessageAttachment> findByMessageId(String messageId) {
		return messageAttachmentDAO.findByMessageId(messageId);
	}

	@Override
	public void removeByMessageId(String messageId) {
		messageAttachmentDAO.removeByMessageId(messageId);
	}

	@Override
	public void removeById(String id) {
		messageAttachmentDAO.removeById(id);
	}

}
