<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
		</script>
		<style>
			.line_height {
				padding: 0px 20px;
			}
			.line_height td {
				padding: 10px 0px 10px 0px;
			}
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/aboutUs">关于我们</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/aboutUs">联系我们</a>&nbsp;&gt;&nbsp;
				联系我们
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>关于我们</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="2" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 消费贷款list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="e_detail">
						<h1 style="text-align: center;">联系我们</h1>
						<br>
						${companyProfile.content}
					</div>
					<table class="line_height">
							<tr>
								<td>客服热线：</td>
								<td class="td2">${contactUs.customerservicehotline}</td>
							</tr>
							<tr>
								<td>公司总机：</td>
								<td class="td2">${contactUs.companyswitchboard}</td>
							</tr>
							<tr>
								<td>传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;真：</td>
								<td class="td2">${contactUs.fax}</td>
							</tr>
							<tr>
								<td>Q&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Q：</td>
								<td class="td2">${contactUs.qq}</td>
							</tr>
							<tr>
								<td>地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址：</td>
								<td class="td2">${contactUs.address}</td>
							</tr>
							<tr>
								<td>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</td>
								<td class="td2">${contactUs.email}</td>
							</tr>
						</table>
				</div>
			</div>
			<!-- 消费贷款list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
