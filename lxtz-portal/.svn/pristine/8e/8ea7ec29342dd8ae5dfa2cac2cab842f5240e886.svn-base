package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.AdvMail;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class AdvMailDAO implements IAdvMailDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(AdvMail advMail) {
		sessionFactory.getCurrentSession().save(advMail);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdvMail> queryAll() {
		String hql = "from AdvMail";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void del(String id) {
		String hql = "delete AdvMail u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();

	}

	@Override
	public void update(AdvMail advMail) {
		sessionFactory.getCurrentSession().update(advMail);
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public AdvMail findById(String id) {
		String hql = "from AdvMail u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (AdvMail) query.uniqueResult();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<AdvMail> query(Page<AdvMail> page) {
		String select = " from AdvMail u where 1=1";
		String clause = "select count(*) from AdvMail u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getTitle())) {
			hql = hql + " and u.title=:title";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			hql = hql + " and u.content=:content";
		}
		
		if (page.getVo().getNum() != null) {
			hql = hql + " and u.num=:num";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql);
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		
		if (StringUtils.isNotBlank(page.getVo().getTitle())) {
			selectQuery.setString("title", page.getVo().getTitle());
			clauseQuery.setString("title", page.getVo().getTitle());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			selectQuery.setString("content", page.getVo().getContent());
			clauseQuery.setString("content", page.getVo().getContent());
		}
		
		if (page.getVo().getNum() != null) {
			selectQuery.setInteger("num", page.getVo().getNum());
			clauseQuery.setInteger("num", page.getVo().getNum());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<AdvMail> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<AdvMail> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}
}
