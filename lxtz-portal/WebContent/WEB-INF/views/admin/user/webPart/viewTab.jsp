<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<ul class="nav nav-tabs">

	<li class="${(param.tabNum == '1' or param.tabNum == '' )? 'active':''}" value="1">
		<a href="${ctx}/admin/user/student/view1/${param.id}">
			个人基础信息
		</a>
	</li>
	<li class="${param.tabNum == '2'? 'active':''}" value="2">
		<a href="${ctx}/admin/user/student/view2/${param.id}">
			紧急联系人
		</a>
	</li>
	<li class="${param.tabNum == '3'? 'active':''}" value="3">
		<a href="${ctx}/admin/user/student/view3/${param.id}">
			就学信息
		</a>
	</li>
	<li class="${param.tabNum == '4'? 'active':''}" value="4">
		<a href="${ctx}/admin/user/student/view4/${param.id}">
			个人消费贷款
		</a>
	</li>
	<li class="${param.tabNum == '5'? 'active':''}" value="5">
		<a href="${ctx}/admin/user/student/view5/${param.id}">
			个人反馈
		</a>
	</li>
</ul>
