package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.Blogroll;
import cn.dosy.platform.core.utils.StringUtils;

public class BlogrollDAO implements IBlogrollDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Blogroll blogroll) {
		sessionFactory.getCurrentSession().save(blogroll);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Blogroll u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
		
	}

	@Override
	public void update(Blogroll blogroll) {
		sessionFactory.getCurrentSession().update(blogroll);
		sessionFactory.getCurrentSession().flush();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Blogroll> query(Blogroll blogroll) {
		String hql = "from Blogroll u where 1 = 1";
		
		if (StringUtils.isNotBlank(blogroll.getWord())) {
			hql = hql + " and u.word = :word";
		}
		if (StringUtils.isNotBlank(blogroll.getLink())) {
			hql = hql + " and u.link = :link";
		}
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(blogroll.getWord())) {
			query.setString("word", blogroll.getWord());
		}
		if (StringUtils.isNotBlank(blogroll.getLink())) {
			query.setString("link", blogroll.getLink());
		}
		return query.list();
	}
	
	@Override
	public Blogroll findById(String id) {
		String hql = "from Blogroll u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Blogroll) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Blogroll> findAll() {
		String hql = "from Blogroll";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
}
