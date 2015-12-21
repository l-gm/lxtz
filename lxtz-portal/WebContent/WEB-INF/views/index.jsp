<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="portalTemplate">
<tiles:putAttribute name="Html_Head">
	<script>
		$(document).ready(function() {
			//最新公告
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getNotice',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><a href="${ctx}/portal/newDynamic/notice/view/' + this.id + '">' + this.title + '</a></li>';
					});
					$("#notice_result").html("");
					$("#notice").append(html);
				},  
				error : function(e) {  
					$("#notice_result").html("模块加载失败");
				 } 
			});
			
			//成功案例
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getExample',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><a href="${ctx}/portal/newDynamic/example/view/' + this.id + '">' + this.title + '</a></li>';
					});
					$("#example_result").html("");
					$("#example").append(html);
				},  
				error : function(e) {  
					$("#example_result").html("模块加载失败");
				 } 
			});
			
			//投资达人榜
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getInvestment',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><a href="${ctx}/portal/newDynamic/investment/view/' + this.id + '">' + this.title + '</a></li>';
					});
					$("#investment_result").html("");
					$("#investment").append(html);
				},  
				error : function(e) {  
					$("#investment_result").html("模块加载失败");
				 } 
			});
			
			
			
			//视频
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getAdvVideo',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					if (data != null) {
						$("#advVideo_result").html("");
						$("#advVideo").append(data.content);
					}
				},  
				error : function(e) {  
					$("#advVideo_result").html("模块加载失败");
				 } 
			});
			
			//理财中心
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getFinancial',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><h3><a href="${ctx}/portal/financial/view/' + this.id + '">' + this.title + '</a></h3>' + 
						'<p>' + this.financialAbstract + '<a href="${ctx}/portal/financial/view/' + this.id + '">[详情]</a></p></li>';
					});
					$("#financial_result").html("");
					$("#financial").append(html);
				},  
				error : function(e) {  
					$("#financial_result").html("模块加载失败");
				 } 
			});
			
			//招聘信息
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getMerchantJob',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						var createdTime = new Date(this.createdDate);
						html += '<li><a href="${ctx}/portal/partTime/merchantJob/view/' + this.id + '">' +
									'<span class="j_title">' + this.jobTitle + '</span>' + 
									'<span class="j_salary">' + this.salaryLevel + '</span>' +	
									'<span class="j_area">' + this.workArea + '</span>' +	
									'<span class="j_num">' + this.num + '人</span>' +	
									'<span class="j_time">' + createdTime.getFullYear().toString() + '年' +
									(createdTime.getMonth()+1).toString() + '月' +  
									createdTime.getDate().toString() + '日' + '</span>' +	
								'</a></li>';
					});
					$("#merchantJob").append(html);
				},  
				error : function(e) {  
				 } 
			});
			
			//求职信息
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getStudentJob',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><a href="${ctx}/portal/partTime/studentJob/view/' + this.id + '">' +
									'<span class="s_title">' + this.title + '</span>' + 
								'</a></li>';
					});
					$("#studentJob").append(html);
				},  
				error : function(e) {  
				 } 
			});
			
			//用户反馈
			 $.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getComment',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<tr><td class="comment_img" >' +
										'<img src="${resourcePath}/img/portal/icons/' + this.iconsName + '" /></td>' +
									'<td class="comment_content" >' + this.content + 
								'</td></tr>';
					});
					$("#comment").append(html);
				},  
				error : function(e) {  
				 } 
			}); 
			
			//心灵鸡汤
			$.ajax({
				type : "get",
				async : false,
				url : '${ctx}/getMindChickenSoup',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var html = '';
					$.each(data, function(){
						html += '<li><a href="${ctx}/portal/mindChickenSoup/view/' + this.id + '">' + this.title + '</a></li>';
					});
					$("#mindChickenSoup_result").html("");
					$("#mindChickenSoup").append(html);
				},  
				error : function(e) {  
					$("#mindChickenSoup_result").html("模块加载失败");
				 } 
			});
			 
			
			
			
			
		});
		
		// 轮播图
		$(function() {
			var $js_slider     = $("#js_slider"),
				$js_img_box    = $("#js_slider").find("#js_img_box"),
				$js_switch_btn = $js_slider.find("#js_switch_btn"),
				$imgs          = $js_img_box.find("img"),
				$li            = $js_switch_btn.find("li"),
				$a             = $js_switch_btn.find("a"),
				iNow           = 0,
				timer          = null;

			// 初始化
			slider();
			// 自动播放
			play();
			// 圆点按钮选择
			circleBtn();
			// 上一个按钮
			pre();
			// 下一个按钮
			next();
			// 鼠标移入停止播放
			$js_slider[0].onmouseover = function() {
				clearInterval(timer);
			}
			// 鼠标移除自动播放
			$js_slider[0].onmouseout = function() {
				play();
			}

			function play() {
				timer = setInterval(function() {
					slider();
					if(iNow >= $imgs.size() - 1) {
						iNow = 0;
					} else {
						iNow++;
					}
				}, 3000);  // 轮播时间3秒
			}

			function slider() {
				for(var i = 0; i < $imgs.size(); i++) {
					if (i != iNow) {
						$imgs.eq(i).fadeOut();
						$li.eq(i).removeClass("active");
					} else {
						$imgs.eq(iNow).fadeIn();
						$li.eq(i).addClass("active");
					}
				}
			}

			function circleBtn() {
				for(var j = 0; j < $imgs.size(); j++) {
					(function(j) {
						$li[j].onclick = function() {
							iNow = j;
							slider();
						}
					})(j);
				}
			}
			function pre() {}
			function next() {}
		});
	</script>
</tiles:putAttribute>
<tiles:putAttribute name="body">	
	<!-- 轮播图开始 -->
	<div class="banner container">
		<div class="slider" id="js_slider">
			<div class="img_box" id="js_img_box">
				<img src="${resourcePath}/images/1.jpg" />
				<img src="${resourcePath}/images/2.jpg" />
				<img src="${resourcePath}/images/3.jpg" />
			</div>	
			<ul class="switch_btn clearfix" id="js_switch_btn">
				<li class="active"><a href="javacript:void(0)"></a></li>
				<li><a href="javacript:void(0)"></a></li>
				<li><a href="javacript:void(0)"></a></li>
			</ul>
		</div>
		<div class="login">
			<h3>欢迎使用本站</h3>
			<c:if test="${studentPrincipal != null}">
				<a class="btn S_login" href="${ctx}/portal/infoCenter/student/basic">个人中心</a>
				<div  class="res_link">
					<a style="color: #fe7e09;" href="${ctx}/logout/student">退出</a>
				</div>
			</c:if>
			<c:if test="${merchantPrincipal != null}">
				<a class="btn B_login" href="${ctx}/portal/infoCenter/merchant/basic">企业中心</a>
				<div  class="res_link">
					<a style="color: #fe7e09;" href="${ctx}/logout/merchant">退出</a>
				</div>
			</c:if>
			<c:if test="${studentPrincipal == null && merchantPrincipal == null}">
				<a class="btn S_login" href="${ctx}/login/student">个人登录</a>
				<a class="btn B_login" href="${ctx}/login/merchant">企业登录</a>
				<div  class="res_link">
					<a style="color: #fe7e09;" href="${ctx}/register/student?_step=1">个人注册</a>
					<a style="color: #fe7e09;" href="${ctx}/register/merchant?_step=1">企业注册</a>
				</div>
			</c:if>
		</div>
		
	</div>
	<!-- 轮播图结束 -->
	<!-- 第一模块组开始 -->
	<div class="module_g container clearfix">
		<!-- 最新公告开始 -->
		<div class="notice module fl">
			<div class="module_title clearfix">
				<h2 class="fl">最新公告</h2>
				<a href="${ctx}/portal/newDynamic" class="more fr">更多&gt;</a>
			</div>
			<div class="notice_box">
				<ul id="notice">
				</ul>
				<div id="notice_result" style="color:red;">模块加载中...</div>
			</div>
		</div>
		<!-- 最新公告开始 -->
		<!-- 热点文章开始 -->
		<div class="hot module fr">
			<div class="module_title clearfix">
				<h2 class="fl">理财中心</h2>
				<a href="${ctx}/portal/financial" class="more fr">更多&gt;</a>
			</div>
			<div class="hotbox">
				<ul id="financial">
				</ul>
				<div id="financial_result" style="color:red;">模块加载中...</div>
			</div>
		</div>
		<!-- 热点文章结束 -->
	</div>
	<!-- 第一模块组结束 -->
	<div class="ad container" style="overflow: hidden;">
		<p><img src="http://static.atm.youku.com/YouKu2014/201409/0930/42645/1190-100.jpg" width="1000" height="90" /></p>
	</div>
	<!-- 第二模块组开始 -->
	<div class="module_g container clearfix">
		<div class="success module fl">
			<div class="module_title clearfix">
				<h2 class="fl">投资达人</h2>
				<a href="${ctx}/portal/newDynamic/investment" class="more fr">更多&gt;</a>
			</div>
			<ul class="newsitem fl" id="investment">
			</ul>
			<div id="investment_result" style="color:red;">模块加载中...</div>
			<div class="master_box clearfix"></div>
			<div class="module_title clearfix">
				<h2 class="fl">成功案例</h2>
				<a href="${ctx}/portal/newDynamic/example" class="more fr">更多&gt;</a>
			</div>
			<ul class="newsitem fl" id="example">
			</ul>
			<div id="example_result" style="color:red;">模块加载中...</div>
			<div class="success_box clearfix"></div>
		</div>
		<!-- 视频开始 -->
		<div class="video module fr">
			<div class="module_title clearfix">
				<h2 class="fl">视频</h2>
			</div>
			<div class="video_box" id="advVideo">
				<div id="advVideo_result" style="color:red;">模块加载中...</div>
			</div>
		</div>
		<!-- 视频结束 -->
	</div>
	<!-- 第二模块组结束 -->
	<!-- 第三模块组开始 -->
	<div class="module_g container clearfix">
		<!-- 招聘信息开始 -->
		<div class="employ module fl">
			<div class="module_title clearfix">
				<h2 class="fl">招聘信息</h2>
				<a href="${ctx}/portal/partTime/merchantJob" class="more fr">更多&gt;</a>
			</div>
			<div class="employ_box">
				<ul id="merchantJob">
					<li class="merchantJob_li_head">
						<span class="j_title">招聘标题</span>
						<span class="j_salary">工资待遇</span>
						<span class="j_area">工作区域</span>
						<span class="j_num">人数</span>
						<span class="j_time">发布时间</span>
					</li>
				</ul>
			</div>
		</div>
		<!-- 招聘信息结束 -->
		<!-- 简历中心开始 -->
		<div class="resume module fr">
			<div class="module_title clearfix">
				<h2 class="fl">个人求职中心</h2>
				<a href="${ctx}/portal/partTime/studentJob" class="more fr">更多&gt;</a>
			</div>
			<div class="resume_box">
				<ul id="studentJob">
					<li class="studentJob_li_head">
						<span class="s_title">求职信息</span>
					</li>
				</ul>
			</div>
		</div>
		<!-- 简历中心结束 -->

	</div>
	<!-- 第三模块组结束 -->
	<div class="container clearfix">
		<div class="ad fl" style="width: 490px; height: 90px; overflow: hidden;">
			<p><img src="http://i.mmcdn.cn/simba/img/TB1N1MsGFXXXXXVXXXXSutbFXXX.jpg" /></p>
		</div>
		<div class="ad fr" style="width: 490px; height: 90px; overflow: hidden;">
			<p><img src="http://i.mmcdn.cn/simba/img/TB1N1MsGFXXXXXVXXXXSutbFXXX.jpg" /></p>
		</div>
	</div>
	<!-- 第四模块组开始 -->
	<div class="module_g container clearfix">
		<div class="box1 fl module">
			<div class="module_title clearfix">
				<h2 class="fl">心灵鸡汤</h2>
				<a href="${ctx}/portal/mindChickenSoup" class="more fr">更多&gt;</a>
			</div>
			<div class="box1_box">
				<ul id="mindChickenSoup">
				</ul>
				<div id="mindChickenSoup_result" style="color:red;">模块加载中...</div>
			</div>
		</div>
		<div class="feedback module fr">
			<div class="module_title clearfix">
				<h2 class="fl">用户反馈</h2>
				<a href="${ctx}/portal/newDynamic/comment" class="more fr">更多&gt;</a>
			</div>
			<div class="feedback_box">
				<table style="table-layout:fixed;width: 100%" id="comment" >
				</table>
			</div>
		</div>
	</div>
	<!-- 第四模块组结束 -->
	
</tiles:putAttribute>	
</tiles:insertDefinition>	
	