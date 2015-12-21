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
				<h4>学生求职信息列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">求职标题</td>
						<td><input type="text" name="searchStudentJob" placeholder="按标题或内容查找" value="${page.vo.title}" /></td>
					</tr>
				</table>
				
				<div class="panel-footer text-right">
					<button type="submit" id="searchButton" name="searchButton" class="btn btn-info">搜索</button>
				</div>
			</div>
			<div class="panel panel-info">
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>查看</th>
						<th>求职标题</th>
						<th>学生姓名</th>
						<th>发布时间</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/partTime/student/view/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.title}</td>
							<td>${_item.student.name}</td>
							<td>${_item.createdDate}</td>
							<td>
								<a href="${ctx}/admin/partTime/student/setForbidden/${_item.id}" class="btn btn-warning">
									${_item.forbidden == true ? '显示' : '隐藏' }
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