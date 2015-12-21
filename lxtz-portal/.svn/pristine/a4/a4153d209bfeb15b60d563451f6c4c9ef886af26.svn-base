<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@page import="cn.dosy.platform.config.utils.MenuUtils"%>

<%
MenuUtils.findURLMappingLeftMenus();
%>

	<style>
	
.sub-menu {
   
    margin: 0;
    padding: 0;
    
}
.sub-menu li {
    display: inline;
   
}
.sub-menu li a {
  
    padding-left: 32px;
    padding-right: 8px;
    padding-top: 8px;
    padding-bottom: 8px;
   
}

	</style>
<div class="left-menu">
<ul class="nav nav-pills nav-stacked">
	<c:forEach items="${currentMenus}" var="menu">
		<li class="${menu.active?'active':''}"><a href="${ctx}${menu.menuURI}">${menu.name}</a></li>
		<ul class="nav nav-list sub-menu ">
			<c:forEach items="${menu.children}" var="leafMenu">
				<li class="${leafMenu.active?'active':''}"><a href="${ctx}${leafMenu.menuURI}">${leafMenu.name}</a></li>	
			</c:forEach>
			
		</ul>

	</c:forEach>
</ul>
</div>
