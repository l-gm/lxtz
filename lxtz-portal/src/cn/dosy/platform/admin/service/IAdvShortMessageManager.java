package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.AdvShortMessage;
import cn.dosy.platform.core.web.vo.Page;


public interface IAdvShortMessageManager {

	/**
	 * 添加短信
	 * 
	 * @param advShortMessage
	 * 		      短信
	 * */
	public void add(AdvShortMessage advShortMessage);
	
	/**
	 * 查找所有关于短信
	 * 
	 * @param advShortMessage
	 * 			短信
	 * */
	public List<AdvShortMessage> queryAll();
	
	/**
	 * 根据短信唯一标识删除短信
	 * 
	 * @param id
	 * 		短信唯一标识
	 * */
	public void del(String id);
	
	/**
	 * 修改短信
	 * @param advShortMessage
	 * 		   短信
	 * */
	public void update(AdvShortMessage advShortMessage);
	
	/**
	 * 根据短信唯一标识查找短信
	 * 
	 * @param id
	 * 			短信唯一标识
	 * */
	public AdvShortMessage findById(String id);
	
	/**
	 * 获取查询对象短信的分页
	 * 
	 * @param advShortMessage
	 * 			短信查询对象
	 * @return
	 * */
	public Page<AdvShortMessage> query(Page<AdvShortMessage> page);
}
