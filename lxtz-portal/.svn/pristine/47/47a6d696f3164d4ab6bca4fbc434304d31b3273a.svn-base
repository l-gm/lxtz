package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.core.web.vo.Page;

public interface IInvestmentManager {

	/**
	 * 添加心灵鸡汤
	 * 
	 * @param investment
	 * 			心灵鸡汤
	 * */
	public void add(Investment investment);
	
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
	 * @param investment
	 * 			心灵鸡汤
	 * */
	public void update(Investment investment);
	
	/**
	 * 获取符合查询对象的心灵鸡汤
	 * 
	 * @param investment
	 * 			心灵鸡汤查询对象
	 * @return
	 * */	
	public List<Investment> query(Investment investment);
	
	/**
	 * 获取查询对象心灵鸡汤的分页
	 * 
	 * @param investment
	 * 			心灵鸡汤查询对象
	 * @return
	 * */
	public Page<Investment> query(Page<Investment> page);
	
	/**
	 * 根据心灵鸡汤唯一标识查找心灵鸡汤
	 * 
	 * @param id
	 * 			心灵鸡汤唯一标识
	 * */
	public Investment findById(String id);
	
	
}
