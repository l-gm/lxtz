<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="Html_Head">
		<script>
		</script>
	</tiles:putAttribute>
	
	<tiles:putAttribute name="showNameTitlePannel" value="true" />
	<tiles:putAttribute name="toolbar">    
		<a href="${ctx}/admin/user/student/rating/${viewStudent.id}" class="btn btn-info">个人信用评价</a>
		<a href="${ctx}/admin/user/student/setForbidden/${viewStudent.id}" class="btn btn-warning">
			${viewStudent.forbidden == true ? '启用' : '禁用' }
		</a>
		<a href="${ctx}/admin/user/student" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/notice/save" class="form-horizontal">
			<jsp:include page="webPart/viewTab.jsp" flush="true">
					<jsp:param name="tabNum" value="1" />
					<jsp:param name="id" value="${viewStudent.id}" />
				</jsp:include>
			<div class="panel panel-info">
					<table  class="table table-bordered">
						<tr>
							<td width="150px">
								<img src="${resourcePath}/img/portal/icons/${viewStudent.iconsName}" style="width: 134px; height: 134px;" />
							</td>
							<td width="600px">
								<div align="center" style="padding-top:40px;"><h2>账号:${viewStudent.account}</h2></div>
							</td>
							<td>
								<div align="center" style="padding-top:40px;">
									<jsp:include page="webPart/rating.jsp" flush="true">
										<jsp:param name="rating" value="${viewStudent.rating}" />
									</jsp:include>
								</div>
							</td>
						</tr>
					</table>
				
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						<tr>
							<td class="text">姓名</td>
							<td>${viewStudent.name}</td>
							<td class="text">教育程度</td>
							<td>
								<c:if test="${viewStudent.educationLevel eq 'HIGH'}">
									高中
								</c:if>	
								<c:if test="${viewStudent.educationLevel eq 'TECHNICAL_SECONDARY'}">
									中专
								</c:if>	
								<c:if test="${viewStudent.educationLevel eq 'JUNIOR'}">
									大专
								</c:if>	
								<c:if test="${viewStudent.educationLevel eq 'COLLEGE'}">
									大学本科
								</c:if>	
								<c:if test="${viewStudent.educationLevel eq 'MASTER'}">
									硕士研究生
								</c:if>	
								<c:if test="${viewStudent.educationLevel eq 'DOCTOR'}">
									博士
								</c:if>	
							</td>
						</tr>
						<tr>
							<td class="text">身份证号码</td>
							<td>${viewStudent.identityNumber}</td>
							<td class="text">学生证号</td>
							<td>${viewStudent.studentNumber}</td>
							
						</tr>
						<tr>
							<td class="text">发证机关所在地</td>
							<td colspan="3">${viewStudent.identityOrgLocated}</td>
						</tr>
						<tr>
							<td class="text">出生年月日</td>
							<td><fmt:formatDate value="${viewStudent.birth}" pattern="yyyy-MM-dd" /></td>
							<td class="text">性别</td>
							<td>${viewStudent.sex == false ? '女' : '男'}</td>
						</tr>
						<tr>
							<td class="text">手机号码</td>
							<td>${viewStudent.phone}</td>
							<td class="text">固定电话</td>
							<td>${viewStudent.telephone}</td>
						</tr>
						<tr>
							<td class="text">新浪微博账号</td>
							<td>${viewStudent.sinaAccount}</td>
							<td class="text">QQ号码</td>
							<td>${viewStudent.qq}</td>
						</tr>
						<tr>
							<td class="text">邮箱</td>
							<td colspan="3">${viewStudent.email}</td>
						</tr>
						<tr>
							<td class="text">家庭户口详细地址</td>
							<td colspan="2">${viewStudent.familyAddress}</td>
							<td>邮编：${viewStudent.familyAddressPostcode}</td>
						</tr>
						<tr>
							<td class="text">现居住详细地址</td>
							<td colspan="2">${viewStudent.liveAddress}</td>
							<td>邮编：${viewStudent.liveAddressPostcode}</td>
						</tr>
					</table>
		
		</div>		
	</form:form>

	
</tiles:putAttribute>
</tiles:insertDefinition>