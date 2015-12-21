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
			.em_all .em_date {
				width: 165px;
			}
			.em_all .em_area {
				width: 100px;
			}
			.em_all .em_title {
				width: 460px;
			}
			.li_head {
				color: #333;
				font-weight: bold;
			}
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/newDynamic">最新动态</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/newDynamic">最新公告</a>&nbsp;&gt;&nbsp;
				最新公告列表
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>最新动态</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 消费贷款list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="pt_topbar clearfix">
						<h2 class="fl">最新公告列表</h2>
					</div>
					
					<div class="e_search_bar">
						<form class="clearfix" id="form">
							<input class="s_txt fl" type="text" placeholder="按标题、内容查找" name="searchFilter" value="${page.vo.title}">
							<input class="s_btn fl" type="button" id="searchButton" value="搜索">
							<input type="hidden" id="pageNo" name="pageNo" value="${page.pageNo}" />
						</form>
					</div>
					
					<c:if test="${page.content != null and fn:length(page.content) != 0}">
						<div class="em_all">
							<h3>心灵鸡汤文章</h3>
							<ul>
								<li class="li_head">
									<span class="em_title">标题</span>
									<span class="em_area">来源</span>
									<span class="em_date">发布时间</span>
								</li>
								<c:forEach items="${page.content}" var="_item">
									<li>
										<a href="${ctx}/portal/newDynamic/notice/view/${_item.id}">
											<span class="em_title">${_item.title}</span>
											<span class="em_area">${_item.source}</span>
											<span class="em_date"><fmt:formatDate value="${_item.lastModifiedDate}" pattern="yyyy年dd月mm日 HH:mm:ss" /></span>
										</a>
									</li>
								</c:forEach>
							</ul>
						</div>
						<d:simplePagination page="${page}" />
					</c:if>
					
					<c:if test="${page.content == null or fn:length(page.content) == 0}">
						<div style="padding: 50px;color: #d9534f;">
							暂时还没有记录哟!!!
						</div>	
					</c:if>
				</div>
			</div>
			<!-- 消费贷款list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
