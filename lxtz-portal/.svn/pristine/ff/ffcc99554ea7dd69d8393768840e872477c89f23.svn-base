package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.CompanyProfile;
import cn.dosy.platform.core.web.vo.Page;

public interface ICompanyProfileManager {

	/**
	 * 添加公司简介
	 * 
	 * @param CompanyProfile
	 * 			公司简介
	 * */
	public void add(CompanyProfile companyProfile);
	
	/**
	 * 查找所有关于公司简介
	 * 
	 * @param companyProfile
	 * 			公司简介
	 * */
	public List<CompanyProfile> findAll();
	
	/**
	 * 根据公司简介唯一标识删除公司简介
	 * 
	 * @param id
	 * 			公司简介唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改公司简介
	 * 
	 * @param CompanyProfile
	 * 			公司简介
	 * */
	public void update(CompanyProfile companyProfile);
	
	/**
	 * 获取符合查询对象的公司简介
	 * 
	 * @param CompanyProfile
	 * 			公司简介查询对象
	 * @return
	 * */	
	public List<CompanyProfile> query(CompanyProfile companyProfile);
	
	/**
	 * 获取查询对象公司简介的分页
	 * 
	 * @param CompanyProfile
	 * 			公司简介查询对象
	 * @return
	 * */
	public Page<CompanyProfile> query(Page<CompanyProfile> page);
	
	/**
	 * 根据公司简介唯一标识查找公司简介
	 * 
	 * @param id
	 * 			公司简介唯一标识
	 * */
	public CompanyProfile findById(String id);
	
	
}
