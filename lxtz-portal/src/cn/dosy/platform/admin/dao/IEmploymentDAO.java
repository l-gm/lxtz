package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.Employment;
import cn.dosy.platform.core.web.vo.Page;

public interface IEmploymentDAO {

	/**
	 * 添加招聘信息
	 * 
	 * @param Employment
	 * 			招聘信息
	 * */
	public void add(Employment employment);
	
	/**
	 * 根据招聘信息唯一标识删除招聘信息
	 * 
	 * @param id
	 * 			招聘信息唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改招聘信息
	 * 
	 * @param Employment
	 * 			招聘信息
	 * */
	public void update(Employment employment);
	
	/**
	 * 获取符合查询对象的招聘信息
	 * 
	 * @param Employment
	 * 			招聘信息查询对象
	 * @return
	 * */	
	public List<Employment> query(Employment employment);
	
	/**
	 * 获取查询对象招聘信息的分页
	 * 
	 * @param Employment
	 * 			招聘信息查询对象
	 * @return
	 * */
	public Page<Employment> query(Page<Employment> page);
	
	/**
	 * 根据招聘信息唯一标识查找招聘信息
	 * 
	 * @param id
	 * 			招聘信息唯一标识
	 * */
	public Employment findById(String id);
	
}
