package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.customer.dao.IStudentDAO;
import cn.dosy.platform.customer.domain.Student;
import cn.dosy.platform.core.web.vo.Page;

public class StudentManager implements IStudentManager{
	
	private IStudentDAO studentDAO;
	
	public void setStudentDAO(IStudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	public void add(Student student) {
		studentDAO.add(student);
	}

	@Override
	public void removeById(String id) {
		studentDAO.removeById(id);
	}

	@Override
	public void update(Student student) {
		studentDAO.update(student);
	}

	@Override
	public List<Student> query(Student student) {
		return studentDAO.query(student);
	}

	@Override
	public Page<Student> query(Page<Student> page) {
		return studentDAO.query(page);
	}

	@Override
	public Student findById(String id) {
		return studentDAO.findById(id);
	}

	@Override
	public Student findByAccountAndPassword(String account, String password) {
		return studentDAO.findByAccountAndPassword(account, password);
	}

	@Override
	public boolean checkValidStudentByAccount(String account) {
		return studentDAO.checkValidStudentByAccount(account);
	}

	@Override
	public boolean checkValidStudentByEmail(String email) {
		return studentDAO.checkValidStudentByEmail(email);
	}

	@Override
	public boolean checkValidStudentByPhone(String phone) {
		return studentDAO.checkValidStudentByPhone(phone);
	}

	@Override
	public List<Student> getStudentPhone() {
		return studentDAO.getStudentPhone();
	}

}
