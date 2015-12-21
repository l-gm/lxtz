package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IFinancialDAO;
import cn.dosy.platform.admin.domain.Financial;
import cn.dosy.platform.core.web.vo.Page;

public class FinancialManager implements IFinancialManager{
	
	private IFinancialDAO financialDAO;
	
	public void setFinancialDAO(IFinancialDAO financialDAO) {
		this.financialDAO = financialDAO;
	}

	@Override
	public void add(Financial financial) {
		financialDAO.add(financial);
	}

	@Override
	public void removeById(String id) {
		financialDAO.removeById(id);
	}

	@Override
	public void update(Financial financial) {
		financialDAO.update(financial);
	}

	@Override
	public List<Financial> query(Financial financial) {
		return financialDAO.query(financial);
	}

	@Override
	public Page<Financial> query(Page<Financial> page) {
		return financialDAO.query(page);
	}

	@Override
	public Financial findById(String id) {
		return financialDAO.findById(id);
	}

}
