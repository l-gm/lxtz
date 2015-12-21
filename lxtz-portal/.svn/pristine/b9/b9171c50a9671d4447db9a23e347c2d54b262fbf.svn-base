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
		<script>
		$(document).ready(function() {
			$("#form").validate({
				rules : {
					'responsibility' : {
						rangelength : [0,300],
							}, 
					'qualifications' : {
						rangelength : [0,300],
							},
					},
				messages : {
					'responsibility' : {
						rangelength : "岗位职责长度为0~300",
					},
					'qualifications' : {
						rangelength : "任职资格长度不超过300字!!!",
					},
				}
				
			});
		});
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/system/employment/update" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>更新招聘信息</h4>
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
							<td colspan="3"><input type="text" name="content" value="${employment.content}"></td>
						</tr>
						<tr>
							<td class="text">职位月薪</td>
							<td><input type="text" name="positionmonthlysalary" value="${employment.positionmonthlysalary}"></td>
							<td class="text">工作性质</td>
							<td><input type="text" name="natureofwork" value="${employment.natureofwork}"></td>
						</tr>
						<tr>
							<td class="text">工作经验</td>
							<td><input type="text" name="workexperience" value="${employment.workexperience}"></td>
							<td class="text">最低学历</td>
							<td><input type="text" name="minimumdegree" value="${employment.minimumdegree}"></td>
						</tr>
						<tr>
							<td class="text">招聘人数</td>
							<td><input type="text" name="hiringnum" value="${employment.hiringnum}"></td>
							<td class="text">职位类别</td>
							<td><input type="text" name="jobcategory" value="${employment.jobcategory}"></td>
						</tr>
						<tr>
							<td class="text">工作地点</td>
							<td colspan="3"><input type="text" name="workingplace" value="${employment.workingplace}"></td>
						</tr>
						<tr>
							<td class="text">岗位职责</td>
							<td colspan="3"><textarea name="responsibility">${employment.responsibility}</textarea></td>
						</tr>
						<tr>
							<td class="text">任职资格</td>
							<td colspan="3"><textarea name="qualifications">${employment.qualifications}</textarea></td>
						</tr>
					</table>
					
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/system/employment" class="btn btn-default">取消</a>
					<button type="submit" class="btn btn-primary" id="save">确认更新</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>