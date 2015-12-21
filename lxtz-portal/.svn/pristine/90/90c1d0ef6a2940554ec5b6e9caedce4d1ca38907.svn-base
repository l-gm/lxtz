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

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" enctype="multipart/form-data"
			action="${ctx}/admin/advertisement/advMail/save" class="form-horizontal">
			<div class="panel panel-info">
				<c:if test="${result != '' && result != null }">
					<div class="alert alert-success alert-dismissible text-center" role="alert">
	  					<button type="button" class="close" data-dismiss="alert">
	  						<span aria-hidden="true">&times;</span>
	  						<span class="sr-only">Close</span>
	  					</button>
	  					${result}
					</div>
				</c:if>
				<div class="panel-heading text-left">
					<h4>编辑广告邮件</h4>
				</div>
				
					<table class="table table-bordered">
				<colgroup>
					<col width="250px">
					<col>
					<col width="250px">
					<col>
				</colgroup>
				<tr>
					<td class="text">邮箱接收人</td>
					<td colspan="3"><input type="file" name="file"></td>
				</tr>
				<tr>
					<td class="text">邮件标题</td>
					<td colspan="3"><input type="text" name="title"></td>
				</tr>
				<tr>
					<td colspan="4">
						<div align="center">
						<textarea cols="100" rows="8" name="content" style="width:712px;height:500px;">${companyProfile.content}</textarea>
						</div>
					</td>
				</tr>
			</table>
					
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/advertisement/advMail" class="btn btn-default">返回</a>
					<button type="submit" class="btn btn-primary" id="save">确认发送</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>