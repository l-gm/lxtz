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
			<a href="${ctx}/admin/advertisement/advImg/add" class="btn btn-primary">添加商家广告</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
			
		<div class="panel panel-info">
			<table class="table table-hover table-bordered table-list">
				<tr>
					<th>序号</th>
					<th>图片名称</th>
					<th>图片标识</th>
					<th>删除</th>
				</tr>
				<c:forEach items="${advImg}" var="advImg" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${advImg.imgName}</td>
						<td>${advImg.located}</td>
						<td>
							<a href="${ctx}/admin/advertisement/advImg/del/${advImg.id}">X</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>