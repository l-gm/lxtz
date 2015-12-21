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
		<form:form modelAttribute="entity" id="form" method="post" 
			action="${ctx}/admin/advertisement/advImg/save" class="form-horizontal" enctype="multipart/form-data">
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
					<h4>添加商家广告</h4>
				</div>
				
				<table class="table table-bordered">
					<colgroup>
						<col width="250px">
						<col>
					</colgroup>
					<tr>
						<td colspan="2" style="text-align: center; color:#31708f;" class="text">温馨提示：你所上传的图片文件大小不超过10M，图片格式支持jpg,jpeg,gif,png</td>
					</tr>
					<tr>
						<td style="text-align: center;" class="text">广告图片标识</td>
						<td colspan="3"><input type="text" name="located"></td>
					</tr>
					<tr>
						<td style="text-align: center;" class="text">图片文件</td>
						<td><input type="file" name="file"></td>
					</tr>
				</table>
				
				<div class="panel-footer text-center">
					<button type="submit" class="btn btn-primary" id="save">添加</button>
					<a href="${ctx}/admin/advertisement/advImg" class="btn btn-default">返回</a>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>