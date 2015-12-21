<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="portalTemplate">
	<tiles:putAttribute name="Html_Head">
		<script>
			$(document).ready(function() {
				$(".forbidden").click(function(){
					if (!confirm("确认要撤销？撤销之后不可再恢复!")) {
			           if(document.all){
							window.event.returnValue = false;
						} else {
							e.preventDefault();//for firefox
						}
			        } else {
			        	$.ajax({
							type : "get",
							async : false,
							url : '${ctx}/portal/infoCenter/student/studentJob/forbidden/' + $(this).val(),
							timeout : 2000,
							success : function() {
								$(this).parent().html("---");
							},  
							error : function(e) {  
								alert('error');  
							 } 
						}); 
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
				已发布的求职信息
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
			<!-- 求职信息list start -->
			<div class="e_content fr">
				<div class="e_wrapper">
					<div class="pt_topbar clearfix">
						<h2 class="fl">已发布的求职兼职</h2>
						<a class="pt_btn fr" href="${ctx}/portal/infoCenter/student/studentJob/add">发布求职信息</a>
					</div>
					<div class="l_partjob active">
						<table>
							<tr class="th">
								<td class="td1">标题</td>
								<td class="td2">更新时间</td>
								<td class="td3">当前状态</td>
								<td class="td4">撤销</td>
							</tr>
							<c:forEach items="${list}" var="_item">
								<tr>
									<td class="td1"><a href="${ctx}/portal/infoCenter/student/studentJob/view/${_item.id}">${_item.title}</a></td>
									<td class="td2">
										<fmt:formatDate value="${_item.lastModifiedDate}" pattern="yyyy年MM月dd日 HH:mm:ss" />
									</td>
									<td class="td3">
										${_item.forbidden == true ? '已撤销' : '<font style="color:red;">求职中</font>'}
									</td>
									<td class="td4">
										<c:if test="${_item.forbidden == false}">
											<button class="forbidden" value="${_item.id}">撤销</button>
										</c:if>
										<c:if test="${_item.forbidden == true}">
											---
										</c:if>
									</td>
								</tr>
							</c:forEach>
						</table>
						<c:if test="${list == null or fn:length(list) == 0}">
							<div style="padding: 50px;color: #d9534f;">
								暂时还没有记录哟!!!
							</div>	
						</c:if>
					</div>
				</div>
			</div>
			<!-- 求职信息list end -->
		</div>
	</div>
</tiles:putAttribute>
</tiles:insertDefinition>
