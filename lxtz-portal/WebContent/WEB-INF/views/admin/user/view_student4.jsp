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
		<a href="${ctx}/admin/user/student/setForbidden/${viewStudent.id}" class="btn btn-warning">
			${viewStudent.forbidden == true ? '启用' : '禁用' }
		</a>
		<a href="${ctx}/admin/user/student" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/notice/save" class="form-horizontal">
			
			<jsp:include page="webPart/viewTab.jsp" flush="true">
				<jsp:param name="tabNum" value="4" />
				<jsp:param name="id" value="${viewStudent.id}" />
			</jsp:include>			
			
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>个人消费贷款记录</h4>
				</div>
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>查看</th>
						<th>商品名称</th>
						<th>商品品牌</th>
						<th>申请贷款总金额</th>
						<th>还款分期</th>
						<th>申请时间</th>
					</tr>
					<c:forEach items="${list}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/client/consumption/view/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.goodsName}</td>
							<td>${_item.brand}</td>
							<td>${_item.applyMoney}元</td>
							<td>${_item.months}月</td>
							<td>${_item.applyTime}</td>
						</tr>
					</c:forEach>
				</table>
			</div>		
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>