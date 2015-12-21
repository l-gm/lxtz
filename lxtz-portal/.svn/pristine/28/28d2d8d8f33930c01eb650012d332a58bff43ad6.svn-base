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
			<a href="${ctx}/admin/advertisement/advVideo/update" class="btn btn-warning">修改视频文件</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form id="form" class="form-horizontal">
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>视频文件</h4>
				</div>
				<table class="table table-bordered">
						<colgroup>
							<col width="250px">
							<col>
						</colgroup>
						<tr>
							<td align="center" class="text" style="padding-top: 130px;">视频文件</td>
							<td align="center">${entity.content}</td>
						</tr>
				</table>
			</div>
		</form>
</tiles:putAttribute>
</tiles:insertDefinition>