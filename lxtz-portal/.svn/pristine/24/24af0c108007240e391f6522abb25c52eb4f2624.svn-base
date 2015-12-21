package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class ExampleDAO implements IExampleDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(Example example) {
		sessionFactory.getCurrentSession().save(example);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Example u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Example example) {
		sessionFactory.getCurrentSession().update(example);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Example> query(Example example) {
		String hql = "from Example u where 1 = 1";
		
		if (StringUtils.isNotBlank(example.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		if (StringUtils.isNotBlank(example.getContent())) {
			hql = hql + " and u.content = :content";
		}
		if (StringUtils.isNotBlank(example.getSource())) {
			hql = hql + " and u.source = :source";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(example.getTitle())) {
			query.setString("title", example.getTitle());
		}
		if (StringUtils.isNotBlank(example.getContent())) {
			query.setString("content", example.getContent());
		}
		if (StringUtils.isNotBlank(example.getSource())) {
			query.setString("source", example.getSource());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Example> query(Page<Example> page) {
		String select = "select new Example(u.id,u.title,u.source, u.isHot, u.isHidden,u.lastModifiedDate)from Example u where 1=1";
		String clause = "select count(*) from Example u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getTitle())) {
			hql = hql + " and (u.title like '%" + page.getVo().getTitle() + "%'";
			hql = hql + " or u.content like '%" + page.getVo().getTitle() + "%')";
		}
		if (page.getVo().getIsHidden() != null) {
			hql = hql + " and u.isHidden = :isHidden ";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.isHot desc,u.lastModifiedDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (page.getVo().getIsHidden() != null) {
			selectQuery.setBoolean("isHidden", page.getVo().getIsHidden());
			clauseQuery.setBoolean("isHidden", page.getVo().getIsHidden());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Example> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Example> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public Example findById(String id) {
		String hql = "from Example u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Example) query.uniqueResult();
	}

}
