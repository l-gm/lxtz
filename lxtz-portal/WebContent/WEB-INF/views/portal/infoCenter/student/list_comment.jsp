<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
				<a href="${ctx}/portal/infoCenter/student/comment">反馈记录</a>&nbsp;&gt;&nbsp;
				反馈记录列表
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="4" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 反馈记录list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="pt_topbar clearfix">
						<h2 class="fl">已反馈的个人记录</h2>
						<span class="fr">
							<font color="red" style="font-size: 13px;">有什么想说的捏？</font>
							<a class="pt_btn" href="${ctx}/portal/infoCenter/student/comment/add">发布个人反馈</a>
						</span>
					</div>
					<div class="l_partjob active">
						<table>
							<tr class="th">
								<td style="width: 650px;">反馈信息</td>
								<td class="td2" style="width: 185px;">发布时间</td>
							</tr>
							<c:forEach items="${list}" var="_item">
								<tr>
									<td class="td1">${_item.content}</td>
									<td class="td2">
										<fmt:formatDate value="${_item.createdDate}" pattern="yyyy年MM月dd日 HH:mm:ss" />
									</td>
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
			<!-- 反馈记录list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
