package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.Financial;
import cn.dosy.platform.core.web.vo.Page;

public interface IFinancialDAO {

	/**
	 * 添加理财频道
	 * 
	 * @param financial
	 * 			理财频道
	 * */
	public void add(Financial financial);
	
	/**
	 * 根据理财频道唯一标识删除理财频道
	 * 
	 * @param id
	 * 			理财频道唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改理财频道
	 * 
	 * @param financial
	 * 			理财频道
	 * */
	public void update(Financial financial);
	
	/**
	 * 获取符合查询对象的理财频道
	 * 
	 * @param financial
	 * 			理财频道查询对象
	 * @return
	 * */	
	public List<Financial> query(Financial financial);
	
	/**
	 * 获取查询对象理财频道的分页
	 * 
	 * @param financial
	 * 			理财频道查询对象
	 * @return
	 * */
	public Page<Financial> query(Page<Financial> page);
	
	/**
	 * 根据理财频道唯一标识查找理财频道
	 * 
	 * @param id
	 * 			理财频道唯一标识
	 * */
	public Financial findById(String id);
	
}
