package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class InvestmentDAO implements IInvestmentDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(Investment investment) {
		sessionFactory.getCurrentSession().save(investment);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Investment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Investment investment) {
		sessionFactory.getCurrentSession().update(investment);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Investment> query(Investment investment) {
		String hql = "from Financial u where 1 = 1";
		
		if (StringUtils.isNotBlank(investment.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		if (StringUtils.isNotBlank(investment.getContent())) {
			hql = hql + " and u.content = :content";
		}
		if (StringUtils.isNotBlank(investment.getSource())) {
			hql = hql + " and u.source = :source";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(investment.getTitle())) {
			query.setString("title", investment.getTitle());
		}
		if (StringUtils.isNotBlank(investment.getContent())) {
			query.setString("content", investment.getContent());
		}
		if (StringUtils.isNotBlank(investment.getSource())) {
			query.setString("source", investment.getSource());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Investment> query(Page<Investment> page) {
		String select = "select new Investment(u.id,u.title,u.source, u.isHot, u.isHidden,u.lastModifiedDate)from Investment u where 1=1";
		String clause = "select count(*) from Investment u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getTitle())) {
			hql = hql + " and (u.title like '%" + page.getVo().getTitle() + "%'";
			hql = hql + " or u.content like '%" + page.getVo().getTitle() + "%')";
		}
		if (page.getVo().getIsHidden() != null) {
			hql = hql + " and u.isHidden = :isHidden ";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.lastModifiedDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (page.getVo().getIsHidden() != null) {
			selectQuery.setBoolean("isHidden", page.getVo().getIsHidden());
			clauseQuery.setBoolean("isHidden", page.getVo().getIsHidden());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Investment> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Investment> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public Investment findById(String id) {
		String hql = "from Investment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Investment) query.uniqueResult();
	}

}
