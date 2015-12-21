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
				<a href="${ctx}/portal/infoCenter/student/studentJob">求职信息</a>&nbsp;&gt;&nbsp;
				求职信息
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="3" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="e_topbar">
						<a href="${ctx}/portal/infoCenter/student/studentJob" class="back_btn">&lt;&lt;&nbsp;返回</a>
					</div>
					<div class="s_partjob active">
						<h2>求职信息</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/studentJob/save" method="post">
							<table>
								<tr>
									<td class="td1">标题：</td>
									<td>${entity.title}</td>
								</tr>
								<tr>
									<td class="td1">状态：</td>
									<td>${entity.forbidden == true ? '已撤销' : '<font style="color:red;">求职中</font>'}</td>
								</tr>
								<tr>
									<td class="td1">更新时间：</td>
									<td><fmt:formatDate value="${entity.lastModifiedDate}" pattern="yyyy年MM月dd日 HH:mm:ss" /></td>
								</tr>
								<tr>
									<td class="td1">求职内容：</td>
									<td><textarea class="com_i" rows="10" name="content" disabled="disabled">${entity.content}</textarea></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<a class="a_btn_update" href="${ctx}/portal/infoCenter/student/studentJob/update/${entity.id}">修改</a>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/studentJob">取消</a>
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
