package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.core.web.vo.Page;
import cn.dosy.platform.customer.dao.IStudentJobDAO;
import cn.dosy.platform.customer.domain.StudentJob;

public class StudentJobManager implements IStudentJobManager{
	
	private IStudentJobDAO studentJobDAO;
	
	public void setStudentJobDAO(IStudentJobDAO studentJobDAO) {
		this.studentJobDAO = studentJobDAO;
	}

	@Override
	public void add(StudentJob studentJob) {
		studentJobDAO.add(studentJob);
	}

	@Override
	public void removeById(String id) {
		studentJobDAO.removeById(id);
	}

	@Override
	public void update(StudentJob studentJob) {
		studentJobDAO.update(studentJob);
	}

	@Override
	public List<StudentJob> query(StudentJob studentJob) {
		return studentJobDAO.query(studentJob);
	}

	@Override
	public Page<StudentJob> query(Page<StudentJob> page) {
		return studentJobDAO.query(page);
	}

	@Override
	public StudentJob findById(String id) {
		return studentJobDAO.findById(id);
	}

}
