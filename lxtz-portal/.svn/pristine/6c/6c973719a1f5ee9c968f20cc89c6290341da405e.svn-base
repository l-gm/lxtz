package cn.dosy.platform.customer.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import cn.dosy.platform.core.domain.AbstractDomainEntity;

/**
 * <p>
 * 学生
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月07日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月07日；
 */
@Entity
@Table(name = "TBL_LXTZ_STUDENT")
public class Student extends AbstractDomainEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8234676166753067008L;
	
	/**
	 * 用户名
	 * */
	private String account;
	
	/**
	 * 密码
	 * */
	private String password;
	
	/**
	 * 学生名字
	 * */
	private String name;
	
	/**
	 * 身份证号码
	 * */
	private String identityNumber;
	
	/**
	 * 学生证号
	 * */
	private String studentNumber;
	
	/**
	 * 发证机关所在地
	 * */
	private String identityOrgLocated;
	
	/**
	 * 出生年月日
	 * */
	private Date birth;
	
	/**
	 * 性别
	 * */
	private Boolean sex;
	
	/**
	 * 手机号码
	 * */
	private String phone;
	
	/**
	 * 固定电话
	 * */
	private String telephone;
	
	/**
	 * 新浪微博账号
	 * */
	private String sinaAccount;
	
	/**
	 * 邮箱
	 * */
	private String email;
	
	/**
	 * qq号码
	 * */
	private String qq;
	
	/**
	 * 家庭户口详细地址
	 * */
	private String familyAddress;
	
	/**
	 * 家庭户口地址邮编
	 * */
	private String familyAddressPostcode;
	
	/**
	 * 现居地详细地址
	 * */
	private String liveAddress;
	
	/**
	 * 现居地地址邮编
	 * */
	private String liveAddressPostcode;
	
	
	/**
	 * 父母或监护人姓名
	 * */
	private String parent1;
	
	/**
	 * 父母或监护人姓名
	 * */
	private String parent2;
	
	/**
	 * 父母或监护人与申请人关系
	 * */
	private String relation1;
	
	/**
	 * 父母或监护人与申请人关系
	 * */
	private String relation2;
	
	/**
	 * 父母或监护人工作单位与地址
	 * */
	private String parentAddress1;
	
	/**
	 * 父母或监护人工作单位与地址
	 * */
	private String parentAddress2;
	
	/**
	 * 父母或监护人手机号码
	 * */
	private String parentPhone1;
	
	/**
	 * 父母或监护人手机号码 
	 * */
	private String parentPhone2;
	
	/**
	 * 父母或监护人固定电话 
	 * */
	private String parentTelephone1;
	
	/**
	 * 父母或监护人固定电话 
	 * */
	private String parentTelephone2;
	
	/**
	 * 同学名字
	 * */
	private String classmateName1;
	
	/**
	 * 同学名字
	 * */
	private String classmateName2;
	
	/**
	 * 同学手机号码
	 * */
	private String classmatePhone1;
	
	/**
	 * 同学手机号码
	 * */
	private String classmatePhone2;
	
	/**
	 * 同学qq
	 * */
	private String classmateQQ1;
	
	/**
	 * 同学qq
	 * */
	private String classmateQQ2;
	
	/**
	 * 班主任名字
	 * */
	private String masterName;
	
	/**
	 * 班主任手机号码
	 * */
	private String masterPhone;
	
	/**
	 * 班主任办公地址
	 * */
	private String masterWorkAddress;
	
	/**
	 * 小学名称
	 * */
	private String primarySchoolName;
	
	/**
	 * 小学地址
	 * */
	private String primarySchoolAddress;
	
	/**
	 * 中学名称
	 * */
	private String middleSchoolName;
	
	/**
	 * 中学地址
	 * */
	private String middleSchoolAddress;
	
	/**
	 * 高中学校名称
	 * */
	private String highSchoolName;
	
	/**
	 * 高中学校地址
	 * */
	private String highSchoolAddress;
	
	
	/**
	 * 大学学校名称
	 * */
	private String universityName;
	
	/**
	 * 学院名称
	 * */
	private String collegeName;
	
	/**
	 * 专业名称
	 * */
	private String majorName;
	
	/**
	 * 班级名称
	 * */
	private String className;
	
	/**
	 * 入学时间
	 * */
	private Date enterScholTime;
	
	/**
	 * 毕业时间
	 * */
	private Date graduationTime;
	
	/**
	 * 教育程度
	 * */
	private EducationLevel educationLevel;
	
	/**
	 * 头像图片名
	 * */
	private String iconsName;
	
	/**
	 * 头像图片
	 * */
	private byte[] iconsPicture;
	
	/**
	 * 禁用
	 * */
	private Boolean forbidden;
	
	/**
	 * 个人评价
	 * */
	private Integer rating;
	
	
	public Student(){
		super(true);
		this.iconsName = "person_male.gif";
		this.forbidden = false;
	}
	
	public Student(String id, String account, String name, String universityName, String phone, Integer rating, Boolean forbidden, Date createdDate){
		this.id = id;
		this.account = account;
		this.name = name;
		this.universityName = universityName;
		this.phone = phone;
		this.rating = rating;
		this.forbidden = forbidden;
		this.createdDate = createdDate;
	}
	
	public Student(String phone, String name, String universityName) {
		this.phone = phone;
		this.name = name;
		this.universityName = universityName;
	}
	
	

	/**
	 * 获取  用户名
	 * 
	 * @return
	 * */
	@Column(name = "ACCOUNT")
	public String getAccount() {
		return account;
	}

	/**
	 * 设置  用户名
	 * 
	 * @param account
	 * */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * 获取  密码
	 * 
	 * @return
	 * */
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	/**
	 * 设置  密码
	 * 
	 * @param password
	 * */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 获取  学生名字
	 * 
	 * @return
	 * */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * 设置  学生名字
	 * 
	 * @param name
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取  身份证号码
	 * 
	 * @return
	 * */
	@Column(name = "IDENTITY_NUMBER")
	public String getIdentityNumber() {
		return identityNumber;
	}

	/**
	 * 设置  身份证号码
	 * 
	 * @param identityNumber
	 * */
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	/**
	 * 获取  学生证号
	 * 
	 * @return
	 * */
	@Column(name = "STUDENT_NUMBER")
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * 设置  学生证号
	 * 
	 * @param studentNumber
	 * */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * 获取  发证机关所在地
	 * 
	 * @return
	 * */
	@Column(name = "IDENTITY_ORG_LOCATED")
	public String getIdentityOrgLocated() {
		return identityOrgLocated;
	}

	/**
	 * 设置  发证机关所在地
	 * 
	 * @param identityOrgLocated
	 * */
	public void setIdentityOrgLocated(String identityOrgLocated) {
		this.identityOrgLocated = identityOrgLocated;
	}

	/**
	 * 获取  出生年月日
	 * 
	 * @return
	 * */
	@Column(name = "BIRTH")
	public Date getBirth() {
		return birth;
	}

	/**
	 * 设置  出生年月日
	 * 
	 * @param birth
	 * */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * 获取  性别
	 * 
	 * @return
	 * */
	@Column(name = "SEX")
	public Boolean getSex() {
		return sex;
	}
	
	/**
	 * 设置  性别
	 * 
	 * @param sex
	 * */
	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	/**
	 * 获取  手机号码
	 * 
	 * @return
	 * */
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置  手机号码
	 * 
	 * @param phone
	 * */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获取  固定电话
	 * 
	 * @return
	 * */
	@Column(name = "TELEPHONE")
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 设置  固定电话
	 * 
	 * @param telephone
	 * */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * 获取  新浪微博账号
	 * 
	 * @return
	 * */
	@Column(name = "SINA_ACCOUNT")
	public String getSinaAccount() {
		return sinaAccount;
	}

	/**
	 * 设置  新浪微博账号
	 * 
	 * @param sinaAccount
	 * */
	public void setSinaAccount(String sinaAccount) {
		this.sinaAccount = sinaAccount;
	}

	/**
	 * 获取  邮箱
	 * 
	 * @return
	 * */
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	/**
	 * 设置  邮箱
	 * 
	 * @param email
	 * */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取  qq号码
	 * 
	 * @return
	 * */
	@Column(name = "QQ")
	public String getQq() {
		return qq;
	}

	/**
	 * 设置  qq号码
	 * 
	 * @param qq
	 * */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * 获取  家庭户口详细地址
	 * 
	 * @return
	 * */
	@Column(name = "FAMILY_ADDRESS")
	public String getFamilyAddress() {
		return familyAddress;
	}

	/**
	 * 设置  家庭户口详细地址
	 * 
	 * @param familyAddress
	 * */
	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	/**
	 * 获取  家庭户口地址邮编
	 * 
	 * @return
	 * */
	@Column(name = "FAMILY_ADDRESS_POSTCODE")
	public String getFamilyAddressPostcode() {
		return familyAddressPostcode;
	}
	
	/**
	 * 设置  家庭户口地址邮编
	 * 
	 * @param familyAddressPostcode
	 * */
	public void setFamilyAddressPostcode(String familyAddressPostcode) {
		this.familyAddressPostcode = familyAddressPostcode;
	}

	/**
	 * 获取  现居地详细地址
	 * 
	 * @return
	 * */
	@Column(name = "LIVE_ADDRESS")
	public String getLiveAddress() {
		return liveAddress;
	}

	/**
	 * 设置  现居地详细地址
	 * 
	 * @param liveAddress
	 * */
	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	/**
	 * 获取  现居地地址邮编
	 * 
	 * @return
	 * */
	@Column(name = "LIVE_ADDRESS_POSTCODE")
	public String getLiveAddressPostcode() {
		return liveAddressPostcode;
	}

	/**
	 * 设置  现居地地址邮编
	 * 
	 * @param liveAddressPostcode
	 * */
	public void setLiveAddressPostcode(String liveAddressPostcode) {
		this.liveAddressPostcode = liveAddressPostcode;
	}

	/**
	 * 获取  父母或监护人姓名
	 * 
	 * @return
	 * */
	@Column(name = "PARENT1")
	public String getParent1() {
		return parent1;
	}

	/**
	 * 设置  父母或监护人姓名
	 * 
	 * @param parent1
	 * */
	public void setParent1(String parent1) {
		this.parent1 = parent1;
	}

	/**
	 * 获取  父母或监护人姓名
	 * 
	 * @return
	 * */
	@Column(name = "PARENT2")
	public String getParent2() {
		return parent2;
	}

	/**
	 * 设置  父母或监护人姓名
	 * 
	 * @param parent2
	 * */
	public void setParent2(String parent2) {
		this.parent2 = parent2;
	}

	/**
	 * 获取  父母或监护人与申请人关系
	 * 
	 * @return
	 * */
	@Column(name = "RELATION1")
	public String getRelation1() {
		return relation1;
	}

	/**
	 * 设置  父母或监护人与申请人关系
	 * 
	 * @param relation1
	 * */
	public void setRelation1(String relation1) {
		this.relation1 = relation1;
	}

	/**
	 * 获取  父母或监护人与申请人关系
	 * 
	 * @return
	 * */
	@Column(name = "RELATION2")
	public String getRelation2() {
		return relation2;
	}

	/**
	 * 设置  父母或监护人与申请人关系
	 * 
	 * @param relation2
	 * */
	public void setRelation2(String relation2) {
		this.relation2 = relation2;
	}

	/**
	 * 获取  父母或监护人工作单位与地址
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_ADDRESS1")
	public String getParentAddress1() {
		return parentAddress1;
	}

	/**
	 * 设置  父母或监护人工作单位与地址
	 * 
	 * @param parentAddress1
	 * */
	public void setParentAddress1(String parentAddress1) {
		this.parentAddress1 = parentAddress1;
	}

	/**
	 * 获取  父母或监护人工作单位与地址
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_ADDRESS2")
	public String getParentAddress2() {
		return parentAddress2;
	}

	/**
	 * 设置  父母或监护人工作单位与地址
	 * 
	 * @param parentAddress2
	 * */
	public void setParentAddress2(String parentAddress2) {
		this.parentAddress2 = parentAddress2;
	}

	/**
	 * 获取  父母或监护人手机号码
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_PHONE1")
	public String getParentPhone1() {
		return parentPhone1;
	}

	/**
	 * 设置  父母或监护人手机号码
	 * 
	 * @param parentPhone1
	 * */
	public void setParentPhone1(String parentPhone1) {
		this.parentPhone1 = parentPhone1;
	}

	/**
	 * 获取  父母或监护人手机号码
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_PHONE2")
	public String getParentPhone2() {
		return parentPhone2;
	}

	/**
	 * 设置  父母或监护人手机号码
	 * 
	 * @param parentPhone2
	 * */
	public void setParentPhone2(String parentPhone2) {
		this.parentPhone2 = parentPhone2;
	}

	/**
	 * 获取  父母或监护人固定电话
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_TELEPHONE1")
	public String getParentTelephone1() {
		return parentTelephone1;
	}

	/**
	 * 设置  父母或监护人固定电话
	 * 
	 * @param parentTelephone1
	 * */
	public void setParentTelephone1(String parentTelephone1) {
		this.parentTelephone1 = parentTelephone1;
	}

	/**
	 * 获取  父母或监护人固定电话
	 * 
	 * @return
	 * */
	@Column(name = "PARENT_TELEPHONE2")
	public String getParentTelephone2() {
		return parentTelephone2;
	}

	/**
	 * 设置  父母或监护人固定电话
	 * 
	 * @param parentTelephone2
	 * */
	public void setParentTelephone2(String parentTelephone2) {
		this.parentTelephone2 = parentTelephone2;
	}

	/**
	 * 获取  同学名字
	 * 
	 * @return
	 * */
	@Column(name = "CLASSMATE_NAME1")
	public String getClassmateName1() {
		return classmateName1;
	}

	/**
	 * 设置  同学名字
	 * 
	 * @param classmateName1
	 * */
	public void setClassmateName1(String classmateName1) {
		this.classmateName1 = classmateName1;
	}

	/**
	 * 获取  同学名字
	 * 
	 * @return
	 * */
	@Column(name = "CLASSMATE_NAME2")
	public String getClassmateName2() {
		return classmateName2;
	}

	/**
	 * 设置  同学名字
	 * 
	 * @param classmateName2
	 * */
	public void setClassmateName2(String classmateName2) {
		this.classmateName2 = classmateName2;
	}

	/**
	 * 获取 同学手机号码
	 * 
	 * @return 
	 * */
	@Column(name = "CLASSMATE_PHONE1")
	public String getClassmatePhone1() {
		return classmatePhone1;
	}
	
	/**
	 * 设置  同学手机号码
	 * 
	 * @param classmatePhone1
	 * */
	public void setClassmatePhone1(String classmatePhone1) {
		this.classmatePhone1 = classmatePhone1;
	}

	/**
	 * 获取  同学手机号码
	 * 
	 * @return
	 * */
	@Column(name = "CLASSMATE_PHONE2")
	public String getClassmatePhone2() {
		return classmatePhone2;
	}

	/**
	 * 设置  同学手机号码
	 * 
	 * @param classmatePhone2
	 * */
	public void setClassmatePhone2(String classmatePhone2) {
		this.classmatePhone2 = classmatePhone2;
	}

	/**
	 * 获取  同学qq
	 * 
	 * @return
	 * */
	@Column(name = "CLASSMATE_QQ1")
	public String getClassmateQQ1() {
		return classmateQQ1;
	}
	
	/**
	 * 设置  同学qq
	 * 
	 * @param classmateQQ1
	 * */
	public void setClassmateQQ1(String classmateQQ1) {
		this.classmateQQ1 = classmateQQ1;
	}
	
	/**
	 * 获取  同学qq
	 * 
	 * @return
	 * */
	@Column(name = "CLASSMATE_QQ2")
	public String getClassmateQQ2() {
		return classmateQQ2;
	}

	/**
	 * 设置  同学qq
	 * 
	 * @param classmateQQ2
	 * */
	public void setClassmateQQ2(String classmateQQ2) {
		this.classmateQQ2 = classmateQQ2;
	}

	/**
	 * 获取  班主任名字
	 * 
	 * @return
	 * */
	@Column(name = "MASTERNAME")
	public String getMasterName() {
		return masterName;
	}

	/**
	 * 设置  班主任名字
	 * 
	 * @param masterName
	 * */
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	/**
	 * 获取  班主任手机号码
	 * 
	 * @return
	 * */
	@Column(name = "MASTER_PHONE")
	public String getMasterPhone() {
		return masterPhone;
	}

	/**
	 * 设置  班主任手机号码
	 * 
	 * @param masterPhone
	 * */
	public void setMasterPhone(String masterPhone) {
		this.masterPhone = masterPhone;
	}

	/**
	 * 获取  班主任办公地址
	 * 
	 * @return
	 * */
	@Column(name = "MASTER_WORK_ADDRESS")
	public String getMasterWorkAddress() {
		return masterWorkAddress;
	}

	/**
	 * 设置  班主任办公地址
	 * 
	 * @param masterWorkAddress
	 * */
	public void setMasterWorkAddress(String masterWorkAddress) {
		this.masterWorkAddress = masterWorkAddress;
	}

	/**
	 * 获取  小学名称
	 * 
	 * @return
	 * */
	@Column(name = "PRIMARY_SCHOOL_NAME")
	public String getPrimarySchoolName() {
		return primarySchoolName;
	}

	/**
	 * 设置  小学名称
	 * 
	 * @param primarySchoolName
	 * */
	public void setPrimarySchoolName(String primarySchoolName) {
		this.primarySchoolName = primarySchoolName;
	}

	/**
	 * 获取  小学地址
	 * 
	 * @return
	 * */
	@Column(name = "PRIMARY_SCHOOL_ADDRESS")
	public String getPrimarySchoolAddress() {
		return primarySchoolAddress;
	}

	/**
	 * 设置  小学地址
	 * 
	 * @param primarySchoolAddress
	 * */
	public void setPrimarySchoolAddress(String primarySchoolAddress) {
		this.primarySchoolAddress = primarySchoolAddress;
	}

	/**
	 * 获取  中学名称
	 * 
	 * @return
	 * */
	@Column(name = "MIDDLE_SCHOOL_NAME")
	public String getMiddleSchoolName() {
		return middleSchoolName;
	}

	/**
	 * 设置  中学名称
	 * 
	 * @param middleSchoolName
	 * */
	public void setMiddleSchoolName(String middleSchoolName) {
		this.middleSchoolName = middleSchoolName;
	}

	/**
	 * 获取  中学地址
	 * 
	 * @return
	 * */
	@Column(name = "MIDDLE_SCHOOL_ADDRESS")
	public String getMiddleSchoolAddress() {
		return middleSchoolAddress;
	}

	/**
	 * 设置  中学地址
	 * 
	 * @param middleSchoolAddress
	 * */
	public void setMiddleSchoolAddress(String middleSchoolAddress) {
		this.middleSchoolAddress = middleSchoolAddress;
	}

	/**
	 * 获取  高中学校名称
	 * 
	 * @return
	 * */
	@Column(name = "HIGH_SCHOOL_NAME")
	public String getHighSchoolName() {
		return highSchoolName;
	}

	/**
	 * 设置  高中学校名称
	 * 
	 * @param highSchoolName
	 * */
	public void setHighSchoolName(String highSchoolName) {
		this.highSchoolName = highSchoolName;
	}
	
	/**
	 * 获取  高中学校地址
	 * 
	 * @return
	 * */
	@Column(name = "HIGH_SCHOOL_ADDRESS")
	public String getHighSchoolAddress() {
		return highSchoolAddress;
	}

	/**
	 * 设置  高中学校地址
	 * 
	 * @param highSchoolAddress
	 * */
	public void setHighSchoolAddress(String highSchoolAddress) {
		this.highSchoolAddress = highSchoolAddress;
	}

	/**
	 * 获取  大学学校名称
	 * 
	 * @return
	 * */
	@Column(name = "UNIVERSITY_NAME")
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * 设置  大学学校名称
	 * 
	 * @param universityName
	 * */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * 获取  学院名称
	 * 
	 * @return
	 * */
	@Column(name = "COLLEGE_NAME")
	public String getCollegeName() {
		return collegeName;
	}

	/**
	 * 设置  学院名称
	 * 
	 * @param collegeName
	 * */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/**
	 * 获取  专业名称
	 * 
	 * @return
	 * */
	@Column(name = "MAJOR_NAME")
	public String getMajorName() {
		return majorName;
	}

	/**
	 * 设置  专业名称
	 * 
	 * @param majorName
	 * */
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	/**
	 * 获取  班级名称
	 * 
	 * @return
	 * */
	@Column(name = "CLASS_NAME")
	public String getClassName() {
		return className;
	}

	/**
	 * 设置  班级名称
	 * 
	 * @param className
	 * */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 获取  入学时间
	 * 
	 * @return
	 * */
	@Column(name = "ENTER_SCHOOL_TIME")
	public Date getEnterScholTime() {
		return enterScholTime;
	}

	/**
	 * 设置  入学时间
	 * 
	 * @param enterScholTime
	 * */
	public void setEnterScholTime(Date enterScholTime) {
		this.enterScholTime = enterScholTime;
	}

	/**
	 * 获取  毕业时间
	 * 
	 * @return
	 * */
	@Column(name = "GRADUATION_TIME")
	public Date getGraduationTime() {
		return graduationTime;
	}

	/**
	 * 设置  毕业时间
	 * 
	 * @param graduationTime
	 * */
	public void setGraduationTime(Date graduationTime) {
		this.graduationTime = graduationTime;
	}

	/**
	 * 获取  教育程度
	 * 
	 * @return
	 * */
	@Column(name = "EDUCATION_LEVEL")
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}

	/**
	 * 设置  教育程度
	 * 
	 * @param educationLevel
	 * */
	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}

	/**
	 * 获取  头像图片名
	 * 
	 * @return
	 * */
	@Column(name = "ICONS_NAME")
	public String getIconsName() {
		return iconsName;
	}

	/**
	 * 设置  头像图片名
	 * 
	 * @param iconsName
	 * */
	public void setIconsName(String iconsName) {
		this.iconsName = iconsName;
	}

	/**
	 * 获取 头像图片
	 * 
	 * @return
	 * */
	@Column(name = "ICONS_PICTURE")
	public byte[] getIconsPicture() {
		return iconsPicture;
	}

	/**
	 * 设置  头像图片
	 * 
	 * @param iconsPicture
	 * */
	public void setIconsPicture(byte[] iconsPicture) {
		this.iconsPicture = iconsPicture;
	}
	
	/**
	 * 获取  是否禁用
	 * 
	 * @return 
	 * */
	@Column(name = "FORBIDDEN")
	public Boolean getForbidden() {
		return forbidden;
	}

	/**
	 * 设置  是否禁用
	 * 
	 * @param forbidden
	 * */
	public void setForbidden(Boolean forbidden) {
		this.forbidden = forbidden;
	}
	
	/**
	 * 获取  个人评级
	 * 
	 * @return 
	 * */
	@Column(name = "RATING")
	public Integer getRating() {
		return rating;
	}

	/**
	 * 设置  个人评级
	 * 
	 * @param rating
	 * */
	public void setRating(Integer rating) {
		this.rating = rating;
	}



	/**
	 * 邮箱校验码
	 * */
	private String checkCode;

	/**
	 * 获取  邮箱校验码
	 * 
	 * @return
	 * */
	@Transient
	public String getCheckCode() {
		return checkCode;
	}

	/**
	 * 设置  邮箱校验码
	 * 
	 * @param checkCode
	 * */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	
	
	
}
