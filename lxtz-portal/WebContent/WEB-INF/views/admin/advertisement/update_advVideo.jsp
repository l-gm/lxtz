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
		<form id="form" class="form-horizontal" action="${ctx}/admin/advertisement/advVideo/update" method="post">
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>修改视频文件</h4>
				</div>
				<table class="table table-bordered">
						<colgroup>
							<col width="250px">
							<col>
						</colgroup>
						<tr>
							<td align="center" class="text" style="padding-top: 90px;">视频文件</td>
							<td align="center">
								<textarea name="content" style="height: 200px;">${entity.content}</textarea>
							</td>
						</tr>
				</table>
				<div class="panel-footer text-center">
					<button type="submit" class="btn btn-primary" id="save">确认修改</button>
					<a href="${ctx}/admin/advertisement/advVideo" class="btn btn-default">取消</a>
				</div>
			</div>
		</form>
</tiles:putAttribute>
</tiles:insertDefinition>