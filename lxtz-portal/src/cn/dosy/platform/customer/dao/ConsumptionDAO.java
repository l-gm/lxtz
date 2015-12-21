package cn.dosy.platform.customer.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.dosy.platform.core.utils.StringUtils;
import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.domain.Consumption;

public class ConsumptionDAO implements IConsumptionDAO {

	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Consumption consumption) {
		sessionFactory.getCurrentSession().save(consumption);
		sessionFactory.getCurrentSession().flush();
	}

	@Override
	public void removeById(String id) {
		String hql = "delete Consumption u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		query.executeUpdate();
	}

	@Override
	public void update(Consumption consumption) {
		sessionFactory.getCurrentSession().update(consumption);
		sessionFactory.getCurrentSession().flush();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consumption> query(Consumption consumption) {
		String hql = "from Consumption u where 1 = 1";
		
		if (StringUtils.isNotBlank(consumption.getGoodsName())) {
			hql = hql + " and u.goodsName = :goodsName";
		}
		
		if (StringUtils.isNotBlank(consumption.getBrand())) {
			hql = hql + " and u.brand = :brand";
		}
		
		if (consumption.getGoodsPrice() != null) {
			hql = hql + " and u.goodsPrice = :goodsPrice";
		}
		
		if (consumption.getApplyMoney() != null) {
			hql = hql + " and u.applyMoney = :applyMoney";
		}
		
		if (consumption.getApplyTime() != null) {
			hql = hql + " and u.applyTime = :applyTime";
		}
		
		if (consumption.getBizTime() != null) {
			hql = hql + " and u.bizTime = :bizTime";
		}
		
		if (consumption.getMonths() != null) {
			hql = hql + " and u.months = :months";
		}
		
		if (StringUtils.isNotBlank(consumption.getComment())) {
			hql = hql + " and u.comment = :comment";
		}
		
		if (consumption.getAgree() != null) {
			hql = hql + " and u.agree = :agree";
		}
		
		if (StringUtils.isNotBlank(consumption.getStudentId())) {
			hql = hql + " and u.studentId = :studentId";
		}
		
		if (StringUtils.isNotBlank(consumption.getStudentName())) {
			hql = hql + " and u.studentName = :studentName";
		}
		
		hql = hql + " order by u.lastModifiedDate desc";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		if (StringUtils.isNotBlank(consumption.getGoodsName())) {
			query.setString("goodsName", consumption.getGoodsName());
		}
		
		if (StringUtils.isNotBlank(consumption.getBrand())) {
			query.setString("brand", consumption.getBrand());
		}
		
		if (consumption.getGoodsPrice() != null) {
			query.setInteger("goodsPrice", consumption.getGoodsPrice());
		}
		
		if (consumption.getApplyMoney() != null) {
			query.setInteger("applyMoney", consumption.getApplyMoney());
		}
		
		if (consumption.getApplyTime() != null) {
			query.setDate("applyTime", consumption.getApplyTime());
		}
		
		if (consumption.getBizTime() != null) {
			query.setDate("bizTime", consumption.getBizTime());
		}
		
		if (consumption.getMonths() != null) {
			query.setInteger("months", consumption.getMonths());
		}
		
		if (StringUtils.isNotBlank(consumption.getComment())) {
			query.setString("comment", consumption.getComment());
		}
		
		if (consumption.getAgree() != null) {
			query.setBoolean("agree", consumption.getAgree());
		}
		
		if (StringUtils.isNotBlank(consumption.getStudentId())) {
			query.setString("studentId", consumption.getStudentId());
		}
		
		if (StringUtils.isNotBlank(consumption.getStudentName())) {
			query.setString("studentName", consumption.getStudentName());
		}
		
		return query.list();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page<Consumption> query(Page<Consumption> page) {
		String select = " from Consumption u where 1=1";
		String clause = "select count(*) from Consumption u where 1=1 ";
		String hql = "";
		
		if (StringUtils.isNotBlank(page.getVo().getGoodsName())) {
			hql = hql + " and u.goodsName = :goodsName";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getBrand())) {
			hql = hql + " and u.brand = :brand";
		}
		
		if (page.getVo().getGoodsPrice() != null) {
			hql = hql + " and u.goodsPrice = :goodsPrice";
		}
		
		if (page.getVo().getApplyMoney() != null) {
			hql = hql + " and u.applyMoney = :applyMoney";
		}
		
		if (page.getVo().getApplyTime() != null) {
			hql = hql + " and u.applyTime = :applyTime";
		}
		
		if (page.getVo().getBizTime() != null) {
			hql = hql + " and u.bizTime = :bizTime";
		}
		
		if (page.getVo().getMonths() != null) {
			hql = hql + " and u.months = :months";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getComment())) {
			hql = hql + " and u.comment = :comment";
		}
		
		if (page.getVo().getAgree() != null) {
			hql = hql + " and u.agree = :agree";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentId())) {
			hql = hql + " and u.studentId = :studentId";
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentName())) {
			hql = hql + " and u.studentName = :studentName";
		}
		
		Query selectQuery = sessionFactory.getCurrentSession().createQuery(select + hql + " order by u.lastModifiedDate desc");
		Query clauseQuery = sessionFactory.getCurrentSession().createQuery(clause + hql);
		
		if (StringUtils.isNotBlank(page.getVo().getGoodsName())) {
			selectQuery.setString("goodsName", page.getVo().getGoodsName());
			clauseQuery.setString("goodsName", page.getVo().getGoodsName());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getBrand())) {
			selectQuery.setString("brand", page.getVo().getBrand());
			clauseQuery.setString("brand", page.getVo().getBrand());
		}
		
		if (page.getVo().getGoodsPrice() != null) {
			selectQuery.setInteger("goodsPrice", page.getVo().getGoodsPrice());
			clauseQuery.setInteger("goodsPrice", page.getVo().getGoodsPrice());
		}
		
		if (page.getVo().getApplyMoney() != null) {
			selectQuery.setInteger("applyMoney", page.getVo().getApplyMoney());
			clauseQuery.setInteger("applyMoney", page.getVo().getApplyMoney());
		}
		
		if (page.getVo().getApplyTime() != null) {
			selectQuery.setDate("applyTime", page.getVo().getApplyTime());
			clauseQuery.setDate("applyTime", page.getVo().getApplyTime());
		}
		
		if (page.getVo().getBizTime() != null) {
			selectQuery.setDate("bizTime", page.getVo().getBizTime());
			clauseQuery.setDate("bizTime", page.getVo().getBizTime());
		}
		
		if (page.getVo().getMonths() != null) {
			selectQuery.setInteger("months", page.getVo().getMonths());
			clauseQuery.setInteger("months", page.getVo().getMonths());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getComment())) {
			selectQuery.setString("comment", page.getVo().getComment());
			clauseQuery.setString("comment", page.getVo().getComment());
		}
		
		if (page.getVo().getAgree() != null) {
			selectQuery.setBoolean("agree", page.getVo().getAgree());
			clauseQuery.setBoolean("agree", page.getVo().getAgree());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentId())) {
			selectQuery.setString("studentId", page.getVo().getStudentId());
			clauseQuery.setString("studentId", page.getVo().getStudentId());
		}
		
		if (StringUtils.isNotBlank(page.getVo().getStudentName())) {
			selectQuery.setString("studentName", page.getVo().getStudentName());
			clauseQuery.setString("studentName", page.getVo().getStudentName());
		}
		
		selectQuery.setFirstResult((page.getPageNo() - 1 ) * page.getPageSize());
		selectQuery.setMaxResults(page.getPageSize());
		
		List<Consumption> content = selectQuery.list();
		Integer totalPages = new Long((Long)clauseQuery.uniqueResult()).intValue();
		
		Page<Consumption> result = new Page(page.getPageNo(), page.getPageSize(), totalPages, totalPages%page.getPageSize() == 0 ? totalPages/page.getPageSize() : totalPages/page.getPageSize() + 1, page.getVo(), content);
		return result;
	}

	@Override
	public Consumption findById(String id) {
		String hql = "from Consumption u where u.id=:id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString("id", id);
		return (Consumption) query.uniqueResult();
	}

}
