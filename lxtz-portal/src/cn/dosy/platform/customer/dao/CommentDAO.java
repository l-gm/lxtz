package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Comment;

public class CommentDAO implements ICommentDAO {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Comment comment) {
		sessionFactory.getCurrentSession().save(comment);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Comment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Comment comment) {
		sessionFactory.getCurrentSession().update(comment);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> query(Comment comment) {
		String hql = "from Comment u where 1 = 1";
		
		if (StringUtils.isNotBlank(comment.getContent())) {
			hql = hql + " and u.content = :content";
		}
		
		if (comment.getIsCancle() != null) {
			hql = hql + " and u.isCancle = :isCancle";
		}
		
		if (comment.getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		if (comment.getStudent() != null) {
			hql = hql + " and u.student = :student";
		}
		
		hql = hql + " order by u.createdDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(comment.getContent())) {
			query.setString("content", comment.getContent());
		}
		
		if (comment.getIsCancle() != null) {
			query.setBoolean("isCancle", comment.getIsCancle());
		}
		
		if (comment.getForbidden() != null) {
			query.setBoolean("forbidden", comment.getForbidden());
		}
		
		if (comment.getStudent() != null) {
			query.setEntity("student", comment.getStudent());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Comment> query(Page<Comment> page) {
		String select = " from Comment u where 1=1";
		String clause = "select count(*) from Comment u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getContent())) {
			hql = hql + " and u.content like '%" + page.getVo().getContent() + "%'";
		}
		
		if (page.getVo().getIsCancle() != null) {
			hql = hql + " and u.isCancle = :isCancle";
		}
		
		if (page.getVo().getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		if (page.getVo().getStudent() != null) {
			hql = hql + " and u.student = :student";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentName())) {
			hql = hql + " and u.student.name = :studentName";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.createdDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (page.getVo().getIsCancle() != null) {
			selectQuery.setBoolean("isCancle", page.getVo().getIsCancle());
			clauseQuery.setBoolean("isCancle", page.getVo().getIsCancle());
		}
		
		if (page.getVo().getForbidden() != null) {
			selectQuery.setBoolean("forbidden", page.getVo().getForbidden());
			clauseQuery.setBoolean("forbidden", page.getVo().getForbidden());
		}
		
		if (page.getVo().getStudent() != null) {
			selectQuery.setEntity("student", page.getVo().getStudent());
			clauseQuery.setEntity("student", page.getVo().getStudent());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentName())) {
			selectQuery.setEntity("studentName", page.getVo().getStudentName());
			clauseQuery.setEntity("studentName", page.getVo().getStudentName());
		}
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<cn.dosy.platform.customer.domain.Comment> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Comment> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public Comment findById(String id) {
		String hql = "from Comment u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Comment) query.uniqueResult();
	}

}
