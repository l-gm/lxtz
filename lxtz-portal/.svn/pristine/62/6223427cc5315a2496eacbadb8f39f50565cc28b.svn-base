<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://cn.dosy.com/dTags" prefix="d" %>

<tiles:insertDefinition name="portalTemplate">

	<tiles:putAttribute name="Html_Head">
		<style>
			.usingHelp_box {
			
			}
			.usingHelp_box ul {
				font-size: 16px;
			}
			.usingHelp_box ul li {
				line-height: 28px;
				padding-left: 14px;
				background: url(../resources/images/ju.gif) left center no-repeat;
			}
			.usingHelp_box ul li a {
				display: block;
				white-space: nowrap;
				text-overflow: ellipsis;
				overflow: hidden;
			}
		</style>
	</tiles:putAttribute>

<tiles:putAttribute name="body">	
	<!-- 注册表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">使用帮助</h2>
			</div>
			<div class="reg_content">
				<div class="step3 usingHelp_box">
					<ul>
						<c:forEach items="${page.content}" var="_item">
							<li><a href="${ctx}/portal/usingHelp/view/${_item.id}">${_item.title}</a></li>
						</c:forEach>
					</ul>
					<d:simplePagination page="${page}" />
				</div>
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
</tiles:putAttribute>	
</tiles:insertDefinition>	
