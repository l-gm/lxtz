package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.ICompanyProfileDAO;
import cn.dosy.platform.admin.domain.CompanyProfile;
import cn.dosy.platform.core.web.vo.Page;

public class CompanyProfileManager implements ICompanyProfileManager{
	
	private ICompanyProfileDAO companyProfileDAO;
	
	public void setCompanyProfileDAO(ICompanyProfileDAO companyProfileDAO) {
		this.companyProfileDAO = companyProfileDAO;
	}

	@Override
	public void add(CompanyProfile companyProfile) {
		companyProfileDAO.add(companyProfile);
	}

	@Override
	public void removeById(String id) {
		companyProfileDAO.removeById(id);
	}

	@Override
	public void update(CompanyProfile companyProfile) {
		companyProfileDAO.update(companyProfile);
	}

	@Override
	public List<CompanyProfile> query(CompanyProfile companyProfile) {
		return companyProfileDAO.query(companyProfile);
	}

	@Override
	public Page<CompanyProfile> query(Page<CompanyProfile> page) {
		return companyProfileDAO.query(page);
	}

	@Override
	public CompanyProfile findById(String id) {
		return companyProfileDAO.findById(id);
	}

	@Override
	public List<CompanyProfile> findAll() {
		return companyProfileDAO.findAll();
	}

}
