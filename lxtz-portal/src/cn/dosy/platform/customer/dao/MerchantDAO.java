package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Merchant;

public class MerchantDAO implements IMerchantDAO {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Merchant merchant) {
		sessionFactory.getCurrentSession().save(merchant);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Merchant u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Merchant merchant) {
		sessionFactory.getCurrentSession().update(merchant);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Merchant> query(Merchant merchant) {
		String hql = "from Merchant u where 1 = 1";
		
		if (StringUtils.isNotBlank(merchant.getName())) {
			hql = hql + " and u.name = :name";
		}
		if (StringUtils.isNotBlank(merchant.getEmail())) {
			hql = hql + " and u.email = :email";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(merchant.getName())) {
			query.setString("name", merchant.getName());
		}
		if (StringUtils.isNotBlank(merchant.getEmail())) {
			query.setString("email", merchant.getEmail());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Merchant> query(Page<Merchant> page) {
		String select = " from Merchant u where 1=1";
		String clause = "select count(*) from Merchant u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getName())) {
			hql = hql + " and u.name=:name";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.lastModifiedDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (StringUtils.isNotBlank(page.getVo().getName())) {
			selectQuery.setString("name", page.getVo().getName());
			clauseQuery.setString("name", page.getVo().getName());
		}
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Merchant> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Merchant> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public Merchant findById(String id) {
		String hql = "from Merchant u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Merchant) query.uniqueResult();
	}

	@Override
	public Merchant findByAccountAndPassword(String account, String password) {
		String hql = "from Merchant u where u.account=:account and u.password=:password";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("account", account);
		query.setString("password", password);
		return (Merchant) query.uniqueResult();
	}

	@Override
	public boolean checkValidMerchantByAccount(String account) {
		String hql = "select count(*) from Merchant u where u.account=:account";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("account", account);
		return ((Long)query.uniqueResult() == 0l);
	}

	@Override
	public boolean checkValidMerchantByEmail(String email) {
		String hql = "select count(*) from Merchant u where u.email=:email";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("email", email);
		return ((Long)query.uniqueResult() == 0l);
	}


}
