package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IMindChickenSoupDAO;
import cn.dosy.platform.admin.domain.MindChickenSoup;
import cn.dosy.platform.core.web.vo.Page;

public class MindChickenSoupManager implements IMindChickenSoupManager{
	
	private IMindChickenSoupDAO mindChickenSoupDAO;
	
	public void setMindChickenSoupDAO(IMindChickenSoupDAO mindChickenSoupDAO) {
		this.mindChickenSoupDAO = mindChickenSoupDAO;
	}

	@Override
	public void add(MindChickenSoup mindChickenSoup) {
		mindChickenSoupDAO.add(mindChickenSoup);
	}

	@Override
	public void removeById(String id) {
		mindChickenSoupDAO.removeById(id);
	}

	@Override
	public void update(MindChickenSoup mindChickenSoup) {
		mindChickenSoupDAO.update(mindChickenSoup);
	}

	@Override
	public List<MindChickenSoup> query(MindChickenSoup mindChickenSoup) {
		return mindChickenSoupDAO.query(mindChickenSoup);
	}

	@Override
	public Page<MindChickenSoup> query(Page<MindChickenSoup> page) {
		return mindChickenSoupDAO.query(page);
	}

	@Override
	public MindChickenSoup findById(String id) {
		return mindChickenSoupDAO.findById(id);
	}

}
