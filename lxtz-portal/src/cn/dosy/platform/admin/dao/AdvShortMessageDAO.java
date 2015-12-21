package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.AdvShortMessage;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class AdvShortMessageDAO implements IAdvShortMessageDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(AdvShortMessage advShortMessage) {
		sessionFactory.getCurrentSession().save(advShortMessage);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdvShortMessage> queryAll() {
		String hql = "from AdvShortMessage";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void del(String id) {
		String hql = "delete AdvShortMessage u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();

	}

	@Override
	public void update(AdvShortMessage advShortMessage) {
		sessionFactory.getCurrentSession().update(advShortMessage);
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public AdvShortMessage findById(String id) {
		String hql = "from AdvShortMessage u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (AdvShortMessage) query.uniqueResult();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<AdvShortMessage> query(Page<AdvShortMessage> page) {
		String select = " from AdvShortMessage u where 1=1";
		String clause = "select count(*) from AdvShortMessage u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			hql = hql + " and u.content=:content";
		}
		
		if (page.getVo().getNum() != null) {
			hql = hql + " and u.num=:num";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql);
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		
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
		
		List<AdvShortMessage> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<AdvShortMessage> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}
}
