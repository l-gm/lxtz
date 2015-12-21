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
					<ul class="fl">
						<li class="sz">
							<span>3</span>
						</li>
						<li class="sm">注册结果</li>
					</ul>
				</div>
				<!-- step2开始 -->
				<div class="step2">
					<div class="reg_content2">
						<p>
							<img src="${resourcePath}/img/portal/icon_flag_passed.jpg" alt="success" />
							激活邮件已发送到您的邮箱 ${merchant.email} ，请登录邮箱马上激活账号
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
						<table border="0" align="center" cellpadding="0" cellspacing="0">
						    <tbody>
						    	<tr>
						     		<td>
						     			<span style="color:red;font-size: 16px;">
											您还可以
										</span>
										<br/>
						     			<!-- <span style="color:#666;line-height: 2;">
						     				·再发送一次激活邮件：
						     				<a id="again" href="javascript:void(0);">点击此处</a>
						     			</span> -->
						      			<!-- <span class="font7" style="color:#666;">
						      				<a href="sendmailagain.php?reback=http://bbs.51cto.com">
						      					<img src="images/ico_dianji.gif" width="70" height="25" border="0" />
						      				</a>
						      			</span> -->
						      			<br/>
						     			<span style="color:#666;line-height: 2;">
						     				·更换注册邮箱：
						     				<a href="${ctx}/register/merchant/updateMail">点击此处</a>
						     			</span>
						      		</td>
						    	</tr>
						  	</tbody>
						 </table>
					</div>
				</div>
				<!-- step2结束 -->
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
</tiles:putAttribute>	
</tiles:insertDefinition>	
