package cn.dosy.platform.customer.dao;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Consumption;

public interface IConsumptionDAO {
	
	/**
	 * 添加消费贷款
	 * 
	 * @param consumption
	 * 			消费贷款
	 * */
	public void add(Consumption consumption);
	
	/**
	 * 根据消费贷款唯一标识删除消费贷款
	 * 
	 * @param id
	 * 			消费贷款唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改消费贷款
	 * 
	 * @param consumption
	 * 			消费贷款
	 * */
	public void update(Consumption consumption);
	
	/**
	 * 获取符合查询对象的消费贷款
	 * 
	 * @param consumption
	 * 			消费贷款查询对象
	 * @return
	 * */	
	public List<Consumption> query(Consumption consumption);
	
	/**
	 * 获取查询对象消费贷款的分页
	 * 
	 * @param page
	 * 			消费贷款查询对象
	 * @return
	 * */
	public Page<Consumption> query(Page<Consumption> page);
	
	/**
	 * 根据消费贷款唯一标识查找消费贷款
	 * 
	 * @param id
	 * 			消费贷款唯一标识
	 * */
	public Consumption findById(String id);
}
