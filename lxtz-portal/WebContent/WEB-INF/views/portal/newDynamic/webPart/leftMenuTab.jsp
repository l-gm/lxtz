<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<li class="${(param.tabNum == '1' or param.tabNum == '' )? 'active':''}" value="1">
		<a href="${ctx}/portal/newDynamic">
			最新公告
		</a>
	</li>
	<li class="${(param.tabNum == '2')? 'active':''}" value="2">
		<a href="${ctx}/portal/newDynamic/example">
			成功案例
		</a>
	</li>
	<li class="${(param.tabNum == '3' )? 'active':''}" value="3">
		<a href="${ctx}/portal/newDynamic/investment">
			投资达人
		</a>
	</li>
	<li class="${(param.tabNum == '4' )? 'active':''}" value="4">
		<a href="${ctx}/portal/newDynamic/comment">
			用户反馈
		</a>
	</li>
</ul>
