<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
		$(document).ready(function() {
			$("#form").validate({
				rules : {
					'email' : {
						required : true,
						email : true,
						remote : {
							url : "${ctx}/register/checkValidMerchantByEmail",
						},
							}, 
					},
				messages : {
					'email' : {
						required : "邮箱不能为空",
						email : "请输入正确的邮箱格式",
						remote : "此邮箱已被注册过，请输入其他邮箱",
							}, 
				}
				
			});
		});
		</script>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业信息</a>&nbsp;&gt;&nbsp;
				修改邮箱
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
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>修改邮箱</h2>
						<form id="form" action="${ctx}/portal/infoCenter/merchant/updateMail" method="post">
							<table>
								<tr>
									<td class="td1">原邮箱：</td>
									<td>${merchantPrincipal.email}</td>
								</tr>
								<tr>
									<td class="td1">新邮箱：</td>
									<td><input type="text" name="email" placeholder="请输入新邮箱！"></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">确认修改</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/merchant/basic">取消</a>
							</div>
						</form>	
					</div>
				</div>
			</div>
			<!-- 发布兼职 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
