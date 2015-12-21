<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
		$(document).ready(function() {
			$("#form").validate({
				rules : {
					'title' : {
						required : true,
						rangelength : [1,15],
							}, 
					'content' : {
						required : true,
						rangelength : [0,300],
							},
					},
				messages : {
					'title' : {
						required : "标题不能为空",
						rangelength : "标题长度为1~15",
					},
					'content' : {
						required : "求职内容不能为空",
						rangelength : "求职内容不超过300字!!!",
					},
				}
				
			});
		});
		</script>
	</tiles:putAttribute>
	<tiles:putAttribute name="body">
	<!-- 登录表单开始 -->
	<div class="main container">
		<!-- 面包屑 start -->
		<div class="crumbs">
			<p>
				<a href="${ctx}/portal/infoCenter/student/basic">个人中心</a>&nbsp;&gt;&nbsp;
				<a href="${ctx}/portal/infoCenter/student/studentJob">求职信息</a>&nbsp;&gt;&nbsp;
				发布求职信息
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="3" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>发布求职信息</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/studentJob/save" method="post">
							<table>
								<tr>
									<td class="td1">标题：</td>
									<td><input type="text" name="title"></td>
								</tr>
								<tr>
									<td class="td1">求职内容：</td>
									<td><textarea class="com_i" rows="10" name="content"></textarea></td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">发布</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/studentJob">取消</a>
							</div>
						</form>	
					</div>
				</div>
			</div>
			<!-- 发布兼职 end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
