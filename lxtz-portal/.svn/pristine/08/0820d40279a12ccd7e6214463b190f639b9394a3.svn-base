<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
		</script>
		<style>
			.ce_content td{
				padding: 20px 0px;
			}	
			.pt_btn:hover {
				cursor:pointer;
			}	
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业信息</a>&nbsp;&gt;&nbsp;
				基本资料
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>企业中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 账号信息 start -->
			<div class="e_content c_content ce_content fr">
				<div class="c_topbar_float_right pt_topbar">
					<ul class="clearfix">
						<li style="float: left;"><h2>用户名:${merchantPrincipal.account}</h2></li>
						<li><a class="pt_btn" href="${ctx}/portal/infoCenter/merchant/updateMail">修改邮箱</a></li>
						<li><a class="pt_btn" href="${ctx}/portal/infoCenter/merchant/updatePsd">修改密码</a></li>
						<li><a class="pt_btn" href="${ctx}/portal/infoCenter/merchant/updateBasic">修改基本信息</a></li>
					</ul>
				</div>
				<div class="e_wrapper c_wrapper">
					<!-- 基本资料 start -->
					<div class="info active" style="width:100%; ">
						<table>
							<tr>
								<td class="td1">公司名称：</td>
								<td class="td2">${merchantPrincipal.name}</td>
								<td class="td1">联系人：</td>
								<td class="td2">${merchantPrincipal.contacts}</td>
							</tr>
							<tr>
								<td class="td1">所属城市：</td>
								<td>${merchantPrincipal.city}</td>
								<td class="td1">电子邮箱：</td>
								<td>${merchantPrincipal.email}</td>
							</tr>
							<tr>
								<td class="td1">联系电话：</td>
								<td>${merchantPrincipal.telephone}</td>
								<td class="td1">手机号码：</td>
								<td>${merchantPrincipal.phone}</td>
							</tr>
							<tr>
								<td class="td1">详细地址：</td>
								<td colspan="3">${merchantPrincipal.address}</td>
							</tr>
							<tr>
								<td class="td1">公司简介：</td>
								<td colspan="3">${merchantPrincipal.profile}</td>
							</tr>
						</table>
					</div>
					<!-- 基本资料 end -->
				</div>
			</div>
			<!-- 账号信息 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
