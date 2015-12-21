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

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/system/companyProfile/update" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>修改公司简介</h4>
				</div>
				
					<table class="table table-bordered">
				<colgroup>
					<col width="150px">
					<col>
					<col width="150px">
					<col>
				</colgroup>
				<tr>
					<td>
						<div align="center">
						<textarea cols="100" rows="8" name="content" style="width:712px;height:500px;">${companyProfile.content}</textarea>
						</div>
					</td>
				</tr>
			</table>
					
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/system/companyProfile" class="btn btn-default">取消</a>
					<button type="submit" class="btn btn-primary" id="save">确认修改</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>