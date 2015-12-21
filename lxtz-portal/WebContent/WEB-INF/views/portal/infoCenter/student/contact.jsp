<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
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
				紧急联系人
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
						<jsp:param name="tabNum" value="2" />
					</jsp:include>
				</div>
				<div class="e_wrapper c_wrapper">
					<!-- 基本资料 start -->
					<div class="info active" style="width:100%; ">
						<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
							<h3>父母或监护人信息</h3>
						</div>
						<table class="table-bordered">
							<tr>
								<td width="20%" class="text">父母或监护人姓名</td>
								<td width="20%" class="text">与申请人关系</td>
								<td width="30%" class="text">工作单位与地址</td>
								<td width="15%" class="text">固定电话</td>
								<td width="15%" class="text">手机号码</td>
							</tr>
							<tr>
								<td height="37px;">${studentPrincipal.parent1}</td>
								<td height="37px;">${studentPrincipal.relation1}</td>
								<td height="37px;">${studentPrincipal.parentAddress1}</td>
								<td height="37px;">${studentPrincipal.parentPhone1}</td>
								<td height="37px;">${studentPrincipal.parentTelephone1}</td>
							</tr>
							<tr>
								<td height="37px;">${studentPrincipal.parent2}</td>
								<td height="37px;">${studentPrincipal.relation2}</td>
								<td height="37px;">${studentPrincipal.parentAddress2}</td>
								<td height="37px;">${studentPrincipal.parentPhone2}</td>
								<td height="37px;">${studentPrincipal.parentTelephone2}</td>
							</tr>
						</table>
						<div style="margin-top: 20px; background-color: #f2dede;color: #a94442;padding: 10px 15px;">
							<h3>其他关系人信息</h3>
						</div>	
						<table class="table-bordered table-border-right">
							<tr>
								<td width="10%" class="text">同学一</td>
								<td width="15%">${studentPrincipal.classmateName1}</td>
								<td width="10%" class="text">移动电话</td>
								<td width="25%">${studentPrincipal.classmatePhone1}</td>
								<td width="15%" class="text">宿舍号、QQ</td>
								<td width="25%" style="border-right: 1px solid #eee;">${studentPrincipal.classmateQQ1}</td>
							</tr>
							<tr>
								<td class="text">同学二</td>
								<td>${studentPrincipal.classmateName2}</td>
								<td class="text">移动电话</td>
								<td>${studentPrincipal.classmatePhone2}</td>
								<td class="text">宿舍号、QQ</td>
								<td style="border-right: 1px solid #eee;">${studentPrincipal.classmateQQ2}</td>
							</tr>
							<tr>
								<td class="text">班主任</td>
								<td>${studentPrincipal.masterName}</td>
								<td class="text">移动电话</td>
								<td>${studentPrincipal.masterPhone}</td>
								<td class="text">办公地址</td>
								<td style="border-right: 1px solid #eee;">${studentPrincipal.masterWorkAddress}</td>
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
