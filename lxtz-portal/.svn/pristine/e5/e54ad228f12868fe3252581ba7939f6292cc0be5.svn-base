package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.ConversionLayout;

public class ConversionLayoutDAO implements IConversionLayoutDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ConversionLayout> findAll() {
		String hql = "from ConversionLayout";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void update(ConversionLayout conversionLayout) {
		sessionFactory.getCurrentSession().update(conversionLayout);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public ConversionLayout findById(String id) {
		String hql = "from ConversionLayout u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (ConversionLayout) query.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ConversionLayout> query(ConversionLayout conversionLayout) {
		String hql = "from ConversionLayout u where 1 = 1";
		
		if (conversionLayout.getIsHidden() != null) {
			hql = hql + " and u.ishidden = :ishidden";
		}

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (conversionLayout.getIsHidden() != null) {
			query.setBoolean("ishidden", conversionLayout.getIsHidden());
		}
		return query.list();
	}
}
