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
				<a href="${ctx}/portal/partTime/merchantJob">我要兼职</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/partTime/studentJob">简历中心</a>&nbsp;&gt;&nbsp;
				个人求职信息
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>我要兼职</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="2" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 文章内容 start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="job_detail">
						<div class="job_topbar">
							<a href="${ctx}/portal/partTime/studentJob" class="back_btn">&lt;&lt;&nbsp;返回</a>
						</div>
						<h2>个人求职信息</h2>
						<p>发布时间：<span><fmt:formatDate value="${entity.createdDate}" pattern="yyyy年MM月dd日 HH:mm:ss" /></span></p>
						<table>
							<tr>
								<td>标&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题：</td>
								<td class="td2">${entity.title}</td>
							</tr>
							<tr>
								<td>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
								<td class="td2">${entity.student.name}</td>
							</tr>
							<tr>
								<td>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
								<td class="td2">${entity.student.sex == false ? '女' : '男'}</td>
							</tr>
							<tr>
								<td>联系电话：</td>
								<td class="td2">${entity.student.phone}</td>
							</tr>
							<tr>
								<td>个人邮箱：</td>
								<td class="td2">${entity.student.email}</td>
							</tr>
							<tr>
								<td>教育程度：</td>
								<td class="td2">
									<c:if test="${entity.student.educationLevel eq 'HIGH'}">
										高中
									</c:if>	
									<c:if test="${entity.student.educationLevel eq 'TECHNICAL_SECONDARY'}">
										中专
									</c:if>	
									<c:if test="${entity.student.educationLevel eq 'JUNIOR'}">
										大专
									</c:if>	
									<c:if test="${entity.student.educationLevel eq 'COLLEGE'}">
										大学本科
									</c:if>	
									<c:if test="${entity.student.educationLevel eq 'MASTER'}">
										硕士研究生
									</c:if>	
									<c:if test="${entity.student.educationLevel eq 'DOCTOR'}">
										博士
									</c:if>	
								</td>
							</tr>
							<tr>
								<td>所在学校：</td>
								<td class="td2">${entity.student.universityName}</td>
							</tr>
							<tr>
								<td>所读专业：</td>
								<td class="td2">${entity.student.majorName}</td>
							</tr>
							<tr>
								<td>求职内容：</td>
								<td class="td2">
									<textarea disabled="disabled" rows="10" style="width: 640px;">${entity.content}</textarea>
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
