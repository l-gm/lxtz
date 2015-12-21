package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.Notice;
import cn.dosy.platform.core.web.vo.Page;

public interface INoticeManager {

	/**
	 * 添加公告文章
	 * 
	 * @param notice
	 * 			公告文章
	 * */
	public void add(Notice notice);
	
	/**
	 * 根据公告唯一标识删除公告文章
	 * 
	 * @param id
	 * 			公告文章唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改公告文章
	 * 
	 * @param notice
	 * 			公告文章
	 * */
	public void update(Notice notice);
	
	/**
	 * 获取符合查询对象的公告
	 * 
	 * @param notice
	 * 			公告查询对象
	 * @return
	 * */	
	public List<Notice> query(Notice notice);
	
	/**
	 * 获取查询对象公告的分页
	 * 
	 * @param notice
	 * 			公告查询对象
	 * @return
	 * */
	public Page<Notice> query(Page<Notice> page);
	
	/**
	 * 根据公告唯一标识查找公告文章
	 * 
	 * @param id
	 * 			公告文章唯一标识
	 * */
	public Notice findById(String id);
	
	
}
