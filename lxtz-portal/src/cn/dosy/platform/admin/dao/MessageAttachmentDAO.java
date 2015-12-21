package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.MessageAttachment;

public class MessageAttachmentDAO implements IMessageAttachmentDAO{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public void add(MessageAttachment messageAttachment) {
		sessionFactory.getCurrentSession().save(messageAttachment);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MessageAttachment> findByMessageId(String messageId) {
		String hql = "from MessageAttachment u where u.messageId=:messageId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("messageId", messageId);
		
		return query.list();
	}

	@Override
	public void removeByMessageId(String messageId) {
		String hql = "delete MessageAttachment u where u.messageId=:messageId";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("messageId", messageId);
		query.executeUpdate();
	}


	@Override
	public void removeById(String id) {
		String hql = "delete MessageAttachment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

}
