package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.domain.AdvVideo;


public interface IAdvVideoManager {

	/**
	 * 添加视频
	 * 
	 * @param advVideo
	 * 		       视频
	 * */
	public void add(AdvVideo advVideo);
	
	/**
	 * 查找所有关于视频
	 * 
	 * @param advVideo
	 * 			视频
	 * */
	public List<AdvVideo> queryAll();
	
	/**
	 * 根据视频唯一标识删除视频
	 * 
	 * @param id
	 * 		视频唯一标识
	 * */
	public void del(String id);
	
	/**
	 * 修改视频
	 * @param advVideo
	 * 		  视频
	 * */
	public void update(AdvVideo advVideo);
	
	/**
	 * 根据视频唯一标识查找视频
	 * 
	 * @param id
	 * 			视频唯一标识
	 * */
	public AdvVideo findById(String id);
	
}
