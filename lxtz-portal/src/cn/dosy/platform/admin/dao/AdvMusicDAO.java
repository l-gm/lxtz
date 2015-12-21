package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.AdvMusic;

public class AdvMusicDAO implements IAdvMusicDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(AdvMusic advMusic) {
		sessionFactory.getCurrentSession().save(advMusic);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdvMusic> queryAll() {
		String hql = "from AdvMusic";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void del() {
		String hql = "delete AdvMusic ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.executeUpdate();

	}

	@Override
	public void update(AdvMusic advMusic) {
		sessionFactory.getCurrentSession().update(advMusic);
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public AdvMusic findById(String id) {
		String hql = "from AdvMusic u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (AdvMusic) query.uniqueResult();
	}
}
