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
			<a href="${ctx}/admin/system/blogroll/add" class="btn btn-primary">添加友情链接</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
			<div class="panel panel-info">	
				<div class="panel-heading text-left">
					<h4>友情链接列表</h4>
				</div>
			
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>友情链接名称</th>
						<th>友情链接地址</th>
						<th>友情链接修改时间</th>
						<th>操作</th>
					</tr>
					
					<c:forEach items="${portalBlogroll}" var="_item">
						<tr>
							<td>${_item.word}</td>
							<td>${_item.link}</td>
							<td><fmt:formatDate value="${_item.lastModifiedDate}" pattern="yyyy年MM月dd日 HH:mm:ss"/></td>
							<td>
								<a href="${ctx}/admin/system/blogroll/update/${_item.id}" class="btn btn-warning">修改友情链接</a>　<a href="${ctx}/admin/system/blogroll/del/${_item.id}" class="btn btn-danger">删除友情链接</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
	
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>