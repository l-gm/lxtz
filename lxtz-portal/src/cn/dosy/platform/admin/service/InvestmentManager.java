package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IInvestmentDAO;
import cn.dosy.platform.admin.domain.Investment;
import cn.dosy.platform.core.web.vo.Page;

public class InvestmentManager implements IInvestmentManager{
	
	private IInvestmentDAO investmentDAO;
	
	public void setInvestmentDAO(IInvestmentDAO investmentDAO) {
		this.investmentDAO = investmentDAO;
	}

	@Override
	public void add(Investment investment) {
		investmentDAO.add(investment);
	}

	@Override
	public void removeById(String id) {
		investmentDAO.removeById(id);
	}

	@Override
	public void update(Investment investment) {
		investmentDAO.update(investment);
	}

	@Override
	public List<Investment> query(Investment investment) {
		return investmentDAO.query(investment);
	}

	@Override
	public Page<Investment> query(Page<Investment> page) {
		return investmentDAO.query(page);
	}

	@Override
	public Investment findById(String id) {
		return investmentDAO.findById(id);
	}

}
