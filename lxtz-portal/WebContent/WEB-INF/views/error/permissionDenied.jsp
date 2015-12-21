<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="body">
	<div class="register container">
		<h2>很抱歉，您没有该功能的访问权限。</h2>
		<p>
			<a href="javascript:history.back();">返回</a>
		</p>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
