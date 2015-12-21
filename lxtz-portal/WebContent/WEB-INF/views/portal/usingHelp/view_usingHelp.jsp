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
		</style>
	</tiles:putAttribute>

<tiles:putAttribute name="body">	
	<!-- 注册表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">使用帮助</h2>
				<a href="${ctx}/portal/usingHelp" class="fr more" style="padding-right: 50px;"><h3>返回列表</h3></a>
			</div>
			<div class="reg_content">
				<div class="step3 usingHelp_box">
					<div class="e_detail">
						<!-- e_detail的内容和样式来自于后台编辑器的录入，以下为手动测试数据 -->
						<h1 style="text-align: center;">${entity.title}</h1>
						<span style="margin:20px;color:#af1d1d;">来源：${entity.source}</span><span style="margin:20px;color:#af1d1d;">发布时间：${entity.lastModifiedDate}</span>
						<br>
						<br>
						${entity.content}
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
</tiles:putAttribute>	
</tiles:insertDefinition>	
