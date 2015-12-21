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
	<tiles:putAttribute name="nameTitle">    
		<h4>学生求职详细信息</h4>
	</tiles:putAttribute>
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/partTime/student" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/partTime/student" class="form-horizontal">
			<div class="panel panel-info">
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						<tr>
							<td class="text">求职标题</td>
							<td colspan="3">${student.title}</td>
						</tr>
						<tr>
							<td class="text">学生姓名</td>
							<td>${student.student.name}</td>
							<td class="text">性别</td>
							<td>${student.student.sex == false ? '女' : '男'}</td>
						</tr>
						<tr>
							<td class="text">联系电话</td>
							<td>${student.student.phone}</td>
							<td class="text">个人邮箱</td>
							<td>${student.student.email}</td>
						</tr>
						<tr>
							<td class="text">教育程度</td>
							<td>
								<c:if test="${student.student.educationLevel eq 'HIGH'}">
									高中
								</c:if>	
								<c:if test="${student.student.educationLevel eq 'TECHNICAL_SECONDARY'}">
									中专
								</c:if>	
								<c:if test="${student.student.educationLevel eq 'JUNIOR'}">
									大专
								</c:if>	
								<c:if test="${student.student.educationLevel eq 'COLLEGE'}">
									大学本科
								</c:if>	
								<c:if test="${student.student.educationLevel eq 'MASTER'}">
									硕士研究生
								</c:if>	
								<c:if test="${student.student.educationLevel eq 'DOCTOR'}">
									博士
								</c:if>	
							</td>
							<td class="text">所在学校</td>
							<td>${student.student.universityName}</td>
						</tr>
						<tr>
							<td class="text">所读专业</td>
							<td colspan="3">${student.student.majorName}</td>
						</tr>
						<tr>
							<td class="text">求职内容</td>
							<td colspan="3"><textarea style="height: 250px;" name="content" disabled="disabled">${student.content}</textarea></td>
						</tr>
					</table>
					
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>