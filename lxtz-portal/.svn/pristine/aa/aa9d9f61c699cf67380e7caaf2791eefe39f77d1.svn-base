<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
		
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/system/employment/add" class="btn btn-primary">添加招聘信息</a>
	</tiles:putAttribute>


	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>招聘信息列表</h4>
			</div>
			<table class="table table-hover table-bordered table-list">
				<tr>
					<th>查看</th>
					<th>内容</th>
					<th>职位月薪</th>
					<th>工作性质</th>
					<th>工作经验</th>
					<th>最低学历</th>
					<th>招聘人数</th>
					<th>职位类别</th>
				</tr>
				<c:forEach items="${page.content}" var="employment">
					<tr>
						<td>
							<a href="${ctx}/admin/system/employment/view/${employment.id}" class="btn btn-primary">查看</a>
						</td>
						<td>${employment.content}</td>
						<td>${employment.positionmonthlysalary}</td>
						<td>${employment.natureofwork}</td>
						<td>${employment.workexperience}</td>
						<td>${employment.minimumdegree}</td>
						<td>${employment.hiringnum}</td>
						<td>${employment.jobcategory}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</form>
</tiles:putAttribute>
</tiles:insertDefinition>