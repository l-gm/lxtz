package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.AdvMail;
import cn.dosy.platform.core.web.vo.Page;

public interface IAdvMailDAO {

	/**
	 * 添加邮件
	 * 
	 * @param advMail
	 * 		       邮件
	 * */
	public void add(AdvMail advMail);
	
	/**
	 * 查找所有关于邮件
	 * 
	 * @param advMail
	 * 			邮件
	 * */
	public List<AdvMail> queryAll();
	
	/**
	 * 根据邮件唯一标识删除邮件
	 * 
	 * @param id
	 * 		邮件唯一标识
	 * */
	public void del(String id);
	
	/**
	 * 修改邮件
	 * @param advMail
	 * 		   邮件
	 * */
	public void update(AdvMail advMail);
	
	/**
	 * 根据邮件唯一标识查找邮件
	 * 
	 * @param id
	 * 			邮件唯一标识
	 * */
	public AdvMail findById(String id);
	
	/**
	 * 获取查询对象邮件的分页
	 * 
	 * @param advMail
	 * 			邮件查询对象
	 * @return
	 * */
	public Page<AdvMail> query(Page<AdvMail> page);
}
