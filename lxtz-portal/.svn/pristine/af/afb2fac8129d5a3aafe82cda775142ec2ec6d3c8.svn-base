package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.StudentJob;

public class StudentJobDAO implements IStudentJobDAO {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(StudentJob studentJob) {
		sessionFactory.getCurrentSession().save(studentJob);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete StudentJob u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(StudentJob studentJob) {
		sessionFactory.getCurrentSession().update(studentJob);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentJob> query(StudentJob studentJob) {
		String hql = "from StudentJob u where 1 = 1";
		
		if (StringUtils.isNotBlank(studentJob.getTitle())) {
			hql = hql + " and u.title = :title";
		}
		
		if (StringUtils.isNotBlank(studentJob.getContent())) {
			hql = hql + " and u.content = :content";
		}
		
		if (studentJob.getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		if (studentJob.getStudent() != null) {
			hql = hql + " and u.student = :student";
		}
		
		hql = hql + " order by u.createdDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(studentJob.getTitle())) {
			query.setString("title", studentJob.getTitle());
		}
		
		if (StringUtils.isNotBlank(studentJob.getContent())) {
			query.setString("content", studentJob.getContent());
		}
		
		
		if (studentJob.getForbidden() != null) {
			query.setBoolean("forbidden", studentJob.getForbidden());
		}
		
		if (studentJob.getStudent() != null) {
			query.setEntity("student", studentJob.getStudent());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<StudentJob> query(Page<StudentJob> page) {
		String select = " from StudentJob u where 1=1";
		String clause = "select count(*) from StudentJob u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getTitle())) {
			hql = hql + " and ( u.title like '%" + page.getVo().getTitle() + "%'";
			hql = hql + " or u.content like '%" + page.getVo().getContent() + "%')";
		}
		
		if (page.getVo().getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		if (page.getVo().getStudent() != null) {
			hql = hql + " and u.student = :student";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.createdDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		
		if (page.getVo().getForbidden() != null) {
			selectQuery.setBoolean("forbidden", page.getVo().getForbidden());
			clauseQuery.setBoolean("forbidden", page.getVo().getForbidden());
		}
		
		if (page.getVo().getStudent() != null) {
			selectQuery.setEntity("student", page.getVo().getStudent());
			clauseQuery.setEntity("student", page.getVo().getStudent());
		}
		
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<StudentJob> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<StudentJob> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public StudentJob findById(String id) {
		String hql = "from StudentJob u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (StudentJob) query.uniqueResult();
	}

}
