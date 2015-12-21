<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="portalTemplate">
<tiles:putAttribute name="body">	
	<!-- 注册表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">注册新用户</h2>
				<p class="fr">已有账号？<a href="${ctx}/login/student">立即登录</a></p>
			</div>
			<div class="reg_content">
				<div class="step clearfix">
					<ul class="active fl">
						<li class="sz">
							<span>1</span>
						</li>
						<li class="sm">填写账号信息</li>
					</ul>
					<ul class="active fl">
						<li class="sz">
							<span>2</span>
						</li>
						<li class="sm">邮箱验证</li>
					</ul>
					<ul class="active fl">
						<li class="sz">
							<span>3</span>
						</li>
						<li class="sm">注册结果</li>
					</ul>
				</div>
				<!-- step3开始 -->
				<div class="step3">
					<c:if test="${registerResult == '1'}">
						恭喜，注册成功！
					</c:if>
					<c:if test="${registerResult == '2'}">
						链接失效，请重新申请！
					</c:if>
					<c:if test="${registerResult == '3'}">
						已注册，请勿重新申请！
					</c:if>
					<c:if test="${registerResult == '4'}">
						校验码错误
					</c:if>
				</div>
				<!-- step3结束 -->
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
</tiles:putAttribute>	
</tiles:insertDefinition>	
