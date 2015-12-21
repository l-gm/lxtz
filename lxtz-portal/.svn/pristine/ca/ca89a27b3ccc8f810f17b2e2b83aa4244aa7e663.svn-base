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
				<h4>用户列表</h4>
			</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">用户名称</td>
						<td><input type="text"/></td>
						<td class="text">所属学生</td>
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
							<th>名字</th>
							<th>学校</th>
							<th>是否在校生</th>
							<th>操作</th>
						</tr>
						<tr>
							<td>
								<a href="javascript:void(0);" class="btn btn-xs btn-info" data-action="open" data-size="650,600">
									<span class="glyphicon glyphicon-list"></span>
										查看
								</a>
							</td>
							<td>梁XX</td>
							<td>广州星海学院</td>
							<td>是</td>
							<td>删除</td>
						</tr>
				</table>
			</div>
	
	</form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>