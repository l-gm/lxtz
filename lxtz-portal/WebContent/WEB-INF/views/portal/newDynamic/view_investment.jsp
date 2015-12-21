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
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/newDynamic">最新动态</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/newDynamic/investment">投资达人</a>&nbsp;&gt;&nbsp;
				投资达人内容
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>最新动态</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="3" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 消费贷款list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="e_topbar">
						<a href="${ctx}/portal/newDynamic/investment" class="back_btn">&lt;&lt;&nbsp;返回</a>
					</div>
					<div class="e_detail" style="white-space:normal;word-wrap : break-word ;">
						<!-- e_detail的内容和样式来自于后台编辑器的录入，以下为手动测试数据 -->
						<h1 style="text-align: center;">${entity.title}</h1>
						<span style="margin:20px;color:#af1d1d;">来源：${entity.source}</span><span style="margin:20px;color:#af1d1d;">发布时间：${entity.lastModifiedDate}</span>
						<br>
						<br>
						${entity.content}
					</div>
					<%-- <div class="e_bottombar clearfix">
						<a href="###" class="disable fl">没有上一篇了</a>
						<a href="###" class="fr">下一篇&nbsp;&gt;</a>
					</div> --%>
				</div>
			</div>
			<!-- 消费贷款list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
