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
		<style>
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
			<a href="${ctx}/admin/system/companyProfile/update/${companyProfile.id}" class="btn btn-warning">修改公司简介</a>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info" style="">
		
			<div class="panel-heading text-left">
				<h4>公司简介</h4>
			</div>
			<div align="center" style="width: 100%; background: #f1f1f1;">
				<div style="width: 750px; background: #ffffff;padding: 20px;" align="left">
					${companyProfile.content}
				</div>
			</div>
		</div>
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>