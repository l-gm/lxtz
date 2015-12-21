package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IAdvMusicDAO;
import cn.dosy.platform.admin.domain.AdvMusic;

public class AdvMusicManager implements IAdvMusicManager {

	private IAdvMusicDAO advMusicDAO;
	
	public void setAdvMusicDAO(IAdvMusicDAO advMusicDAO) {
		this.advMusicDAO = advMusicDAO;
	}

	@Override
	public void add(AdvMusic advMusic) {
		advMusicDAO.add(advMusic);

	}

	@Override
	public List<AdvMusic> queryAll() {
 
		return advMusicDAO.queryAll();
	}

	@Override
	public void del() {
		advMusicDAO.del();

	}

	@Override
	public void update(AdvMusic advMusic) {
		advMusicDAO.update(advMusic);

	}

	@Override
	public AdvMusic findById(String id) {

		return advMusicDAO.findById(id);
	}


}
