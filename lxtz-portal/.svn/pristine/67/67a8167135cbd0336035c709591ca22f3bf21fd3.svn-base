package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.UsingHelp;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class UsingHelpDAO implements IUsingHelpDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(UsingHelp usingHelp) {
		sessionFactory.getCurrentSession().save(usingHelp);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {

		String hql = "delete UsingHelp u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(UsingHelp usingHelp) {
		sessionFactory.getCurrentSession().update(usingHelp);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UsingHelp> query(UsingHelp usingHelp) {
		String hql = "from UsingHelp u where 1 = 1";
		
		if (StringUtils.isNotBlank(usingHelp.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		if (StringUtils.isNotBlank(usingHelp.getContent())) {
			hql = hql + " and u.content = :content";
		}
		if (StringUtils.isNotBlank(usingHelp.getSource())) {
			hql = hql + " and u.source = :source";
		}
		if (usingHelp.getIsHidden() != null) {
			hql = hql + " and u.isHidden = :isHidden";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(usingHelp.getTitle())) {
			query.setString("title", usingHelp.getTitle());
		}
		if (StringUtils.isNotBlank(usingHelp.getContent())) {
			query.setString("content", usingHelp.getContent());
		}
		if (StringUtils.isNotBlank(usingHelp.getSource())) {
			query.setString("source", usingHelp.getSource());
		}
		if (usingHelp.getIsHidden() != null) {
			query.setBoolean("isHidden", usingHelp.getIsHidden());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<UsingHelp> query(Page<UsingHelp> page) {
		String select = "select new UsingHelp(u.id,u.title,u.source, u.isHidden,u.lastModifiedDate)from UsingHelp u where 1=1";
		String clause = "select count(*) from UsingHelp u where 1=1 ";
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
		
		List<UsingHelp> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<UsingHelp> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public UsingHelp findById(String id) {
		String hql = "from UsingHelp u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		
		return (UsingHelp) query.uniqueResult();
	}

}
