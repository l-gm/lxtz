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
					'name' : {
						required : true,
								},
					'profile' : {
						required : true,
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
					'name' : {
						required : "公司名称不能为空",
					},
					'profile' : {
						required : "公司简介不能为空",
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
			
			$.validator.addMethod("phones",function(value,element) {
				var phones = /^1[1-9][0-9]{9}/;
				
				return this.optional(element) || phones.test(value);
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
				修改基本信息
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
						<h2>修改基本信息</h2>
						<form id="form" action="${ctx}/portal/infoCenter/merchant/updateBasic" method="post">
							<table>
								<tr>
									<td class="td1">公司名称：</td>
									<td><input type="text" name="name" value="${merchantPrincipal.name}"></td>
								</tr>
								<tr>
									<td class="td1">所在城市：</td>
									<td><input type="text" name="city" value="${merchantPrincipal.city}"></td>
								</tr>
								<tr>
									<td class="td1">详细地址：</td>
									<td><input type="text" name="address" value="${merchantPrincipal.address}"></td>
								</tr>
								<tr>
									<td class="td1">联系人：</td>
									<td><input type="text" name="contacts" value="${merchantPrincipal.contacts}"></td>
								</tr>
								<tr>
									<td class="td1">座机(公司)：</td>
									<td><input type="text" name="telephone" value="${merchantPrincipal.telephone}"></td>
								</tr>
								<tr>
									<td class="td1">手机(联系人)：</td>
									<td><input type="text" name="phone" value="${merchantPrincipal.phone}"></td>
								</tr>
								<tr>
									<td class="td1">公司简介：</td>
									<td><textarea class="com_i" rows="10" name="profile">${merchantPrincipal.profile}</textarea></td>
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
