package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.core.web.vo.Page;

public interface IInvestmentDAO {

	/**
	 * 添加投资达人榜
	 * 
	 * @param investment
	 * 			投资达人榜
	 * */
	public void add(Investment investment);
	
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
	 * @param investment
	 * 			投资达人榜
	 * */
	public void update(Investment investment);
	
	/**
	 * 获取符合查询对象的投资达人榜
	 * 
	 * @param investment
	 * 			投资达人榜查询对象
	 * @return
	 * */	
	public List<Investment> query(Investment investment);
	
	/**
	 * 获取查询对象投资达人榜的分页
	 * 
	 * @param investment
	 * 			投资达人榜查询对象
	 * @return
	 * */
	public Page<Investment> query(Page<Investment> page);
	
	/**
	 * 根据投资达人榜唯一标识查找投资达人榜
	 * 
	 * @param id
	 * 			投资达人榜唯一标识
	 * */
	public Investment findById(String id);
	
}
