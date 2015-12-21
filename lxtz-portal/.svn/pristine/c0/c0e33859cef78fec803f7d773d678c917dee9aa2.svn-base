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

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/notice/save" class="form-horizontal">
			<div class="panel panel-info">
					<table  class="table table-bordered">
						<tr>
							<td width="150px">
								<img src="${resourcePath}/img/portal/person_male.gif" />
							</td>
							<td>
								${viewMerchant.account}
							</td>
							<td>
								商家信用评价：
								<jsp:include page="webPart/rating.jsp" flush="true">
									<jsp:param name="rating" value="${_item.rating}" />
								</jsp:include>
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
							<td class="text">公司名称</td>
							<td>${viewMerchant.name}</td>
							<td class="text">城市</td>
							<td>${viewMerchant.city}</td>
						</tr>
						<tr>
							<td class="text">联系人</td>
							<td>${viewMerchant.contacts}</td>
							<td class="text">联系电话</td>
							<td>${viewMerchant.telephone}</td>
						</tr>
						<tr>
							<td class="text">手机号码</td>
							<td>${viewMerchant.phone}</td>
							<td class="text">电子邮箱</td>
							<td>${viewMerchant.email}</td>
						</tr>
						<tr>
							<td class="text">详细地址</td>
							<td colspan="3">${viewMerchant.address}</td>
						</tr>
						<tr>
							<td class="text">公司简介</td>
							<td><textarea style="resize:none;height: 250px" name="content" >${viewMerchant.profile}</textarea></td>
						</tr>
					</table>
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>