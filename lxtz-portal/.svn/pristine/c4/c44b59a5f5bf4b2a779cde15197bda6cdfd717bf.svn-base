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
			action="${ctx}/admin/client/consumption/audit" class="form-horizontal">
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>审核信息</h4>
				</div>
				<table class="table table-bordered">
					<colgroup>
						<col width="150px">
						<col>
						<col width="150px">
						<col>
					</colgroup>
					<tr>
						<td class="text">是否同意</td>
						<td colspan="3">
							<c:if test="${auditConsumption.agree == null}">
								<input type="radio" name="agree" value="true" checked="checked">同意
								<input type="radio" name="agree" value="false" >不同意
							</c:if>
							<c:if test="${auditConsumption.agree != null}">
								<c:if test="${auditConsumption.agree == 'true'}">
									<input type="radio" name="agree" value="true" checked="checked">同意
									<input type="radio" name="agree" value="false" >不同意
								</c:if>
								<c:if test="${auditConsumption.agree == 'false'}">
									<input type="radio" name="agree" value="true" >同意
									<input type="radio" name="agree" value="false" checked="checked">不同意
								</c:if>
							</c:if>
						</td>
					</tr>
					<tr>
						<td class="text">信审部意见</td>
						<td colspan="3"><textarea style="resize:none;height: 150px" name="comment" >${auditConsumption.comment}</textarea></td>
					</tr>
				</table>
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/client/consumption/view/${auditConsumption.id}" class="btn btn-default">返回</a>
					<button type="submit" class="btn btn-primary" id="save">审核</button>
				</div>
			</div>	
		</form:form>
	</tiles:putAttribute>
</tiles:insertDefinition>