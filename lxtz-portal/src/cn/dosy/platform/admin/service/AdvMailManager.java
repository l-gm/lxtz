package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IAdvMailDAO;
import cn.dosy.platform.admin.domain.AdvMail;
import cn.dosy.platform.core.web.vo.Page;

public class AdvMailManager implements IAdvMailManager {

	private IAdvMailDAO advMailDAO;
	
	public void setAdvMailDAO(IAdvMailDAO advMailDAO) {
		this.advMailDAO = advMailDAO;
	}

	@Override
	public void add(AdvMail advMail) {
		advMailDAO.add(advMail);

	}

	@Override
	public List<AdvMail> queryAll() {
 
		return advMailDAO.queryAll();
	}

	@Override
	public void del(String id) {
		advMailDAO.del(id);

	}

	@Override
	public void update(AdvMail advMail) {
		advMailDAO.update(advMail);

	}

	@Override
	public AdvMail findById(String id) {

		return advMailDAO.findById(id);
	}

	@Override
	public Page<AdvMail> query(Page<AdvMail> page) {

		return advMailDAO.query(page);
	}

}
