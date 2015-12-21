<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
		</script>
		<style>
			.ce_content .td2{
				width: 400px;
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
				基本资料
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
						<jsp:param name="tabNum" value="1" />
					</jsp:include>
				</div>
				<div class="e_wrapper c_wrapper">
					<!-- 基本资料 start -->
					<div class="info active" style="width:100%; ">
						<table>
							<tr>
								<td class="td1">姓名：</td>
								<td class="td2">${studentPrincipal.name}</td>
								<td rowspan="5">
									<img src="${resourcePath}/img/portal/icons/${studentPrincipal.iconsName}" style="width: 128px; height: 128px; border:1px solid #ccc;" />
								</td>
							</tr>
							<tr>
								<td class="td1">教育程度：</td>
								<td class="td2">
									<c:if test="${studentPrincipal.educationLevel eq 'HIGH'}">
										高中
									</c:if>	
									<c:if test="${studentPrincipal.educationLevel eq 'TECHNICAL_SECONDARY'}">
										中专
									</c:if>	
									<c:if test="${studentPrincipal.educationLevel eq 'JUNIOR'}">
										大专
									</c:if>	
									<c:if test="${studentPrincipal.educationLevel eq 'COLLEGE'}">
										大学本科
									</c:if>	
									<c:if test="${studentPrincipal.educationLevel eq 'MASTER'}">
										硕士研究生
									</c:if>	
									<c:if test="${studentPrincipal.educationLevel eq 'DOCTOR'}">
										博士
									</c:if>	
								</td>
							</tr>
							<tr>
								<td class="td1">身份证号码：</td>
								<td class="td2">${studentPrincipal.identityNumber}</td>
							</tr>
							<tr>
								<td class="td1">学生证号：</td>
								<td class="td2">${studentPrincipal.studentNumber}</td>
							</tr>
							<tr>
								<td class="td1">发证机关所在地：</td>
								<td class="td2">${studentPrincipal.identityOrgLocated}</td>
							</tr>
							<tr>
								<td class="td1">出生年月日：</td>
								<td class="td2"><fmt:formatDate value="${studentPrincipal.birth}" pattern="yyyy-MM-dd" /></td>
							</tr>
							<tr>
								<td class="td1">性别：</td>
								<td class="td2">${studentPrincipal.sex == false ? '女' : '男'}</td>
							</tr>
							<tr>
								<td class="td1">手机号码：</td>
								<td class="td2">${studentPrincipal.phone}</td>
							</tr>
							<tr>
								<td class="td1">固定电话：</td>
								<td class="td2">${studentPrincipal.telephone}</td>
							</tr>
							<tr>
								<td class="td1">新浪微博账号：</td>
								<td class="td2">${studentPrincipal.sinaAccount}</td>
							</tr>
							<tr>
								<td class="td1">QQ号码：</td>
								<td class="td2">${studentPrincipal.qq}</td>
							</tr>
							<tr>
								<td class="td1">邮箱：</td>
								<td class="td2">${studentPrincipal.email}</td>
							</tr>
							<tr>
								<td class="td1">家庭户口详细地址：</td>
								<td class="td2">${studentPrincipal.familyAddress}</td>
							</tr>
							<tr>
								<td class="td1">家庭户口地址邮编：</td>
								<td class="td2">${studentPrincipal.familyAddressPostcode}</td>
							</tr>
							<tr>
								<td class="td1">现居住详细地址：</td>
								<td class="td2">${studentPrincipal.liveAddress}</td>
							</tr>
							<tr>
								<td class="td1">现居地地址邮编：</td>
								<td class="td2">${studentPrincipal.liveAddressPostcode}</td>
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
