<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>

	<li class="${(param.tabNum == '1' or param.tabNum == '' )? 'active':''}" value="1">
		<a href="${ctx}/portal/infoCenter/merchant/basic">
			企业信息
		</a>
	</li>
	<li class="${param.tabNum == '2'? 'active':''}" value="2">
		<a href="${ctx}/portal/infoCenter/merchant/merchantJob">
			招聘信息
		</a>
	</li>
</ul>
