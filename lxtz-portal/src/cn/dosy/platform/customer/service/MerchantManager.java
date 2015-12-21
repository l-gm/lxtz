package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.dao.IMerchantDAO;
import cn.dosy.platform.customer.domain.Merchant;

public class MerchantManager implements IMerchantManager{
	
	private IMerchantDAO merchantDAO;
	
	public void setMerchantDAO(IMerchantDAO merchantDAO) {
		this.merchantDAO = merchantDAO;
	}

	@Override
	public void add(Merchant merchant) {
		merchantDAO.add(merchant);
	}

	@Override
	public void removeById(String id) {
		merchantDAO.removeById(id);
	}

	@Override
	public void update(Merchant merchant) {
		merchantDAO.update(merchant);
	}

	@Override
	public List<Merchant> query(Merchant merchant) {
		return merchantDAO.query(merchant);
	}

	@Override
	public Page<Merchant> query(Page<Merchant> page) {
		return merchantDAO.query(page);
	}

	@Override
	public Merchant findById(String id) {
		return merchantDAO.findById(id);
	}

	@Override
	public Merchant findByAccountAndPassword(String account, String password) {
		return merchantDAO.findByAccountAndPassword(account, password);
	}

	@Override
	public boolean checkValidMerchantByAccount(String account) {
		return merchantDAO.checkValidMerchantByAccount(account);
	}

	@Override
	public boolean checkValidMerchantByEmail(String email) {
		return merchantDAO.checkValidMerchantByEmail(email);
	}

}
