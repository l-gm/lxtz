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
			action="" class="form-horizontal">
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
					<h4>版面切换</h4>
				</div>
				
					<table class="table table-bordered text-center">
						<colgroup>
							<col width="250px">
							<col>
							<col width="250px">
						</colgroup>
						
						<tr>
							<td class="text">版面状态</td>
							<td>
								<c:if test="${portalConversionLayout == null}">
									系统异常，未正常检测版面状态
								</c:if>
								<c:if test="${portalConversionLayout != null}">
									<c:if test="${portalConversionLayout.isHidden == false}">
										正常访问
									</c:if>
									<c:if test="${portalConversionLayout.isHidden == true}">
										已屏蔽
									</c:if>
									<c:if test="${portalConversionLayout.isHidden == null}">
										未设置值，请联系管理员
									</c:if>
								</c:if>
							</td>
							<td class="text"><a href="${ctx}/admin/system/conversionLayout/update" class="btn btn-default">切换版面</a></td>
						</tr>
					</table>
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>