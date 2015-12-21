<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>消费贷款信息列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">商品名称</td>
						<td><input type="text" name="goodsName" placeholder="按商品名称查找" value="${page.vo.goodsName}" /></td>
						<td class="text">商品品牌</td>
						<td><input type="text" name="brand" placeholder="按商品品牌查找" value="${page.vo.brand}" /></td>
					</tr>
				</table>
				
				<div class="panel-footer text-right">
					<button type="submit" id="searchButton" name="searchButton" class="btn btn-info">搜索</button>
				</div>
			</div>
			<div class="panel panel-info">
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>查看</th>
						<th>个人姓名</th>
						<th>商品名称</th>
						<th>商品品牌</th>
						<th>商品价格</th>
						<th>申请贷款总金额</th>
					</tr>
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/client/consumption/view/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.studentName}</td>
							<td>${_item.goodsName}</td>
							<td>${_item.brand}</td>
							<td>${_item.goodsPrice}</td>
							<td>${_item.applyMoney}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		<d:pagination page = "${page}"/>
	</form>
	</tiles:putAttribute>
</tiles:insertDefinition>