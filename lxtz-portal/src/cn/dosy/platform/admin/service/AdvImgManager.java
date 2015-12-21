package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IAdvImgDAO;
import cn.dosy.platform.admin.domain.AdvImg;

public class AdvImgManager implements IAdvImgManager {

	private IAdvImgDAO advImgDAO;
	
	public void setAdvImgDAO(IAdvImgDAO advImgDAO) {
		this.advImgDAO = advImgDAO;
	}

	@Override
	public void add(AdvImg advImg) {
		advImgDAO.add(advImg);

	}

	@Override
	public List<AdvImg> queryAll() {
 
		return advImgDAO.queryAll();
	}

	@Override
	public void del(String id) {
		advImgDAO.del(id);

	}

	@Override
	public void update(AdvImg advImg) {
		advImgDAO.update(advImg);

	}

	@Override
	public AdvImg findById(String id) {

		return advImgDAO.findById(id);
	}


}
