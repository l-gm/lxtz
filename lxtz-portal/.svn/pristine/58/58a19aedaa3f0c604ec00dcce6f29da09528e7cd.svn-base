package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.MerchantJob;

public class MerchantJobDAO implements IMerchantJobDAO {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(MerchantJob merchantJob) {
		sessionFactory.getCurrentSession().save(merchantJob);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete MerchantJob u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(MerchantJob merchantJob) {
		sessionFactory.getCurrentSession().update(merchantJob);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MerchantJob> query(MerchantJob merchantJob) {
		String hql = "from MerchantJob u where 1 = 1";
		
		if (StringUtils.isNotBlank(merchantJob.getJobTitle())) {
			hql = hql + " and u.jobTitle = :jobTitle";
		}
		
		
		if (merchantJob.getNum() != null) {
			hql = hql + " and u.num = :num";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getSalaryLevel())) {
			hql = hql + " and u.salaryLevel = :salaryLevel";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getPhone())) {
			hql = hql + " and u.phone = :phone";
		}
		
		if (merchantJob.getPartTime() != null) {
			hql = hql + " and u.partTime = :partTime";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getWorkArea())) {
			hql = hql + " and u.workArea = :workArea";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getAddress())) {
			hql = hql + " and u.address = :address";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getJobResponsibilities())) {
			hql = hql + " and u.jobResponsibilities = :jobResponsibilities";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getCompanyProfile())) {
			hql = hql + " and u.companyProfile = :companyProfile";
		}
		
		if (StringUtils.isNotBlank(merchantJob.getMerchantId())) {
			hql = hql + " and u.merchantId = :merchantId";
		}
		
		if (merchantJob.getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		hql = hql + " order by u.createdDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(merchantJob.getJobTitle())) {
			query.setString("jobTitle", merchantJob.getJobTitle());
		}
		
		if (merchantJob.getNum() != null) {
			query.setInteger("num", merchantJob.getNum());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getSalaryLevel())) {
			query.setString("salaryLevel", merchantJob.getSalaryLevel());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getPhone())) {
			query.setString("phone", merchantJob.getPhone());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getWorkArea())) {
			query.setString("workArea", merchantJob.getWorkArea());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getAddress())) {
			query.setString("address", merchantJob.getAddress());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getJobResponsibilities())) {
			query.setString("jobResponsibilities", merchantJob.getJobResponsibilities());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getCompanyProfile())) {
			query.setString("companyProfile", merchantJob.getCompanyProfile());
		}
		
		if (StringUtils.isNotBlank(merchantJob.getMerchantId())) {
			query.setString("merchantId", merchantJob.getMerchantId());
		}
		
		if (merchantJob.getForbidden() != null) {
			query.setBoolean("forbidden", merchantJob.getForbidden());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<MerchantJob> query(Page<MerchantJob> page) {
		String select = " from MerchantJob u where 1=1";
		String clause = "select count(*) from MerchantJob u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getJobTitle())) {
			hql = hql + " and ( u.jobTitle like '%" + page.getVo().getJobTitle() + "%'";
			hql = hql + " or u.jobResponsibilities like '%" + page.getVo().getJobResponsibilities() + "%')";
		}
		
		if (page.getVo().getNum() != null) {
			hql = hql + " and u.num = :num";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getSalaryLevel())) {
			hql = hql + " and u.salaryLevel = :salaryLevel";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getPhone())) {
			hql = hql + " and u.phone = :phone";
		}
		
		if (page.getVo().getPartTime() != null) {
			hql = hql + " and u.partTime = :partTime";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkArea())) {
			hql = hql + " and u.workArea = :workArea";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getAddress())) {
			hql = hql + " and u.address = :address";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getCompanyProfile())) {
			hql = hql + " and u.companyProfile = :companyProfile";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getMerchantId())) {
			hql = hql + " and u.merchantId = :merchantId";
		}
		
		if (page.getVo().getForbidden() != null) {
			hql = hql + " and u.forbidden = :forbidden";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql);
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (page.getVo().getNum() != null) {
			selectQuery.setInteger("num", page.getVo().getNum());
			clauseQuery.setInteger("num", page.getVo().getNum());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getSalaryLevel())) {
			selectQuery.setString("salaryLevel", page.getVo().getSalaryLevel());
			clauseQuery.setString("salaryLevel", page.getVo().getSalaryLevel());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getPhone())) {
			selectQuery.setString("phone", page.getVo().getPhone());
			clauseQuery.setString("phone", page.getVo().getPhone());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getWorkArea())) {
			selectQuery.setString("workArea", page.getVo().getWorkArea());
			clauseQuery.setString("workArea", page.getVo().getWorkArea());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getAddress())) {
			selectQuery.setString("address", page.getVo().getAddress());
			clauseQuery.setString("address", page.getVo().getAddress());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getCompanyProfile())) {
			selectQuery.setString("companyProfile", page.getVo().getCompanyProfile());
			clauseQuery.setString("companyProfile", page.getVo().getCompanyProfile());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getMerchantId())) {
			selectQuery.setString("merchantId", page.getVo().getMerchantId());
			clauseQuery.setString("merchantId", page.getVo().getMerchantId());
		}
		
		if (page.getVo().getForbidden() != null) {
			selectQuery.setBoolean("forbidden", page.getVo().getForbidden());
			clauseQuery.setBoolean("forbidden", page.getVo().getForbidden());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<MerchantJob> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<MerchantJob> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public MerchantJob findById(String id) {
		String hql = "from MerchantJob u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (MerchantJob) query.uniqueResult();
	}

}
