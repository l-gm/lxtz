package cn.dosy.platform.customer.dao;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.MerchantJob;

public interface IMerchantJobDAO {
	
	/**
	 * 添加商家招聘
	 * 
	 * @param merchantJob
	 * 			商家招聘
	 * */
	public void add(MerchantJob merchantJob);
	
	/**
	 * 根据商家招聘唯一标识删除商家招聘
	 * 
	 * @param id
	 * 			商家招聘唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改商家招聘
	 * 
	 * @param merchantJob
	 * 			商家招聘
	 * */
	public void update(MerchantJob merchantJob);
	
	/**
	 * 获取符合查询对象的商家招聘
	 * 
	 * @param merchantJob
	 * 			商家招聘查询对象
	 * @return
	 * */	
	public List<MerchantJob> query(MerchantJob merchantJob);
	
	/**
	 * 获取查询对象商家招聘的分页
	 * 
	 * @param page
	 * 			商家招聘查询对象
	 * @return
	 * */
	public Page<MerchantJob> query(Page<MerchantJob> page);
	
	/**
	 * 根据商家招聘唯一标识查找商家招聘
	 * 
	 * @param id
	 * 			商家招聘唯一标识
	 * */
	public MerchantJob findById(String id);
}
