package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IUsingHelpDAO;
import cn.dosy.platform.admin.domain.UsingHelp;
import cn.dosy.platform.core.web.vo.Page;

public class UsingHelpManager implements IUsingHelpManager {

	private IUsingHelpDAO usingHelpDAO;
	
	
	public void setUsingHelpDAO(IUsingHelpDAO usingHelpDAO) {
		this.usingHelpDAO = usingHelpDAO;
	}

	@Override
	public void add(UsingHelp usingHelp) {
		usingHelpDAO.add(usingHelp);
	}

	@Override
	public void removeById(String id) {
		usingHelpDAO.removeById(id);
	}

	@Override
	public void update(UsingHelp usingHelp) {
		usingHelpDAO.update(usingHelp);
	}

	@Override
	public List<UsingHelp> query(UsingHelp usingHelp) {
		return usingHelpDAO.query(usingHelp);
	}

	@Override
	public Page<UsingHelp> query(Page<UsingHelp> page) {
		return usingHelpDAO.query(page);
	}

	@Override
	public UsingHelp findById(String id) {
		return usingHelpDAO.findById(id);
	}

}
