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
				<h4>商家信息列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">商家名称</td>
						<td><input type="text" value="${page.vo.name}"/></td>
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
						<th>商家名称</th>
						<th>所在城市</th>
						<th>联系人</th>
						<th>联系电话</th>
						<th>评价</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/user/merchant/view/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.name}</td>
							<td>${_item.city}</td>
							<td>${_item.contacts}</td>
							<td>${_item.telephone}</td>
							<td>
								<jsp:include page="webPart/rating.jsp" flush="true">
									<jsp:param name="rating" value="${_item.rating}" />
								</jsp:include>
							</td>
							<td>
								<a href="${ctx}/admin/user/merchant/setForbidden/${_item.id}" class="btn btn-warning">
									${_item.forbidden == true ? '启用' : '禁用' }
								</a>
								<a href="${ctx}/admin/article/example/setHot/${_item.id}" class="btn btn-info">
									评价
								</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		<d:pagination page = "${page}"/>
	</form>
	</tiles:putAttribute>
</tiles:insertDefinition>