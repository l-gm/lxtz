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
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/aboutUs">关于我们</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/aboutUs">公司简介</a>&nbsp;&gt;&nbsp;
				公司简介
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>关于我们</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 消费贷款list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="e_detail">
						<h1 style="text-align: center;">公司简介</h1>
						<br>
						${companyProfile.content}
					</div>
				</div>
			</div>
			<!-- 消费贷款list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
