package cn.dosy.platform.admin.service;

import java.util.List;

import cn.dosy.platform.admin.dao.IContactUsDAO;
import cn.dosy.platform.admin.domain.ContactUs;

public class ContactUsManager implements IContactUsManager{
	
	private IContactUsDAO contactUsDAO;
	
	public void setContactUsDAO(IContactUsDAO contactUsDAO) {
		this.contactUsDAO = contactUsDAO;
	}

	@Override
	public List<ContactUs> findAll() {
	
		return contactUsDAO.findAll();
	}

	@Override
	public void update(ContactUs contactUs) {
		contactUsDAO.update(contactUs);
		
	}

	@Override
	public ContactUs findById(String id) {
		return contactUsDAO.findById(id);
	}

}
