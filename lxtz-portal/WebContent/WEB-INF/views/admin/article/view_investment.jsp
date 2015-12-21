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
		<a href="${ctx}/admin/article/investment/del/${entity.id}" class="btn btn-danger">删除</a>
		<a href="${ctx}/admin/article/investment/update/${entity.id}" class="btn btn-warning">修改投资达人榜内容</a>
		<a href="${ctx}/admin/article/investment" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/investment/save" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>投资达人榜详细信息</h4>
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
							<td>${entity.title}</td>
						</tr>
						<tr>
							<td class="text">来源</td>
							<td>${entity.source}</td>
							<td class="text">发布时间</td>
							<td>${entity.lastModifiedDate}</td>
						</tr>
					</table>
					
					<div class="panel-heading text-left">
						<h4>投资达人榜内容</h4>
					</div>
				
					<div align="center" style="width: 100%; background: #f1f1f1;">
						<div style="width: 750px; background: #ffffff;padding: 20px;" align="left">
							${entity.content}
						</div>
					</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>