package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.dao.ICommentDAO;
import cn.dosy.platform.customer.domain.Comment;

public class CommentManager implements ICommentManager{
	
	private ICommentDAO commentDAO;
	
	public void setCommentDAO(ICommentDAO commentDAO) {
		this.commentDAO = commentDAO;
	}

	@Override
	public void add(Comment comment) {
		commentDAO.add(comment);
	}

	@Override
	public void removeById(String id) {
		commentDAO.removeById(id);
	}

	@Override
	public void update(Comment comment) {
		commentDAO.update(comment);
	}

	@Override
	public List<Comment> query(Comment comment) {
		return commentDAO.query(comment);
	}

	@Override
	public Page<Comment> query(Page<Comment> page) {
		return commentDAO.query(page);
	}

	@Override
	public Comment findById(String id) {
		return commentDAO.findById(id);
	}

}
