package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.core.web.vo.Page;

public interface IMindChickenSoupManager {

	/**
	 * 添加投资达人榜
	 * 
	 * @param mindChickenSoup
	 * 			投资达人榜
	 * */
	public void add(MindChickenSoup mindChickenSoup);
	
	/**
	 * 根据投资达人榜唯一标识删除投资达人榜
	 * 
	 * @param id
	 * 			投资达人榜唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改投资达人榜
	 * 
	 * @param mindChickenSoup
	 * 			投资达人榜
	 * */
	public void update(MindChickenSoup mindChickenSoup);
	
	/**
	 * 获取符合查询对象的投资达人榜
	 * 
	 * @param mindChickenSoup
	 * 			投资达人榜查询对象
	 * @return
	 * */	
	public List<MindChickenSoup> query(MindChickenSoup mindChickenSoup);
	
	/**
	 * 获取查询对象投资达人榜的分页
	 * 
	 * @param mindChickenSoup
	 * 			投资达人榜查询对象
	 * @return
	 * */
	public Page<MindChickenSoup> query(Page<MindChickenSoup> page);
	
	/**
	 * 根据投资达人榜唯一标识查找投资达人榜
	 * 
	 * @param id
	 * 			投资达人榜唯一标识
	 * */
	public MindChickenSoup findById(String id);
	
	
}
