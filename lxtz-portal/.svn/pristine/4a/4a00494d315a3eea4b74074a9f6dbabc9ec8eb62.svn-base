<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="Html_Head">
		<script type="text/javascript">
			$(document).ready(function() {
				$(".rating").click(function() {
					$('#myModal').modal('show');
					
				});
			});
		</script>
	</tiles:putAttribute>	

	<tiles:putAttribute name="body">
		<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>个人信息列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">学生名称</td>
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
						<th>用户名</th>
						<th>名字</th>
						<th>学校</th>
						<th>联系电话</th>
						<th>注册时间</th>
						<th>个人信用评价</th>
						<th>操作</th>
					</tr>
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/user/student/view1/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.account}</td>
							<td>${_item.name}</td>
							<td>${_item.universityName}</td>
							<td>${_item.phone}</td>
							<td>${_item.createdDate}</td>
							<td>
								<jsp:include page="webPart/rating.jsp" flush="true">
									<jsp:param name="rating" value="${_item.rating}" />
								</jsp:include>
							</td>
							<td>
								<a href="${ctx}/admin/user/student/setForbidden/${_item.id}" class="btn btn-warning">
									${_item.forbidden == true ? '启用' : '禁用' }
								</a>
								<a href="${ctx}/admin/user/student/rating/${_item.id}" class="btn btn-info rating">
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