<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="Html_Head">
		<script>
		</script>
	</tiles:putAttribute>
	
	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/user/student/setForbidden/${viewStudent.id}" class="btn btn-warning">
			${viewStudent.forbidden == true ? '启用' : '禁用' }
		</a>
		<a href="${ctx}/admin/user/student" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/notice/save" class="form-horizontal">
			
			<jsp:include page="webPart/viewTab.jsp" flush="true">
					<jsp:param name="tabNum" value="5" />
					<jsp:param name="id" value="${viewStudent.id}" />
				</jsp:include>
			
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>个人反馈记录</h4>
				</div>
				
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>反馈内容</th>
						<th>反馈时间</th>
						<th>反馈状态</th>
					</tr>
					<c:forEach items="${list}" var="_item">
						<tr>
							<td>${_item.content}</td>
							<td>${_item.createdDate}</td>
							<td>${_item.isCancle == true ? '已取消' : '正常'}</td>
						</tr>
					</c:forEach>
				</table>
			</div>		
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>