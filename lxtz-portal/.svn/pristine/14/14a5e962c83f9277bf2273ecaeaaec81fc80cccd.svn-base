package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Student;

public class StudentDAO implements IStudentDAO {
	
	private SessionFactory sessionFactory;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Student student) {
		sessionFactory.getCurrentSession().save(student);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Student u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Student student) {
		sessionFactory.getCurrentSession().update(student);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> query(Student student) {
		String hql = "from Student u where 1 = 1";
		
		if (StringUtils.isNotBlank(student.getStudentNumber())) {
			hql = hql + " and u.studentNumber = :studentNumber";
		}
		if (StringUtils.isNotBlank(student.getEmail())) {
			hql = hql + " and u.email = :email";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(student.getStudentNumber())) {
			query.setString("studentNumber", student.getStudentNumber());
		}
		if (StringUtils.isNotBlank(student.getEmail())) {
			query.setString("email", student.getEmail());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Student> query(Page<Student> page) {
		String select = "select new Student(u.id, u.account, u.name, u.universityName, u.phone, u.rating, u.forbidden, u.createdDate) from Student u where 1=1";
		String clause = "select count(*) from Student u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getStudentNumber())) {
			hql = hql + " and u.studentNumber=:studentNumber";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.createdDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (StringUtils.isNotBlank(page.getVo().getStudentNumber())) {
			selectQuery.setString("studentNumber", page.getVo().getStudentNumber());
			clauseQuery.setString("studentNumber", page.getVo().getStudentNumber());
		}
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Student> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Student> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public Student findById(String id) {
		String hql = "from Student u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Student) query.uniqueResult();
	}

	@Override
	public Student findByAccountAndPassword(String account, String password) {
		String hql = "from Student u where u.account=:account and u.password=:password";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("account", account);
		query.setString("password", password);
		return (Student) query.uniqueResult();
	}

	@Override
	public boolean checkValidStudentByAccount(String account) {
		String hql = "select count(*) from Student u where u.account=:account";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("account", account);
		return ((Long)query.uniqueResult() == 0l);
	}

	@Override
	public boolean checkValidStudentByEmail(String email) {
		String hql = "select count(*) from Student u where u.email=:email";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("email", email);
		return ((Long)query.uniqueResult() == 0l);
	}

	@Override
	public boolean checkValidStudentByPhone(String phone) {
		String hql = "select count(*) from Student u where u.phone=:phone";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("phone", phone);
		return ((Long)query.uniqueResult() == 0l);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentPhone() {
		String hql = "select new Student(u.phone, u.name, u.universityName) from Student u ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
