<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="cn.dosy.platform.config.utils.MenuUtils"%>

<%
MenuUtils.findURLMappingBreadCrumb();
%>


<ul class="breadcrumb">
	<c:forEach items="${breadCrumb}" var="item">
		<c:choose>
			<c:when test="${item.level!= fn:length(breadCrumb)}">
				<li>
					<c:if test="${not empty item.menuURI}">   
				    	<a href="${ctx}${item.menuURI}">${item.name}</a>
					</c:if> 
					<c:if test="${empty item.menuURI}">   
			    		${item.name}
					</c:if>
		
			
				</li>
			</c:when>
			<c:otherwise>
				<li>${item.name}</li>
			</c:otherwise>
		</c:choose>
		
	</c:forEach>
	
	
		
</ul>