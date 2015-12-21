<%@ page contentType="text/html;charset=UTF-8"%>

<%
%>
<style>
	.logoBox {
		position: absolute;
		height: 68px;
		width: 160px;
		text-align: center;
		background-color: rgb(0, 94, 172);
		background: url(../resources/images/logo.jpg);
	}

</style>

	<div class="container-fluid header clearfix">
		<div class="pull-left logo">
			<div class="page-header sp-page-header">
			  <img src="${resourcePath}/images/logo.jpg" />
			  <h1><small>广州朗鑫门户后台管理</small></h1>
			</div>
		</div>
			
		<div class="pull-right user-info">
	
			<span class="glyphicon glyphicon-user sp-glyphicon"></span>
			[${principal.name}]
			&nbsp;&nbsp;
			<span class="glyphicon glyphicon-cog sp-glyphicon"></span>
			<a href="${ctx}/admin/system/contactUs" class="topmenu">
			我的配置</a>
			&nbsp;&nbsp;
			<span class="glyphicon glyphicon-log-out sp-glyphicon"></span>
			<a href="${ctx}/logout" class="topmenulast">
			退出系统</a>
		</div>
			
	</div>
