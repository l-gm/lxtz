<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>

	<li class="${(param.tabNum == '1' or param.tabNum == '' )? 'active':''}" value="1">
		<a href="${ctx}/portal/infoCenter/student/basic">
			个人信息
		</a>
	</li>
	<li class="${param.tabNum == '2'? 'active':''}" value="2">
		<a href="${ctx}/portal/infoCenter/student/consumption">
			消费贷款
		</a>
	</li>
	<li class="${param.tabNum == '3'? 'active':''}" value="3">
		<a href="${ctx}/portal/infoCenter/student/studentJob">
			求职信息
		</a>
	</li>
	<li class="${param.tabNum == '4'? 'active':''}" value="4">
		<a href="${ctx}/portal/infoCenter/student/comment">
			反馈记录
		</a>
	</li>
</ul>
