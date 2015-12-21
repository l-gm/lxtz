package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.Financial;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class FinancialDAO implements IFinancialDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(Financial financial) {
		sessionFactory.getCurrentSession().save(financial);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Financial u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Financial financial) {
		sessionFactory.getCurrentSession().update(financial);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Financial> query(Financial financial) {
		String hql = "from Financial u where 1 = 1";
		
		if (StringUtils.isNotBlank(financial.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		if (StringUtils.isNotBlank(financial.getContent())) {
			hql = hql + " and u.content = :content";
		}
		if (StringUtils.isNotBlank(financial.getSource())) {
			hql = hql + " and u.source = :source";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(financial.getTitle())) {
			query.setString("title", financial.getTitle());
		}
		if (StringUtils.isNotBlank(financial.getContent())) {
			query.setString("content", financial.getContent());
		}
		if (StringUtils.isNotBlank(financial.getSource())) {
			query.setString("source", financial.getSource());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Financial> query(Page<Financial> page) {
		String select = "select new Financial(u.id,u.title,u.financialAbstract,u.source, u.isHot, u.isHidden,u.lastModifiedDate)from Financial u where 1=1";
		String clause = "select count(*) from Financial u where 1=1 ";
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
		
		List<Financial> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Financial> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public Financial findById(String id) {
		String hql = "from Financial u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Financial) query.uniqueResult();
	}

}
