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
		<style>
			.table textarea {
				height: 120px;
			}
		</style>
	</tiles:putAttribute>

	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/system/employment/update/${employment.id}" class="btn btn-warning">修改招聘信息</a>
		<a href="${ctx}/admin/system/employment/del/${employment.id}" class="btn btn-danger">删除招聘信息</a>
		<a href="${ctx}/admin/system/employment" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>查看招聘详细信息</h4>
				</div>
				
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						
						<tr>
							<td class="text">内容</td>
							<td colspan="3">${employment.content}</td>
						</tr>
						<tr>
							<td class="text">职位月薪</td>
							<td>${employment.positionmonthlysalary}</td>
							<td class="text">工作性质</td>
							<td>${employment.natureofwork}</td>
						</tr>
						<tr>
							<td class="text">工作经验</td>
							<td>${employment.workexperience}</td>
							<td class="text">最低学历</td>
							<td>${employment.minimumdegree}</td>
						</tr>
						<tr>
							<td class="text">招聘人数</td>
							<td>${employment.hiringnum}</td>
							<td class="text">职位类别</td>
							<td>${employment.jobcategory}</td>
						</tr>
						<tr>
							<td class="text">工作地点</td>
							<td colspan="3">${employment.workingplace}</td>
						</tr>
						<tr>
							<td class="text">岗位职责</td>
							<td colspan="3"><textarea disabled="disabled">${employment.responsibility}</textarea></td>
						</tr>
						<tr>
							<td class="text">任职资格</td>
							<td colspan="3"><textarea disabled="disabled">${employment.qualifications}</textarea></td>
						</tr>
					</table>
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>