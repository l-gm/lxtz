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
			action="${ctx}/admin/system/contactUs/update" class="form-horizontal">
			<div class="panel panel-info">
				
				<div class="panel-heading text-left">
					<h4>修改联系我们</h4>
				</div>
				
					<table class="table table-bordered">
						<colgroup>
							<col width="150px">
							<col>
							<col width="150px">
							<col>
						</colgroup>
						
						<tr>
							<td class="text">客服热线</td>
							<td><input type="text" name="customerservicehotline" value="${contact.customerservicehotline}"/></td>
							<td class="text">公司总机</td>
							<td><input type="text" name="companyswitchboard" value="${contact.companyswitchboard}"/></td>
						</tr>
						<tr>
							<td class="text">传   真</td>
							<td><input type="text" name="fax" value="${contact.fax}"/></td>
							<td class="text">Q  Q</td>
							<td><input type="text" name="qq" value="${contact.qq}"/></td>
						</tr>
						<tr>
							<td class="text">邮箱</td>
							<td colspan="3"><input type="text" name="email" value="${contact.email}"/></td>
						</tr>
						<tr>
							<td class="text">公司地址</td>
							<td colspan="3"><input type="text" name="address" value="${contact.address}"/></td>
						</tr>
					</table>
					
				<div class="panel-footer text-center">
					<a href="${ctx}/admin/system/contactUs" class="btn btn-default">取消</a>
					<button type="submit" class="btn btn-primary" id="save">确认修改</button>
				</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>