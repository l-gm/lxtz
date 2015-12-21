<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul class="clearfix">

	<li class="${(param.tabNum == '1' or param.tabNum == '' )? 'active':''}" value="1">
		<a href="${ctx}/portal/infoCenter/student/basic">
			基本资料
		</a>
	</li>
	<li style="width: 96px;" class="${param.tabNum == '2'? 'active':''}" value="2">
		<a href="${ctx}/portal/infoCenter/student/contact">
			紧急联系人
		</a>
	</li>
	<li class="${param.tabNum == '3'? 'active':''}" value="3">
		<a href="${ctx}/portal/infoCenter/student/edu">
			就学信息
		</a>
	</li>
	<c:if test="${ param.tabNum == '1' or param.tabNum == '' }">
		<li style="float: right; width: 90px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updateBasic">修改资料</a>
		</li>
		<li style="float: right; width: 90px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updateIcons">修改头像</a>
		</li>
		<li style="float: right; width: 90px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updateMail">修改邮箱</a>
		</li>
		<li style="float: right; width: 90px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updatePsd">修改密码</a>
		</li>
		<li style="float: right; width: 90px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updatePhone">修改手机</a>
		</li>
	</c:if>
	<c:if test="${ param.tabNum == '2' }">
		<li style="float: right; width: 135px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updateContact">修改紧急联系人</a>
		</li>
	</c:if>
	<c:if test="${ param.tabNum == '3' }">
		<li style="float: right; width: 118px;">
			<a style="padding: 5px 16px;color: #fff;background-color: #ff7f00;" href="${ctx}/portal/infoCenter/student/updateEdu">修改就学信息</a>
		</li>
	</c:if>
</ul>
