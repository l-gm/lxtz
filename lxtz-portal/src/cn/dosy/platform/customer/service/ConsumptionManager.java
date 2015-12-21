package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.dao.IConsumptionDAO;
import cn.dosy.platform.customer.domain.Consumption;

public class ConsumptionManager implements IConsumptionManager{
	
	private IConsumptionDAO consumptionDAO;
	
	public void setConsumptionDAO(IConsumptionDAO consumptionDAO) {
		this.consumptionDAO = consumptionDAO;
	}

	@Override
	public void add(Consumption consumption) {
		consumptionDAO.add(consumption);
	}

	@Override
	public void removeById(String id) {
		consumptionDAO.removeById(id);
	}

	@Override
	public void update(Consumption consumption) {
		consumptionDAO.update(consumption);
	}

	@Override
	public List<Consumption> query(Consumption consumption) {
		return consumptionDAO.query(consumption);
	}

	@Override
	public Page<Consumption> query(Page<Consumption> page) {
		return consumptionDAO.query(page);
	}

	@Override
	public Consumption findById(String id) {
		return consumptionDAO.findById(id);
	}

}
