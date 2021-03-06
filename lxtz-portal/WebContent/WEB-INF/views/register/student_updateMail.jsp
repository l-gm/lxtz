<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="portalTemplate">
<tiles:putAttribute name="Html_Head">
<script>
$(document).ready(function() {
	$("#form").validate({
		rules : {
			'mail' : {
				required : true,
				email : true,
				remote : {
					url : "${ctx}/register/checkValidMerchantByEmail",
				},
					},
			},
		messages : {
			'mail' : {
				required : "邮箱不能为空",
				email : "请输入正确的邮箱格式",
				remote : "此邮箱已被注册过，请输入其他邮箱",
					}, 
		},
	});
	
});
</script>

	<style>
		.text_1 {
			padding: 10px 10px 10px 0;
			width: 80px;
			font-weight: normal;
			text-align: right;
			line-height: 36px;
		}
		.text_2 {
			padding: 10px 0 10px 10px;
		}
		.text_2 input {
			width: 235px;
			height: 24px;
			padding: 5px;
			margin-right: 10px;
			font-size: 14px;
		}
		.reg1_submit {
			width: 249px;
			height: 36px;
			font-size: 16px;
			border: 0;
			cursor: pointer;
			background-color: #ff7f00;
			color: #fff;
			font-weight: bold;
		}
	</style>
</tiles:putAttribute>
<tiles:putAttribute name="body">	
	<!-- 注册表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">注册新用户</h2>
				<p class="fr">已有账号？<a href="${ctx}/login/student">立即登录</a></p>
			</div>
			<div class="reg_content">
				<div class="step clearfix">
					<ul class="active fl">
						<li class="sz">
							<span>1</span>
						</li>
						<li class="sm">填写账号信息</li>
					</ul>
					<ul class="active fl">
						<li class="sz">
							<span>2</span>
						</li>
						<li class="sm">邮箱验证</li>
					</ul>
					<ul class="fl">
						<li class="sz">
							<span>3</span>
						</li>
						<li class="sm">注册结果</li>
					</ul>
				</div>
				<!-- step3开始 -->
				<div class="step3">
					<form id="form" action="${ctx}/register/student/updateMail" method="post">
						<table>
							<tr>
								<td class="text_1">原邮箱：</td>
								<td class="text_2">${student.email}</td>
							</tr>
							<tr>
								<td class="text_1">新邮箱：</td>
								<td class="text_2"><input type="text" name="mail"></td>
							</tr>
							<tr>
								<td colspan="2" align="center" style="padding-top: 30px;">
									<input id="next" class="reg1_submit" type="submit" value="确认修改" />
								</td>
							</tr>
						</table>
					</form>	
				</div>
				<!-- step3结束 -->
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
</tiles:putAttribute>	
</tiles:insertDefinition>	
