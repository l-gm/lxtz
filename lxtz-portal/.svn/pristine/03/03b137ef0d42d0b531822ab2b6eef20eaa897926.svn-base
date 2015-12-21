package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IAdvVideoDAO;
import cn.dosy.platform.admin.domain.AdvVideo;

public class AdvVideoManager implements IAdvVideoManager {

	private IAdvVideoDAO advVideoDAO;
	
	public void setAdvVideoDAO(IAdvVideoDAO advVideoDAO) {
		this.advVideoDAO = advVideoDAO;
	}

	@Override
	public void add(AdvVideo advVideo) {
		advVideoDAO.add(advVideo);

	}

	@Override
	public List<AdvVideo> queryAll() {
 
		return advVideoDAO.queryAll();
	}

	@Override
	public void del(String id) {
		advVideoDAO.del(id);

	}

	@Override
	public void update(AdvVideo advVideo) {
		advVideoDAO.update(advVideo);

	}

	@Override
	public AdvVideo findById(String id) {

		return advVideoDAO.findById(id);
	}


}
