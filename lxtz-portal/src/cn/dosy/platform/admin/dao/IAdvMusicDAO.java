package cn.dosy.platform.admin.dao;

import java.util.List;

import cn.dosy.platform.admin.domain.AdvMusic;

public interface IAdvMusicDAO {

	/**
	 * 添加门户音乐
	 * 
	 * @param advMusic
	 * 		       门户音乐
	 * */
	public void add(AdvMusic advMusic);
	
	/**
	 * 查找所有关于门户音乐
	 * 
	 * @param advMusic
	 * 			视频
	 * */
	public List<AdvMusic> queryAll();
	
	/**
	 * 删除门户音乐
	 * */
	public void del();
	
	/**
	 * 修改门户音乐
	 * @param advMusic
	 * 		   视频
	 * */
	public void update(AdvMusic advMusic);
	
	/**
	 * 根据门户音乐唯一标识查找门户音乐
	 * 
	 * @param id
	 * 			门户音乐唯一标识
	 * */
	public AdvMusic findById(String id);
	
}
