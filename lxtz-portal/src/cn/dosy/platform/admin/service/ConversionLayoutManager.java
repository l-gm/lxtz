package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IConversionLayoutDAO;
import cn.dosy.platform.admin.domain.ConversionLayout;

public class ConversionLayoutManager implements IConversionLayoutManager{
	
	private IConversionLayoutDAO conversionLayoutDAO;
	
	public void setConversionLayoutDAO(IConversionLayoutDAO conversionLayoutDAO) {
		this.conversionLayoutDAO = conversionLayoutDAO;
	}
	
	@Override
	public List<ConversionLayout> findAll() {
	
		return conversionLayoutDAO.findAll();
	}

	@Override
	public void update(ConversionLayout conversionLayout) {
		conversionLayoutDAO.update(conversionLayout);
		
	}

	@Override
	public ConversionLayout findById(String id) {
		return conversionLayoutDAO.findById(id);
	}
	
	@Override
	public List<ConversionLayout> query(ConversionLayout conversionLayout) {
		return conversionLayoutDAO.query(conversionLayout);
	}

}
