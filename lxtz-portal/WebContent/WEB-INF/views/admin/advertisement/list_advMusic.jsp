<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
		
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
			<a href="${ctx}/admin/advertisement/advMusic/add" class="btn btn-primary">添加门户音乐</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
			<table class="table table-hover table-bordered table-list">
				<tr>
					<th>音乐名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${advMusic}" var="advMusic">
					<tr>
						<td>${advMusic.musicName}</td>
						<td>
							<a href="${ctx}/admin/system/advMusic/update/${advMusic.id}" class="btn btn-primary">更新门户音乐</a>|<a href="${ctx}/admin/system/advMusic/del/${advMusic.id}" class="btn btn-primary">删除门户音乐</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>