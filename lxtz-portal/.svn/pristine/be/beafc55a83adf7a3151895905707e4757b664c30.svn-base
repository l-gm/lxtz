<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script src="${resourcePath}/js/framework.js" type="text/javascript"></script>
		<script>
			$(document).ready(function() {
				$("#educationLevel").val('${studentPrincipal.educationLevel}');
				
				$("#form").validate({
					rules : {
						'name' : {
							names : true,
							rangelength : [2,4],
						},
						'identityNumber' : {
							required : true,
							identityNumbers : true,
								}, 
						'studentNumber' : {
							required : true,
							digits : true,
								}, 
						'identityOrgLocated' : {
							names : true,
							},
						'sinaAccount' : {
							email : true,
							},
						'telephone' : {
							telephones : true,
							},
						},
					messages : {
						'name' : {
							names : "请输入中文名称!",
							rangelength : "姓名长度为2~4!",
						},
						'identityNumber' : {
							required : "身份证号不能为空!",
							identityNumbers : "请输入正确的身份证号格式!",
								}, 
						'studentNumber' : {
							required : "学生证号不能为空!",
							digits : "请输入数字!",
								}, 
						'identityOrgLocated' : {
							names : "请输入中文!",
								},
						'sinaAccount' : {
							email : "请输入正确的邮箱格式!",
							},
						'telephone' : {
							telephones : "请输入正确的电话格式!",
							},
					}
					
				});
				
				$.validator.addMethod("names",function(value,element) {
					var names = /[^u4e00-u9fa5]/;
					
					return this.optional(element) || names.test(value);
				});
				$.validator.addMethod("identityNumbers",function(value,element) {
					var identityNumbers = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
					
					return this.optional(element) || identityNumbers.test(value);
				});
				$.validator.addMethod("telephones",function(value,element) {
					var telephones = /^((0\d{2,3}-\d{7,8})|(1[3584]\d{9}))$/;
					
					return this.optional(element) || telephones.test(value);
				});
				
			});
		</script>
		<link rel="stylesheet" href="${resourcePath}/css/jquery-ui-1.10.4.custom.min.css" />
		<style>
			.e_wrapper select {
				width: 300px;
				padding: 3px 6px;
				background-color: #f1f1f1;
			}
		</style>
		
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/student/basic">个人中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/student/consumption">消费贷款</a>&nbsp;&gt;&nbsp;
				修改基本信息
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
						<h2>修改基本信息</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/updateBasic" method="post">
							<table>
								<tr>
									<td class="td1">姓名：</td>
									<td><input type="text" name="name" value="${studentPrincipal.name}"></td>
								</tr>
								<tr>
									<td class="td1">教育程度：</td>
									<td>
										<select name="educationLevel" id="educationLevel">
											<option value="HIGH">高中</option>
											<option value="TECHNICAL_SECONDARY">中专</option>
											<option value="JUNIOR">大专</option>
											<option value="COLLEGE">大学本科</option>
											<option value="MASTER">硕士研究生</option>
											<option value="DOCTOR">博士</option>
										</select>	
									</td>
								</tr>
								<tr>
									<td class="td1">身份证号码：</td>
									<td><input type="text" name="identityNumber" value="${studentPrincipal.identityNumber}"></td>
								</tr>
								<tr>
									<td class="td1">学生证号：</td>
									<td><input type="text" name="studentNumber" value="${studentPrincipal.studentNumber}"></td>
								</tr>
								<tr>
									<td class="td1">发证机关所在地：</td>
									<td><input type="text" name="identityOrgLocated" value="${studentPrincipal.identityOrgLocated}"></td>
								</tr>
								<tr>
									<td class="td1">出生年月日：</td>
									<td>
										<input type="text" name="birth" style="width: 300px;" class="datePicker" value="<fmt:formatDate value="${studentPrincipal.birth}" pattern="yyyy-MM-dd" />">
									</td>
								</tr>
								<tr>
									<td class="td1">性别：</td>
									<td>
										<c:choose>
											<c:when test="${studentPrincipal.sex == false}">
												<input type="radio" name="sex" style="width: 20px;" value="true">男
												<input type="radio" name="sex" style="width: 20px;" value="false" checked="checked">女
											</c:when>
											<c:otherwise>
												<input type="radio" name="sex" style="width: 20px;" value="true" checked="checked">男
												<input type="radio" name="sex" style="width: 20px;" value="false">女
											</c:otherwise>
										</c:choose>
									</td>
								</tr>
								<tr>
									<td class="td1">固定电话：</td>
									<td><input type="text" name="telephone" value="${studentPrincipal.telephone}"></td>
								</tr>
								<tr>
									<td class="td1">新浪微博账号：</td>
									<td><input type="text" name="sinaAccount" value="${studentPrincipal.sinaAccount}"></td>
								</tr>
								<tr>
									<td class="td1">QQ号码：</td>
									<td><input type="text" name="qq" value="${studentPrincipal.qq}"></td>
								</tr>
								<tr>
									<td class="td1">家庭户口详细地址：</td>
									<td><input type="text" name="familyAddress" value="${studentPrincipal.familyAddress}"></td>
								</tr>	
								<tr>
									<td class="td1">家庭户口地址邮编：</td>
									<td><input type="text" name="familyAddressPostcode" value="${studentPrincipal.familyAddressPostcode}"></td>
								</tr>	
								<tr>
									<td class="td1">现居住详细地址：</td>
									<td><input type="text" name="liveAddress" value="${studentPrincipal.liveAddress}"></td>
								</tr>	
								<tr>
									<td class="td1">现居地地址邮编：</td>
									<td><input type="text" name="liveAddressPostcode" value="${studentPrincipal.liveAddressPostcode}"></td>
								</tr>	
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">确认修改</button>
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
