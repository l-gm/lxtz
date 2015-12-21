<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="cn.dosy.platform.config.utils.MenuUtils"%>

<%
MenuUtils.findURLMappingTopMenus();
%>

<nav class="navbar navbar-default sp-navbar" role="navigation">
  <div class="container-fluid">
	<!-- 移动端响应式出现菜单按钮 -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">出现菜单按钮</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <!-- <span class="navbar-brand glyphicon glyphicon-fullscreen" id="full-screen"></span> -->
    </div>

    <div class="collapse navbar-collapse sp-navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" style="float: left;margin: 0;">
        <c:forEach items="${topMenus}" var="topMenu">
			<li style="float: left;" class="${topMenu.active?'active':''}"><a href="${ctx}${topMenu.menuURI}">${topMenu.name}</a></li>
		</c:forEach>
      </ul> 
    </div>
  </div>
</nav>


