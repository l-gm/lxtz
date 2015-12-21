package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.ContactUs;

public class ContactUsDAO implements IContactUsDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContactUs> findAll() {
		String hql = "from ContactUs";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void update(ContactUs contactUs) {
		sessionFactory.getCurrentSession().update(contactUs);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public ContactUs findById(String id) {
		String hql = "from ContactUs u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (ContactUs) query.uniqueResult();
	}

}
