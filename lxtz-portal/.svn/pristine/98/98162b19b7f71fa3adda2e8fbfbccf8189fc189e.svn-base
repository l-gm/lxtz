package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.UsingHelp;
import cn.dosy.platform.core.web.vo.Page;

public interface IUsingHelpDAO {

	/**
	 * 添加使用帮助
	 * 
	 * @param usingHelp
	 * 			使用帮助
	 * */
	public void add(UsingHelp usingHelp);
	
	/**
	 * 根据使用帮助唯一标识删除使用帮助
	 * 
	 * @param id
	 * 			使用帮助唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改使用帮助
	 * 
	 * @param usingHelp
	 * 			使用帮助
	 * */
	public void update(UsingHelp usingHelp);
	
	/**
	 * 获取符合查询对象的使用帮助
	 * 
	 * @param usingHelp
	 * 			使用帮助查询对象
	 * @return
	 * */	
	public List<UsingHelp> query(UsingHelp usingHelp);
	
	/**
	 * 获取查询对象使用帮助的分页
	 * 
	 * @param usingHelp
	 * 			使用帮助查询对象
	 * @return
	 * */
	public Page<UsingHelp> query(Page<UsingHelp> page);
	
	/**
	 * 根据使用帮助唯一标识查找使用帮助
	 * 
	 * @param id
	 * 			使用帮助唯一标识
	 * */
	public UsingHelp findById(String id);
}
