package cn.dosy.platform.security.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.security.domain.User;


public class UserDAO implements IUserDAO  {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		String hql = "from User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

	public boolean delUser(String id) {
		String hql = "delete User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		
		return (query.executeUpdate() > 0);
	}
	
	public User getUser(String id) {
		String hql = "from User u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		
		return (User) query.uniqueResult();
	}

	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public User getUser(String account, String password) {
		// TODO Auto-generated method stub
		String hql = "from User u where u.account=? and u.password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, account);
		query.setString(1, password);
		
		return (User) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> query(User user) {
		String hql = "from User u where 1=1 ";
		
		if (StringUtils.isNotBlank(user.getAccount())) {
			hql = hql + " and u.account=:account";
		}
		if (user.getUserRole() != null) {
			hql = hql + " and u.userRole >= :userRole";
		}
		if (StringUtils.isNotBlank(user.getName())) {
			hql = hql + " and u.name=:name";
		}
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(user.getAccount())) {
			query.setString("account", user.getAccount());
		}
		if (user.getUserRole() != null) {
			query.setInteger("userRole", user.getUserRole().ordinal());
		}
		if (StringUtils.isNotBlank(user.getName())) {
			query.setString("name", user.getName());
		}
		
		return query.list();
	}
	

}
