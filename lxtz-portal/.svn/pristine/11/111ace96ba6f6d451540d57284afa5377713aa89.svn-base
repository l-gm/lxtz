package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Merchant;

public interface IMerchantManager {
	/**
	 * 添加商家（顾客）
	 * 
	 * @param merchant
	 * 			商家（顾客）
	 * */
	public void add(Merchant merchant);
	
	/**
	 * 根据商家唯一标识删除商家
	 * 
	 * @param id
	 * 			商家唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改商家（顾客）
	 * 
	 * @param merchant
	 * 			商家（顾客）
	 * */
	public void update(Merchant merchant);
	
	/**
	 * 获取符合查询对象的商家（顾客）
	 * 
	 * @param merchant
	 * 			商家（顾客）查询对象
	 * @return
	 * */	
	public List<Merchant> query(Merchant merchant);
	
	/**
	 * 获取查询对象商家（顾客）的分页
	 * 
	 * @param page
	 * 			商家（顾客）查询对象
	 * @return
	 * */
	public Page<Merchant> query(Page<Merchant> page);
	
	/**
	 * 根据商家（顾客）唯一标识查找商家（顾客）
	 * 
	 * @param id
	 * 			商家（顾客）唯一标识
	 * */
	public Merchant findById(String id);
	
	/**
	 * 根据用户名密码获取商家信息
	 * 
	 * @param account
	 * 				用户名
	 * @param password
	 * 				密码
	 * @return
	 * */
	public Merchant findByAccountAndPassword(String account, String password);
	
	/**
	 * 检查用户名唯一
	 * @param account
	 * @return
	 */
	public boolean checkValidMerchantByAccount(String account);
	
	/**
	 * 检查邮箱唯一
	 * @param email
	 * @return
	 */
	public boolean checkValidMerchantByEmail(String email);
}
