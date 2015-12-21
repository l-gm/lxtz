package cn.dosy.platform.customer.dao;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Comment;

public interface ICommentDAO {
	
	/**
	 * 添加学生反馈
	 * 
	 * @param comment
	 * 			学生反馈
	 * */
	public void add(Comment comment);
	
	/**
	 * 根据学生反馈唯一标识删除学生反馈
	 * 
	 * @param id
	 * 			学生反馈唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改学生反馈
	 * 
	 * @param comment
	 * 			学生反馈
	 * */
	public void update(Comment comment);
	
	/**
	 * 获取符合查询对象的学生反馈
	 * 
	 * @param comment
	 * 			学生反馈查询对象
	 * @return
	 * */	
	public List<Comment> query(Comment comment);
	
	/**
	 * 获取查询对象学生反馈的分页
	 * 
	 * @param page
	 * 			学生反馈查询对象
	 * @return
	 * */
	public Page<Comment> query(Page<Comment> page);
	
	/**
	 * 根据学生反馈唯一标识查找学生反馈
	 * 
	 * @param id
	 * 			学生反馈唯一标识
	 * */
	public Comment findById(String id);
}
