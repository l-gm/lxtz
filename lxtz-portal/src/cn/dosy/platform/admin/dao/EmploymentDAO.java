package cn.dosy.platform.admin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.admin.domain.Employment;
import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;

public class EmploymentDAO implements IEmploymentDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public void add(Employment employment) {
		sessionFactory.getCurrentSession().save(employment);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Employment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Employment employment) {
		sessionFactory.getCurrentSession().update(employment);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employment> query(Employment employment) {
		String hql = "from Employment u where 1 = 1";
		
		if (StringUtils.isNotBlank(employment.getContent())) {
			hql = hql + " and u.content = :content";
		}
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(employment.getContent())) {
			query.setString("content", employment.getContent());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Employment> query(Page<Employment> page) {
		String select = " from Employment u where 1=1";
		String clause = "select count(*) from Employment u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			hql = hql + " and u.content=:content";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getPositionmonthlysalary())) {
			hql = hql + " and u.positionmonthlysalary=:positionmonthlysalary";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkingplace())) {
			hql = hql + " and u.workingplace=:workingplace";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getNatureofwork())) {
			hql = hql + " and u.natureofwork=:natureofwork";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkexperience())) {
			hql = hql + " and u.workexperience=:workexperience";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getMinimumdegree())) {
			hql = hql + " and u.minimumdegree=:minimumdegree";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getHiringnum())) {
			hql = hql + " and u.hiringnum=:hiringnum";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getJobcategory())) {
			hql = hql + " and u.jobcategory=:jobcategory";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getResponsibility())) {
			hql = hql + " and u.responsibility=:responsibility";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getQualifications())) {
			hql = hql + " and u.qualifications=:qualifications";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql);
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			selectQuery.setString("content", page.getVo().getContent());
			clauseQuery.setString("content", page.getVo().getContent());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getPositionmonthlysalary())) {
			selectQuery.setString("positionmonthlysalary", page.getVo().getPositionmonthlysalary());
			clauseQuery.setString("positionmonthlysalary", page.getVo().getPositionmonthlysalary());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkingplace())) {
			selectQuery.setString("workingplace", page.getVo().getWorkingplace());
			clauseQuery.setString("workingplace", page.getVo().getWorkingplace());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getNatureofwork())) {
			selectQuery.setString("natureofwork", page.getVo().getNatureofwork());
			clauseQuery.setString("natureofwork", page.getVo().getNatureofwork());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkexperience())) {
			selectQuery.setString("workexperience", page.getVo().getWorkexperience());
			clauseQuery.setString("workexperience", page.getVo().getWorkexperience());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getMinimumdegree())) {
			selectQuery.setString("minimumdegree", page.getVo().getMinimumdegree());
			clauseQuery.setString("minimumdegree", page.getVo().getMinimumdegree());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getHiringnum())) {
			selectQuery.setString("hiringnum", page.getVo().getHiringnum());
			clauseQuery.setString("hiringnum", page.getVo().getHiringnum());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getJobcategory())) {
			selectQuery.setString("jobcategory", page.getVo().getJobcategory());
			clauseQuery.setString("jobcategory", page.getVo().getJobcategory());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getResponsibility())) {
			selectQuery.setString("responsibility", page.getVo().getResponsibility());
			clauseQuery.setString("responsibility", page.getVo().getResponsibility());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getQualifications())) {
			selectQuery.setString("qualifications", page.getVo().getQualifications());
			clauseQuery.setString("qualifications", page.getVo().getQualifications());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Employment> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Employment> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}


	@Override
	public Employment findById(String id) {
		String hql = "from Employment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Employment) query.uniqueResult();
	}

}
