<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
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
				消费贷款详细信息
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
					<div class="e_topbar">
						<a href="${ctx}/portal/infoCenter/student/consumption" class="back_btn">&lt;&lt;&nbsp;返回</a>
					</div>
					<div class="s_partjob active">
						<h2>消费贷款详细信息</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/consumption/save" method="post">
							<table>
								<tr>
									<td class="td1">商品名称：</td>
									<td>${entity.goodsName}</td>
								</tr>
								<tr>
									<td class="td1">商品品牌：</td>
									<td>${entity.brand}</td>
								</tr>
								<tr>
									<td class="td1">商品价格(元)：</td>
									<td>${entity.goodsPrice}</td>
								</tr>
								<tr>
									<td class="td1">贷款总金额(元)：</td>
									<td>${entity.applyMoney}</td>
								</tr>
								<tr>
									<td class="td1">还款分期(月)：</td>
									<td>${entity.months}</td>
								</tr>
								<tr>
									<td class="td1">申请时间：</td>
									<td><fmt:formatDate value="${entity.createdDate}" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
								</tr>
								<tr>
									<td class="td1">备注：</td>
									<td><textarea class="com_i" rows="8" name="note" disabled="disabled">${entity.note}</textarea></td>
								</tr>
							</table>
						</form>	
					</div>
					<div class="s_partjob active">
						<h2>审核结果</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/consumption/save" method="post">
							<table>
								<tr>
									<td class="td1">是否同意：</td>
									<td>${entity.agree == true ? '是' : '否'}</td>
								</tr>
								<tr>
									<td class="td1">业务时间：</td>
									<td>${entity.bizTime}</td>
								</tr>
								<tr>
									<td class="td1">备注：</td>
									<td><textarea class="com_i" rows="8" name="comment" disabled="disabled">${entity.comment}</textarea></td>
								</tr>
							</table>
						</form>	
					</div>
				</div>
			</div>
			<!-- 发布兼职 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
