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
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/merchant/merchantJob">招聘信息</a>&nbsp;&gt;&nbsp;
				详细兼职信息
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
			<!-- 文章内容 start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="job_detail">
						<div class="job_topbar">
							<c:if test="${entity.forbidden == false}">
								<a href="${ctx}/portal/infoCenter/merchant/merchantJob/update/${entity.id}" class="getjob_btn">修改兼职信息</a>
								<a href="${ctx}/portal/infoCenter/merchant/merchantJob/forbidden/${entity.id}" class="getjob_btn">手动撤销</a>
							</c:if>
							<c:if test="${entity.forbidden == true}">
								<a href="javascript:void(0)" class="getjob_btn disable">已撤销</a>
							</c:if>
							<a href="${ctx}/portal/infoCenter/merchant/merchantJob" class="back_btn">&lt;&lt;&nbsp;返回</a>
						</div>
						<h2>详细兼职信息</h2>
						<p>发布时间：<span><fmt:formatDate value="${entity.createdDate}" pattern="yyyy年MM月dd日 HH:mm:ss" /></span></p>
						<table>
							<tr>
								<td>标&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;题：</td>
								<td class="td2">${entity.jobTitle}</td>
							</tr>
							<tr>
								<td>公司名称：</td>
								<td class="td2">${entity.merchantName}</td>
							</tr>
							<tr>
								<td>招聘人数：</td>
								<td class="td2">${entity.num}人</td>
							</tr>
							<tr>
								<td>有&nbsp;效&nbsp;期：</td>
								<td class="td2">${entity.effectiveTime}</td>
							</tr>
							<tr>
								<td>薪资水平：</td>
								<td class="td2">${entity.salaryLevel}</td>
							</tr>
							<tr>
								<td>兼职时间：</td>
								<td class="td2">${entity.partTime}</td>
							</tr>
							<tr>
								<td>工作区域：</td>
								<td class="td2">${entity.workArea}</td>
							</tr>
							<tr>
								<td>详细地址：</td>
								<td class="td2">${entity.address}</td>
							</tr>
							<tr>
								<td>联系电话：</td>
								<td class="td2">${entity.phone}</td>
							</tr>
							<tr>
								<td>岗位职责：</td>
								<td class="td2">
									<textarea disabled="disabled" rows="10" style="width: 640px;">${entity.jobResponsibilities}</textarea>
								</td>
							</tr>
							<tr>
								<td>公司简介：</td>
								<td class="td2">
									<textarea disabled="disabled" rows="10" style="width: 640px;">${entity.companyProfile}</textarea>
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
