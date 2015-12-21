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
					'phone' : {
						required : true,
						digits : true,
						phones : true,
						rangelength : [11,11],
						remote : {
							url : "${ctx}/register/checkValidStudentByPhone",
								},
							}, 
					'yzm' : {
						required : true,
						remote : {
							url : "${ctx}/portal/infoCenter/student/checkValidYzm",
						},
							}, 	
					},
				messages : {
					'phone' : {
						required : "手机号不能为空",
						digits : "请输入整数",
						phones : "请输入正确格式的手机号",
						rangelength : "请输入11位的手机号",
						remote : "此手机号已被注册过，请输入其他手机号",
							}, 
					'yzm' : {
						required : "验证码不能为空",
						remote : "验证码不正确",
							}, 		
				}
				
			});
			$.validator.addMethod("phones",function(value,element) {
				var phones = /^1[1-9][0-9]{9}/;
				
				return this.optional(element) || phones.test(value);
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
				<a href="${ctx}/portal/infoCenter/student/basic">个人信息</a>&nbsp;&gt;&nbsp;
				修改手机
			</p>
		</div>
		<!-- 面包屑 end -->
		<div class="clearfix">
			<!-- 侧栏菜单 start -->
			<div class="leftbar fl">
				<h3>个人中心</h3>
				<jsp:include page="webPart/leftMenuTab.jsp">
					<jsp:param name="tabNum" value="1" />
				</jsp:include>
			</div>
			<!-- 侧栏菜单 end -->
			<div class="e_content ce_content fr">
				<div class="e_wrapper">
					<div class="s_partjob active">
						<h2>修改手机</h2>
						<form id="form" action="${ctx}/portal/infoCenter/student/updatePhone" method="post">
							<table>
								<tr>
									<td class="td1">原手机号码：</td>
									<td>${studentPrincipal.phone}</td>
								</tr>
								<tr>
									<td class="td1">新手机号码：</td>
									<td><input type="text" id="phone" name="phone" placeholder="请输入新手机号码！" style="width: 300px;"></td>
								</tr>
								<tr>
									<td class="td1">手机验证码：</td>
									<td>
										<input type="text" name="yzm" placeholder="手机验证码" style="width: 300px;"/>
										<input id="zphone" type="button" value="发送手机验证码 " class="a_btn_save" onClick="get_mobile_code();" style="width:150px;color: #fff;background-color: #af1d1d;">
									</td>
								</tr>
							</table>
							<div align="center" style="padding-top: 30px;">
								<button type="submit" class="a_btn_save">确认修改</button>
								<a class="a_btn_cancle" href="${ctx}/portal/infoCenter/student/basic">取消</a>
							</div>
						</form>	
					</div>
				</div>
			</div>
			<!-- 发布兼职 end -->
		</div>
	</div>
	<script>
		function get_mobile_code(){
			var phone = jQuery.trim($('#phone').val());
			if (phone == null || phone == '') {
				alert("请输入手机号码");
				return;
			}
			var regx=/^1[1-9][0-9]{9}/;
			var flag=regx.test(phone);
			if (flag == false) {
				alert("请输入正确的手机号码");
				return;
			}
			
			$.post('${ctx}/register/checkValidStudentByPhone', {phone:phone}, function(msg) {
				if(msg == 'false' || msg == false){
					alert("此手机号已被注册过，请输入其他手机号");
					return;
				}
	        });
	        $.post('${ctx}/portal/infoCenter/student/vertifyPhone', {phone:phone}, function(msg) {
				if(msg == 'true' || msg == true){
					RemainTime();
				}
	       });
		};
		var iTime = 300;
		var Account;
		function RemainTime(){
			document.getElementById('zphone').disabled = true;
			var iSecond,sSecond="",sTime="";
			if (iTime >= 0){
				iSecond = parseInt(iTime%60);
				iMinute = parseInt(iTime/60);
				if (iSecond >= 0){
					if(iMinute>0){
						sSecond = iMinute + "分" + iSecond + "秒";
					}else{
						sSecond = iSecond + "秒";
					}
				}
				sTime=sSecond;
				if(iTime==0){
					clearTimeout(Account);
					sTime='获取手机验证码';
					iTime = 300;
					document.getElementById('zphone').disabled = false;
				}else{
					Account = setTimeout("RemainTime()",1000);
					iTime=iTime-1;
				}
			}else{
				sTime='没有倒计时';
			}
			document.getElementById('zphone').value = sTime;
		}
	</script>
</tiles:putAttribute>
</tiles:insertDefinition>
