package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IEmploymentDAO;
import cn.dosy.platform.admin.domain.Employment;
import cn.dosy.platform.core.web.vo.Page;

public class EmploymentManager implements IEmploymentManager{
	
	private IEmploymentDAO employmentDAO;
	
	public void setEmploymentDAO(IEmploymentDAO employmentDAO) {
		this.employmentDAO = employmentDAO;
	}

	@Override
	public void add(Employment employment) {
		employmentDAO.add(employment);
	}

	@Override
	public void removeById(String id) {
		employmentDAO.removeById(id);
	}

	@Override
	public void update(Employment employment) {
		employmentDAO.update(employment);
	}

	@Override
	public List<Employment> query(Employment employment) {
		return employmentDAO.query(employment);
	}

	@Override
	public Page<Employment> query(Page<Employment> page) {
		return employmentDAO.query(page);
	}

	@Override
	public Employment findById(String id) {
		return employmentDAO.findById(id);
	}

}
