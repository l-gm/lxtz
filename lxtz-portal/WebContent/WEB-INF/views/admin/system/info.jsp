<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
			<a href="javascript:void(0);" class="btn btn-warning">修改个人基本信息</a>
	</tiles:putAttribute>
	
	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="pannel panel-info">
		
			<div class="panel-heading text-left">
				<h4>个人基本信息</h4>
			</div>
		
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">账号</td>
						<td>admin</td>
						<td class="text">姓名</td>
						<td>XXX</td>
					</tr>
					<tr>
						<td class="text">性别</td>
						<td>男</td>
						<td class="text">联系方式</td>
						<td>123456789</td>
					</tr>
					<tr>
						<td class="text">QQ</td>
						<td>1000</td>
						<td class="text">邮箱</td>
						<td colspan="3">10000@qq.com</td>
					</tr>
				</table>
			</div>
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>