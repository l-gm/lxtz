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
		<a href="${ctx}/admin/advertisement/advMail/add" class="btn btn-primary">发送广告邮件</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>邮件列表</h4>
			</div>
			<table class="table table-hover table-bordered table-list">
				<tr>
					<th>邮件标题</th>
					<th>邮件内容</th>
					<th width="90px;">接收人数</th>
					<th width="70px;">删除</th>
				</tr>
				<c:forEach items="${page.content}" var="advMail">
					<tr>
						<td>${advMail.title}</td>
						<td>${advMail.content}</td>
						<td>${advMail.num}</td>
						<td><a href="${ctx}/admin/advertisement/advMail/del/${advMail.id}">X</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<d:pagination page = "${page}"/>
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>