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
					<jsp:param name="tabNum" value="2" />
					<jsp:param name="id" value="${viewStudent.id}" />
				</jsp:include>
			
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>父母或监护人信息</h4>
				</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="200px">
						<col width="200px">
						<col>
						<col>
						<col width="200px">
					</colgroup>
					<tr>
						<td class="text">父母或监护人姓名</td>
						<td class="text">与申请人关系</td>
						<td class="text">工作单位与地址</td>
						<td class="text">固定电话</td>
						<td class="text">手机号码</td>
					</tr>
					<tr>
						<td height="37px;">${viewStudent.parent1}</td>
						<td height="37px;">${viewStudent.relation1}</td>
						<td height="37px;">${viewStudent.parentAddress1}</td>
						<td height="37px;">${viewStudent.parentPhone1}</td>
						<td height="37px;">${viewStudent.parentTelephone1}</td>
					</tr>
					<tr>
						<td height="37px;">${viewStudent.parent2}</td>
						<td height="37px;">${viewStudent.relation2}</td>
						<td height="37px;">${viewStudent.parentAddress2}</td>
						<td height="37px;">${viewStudent.parentPhone2}</td>
						<td height="37px;">${viewStudent.parentTelephone2}</td>
					</tr>
				</table>
			</div>		
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>其他关系人信息</h4>
				</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">同学一</td>
						<td>${viewStudent.classmateName1}</td>
						<td class="text">移动电话</td>
						<td>${viewStudent.classmatePhone1}</td>
						<td class="text">宿舍号、QQ</td>
						<td>${viewStudent.classmateQQ1}</td>
					</tr>
					<tr>
						<td class="text">同学二</td>
						<td>${viewStudent.classmateName2}</td>
						<td class="text">移动电话</td>
						<td>${viewStudent.classmatePhone2}</td>
						<td class="text">宿舍号、QQ</td>
						<td>${viewStudent.classmateQQ2}</td>
					</tr>
					<tr>
						<td class="text">班主任</td>
						<td>${viewStudent.masterName}</td>
						<td class="text">移动电话</td>
						<td>${viewStudent.masterPhone}</td>
						<td class="text">办公地址</td>
						<td>${viewStudent.masterWorkAddress}</td>
					</tr>
				</table>
			</div>	
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>