<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>用户反馈列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">反馈人</td>
						<td><input type="text" name="name" value="${page.vo.studentName}"/></td>
						<td class="text">反馈内容</td>
						<td><input type="text" name="content" value="${page.vo.content}"/></td>
					</tr>
				</table>
				
				<div class="panel-footer text-right">
					<button type="submit" id="searchButton"  class="btn btn-info">搜索</button>
				</div>
			</div>
			<div class="panel panel-info">
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>反馈人</th>
						<th>反馈内容</th>
						<th>反馈时间</th>
						<th>反馈状态</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>${_item.student.name}</td>
							<td>${_item.content}</td>
							<td>${_item.createdDate}</td>
							<td>${_item.isCancle == true ? '已取消' : '正常'}</td>
							<td>
								<a href="${ctx}/admin/user/comment/setForbidden/${_item.id}" class="btn btn-warning">
									${_item.forbidden == true ? '取消禁用' : '禁用' }
								</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		<d:pagination page = "${page}"/>
	</form>
</tiles:putAttribute>
</tiles:insertDefinition>