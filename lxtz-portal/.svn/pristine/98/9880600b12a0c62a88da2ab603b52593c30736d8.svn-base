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
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/merchant/merchantJob">招聘信息</a>&nbsp;&gt;&nbsp;
				招聘信息列表
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>企业中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="2" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 反馈记录list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="pt_topbar clearfix">
						<h2 class="fl">招聘信息列表</h2>
						<span class="fr">
							<font color="red" style="font-size: 13px;">有什么要发布的兼职吗？</font>
							<a class="pt_btn" href="${ctx}/portal/infoCenter/merchant/merchantJob/add">发布兼职信息</a>
						</span>
					</div>
					<div class="l_partjob active">
						<table>
							<tr class="th">
								<td style="width: 500px;">标题</td>
								<td style="width: 70px;">状态</td>
								<td class="td2">发布时间</td>
							</tr>
							<c:forEach items="${list}" var="_item">
								<tr>
									<td class="td1">
										<a href="${ctx}/portal/infoCenter/merchant/merchantJob/view/${_item.id}">
											${_item.jobTitle}
										</a>
									</td>
									<td>${_item.forbidden == true ? '已撤销' : '<font color="#af1d1d">招聘中</font>'}</td>
									<td class="td2">
										<fmt:formatDate value="${_item.createdDate}" pattern="yyyy年dd月mm日 HH:mm:ss" />
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
