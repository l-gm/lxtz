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
			'account' : {
				required : true,
				names : true,
				rangelength : [3,20],
				remote : {
					url : "${ctx}/register/checkValidMerchantByAccount",
				},
			},
			'password' : {
				required : true,
				passwords : true,
				rangelength : [6,16],
					}, 
			'vertify_password' : {
				required : true,
				equalTo: "#password",
					},
			'name' : {
				required : true,
						},
			'email' : {
				required : true,
				email : true,
				remote : {
					url : "${ctx}/register/checkValidMerchantByEmail",
				},
					},
			'city' : {
				required : true,
					},
			'address' : {
				required : true,
					},
			'contacts' : {
				required : true,
					},
			'telephone' : {
				required : true,
					},
			'phone' : {
				required : true,
				digits : true,
				phones : true,
				rangelength : [11,11],
				}
			},
		messages : {
			'account' : {
				required : "用户名不能为空",
				names : "请英文数字下划线",
				rangelength : "用户名长度为3~20",
				remote : "已有此用户名，请输入其他用户名",
				
			},
			'password' : {
				required : "密码不能为空",
				passwords : "请输入英文和数字",
				rangelength : "密码长度为6~16",
			},
			'vertify_password' : {
				required : "密码不能为空",
				passwords : "请输入英文和数字",
				rangelength : "密码长度为6~16",
				equalTo: "两次密码输入不一致！",
			},
			'name' : {
				required : "公司名称不能为空",
			},
			'email' : {
				required : "邮箱不能为空",
				email : "请输入正确的邮箱格式",
				remote : "此邮箱已被注册过，请输入其他邮箱",
					}, 
			'city' : {
				required : "所在城市不能为空",
					},
			'address' : {
				required : "详细地址不能为空",
					},
			'contacts' : {
				required : "联系人不能为空",
					},
			'telephone' : {
				required : "座机(公司)不能为空",
					},
			'phone' : {
				required : "手机号不能为空",
				digits : "请输入整数",
				phones : "请输入正确格式的手机号",
				rangelength : "请输入11位的手机号",
					}, 
		},
});
	
	$.validator.addMethod("names",function(value,element) {
		var names = /^[a-zA-Z0-9_]+$/;
		
		return this.optional(element) || names.test(value);
	});
	
	$.validator.addMethod("passwords",function(value,element) {
		var passwords = /^[a-zA-Z0-9]/;
		
		return this.optional(element) || passwords.test(value);
	});
	
	$.validator.addMethod("phones",function(value,element) {
		var phones = /^1[1-9][0-9]{9}/;
		
		return this.optional(element) || phones.test(value);
	});
	
	/* $("#pwd").blur(function() {
		$("#pwds").text("");
		if ($("#password").val() != $("#pwd").val()) {
			$("#pwds").text("两次输入的密码不一致");
		}
	});
	$("#next").mouseup(function() {
		$("#pwds").text("");
		if ($("#password").val() != $("#pwd").val()) {
			$("#pwds").text("两次输入的密码不一致");
		}
	}); */
});
</script>
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
					<ul class="fl">
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
				<!-- step1开始 -->
				<div class="step1">
					<form class="reg_form" id="form" action="${ctx}/register/merchant?_step=2" method="post">
						<table>
							<tr>
								<th>用户名</th>
								<td>
									<div class="input">
										<input type="text" name="account" placeholder="请英文数字下划线,长度为3~20！" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>密码</th>
								<td>
									<div class="input">
										<input type="password" id="password" name="password" placeholder="请输入英文和数字，长度为6~16！" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>确认密码</th>
								<td>
									<div class="input">
										<input type="password" id="pwd" name="vertify_password" placeholder="请再次输入密码" />
										<span id="pwds" style="color: red"></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>公司名称</th>
								<td>
									<div class="input">
										<input type="text" name="name" placeholder="请输入公司名称" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>邮箱</th>
								<td>
									<div class="input">
										<input type="text" name="email" placeholder="推荐使用163、sina、sohu、qq邮箱！" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>所在城市</th>
								<td>
									<div class="input">
										<input type="text" name="city" placeholder="请输入城市" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>详细地址</th>
								<td>
									<div class="input">
										<input type="text" name="address" placeholder="请输入详细地址" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>联系人</th>
								<td>
									<div class="input">
										<input type="text" name="contacts" placeholder="请输入联系人" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>座机(公司)</th>
								<td>
									<div class="input">
										<input type="text" name="telephone" placeholder="请输入联系电话" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th>手机(联系人)</th>
								<td>
									<div class="input">
										<input type="text" name="phone" placeholder="请输入手机号码" />
										<span></span>
									</div>
								</td>
							</tr>
							<tr>
								<th></th>
								<td>
									<input id="next" class="reg_submit" type="submit" value="下一步" />
								</td>
							</tr>
						</table>
					</form>
				</div>
				<!-- step1结束 -->
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
	</tiles:putAttribute>	
</tiles:insertDefinition>	