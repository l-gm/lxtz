package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.Example;
import cn.dosy.platform.core.web.vo.Page;

public interface IExampleManager {

	/**
	 * 添加成功案例
	 * 
	 * @param example
	 * 			成功案例
	 * */
	public void add(Example example);
	
	/**
	 * 根据成功案例唯一标识删除成功案例
	 * 
	 * @param id
	 * 			成功案例唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改成功案例
	 * 
	 * @param example
	 * 			成功案例
	 * */
	public void update(Example example);
	
	/**
	 * 获取符合查询对象的成功案例
	 * 
	 * @param example
	 * 			成功案例查询对象
	 * @return
	 * */	
	public List<Example> query(Example example);
	
	/**
	 * 获取查询对象成功案例的分页
	 * 
	 * @param example
	 * 			成功案例查询对象
	 * @return
	 * */
	public Page<Example> query(Page<Example> page);
	
	/**
	 * 根据成功案例唯一标识查找成功案例
	 * 
	 * @param id
	 * 			成功案例唯一标识
	 * */
	public Example findById(String id);
	
	
}
