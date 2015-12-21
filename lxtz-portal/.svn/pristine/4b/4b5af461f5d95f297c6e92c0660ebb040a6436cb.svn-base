package cn.dosy.platform.security.service;

import java.util.List;

import cn.dosy.platform.security.dao.IUserDAO;
import cn.dosy.platform.security.domain.User;

public class UserManager implements IUserManager {
	
	private IUserDAO userDao;
	
	
	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}


	public void addUser(User user) {
		userDao.addUser(user);
	}


	public List<User> getAllUser() {
		return userDao.getAllUser();
	}


	public boolean delUser(String id) {
		return userDao.delUser(id);
	}
	
	public User getUser(String id) {
		return userDao.getUser(id);
	}


	public void updateUser(User user) {
		userDao.updateUser(user);
	}


	@Override
	public User getUser(String account, String password) {
		return userDao.getUser(account, password);
	}


	@Override
	public List<User> query(User user) {
		return userDao.query(user);
	}

}
