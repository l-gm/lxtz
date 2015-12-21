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
	
		<form:form modelAttribute="entity" id="form" action="" method="post" class="form-horizontal">
				
		<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>添加文章</h4>
				</div>
				
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						
						<tr>
							<td class="text">标题</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td class="text">导语</td>
							<td><input type="text" /></td>
						</tr>
					</table>
					
					<div class="panel-heading text-left">
						<h4>文章内容</h4>
					</div>
				
					<div  align="center" data-url="" data-reRenderUrl="">
						<textarea rows="5">
							
						</textarea>					
					</div>
					
				
				<div class="panel-footer text-center">
					<a href="" class="btn btn-default">返回</a>
					<button type="submit" class="btn btn-primary" id="save">添加</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>