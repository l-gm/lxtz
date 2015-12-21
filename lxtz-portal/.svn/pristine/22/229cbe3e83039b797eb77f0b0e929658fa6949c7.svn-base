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
		<a href="${ctx}/admin/client/consumption/audit/${consumption.id}" class="btn btn-info">审核信息</a>   
		<a href="${ctx}/admin/client/consumption" class="btn btn-default">返回列表</a>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/client/consumption" class="form-horizontal">
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>消费贷款详细信息</h4>
				</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">申请人姓名</td>
						<td colspan="3">${consumption.studentName}</td>
					</tr>
					<tr>
						<td class="text">商品名称</td>
						<td>${consumption.goodsName}</td>
						<td class="text">商品品牌</td>
						<td>${consumption.brand}</td>
					</tr>
					<tr>
						<td class="text">商品价格</td>
						<td>${consumption.goodsPrice}元</td>
						<td class="text">申请贷款总金额</td>
						<td>${consumption.applyMoney}元</td>
					</tr>
					<tr>
						<td class="text">申请时间</td>
						<td>${consumption.applyTime}</td>
						<td class="text">还款分期</td>
						<td>${consumption.months}月</td>
					</tr>
					<tr>
						<td class="text">备注</td>
						<td colspan="3"><textarea style="resize:none;height: 150px" name="note" disabled="disabled">${consumption.note}</textarea></td>
					</tr>
				</table>
					
			</div>	
			
			<c:if test="${consumption.bizTime != null}">
				<div class="panel panel-info">
					<div class="panel-heading text-left">
						<h4>审核信息</h4>
					</div>
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						<tr>
							<td class="text">是否同意</td>
							<td>${consumption.agree == true ? '是' : '否'}</td>
							<td class="text">业务时间</td>
							<td>${consumption.bizTime}</td>
						</tr>
						<tr>
							<td class="text">信审部意见</td>
							<td colspan="3"><textarea style="resize:none;height: 150px" name="comment" disabled="disabled" >${consumption.comment}</textarea></td>
						</tr>
					</table>
				</div>	
			</c:if>
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>