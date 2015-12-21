package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.Blogroll;


public interface IBlogrollManager {

	/**
	 * 添加友情链接
	 * 
	 * @param Blogroll
	 * 		  友情链接
	 * */
	public void add(Blogroll blogroll);
	
	/**
	 * 根据友情链接唯一标识删除友情链接
	 * 
	 * @param id
	 * 
	 * 		友情链接唯一标识
	 * */
	public void removeById(String id);
	
	/**
	 * 修改友情链接
	 * 
	 * @param Blogroll
	 * 
	 * 		友情链接
	 * */
	public void update(Blogroll blogroll);
	
	/**
	 * 获取符合查询对象的友情链接
	 * 
	 * @param Blogroll
	 * 			友情链接查询对象
	 * @return
	 * */	
	public List<Blogroll> query(Blogroll blogroll);
	
	/**
	 * 根据友情链接唯一标识查找友情链接
	 * 
	 * @param id
	 * 			友情链接唯一标识
	 * */
	public Blogroll findById(String id);
	
	/**
	 * 获取对象所有的友情链接
	 * 
	 * @param Blogroll
	 * 			友情链接查询对象
	 * @return
	 * */	
	public List<Blogroll> findAll();
}
