package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.StudentJob;

public interface IStudentJobManager {
	/**
	 * 添加个人求职
	 * 
	 * @param studentJob
	 * 			个人求职
	 * */
	public void add(StudentJob studentJob);
	
	/**
	 * 根据个人求职唯一标识删除个人求职
	 * 
	 * @param id
	 * 			个人求职唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改个人求职
	 * 
	 * @param studentJob
	 * 			个人求职
	 * */
	public void update(StudentJob studentJob);
	
	/**
	 * 获取符合查询对象的个人求职
	 * 
	 * @param studentJob
	 * 			个人求职查询对象
	 * @return
	 * */	
	public List<StudentJob> query(StudentJob studentJob);
	
	/**
	 * 获取查询对象个人求职的分页
	 * 
	 * @param page
	 * 			个人求职查询对象
	 * @return
	 * */
	public Page<StudentJob> query(Page<StudentJob> page);
	
	/**
	 * 根据个人求职唯一标识查找个人求职
	 * 
	 * @param id
	 * 			个人求职唯一标识
	 * */
	public StudentJob findById(String id);
}
