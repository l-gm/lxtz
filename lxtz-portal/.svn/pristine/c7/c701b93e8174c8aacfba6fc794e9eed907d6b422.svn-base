package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.core.web.vo.Page;

public interface IMindChickenSoupDAO {

	/**
	 * 添加心灵鸡汤
	 * 
	 * @param mindChickenSoup
	 * 			心灵鸡汤
	 * */
	public void add(MindChickenSoup mindChickenSoup);
	
	/**
	 * 根据心灵鸡汤唯一标识删除心灵鸡汤
	 * 
	 * @param id
	 * 			心灵鸡汤唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改心灵鸡汤
	 * 
	 * @param mindChickenSoup
	 * 			心灵鸡汤
	 * */
	public void update(MindChickenSoup mindChickenSoup);
	
	/**
	 * 获取符合查询对象的心灵鸡汤
	 * 
	 * @param mindChickenSoup
	 * 			心灵鸡汤查询对象
	 * @return
	 * */	
	public List<MindChickenSoup> query(MindChickenSoup mindChickenSoup);
	
	/**
	 * 获取查询对象心灵鸡汤的分页
	 * 
	 * @param mindChickenSoup
	 * 			心灵鸡汤查询对象
	 * @return
	 * */
	public Page<MindChickenSoup> query(Page<MindChickenSoup> page);
	
	/**
	 * 根据心灵鸡汤唯一标识查找心灵鸡汤
	 * 
	 * @param id
	 * 			心灵鸡汤唯一标识
	 * */
	public MindChickenSoup findById(String id);
	
}
