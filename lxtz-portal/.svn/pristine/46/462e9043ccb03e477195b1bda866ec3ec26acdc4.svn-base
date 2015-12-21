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
				<a href="${ctx}/portal/aboutUs">关于我们</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/aboutUs/employment">加入我们</a>&nbsp;&gt;&nbsp;
				招聘详细信息
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>我要兼职</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="3" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 文章内容 start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="job_detail">
						<div class="job_topbar">
							<a href="${ctx}/portal/aboutUs/employment" class="back_btn">&lt;&lt;&nbsp;返回</a>
						</div>
						<h2>招聘详细信息</h2>
						<p>发布时间：<span><fmt:formatDate value="${entity.createdDate}" pattern="yyyy年MM月dd日" /></span></p>
						<table>
							<tr>
								<td>招聘内容：</td>
								<td class="td2">${entity.content}</td>
							</tr>
							<tr>
								<td>职位月薪：</td>
								<td class="td2">${entity.positionmonthlysalary}</td>
							</tr>
							<tr>
								<td>工作性质：</td>
								<td class="td2">${entity.natureofwork}人</td>
							</tr>
							<tr>
								<td>工作经验：</td>
								<td class="td2">${entity.workexperience}</td>
							</tr>
							<tr>
								<td>最低学历：</td>
								<td class="td2">${entity.minimumdegree}</td>
							</tr>
							<tr>
								<td>招聘人数：</td>
								<td class="td2">${entity.hiringnum}人</td>
							</tr>
							<tr>
								<td>职位类别：</td>
								<td class="td2">${entity.jobcategory}</td>
							</tr>
							<tr>
								<td>工作地点：</td>
								<td class="td2">${entity.workingplace}</td>
							</tr>
							<tr>
								<td>岗位职责：</td>
								<td class="td2">
									<textarea disabled="disabled" rows="10" style="width: 640px;">${entity.responsibility}</textarea>
								</td>
							</tr>
							<tr>
								<td>任职资格：</td>
								<td class="td2">
									<textarea disabled="disabled" rows="10" style="width: 640px;">${entity.qualifications}</textarea>
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			<!-- 文章内容 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
