<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- 底部模块开始 -->
	<div class="footer">
		<div class="links container">
			<div class="hlinks clearfix">
				<dl class="fl">
					<dt>关于我们</dt>
					<dd><a href="${ctx}/portal/aboutUs">关于我们</a></dd>
					<dd><a href="${ctx}/portal/aboutUs/contactUs">联系我们</a></dd>
					<dd><a href="${ctx}/portal/aboutUs/employment">加入我们</a></dd>
				</dl>
				<dl class="fl">
					<dt>理财课堂</dt>
					<dd><a href="${ctx}/portal/financial">理财中心</a></dd>
					<dd><a href="${ctx}/portal/newDynamic/example">成功案例</a></dd>
				</dl>
				<dl class="fl">
					<dt>常见问题</dt>
					<dd><a href="${ctx}/portal/usingHelp/view/baimingdan" target=_blank>邮件白名单设置方法</a></dd>
					<dd><a href="${ctx}/portal/usingHelp/view/lianjieshixiao" target=_blank>邮件激活链接失效</a></dd>
				</dl>
				<div class="service fl">
					<h3>客服热线</h3>
					<p class="workphone">${portalContactUs == null ? '' : portalContactUs.customerservicehotline}</p>
					<p class="worktime">工作时间：9：00-18：30</p>
					<p class="workemail">联系邮箱：${portalContactUs == null ? '' : portalContactUs.email}</p>
				</div>
				<div class="social fr clearfix">
					<div class="weibo fl">
						<img src="${resourcePath}/images/weibo.png" />
						<p>微博</p>
					</div>
					<div class="weixin fr">
						<img src="${resourcePath}/images/weixin.png" />
						<p>微信</p>
					</div>
				</div>
			</div>
		</div>
		<div class="siteInfo">
			<div class="flinks">
				<p>
					<c:forEach items="${portalBlogroll}" var="_item" varStatus="status">
						<c:if test="${fn:length(portalBlogroll) == status.index+1}">
							<a href="http://${_item.link}" target=_blank>${_item.word}</a>
						</c:if>
						<c:if test="${fn:length(portalBlogroll) != status.index+1}">
							<a href="http://${_item.link}" target=_blank>${_item.word}</a>|
						</c:if>
					</c:forEach>
				</p>
			</div>
			<p class="copyright">Copyright @广州朗鑫投资有限公司 备案号 版权所有，未经许可不得复制、转载或摘编，违者必究！</p>
		</div>
	</div>
	<!-- 底部模块结束 -->

