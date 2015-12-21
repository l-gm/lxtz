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
					<jsp:param name="tabNum" value="3" />
					<jsp:param name="id" value="${viewStudent.id}" />
				</jsp:include>
			
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>小、初、高就学信息</h4>
				</div>
				
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">小学名称</td>
						<td>${viewStudent.primarySchoolName}</td>
						<td class="text">小学地址</td>
						<td>${viewStudent.primarySchoolAddress}</td>
					</tr>
					<tr>
						<td class="text">初中名称</td>
						<td>${viewStudent.middleSchoolName}</td>
						<td class="text">初中地址</td>
						<td>${viewStudent.middleSchoolAddress}</td>
					</tr>
					<tr>
						<td class="text">高中名称</td>
						<td>${viewStudent.highSchoolName}</td>
						<td class="text">高中地址</td>
						<td>${viewStudent.highSchoolAddress}</td>
					</tr>
				</table>
			</div>
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>大学信息</h4>
				</div>
				
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">学校名称</td>
						<td>${viewStudent.universityName}</td>
						<td class="text">学院名称</td>
						<td>${viewStudent.collegeName}</td>
					</tr>
					<tr>
						<td class="text">专业名称</td>
						<td>${viewStudent.majorName}</td>
						<td class="text">班级名称</td>
						<td>${viewStudent.className}</td>
					</tr>
					<tr>
						<td class="text">入学时间</td>
						<td><fmt:formatDate value="${viewStudent.enterScholTime}" pattern="yyyy-MM-dd" /></td>
						<td class="text">毕业时间</td>
						<td><fmt:formatDate value="${viewStudent.graduationTime}" pattern="yyyy-MM-dd" /></td>
					</tr>
				</table>
			</div>			
		</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>