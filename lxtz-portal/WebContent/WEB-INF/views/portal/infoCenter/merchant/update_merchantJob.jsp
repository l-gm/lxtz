<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
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
				修改兼职信息
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
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>修改兼职信息</h2>
						<form action="${ctx}/portal/infoCenter/merchant/merchantJob/update" method="post">
							<table>
								<tr>
									<td class="td1">标题：</td>
									<td><input type="text" name="jobTitle" value="${merchantJob.jobTitle}"></td>
								</tr>
								<tr>
									<td class="td1">公司名称：</td>
									<td><input type="text" name="merchantName" value="${merchantJob.merchantName}"></td>
								</tr>
								<tr>
									<td class="td1">招聘人数：</td>
									<td><input type="text" name="num" value="${merchantJob.num}"></td>
								</tr>
								<tr>
									<td class="td1">有效期：</td>
									<td><input type="text" name="effectiveTime" value="${merchantJob.effectiveTime}"></td>
								</tr>
								<tr>
									<td class="td1">薪资水平：</td>
									<td><input type="text" name="salaryLevel" value="${merchantJob.salaryLevel}"></td>
								</tr>
								<tr>
									<td class="td1">联系电话：</td>
									<td><input type="text" name="phone" value="${merchantJob.phone}"></td>
								</tr>
								<tr>
									<td class="td1">兼职时间：</td>
									<td><input type="text" name="partTime" value="${merchantJob.partTime}"></td>
								</tr>
								<tr>
									<td class="td1">工作区域：</td>
									<td><input type="text" name="workArea" value="${merchantJob.workArea}"></td>
								</tr>
								<tr>
									<td class="td1">详细地址：</td>
									<td><input type="text" name="address" value="${merchantJob.address}"></td>
								</tr>
								<tr>
									<td class="td1">岗位职责：</td>
									<td><textarea class="com_i" rows="10" name="jobResponsibilities">${merchantJob.jobResponsibilities}</textarea></td>
								</tr>
								<tr>
									<td class="td1">公司简介：</td>
									<td><textarea class="com_i" rows="10" name="companyProfile">${merchantJob.companyProfile}</textarea></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">确认修改</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/merchant/merchantJob">取消</a>
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
