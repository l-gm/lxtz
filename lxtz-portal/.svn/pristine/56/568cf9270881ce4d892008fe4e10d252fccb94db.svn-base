<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			
		</script>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/merchant/basic">企业信息</a>&nbsp;&gt;&nbsp;
				修改邮箱
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>企业中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>修改邮箱</h2>
						<!-- step2开始 -->
				<div class="step2">
					<div class="reg_content2">
						<p>
							<img src="${resourcePath}/img/portal/icon_flag_passed.jpg" alt="success" />
							激活邮件已发送到您的邮箱 ${email} ，请登录邮箱马上激活账号
						</p>
						<table>
							<tr>
								<td height="96" colspan="3" valign="top" class="font6">
									<span style="color:red;font-size: 16px;">
										我收不到激活邮件，怎么办？
									</span>
									<br/>
									<span style="color:#666;line-height: 2;">
       									· 网络有可能会发生拥堵延时，激活邮件可能会在几分钟后收到，请耐心等待并再次刷新。
       								</span>
       								<br/>
        							<span style="color:#666;line-height: 2;">
        								·去垃圾箱查看是否收到激活邮件。
        							</span>
        							<br/>
       				 				<span style="color:#666;line-height: 2;">
       				 					·将 service@163.com 加入您邮箱的白名单，刷新邮箱即收到邮件。
       				 					<a href="${ctx}/portal/usingHelp/view/baimingdan" target="_blank" style="color: #4779B1;text-decoration: underline;">
       				 						查看设置方法»
       				 					</a>
       				 				</span>
       				 			</td>
							</tr>
						</table>
					</div>
				</div>
				<!-- step2结束 -->
					</div>
				</div>
			</div>
			<!-- 发布兼职 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
