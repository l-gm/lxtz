package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class MindChickenSoupDAO implements IMindChickenSoupDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(MindChickenSoup mindChickenSoup) {
		sessionFactory.getCurrentSession().save(mindChickenSoup);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete MindChickenSoup u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(MindChickenSoup mindChickenSoup) {
		sessionFactory.getCurrentSession().update(mindChickenSoup);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MindChickenSoup> query(MindChickenSoup mindChickenSoup) {
		String hql = "from MindChickenSoup u where 1 = 1";
		
		if (StringUtils.isNotBlank(mindChickenSoup.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		if (StringUtils.isNotBlank(mindChickenSoup.getContent())) {
			hql = hql + " and u.content = :content";
		}
		if (StringUtils.isNotBlank(mindChickenSoup.getSource())) {
			hql = hql + " and u.source = :source";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(mindChickenSoup.getTitle())) {
			query.setString("title", mindChickenSoup.getTitle());
		}
		if (StringUtils.isNotBlank(mindChickenSoup.getContent())) {
			query.setString("content", mindChickenSoup.getContent());
		}
		if (StringUtils.isNotBlank(mindChickenSoup.getSource())) {
			query.setString("source", mindChickenSoup.getSource());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<MindChickenSoup> query(Page<MindChickenSoup> page) {
		String select = "select new MindChickenSoup(u.id,u.title,u.source, u.isHot, u.isHidden,u.lastModifiedDate)from MindChickenSoup u where 1=1";
		String clause = "select count(*) from MindChickenSoup u where 1=1 ";
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
		
		List<MindChickenSoup> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<MindChickenSoup> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public MindChickenSoup findById(String id) {
		String hql = "from MindChickenSoup u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (MindChickenSoup) query.uniqueResult();
	}

}
