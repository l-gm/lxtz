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
	<tiles:putAttribute name="nameTitle">    
		<h4>当前可用短信：<font color="red">${sms.num}</font>条</h4>
	</tiles:putAttribute>
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/advertisement/advShortMessage/add" class="btn btn-primary">发送短信</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>短信列表</h4>
			</div>
			<table class="table table-hover table-bordered table-list">
				<tr>
					<th>短信内容</th>
					<th>接收人数</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${page.content}" var="advShortMessage">
					<tr>
						<td>${advShortMessage.content}</td>
						<td>${advShortMessage.num}</td>
						<td>
							<a href="${ctx}/admin/advertisement/advShortMessage/del/${advShortMessage.id}" class="btn btn-danger">删除短信</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<d:pagination page = "${page}"/>
	</form>
</tiles:putAttribute>
</tiles:insertDefinition>