package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.dao.IMerchantJobDAO;
import cn.dosy.platform.customer.domain.MerchantJob;

public class MerchantJobManager implements IMerchantJobManager{
	
	private IMerchantJobDAO merchantJobDAO;
	
	public void setMerchantJobDAO(IMerchantJobDAO merchantJobDAO) {
		this.merchantJobDAO = merchantJobDAO;
	}

	@Override
	public void add(MerchantJob merchantJob) {
		merchantJobDAO.add(merchantJob);
	}

	@Override
	public void removeById(String id) {
		merchantJobDAO.removeById(id);
	}

	@Override
	public void update(MerchantJob merchantJob) {
		merchantJobDAO.update(merchantJob);
	}

	@Override
	public List<MerchantJob> query(MerchantJob merchantJob) {
		return merchantJobDAO.query(merchantJob);
	}

	@Override
	public Page<MerchantJob> query(Page<MerchantJob> page) {
		return merchantJobDAO.query(page);
	}

	@Override
	public MerchantJob findById(String id) {
		return merchantJobDAO.findById(id);
	}

}
