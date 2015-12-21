<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script src="${resourcePath}/js/framework.js" type="text/javascript"></script>
		<script>
			
		</script>
		<link rel="stylesheet" href="${resourcePath}/css/jquery-ui-1.10.4.custom.min.css" />
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
				修改就学信息
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
				<div class="e_wrapper c_wrapper">
					<!-- 基本资料 start -->
					<form action="${ctx}/portal/infoCenter/student/updateEdu" method="post">
						<div class="info active" style="width:100%; ">
							<h2>修改就学信息</h2>
							<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
								<h3>小、初、高就学信息</h3>
							</div>
							<table class="table-bordered">
								<tr>
									<td width="10%" class="text">小学名称：</td>
									<td width="30%"><input type="text" style="width: 180px;" name="primarySchoolName" value="${studentPrincipal.primarySchoolName}"></td>
									<td width="10%" class="text">小学地址：</td>
									<td width="50%"><input type="text" style="width: 340px;" name="primarySchoolAddress" value="${studentPrincipal.primarySchoolAddress}"></td>
								</tr>
								<tr>
									<td class="text">初中名称：</td>
									<td><input type="text" style="width: 180px;" name="middleSchoolName" value="${studentPrincipal.middleSchoolName}"></td>
									<td class="text">初中地址：</td>
									<td><input type="text" style="width: 340px;" name="middleSchoolAddress" value="${studentPrincipal.middleSchoolAddress}"></td>
								</tr>
								<tr>
									<td class="text">高中名称：</td>
									<td><input type="text" style="width: 180px;" name="highSchoolName" value="${studentPrincipal.highSchoolName}"></td>
									<td class="text">高中地址：</td>
									<td><input type="text" style="width: 340px;" name="highSchoolAddress" value="${studentPrincipal.highSchoolAddress}"></td>
								</tr>
							</table>
							<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
								<h3>大学信息</h3>
							</div>
							<table class="table-bordered">
								<tr>
									<td width="10%" class="text">学校名称：</td>
									<td width="40%"><input type="text" style="width: 230px;" name="universityName" value="${studentPrincipal.universityName}"></td>
									<td width="10%" class="text">学院名称：</td>
									<td width="40%"><input type="text" style="width: 260px;" name="collegeName" value="${studentPrincipal.collegeName}"></td>
								</tr>
								<tr>
									<td class="text">专业名称：</td>
									<td><input type="text" style="width: 230px;" name="majorName" value="${studentPrincipal.majorName}"></td>
									<td class="text">班级名称：</td>
									<td><input type="text" style="width: 260px;" name="className" value="${studentPrincipal.className}"></td>
								</tr>
								<tr>
									<td class="text">入学时间：</td>
									<td><input type="text" style="width: 230px;" name="enterScholTime" class="datePicker" value="<fmt:formatDate value="${studentPrincipal.enterScholTime}" pattern="yyyy-MM-dd" />"></td>
									<td class="text">毕业时间：</td>
									<td><input type="text" style="width: 260px;" name="graduationTime" class="datePicker" value="<fmt:formatDate value="${studentPrincipal.graduationTime}" pattern="yyyy-MM-dd" />"></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">确认修改</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/edu">取消</a>
							</div>
						</div>
					</form>	
					<!-- 基本资料 end -->
				</div>
			</div>
			<!-- 账号信息 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
