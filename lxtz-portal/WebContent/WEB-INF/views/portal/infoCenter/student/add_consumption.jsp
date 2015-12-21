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
					'goodsName' : {
						required : true,
							}, 
					'brand' : {
						required : true,
							},
					'goodsPrice' : {
						required : true,
						goodsPrices : true,
							},
					'applyMoney' : {
						required : true,
						goodsPrices : true,
							},
					'months' : {
						required : true,
						digits : true,
						rangelength : [1,2],
							},
					'note' : {
						rangelength : [0,150],
							},
					},
				messages : {
					'goodsName' : {
						required : "商品名称不能为空",
					},
					'brand' : {
						required : "商品品牌不能为空",
					},
					'goodsPrice' : {
						required : "商品价格不能为空",
						goodsPrices : "请输入合法的价格并保留小数点后2位",
					},
					'applyMoney' : {
						required : "贷款总金额不能为空",
						goodsPrices : "请输入合法的价格并保留小数点后2位",
					},
					'months' : {
						required : "还款分期不能为空",
						digits : "请输入数字",
						rangelength : "长度为1~2",
					},
					'note' : {
						rangelength : "备注字数过长,请输入150字以内!",
					},
				}
				
			});
			$.validator.addMethod("goodsPrices",function(value,element) {
				var goodsPrices = /^[1-9]+(.[0-9]{2})?$/;
				
				return this.optional(element) || goodsPrices.test(value);
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
				<a href="${ctx}/portal/infoCenter/student/basic">个人中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/student/consumption">消费贷款</a>&nbsp;&gt;&nbsp;
				申请消费贷款
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="2" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>申请消费贷款</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/consumption/save" method="post">
							<table>
								<tr>
									<td class="td1">商品名称：</td>
									<td><input type="text" name="goodsName"></td>
								</tr>
								<tr>
									<td class="td1">商品品牌：</td>
									<td><input type="text" name="brand"></td>
								</tr>
								<tr>
									<td class="td1">商品价格(元)：</td>
									<td><input type="text" name="goodsPrice"></td>
								</tr>
								<tr>
									<td class="td1">贷款总金额(元)：</td>
									<td><input type="text" name="applyMoney"></td>
								</tr>
								<tr>
									<td class="td1">还款分期(月)：</td>
									<td><input type="text" name="months"></td>
								</tr>
								<tr>
									<td class="td1">备注：</td>
									<td><textarea class="com_i" rows="10" name="note"></textarea></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<div style="color:red;">请注意：提交后不可修改，请认真审阅您提交的信息</div>
								<button type="submit" class="a_btn_save">发布</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/consumption">取消</a>
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
