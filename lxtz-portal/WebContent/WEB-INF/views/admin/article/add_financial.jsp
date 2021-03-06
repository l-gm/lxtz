<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="Html_Head">
		<link rel="stylesheet" href="${resourcePath}/kindeditor-4.1.10/themes/default/default.css" />
		<link rel="stylesheet" href="${resourcePath}/kindeditor-4.1.10/plugins/code/prettify.css" />
		<script charset="utf-8" src="${resourcePath}/kindeditor-4.1.10/kindeditor.js"></script>
		<script charset="utf-8" src="${resourcePath}/kindeditor-4.1.10/lang/zh_CN.js"></script>
		<script charset="utf-8" src="${resourcePath}/kindeditor-4.1.10/plugins/code/prettify.js"></script>
		<script>
			KindEditor.ready(function(K) {
				var editor = K.create('textarea[name="content"]', {
					cssPath : '${resourcePath}/kindeditor-4.1.10/plugins/code/prettify.css',
					uploadJson : '${resourcePath}/kindeditor-4.1.10/jsp/upload_json.jsp',
					fileManagerJson : '${resourcePath}/kindeditor-4.1.10/jsp/file_manager_json.jsp',
					allowFileManager : true,
				});
				prettyPrint();
			});
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/article/financial/save" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>添加理财频道</h4>
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
							<td colspan="3"><input type="text" name="title"></td>
						</tr>
						<tr>
							<td class="text">来源</td>
							<td colspan="3"><input type="text" value="朗鑫门户编辑" name="source"/></td>
						</tr>
						<tr>
							<td class="text">摘要</td>
							<td colspan="3"><textarea name="financialAbstract" style="height: 120px;"></textarea></td>
						</tr>
					</table>
					
					<div class="panel-heading text-left">
						<h4>理财频道内容</h4>
					</div>
				
					<div align="center">
						<textarea name="content" cols="100" rows="8" style="width:712px;height:500px;"></textarea>
					</div>
					
				
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/article/financial" class="btn btn-default">返回</a>
					<button type="submit" class="btn btn-primary" id="save">添加</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>