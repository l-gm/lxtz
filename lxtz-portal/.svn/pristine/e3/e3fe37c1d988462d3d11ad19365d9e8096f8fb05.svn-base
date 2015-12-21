package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.AdvVideo;

public class AdvVideoDAO implements IAdvVideoDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(AdvVideo advVideo) {
		sessionFactory.getCurrentSession().save(advVideo);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdvVideo> queryAll() {
		String hql = "from AdvVideo";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void del(String id) {
		String hql = "delete AdvVideo u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();

	}

	@Override
	public void update(AdvVideo advVideo) {
		sessionFactory.getCurrentSession().update(advVideo);
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public AdvVideo findById(String id) {
		String hql = "from AdvVideo u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (AdvVideo) query.uniqueResult();
	}
}
