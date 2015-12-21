package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.AdvImg;

public class AdvImgDAO implements IAdvImgDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(AdvImg advImg) {
		sessionFactory.getCurrentSession().save(advImg);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdvImg> queryAll() {
		String hql = "from AdvImg";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void del(String id) {
		String hql = "delete AdvImg u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();

	}

	@Override
	public void update(AdvImg advImg) {
		sessionFactory.getCurrentSession().update(advImg);
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public AdvImg findById(String id) {
		String hql = "from AdvImg u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (AdvImg) query.uniqueResult();
	}
}
