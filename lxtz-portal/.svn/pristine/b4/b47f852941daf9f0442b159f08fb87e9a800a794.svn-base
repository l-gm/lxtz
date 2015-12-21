package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.CompanyProfile;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class CompanyProfileDAO implements ICompanyProfileDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(CompanyProfile companyProfile) {
		sessionFactory.getCurrentSession().save(companyProfile);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete CompanyProfile u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(CompanyProfile companyProfile) {
		sessionFactory.getCurrentSession().update(companyProfile);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyProfile> query(CompanyProfile companyProfile) {
		String hql = "from CompanyProfile u where 1 = 1";
		
		if (StringUtils.isNotBlank(companyProfile.getContent())) {
			hql = hql + " and u.content = :content";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(companyProfile.getContent())) {
			query.setString("companyProfile", companyProfile.getContent());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<CompanyProfile> query(Page<CompanyProfile> page) {
		String select = "select new CompanyProfile(u.id,u.content,u.lastModifiedDate)from CompanyProfile u where 1=1";
		String clause = "select count(*) from CompanyProfile u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			hql = hql + " and u.content=:content";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.lastModifiedDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			selectQuery.setString("content", page.getVo().getContent());
			clauseQuery.setString("content", page.getVo().getContent());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<CompanyProfile> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<CompanyProfile> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public CompanyProfile findById(String id) {
		String hql = "from CompanyProfile u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (CompanyProfile) query.uniqueResult();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<CompanyProfile> findAll() {
		String hql = "from CompanyProfile";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
