package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.AdvImg;

public interface IAdvImgDAO {

	/**
	 * 添加图片
	 * 
	 * @param advImg
	 * 		       图片
	 * */
	public void add(AdvImg advImg);
	
	/**
	 * 查找所有关于图片
	 * 
	 * @param advImg
	 * 			图片
	 * */
	public List<AdvImg> queryAll();
	
	/**
	 * 根据图片唯一标识删除图片
	 * 
	 * @param id
	 * 		图片唯一标识
	 * */
	public void del(String id);
	
	/**
	 * 修改图片
	 * @param advImg
	 * 		   图片
	 * */
	public void update(AdvImg advImg);
	
	/**
	 * 根据图片唯一标识查找图片
	 * 
	 * @param id
	 * 			图片唯一标识
	 * */
	public AdvImg findById(String id);
	
}
