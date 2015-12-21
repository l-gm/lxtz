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
				<h4>学生兼职列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">标题</td>
						<td><input type="text"/></td>
						<td class="text">内容</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="text">发布时间</td>
						<td>
							<input type="text"/>
						</td>
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
							<th>标题</th>
							<th>内容</th>
							<th>发布者</th>
							<th>发布时间</th>
							<th>操作</th>
						</tr>
						<tr>
							<td>
								<a href="javascript:void(0);" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>肯德基钟点工</td>
							<td>本人需要一份兼职，最好是肯德基的钟点工，我的空余时间有...</td>
							<td>梁XX</td>
							<td>2010-10-10 00:00:00</td>
							<td>删除、推荐</td>
						</tr>
				</table>
			</div>
	
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>