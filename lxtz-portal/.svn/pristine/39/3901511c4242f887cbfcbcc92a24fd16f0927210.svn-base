<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
				消费贷款列表
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
			<!-- 消费贷款list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="pt_topbar clearfix">
						<h2 class="fl">已申请的消费贷款</h2>
						<span class="fr">
							<font color="red" style="font-size: 13px;">需要帮忙吗？</font>
							<a class="pt_btn" href="${ctx}/portal/infoCenter/student/consumption/add">申请消费贷款</a>
						</span>
					</div>
					<div class="l_partjob active">
						<table>
							<tr class="th">
								<td class="td1">商品名称</td>
								<td class="td2">商品品牌</td>
								<td class="td3">商品价格</td>
								<td class="td4">申请贷款总金额</td>
							</tr>
							<c:forEach items="${list}" var="_item">
								<tr>
									<td class="td1"><a href="${ctx}/portal/infoCenter/student/consumption/view/${_item.id}">${_item.goodsName}</a></td>
									<td class="td2">${_item.brand}</td>
									<td class="td2">${_item.goodsPrice}</td>
									<td class="td2">${_item.applyMoney}</td>
								</tr>
							</c:forEach>
						</table>
						<c:if test="${list == null or fn:length(list) == 0}">
							<div style="padding: 50px;color: #d9534f;">
								暂时还没有记录哟!!!
							</div>	
						</c:if>
					</div>
				</div>
			</div>
			<!-- 消费贷款list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
