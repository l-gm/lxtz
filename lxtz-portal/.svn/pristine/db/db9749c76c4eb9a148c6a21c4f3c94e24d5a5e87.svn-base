<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
		</script>
		<style>
			.table-bordered {
				width: 100%;
			}
			.table-bordered .text{
				font-weight: bold;
				color: #333;
			}
			.table-bordered td {
				border-bottom: 1px solid #eee;	
			}
			.table-border-right .text {
				border-right: 1px solid #eee;
				border-left: 1px solid #eee;	
			}
		</style>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/student/basic">个人中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/student/basic">个人信息</a>&nbsp;&gt;&nbsp;
				就学信息
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<!-- 账号信息 start -->
			<div class="e_content c_content ce_content fr">
				<div class="c_topbar">
					<jsp:include page="webPart/basicViewTab.jsp">
						<jsp:param name="tabNum" value="3" />
					</jsp:include>
				</div>
				<div class="e_wrapper c_wrapper">
					<!-- 基本资料 start -->
					<div class="info active" style="width:100%; ">
						<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
							<h3>小、初、高就学信息</h3>
						</div>
						<table class="table-bordered">
							<tr>
								<td width="10%" class="text">小学名称：</td>
								<td width="30%">${studentPrincipal.primarySchoolName}</td>
								<td width="10%" class="text">小学地址：</td>
								<td width="50%">${studentPrincipal.primarySchoolAddress}</td>
							</tr>
							<tr>
								<td class="text">初中名称：</td>
								<td>${studentPrincipal.middleSchoolName}</td>
								<td class="text">初中地址：</td>
								<td>${studentPrincipal.middleSchoolAddress}</td>
							</tr>
							<tr>
								<td class="text">高中名称：</td>
								<td>${studentPrincipal.highSchoolName}</td>
								<td class="text">高中地址：</td>
								<td>${studentPrincipal.highSchoolAddress}</td>
							</tr>
						</table>
						<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
							<h3>大学信息</h3>
						</div>
						<table class="table-bordered">
							<tr>
								<td width="10%" class="text">学校名称：</td>
								<td width="40%">${studentPrincipal.universityName}</td>
								<td width="10%" class="text">学院名称：</td>
								<td width="40%">${studentPrincipal.collegeName}</td>
							</tr>
							<tr>
								<td class="text">专业名称：</td>
								<td>${studentPrincipal.majorName}</td>
								<td class="text">班级名称：</td>
								<td>${studentPrincipal.className}</td>
							</tr>
							<tr>
								<td class="text">入学时间：</td>
								<td><fmt:formatDate value="${studentPrincipal.enterScholTime}" pattern="yyyy-MM-dd" /></td>
								<td class="text">毕业时间：</td>
								<td><fmt:formatDate value="${studentPrincipal.graduationTime}" pattern="yyyy-MM-dd" /></td>
							</tr>
						</table>
					</div>
					<!-- 基本资料 end -->
				</div>
			</div>
			<!-- 账号信息 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
