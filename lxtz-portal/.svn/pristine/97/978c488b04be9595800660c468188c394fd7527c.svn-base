package cn.dosy.platform.customer.service;

import java.util.List;

import cn.dosy.platform.customer.domain.Student;
import cn.dosy.platform.core.web.vo.Page;

public interface IStudentManager {

	/**
	 * 添加学生（顾客）
	 * 
	 * @param student
	 * 			学生（顾客）
	 * */
	public void add(Student student);
	
	/**
	 * 根据学生唯一标识删除学生
	 * 
	 * @param id
	 * 			学生唯一标识
	 * */
	public void removeById(String id); 
	
	/**
	 * 修改学生（顾客）
	 * 
	 * @param student
	 * 			学生（顾客）
	 * */
	public void update(Student student);
	
	/**
	 * 获取符合查询对象的学生（顾客）
	 * 
	 * @param student
	 * 			学生（顾客）查询对象
	 * @return
	 * */	
	public List<Student> query(Student student);
	
	/**
	 * 获取查询对象学生（顾客）的分页
	 * 
	 * @param page
	 * 			学生（顾客）查询对象
	 * @return
	 * */
	public Page<Student> query(Page<Student> page);
	
	/**
	 * 根据学生（顾客）唯一标识查找学生（顾客）
	 * 
	 * @param id
	 * 			学生（顾客）唯一标识
	 * */
	public Student findById(String id);
	
	/**
	 * 根据用户名密码获取学生信息
	 * 
	 * @param account
	 * 				用户名
	 * @param password
	 * 				密码
	 * @return
	 * */
	public Student findByAccountAndPassword(String account, String password);
	
	/**
	 * 检查用户名唯一
	 * @param account
	 * @return
	 */
	public boolean checkValidStudentByAccount(String account);
	
	/**
	 * 检查邮箱唯一
	 * @param email
	 * @return
	 */
	public boolean checkValidStudentByEmail(String email);
	
	/**
	 * 检查手机号唯一
	 * @param phone
	 * @return
	 */
	public boolean checkValidStudentByPhone(String phone);
	
	/**
	 * 获取学生手机
	 * */
	public List<Student> getStudentPhone();
}
