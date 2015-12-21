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
			'oldPsd' : {
				required : true,
				passwords : true,
				rangelength : [6,16],
					}, 
			'newPsd' : {
				required : true,
				passwords : true,
				rangelength : [6,16],
					},
			'verifyNewPsd' : {
				required : true,
				passwords : true,
				rangelength : [6,16],
				equalTo: "#pwd",
					},
			},
		messages : {
			'oldPsd' : {
				required : "密码不能为空",
				passwords : "请输入英文和数字",
				rangelength : "密码长度为6~16",
			},
			'newPsd' : {
				required : "密码不能为空",
				passwords : "请输入英文和数字",
				rangelength : "密码长度为6~16",
			},
			'verifyNewPsd' : {
				required : "密码不能为空",
				passwords : "请输入英文和数字",
				rangelength : "密码长度为6~16",
				equalTo: "两次输入密码不一致！",
			},
		}
		
	});
	
	$.validator.addMethod("passwords",function(value,element) {
		var passwords = /^[a-zA-Z0-9]/;
		
		return this.optional(element) || passwords.test(value);
	});
	/* 
	$("#pwd").blur(function() {
		$("#pwds").text("");
		if ($("#password").val() != $("#pwd").val()) {
			$("#pwds").text("两次输入的密码不一致");
		}
	});
	$("#sure").mouseup(function() {
		$("#pwds").text("");
		if ($("#password").val() != $("#pwd").val()) {
			$("#pwds").text("两次输入的密码不一致");
		}
	}); */
});
</script>
</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/student/basic">个人中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/student/basic">个人信息</a>&nbsp;&gt;&nbsp;
				基本密码
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>修改密码</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/updatePsd" method="post">
							<table>
								<tr>
									<td class="td1">原密码：</td>
									<td><input type="password" name="oldPsd" placeholder="请输入原密码！"></td>
								</tr>
								<tr>
									<td class="td1">新密码：</td>
									<td><input id="password" type="password" name="newPsd" placeholder="请输入英文和数字，长度为6~16!"></td>
								</tr>
								<tr>
									<td class="td1">确认新密码：</td>
									<td>
										<input id="pwd" type="password" name="verifyNewPsd" placeholder="请确认新密码！">
										<span></span>
									</td>
								</tr>
							</table>
							<c:if test="${errorMessage != null && errorMessage != ''}">
								<div align="center" style="color: #d9534f;">
									${errorMessage}
								</div>	
							</c:if>
							<div align="center" style="padding-top: 30px;">
								<button id="sure" type="submit" class="a_btn_save">确认修改</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/basic">取消</a>
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
