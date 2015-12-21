<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			$(function() {
				$("form").validate();
			});
		</script>
		<style>
			#merchantLogin:hover {
				text-decoration: underline;
			}
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">用户登录</h2>
				<p class="fr"></p>
			</div>
		 <form action="${ctx}/login/student" id="form" method="post" autocomplete="off" class="form-horizontal">	
			<div class="login_content clearfix">
				<div class="login_l fl">
					<span style="font-size: 20px; font-weight: bold;">
						<font>个人登录</font>
						<font>/</font>
						<font>
							<a href="${ctx}/login/merchant" style="color: #af1d1d;" id="merchantLogin">企业登录</a>
						</font>
					</span>
					<ul>
						<li>用户名：<input type="text" placeholder="请输入用户名" name="account" required=""></li>
						<li>密　码：<input type="password"  placeholder="请输入密码" name="password" required=""></li>
					</ul>
					<c:if test="${not empty loginMessage}">
						<div style="color: red; text-align: center;">${loginMessage}</div>
					</c:if>
					<div class="login_btn_box">
						<input class="save_btn login_btn" type="submit" value="登录">
					</div>
				</div>
				<div class="login_r fr">
					<p>还没有账号？</p>
					<a href="${ctx}/register/student?_step=1" class="btn s_reg_btn">个人注册</a>
					<a href="${ctx}/register/merchant?_step=1" class="btn c_reg_btn">企业注册</a>
				</div>
			</div>
		</form>	
		</div>
	</div>
	<!-- 登录表单结束 -->
</tiles:putAttribute>
</tiles:insertDefinition>
