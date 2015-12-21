<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="Html_Head">
		<script>
			$(document).ready(function() {
				$("#rating").val(${viewStudent.rating});
			});
		</script>
	</tiles:putAttribute>
	
	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/user/student/rating" class="form-horizontal">
			
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>个人星级评价设置</h4>
				</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="200px">
						<col>
					</colgroup>
					<tr>
						<td class="text">个人星级评价</td>
						<td>
							<select id="rating" name="rating" style="width: 300px;">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</td>
					</tr>
				</table>
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/user/student" class="btn btn-default">返回列表</a>
					<button type="submit" class="btn btn-primary" id="save">确认</button>
				</div>
			</div>		
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>