<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
		
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
	
	<form id="form" class="form-horizontal">
	
		<div class="panel panel-info">
		
			<div class="panel-heading text-left">
				<h4>投资达人榜列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">标题、内容</td>
						<td colspan="3"><input type="text" placeholder="按标题或内容查找" name="searchFilter" value="${page.vo.title}"/></td>
					</tr>
				</table>
				
				<div class="panel-footer">
					<table style="width: 100%;">
						<tr>
							<td>
								<a href="${ctx}/admin/article/investment/add" class="btn btn-primary">添加投资达人榜</a>
							</td>
							<td class="text-right">
								<button type="submit" id="searchButton" name="searchButton" class="btn btn-info">搜索</button>
							</td>
						</tr>
					</table>
				</div>
			</div>
			
			
			<div class="panel panel-info">
				<table class="table table-hover table-bordered table-list">
					<tr>
						<th>查看</th>
						<th>标题</th>
						<th>来源</th>
						<th>发布时间</th>
						<th>操作</th>
					</tr>
					
					<c:forEach items="${page.content}" var="_item">
						<tr>
							<td>
								<a href="${ctx}/admin/article/investment/view/${_item.id}" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>${_item.title}</td>
							<td>${_item.source}</td>
							<td><fmt:formatDate value="${_item.lastModifiedDate}" pattern="yyyy年MM月dd日 HH:mm:ss"/></td>
							<td>
								<a href="${ctx}/admin/article/investment/setHot/${_item.id}" class="btn btn-info">
									${_item.isHot == true ? '取消置顶' : '置顶' }
								</a>
								<a href="${ctx}/admin/article/investment/setHidden/${_item.id}" class="btn btn-primary">
									${_item.isHidden == true ? '取消隐藏' : '隐藏' }
								</a>
								<a href="${ctx}/admin/article/investment/del/${_item.id}" class="btn btn-danger">删除</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		<d:pagination page = "${page}"/>
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>