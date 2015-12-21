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
			<a href="${ctx}/admin/system/contactUs/update/${contactUs.id}" class="btn btn-warning">修改联系我们</a>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>联系我们</h4>
			</div>
		
			<table class="table table-bordered">
				<colgroup>
					<col width="150px">
					<col>
					<col width="150px">
					<col>
				</colgroup>
				<tr>
					<td class="text">客服热线</td>
					<td>${contactUs.customerservicehotline}</td>
					<td class="text">公司总机</td>
					<td>${contactUs.companyswitchboard}</td>
				</tr>
				<tr>
					<td class="text">传       真</td>
					<td>${contactUs.fax}</td>
					<td class="text">QQ</td>
					<td>${contactUs.qq}</td>
				</tr>
				<tr>
					<td class="text">邮箱</td>
					<td colspan="3">${contactUs.email}</td>
				</tr>
				<tr>
					<td class="text">地      址</td>
					<td colspan="3">${contactUs.address}</td>
				</tr>
			</table>
		</div>
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>