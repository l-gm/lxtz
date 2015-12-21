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
			action="${ctx}/admin/system/blogroll/save" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>添加友情链接</h4>
				</div>
				
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						
						<tr>
							<td class="text">友情链接名称</td>
							<td colspan="3"><input type="text" name="word"></td>
						</tr>
						<tr>
							<td class="text">友情链接地址</td>
							<td colspan="3"><input type="text" name="link"/></td>
						</tr>
					</table>
					
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/system/blogroll" class="btn btn-default">返回</a>
					<button type="submit" class="btn btn-primary" id="save">添加</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>