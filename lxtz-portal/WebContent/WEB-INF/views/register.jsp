<%@ page contentType="text/html;charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
	<title>广州朗鑫投资门户网站</title>
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta name="description" content="" />
	<meta name="author" content="heyiyang" />

	<link rel="shortcut icon" href="/favicon.ico" />
	<link rel="apple-touch-icon" href="/apple-touch-icon.png" />
	<link rel="stylesheet" href="${resourcePath}/css/rest.css" />
	<link rel="stylesheet" href="${resourcePath}/css/main.css" />
</head>

<body class="bg">
	<!-- 头部工具栏开始 -->
	<div class="topbar">
		<div class="container clearfix">
			<p class="welcome fl">欢迎来到本站！</p>
			<ul class="topnav fr clearfix">
				<li><a href="###">登录</a></li>
				<li><a href="###">注册</a></li>
				<li><a href="###">帮助</a></li>
			</ul>
		</div>
	</div>
	<!-- 头部工具栏结束 -->
	<!-- 头部菜单开始 -->
	<div class="header">
		<div class="headerBox container clearfix">
			<div class="logo fl clearfix">
				<div class="logoBox">
					<!--
					<h1>朗鑫门户</h1>
					<p>langxin.com</p>
					 -->
					<!-- <img src="images/logo.png"> -->
				</div>
			</div>
			<div class="mainnav fl">
				<ul class="clearfix">
					<li class=""><a href="###">首页</a></li>
					<li><a href="###">我要兼职</a></li>
					<li><a href="###">我要理财</a></li>
					<li><a href="###">心灵鸡汤</a></li>
					<li><a href="###">关于我们</a></li>
				</ul>
			</div>
			<div class="mycenter fr">
				<a></a>
			</div>
		</div>
	</div>
	<!-- 头部菜单结束 -->
	<!-- 注册表单开始 -->
	<div class="register container">
		<div class="reg_box clearfix">
			<div class="reg_title clearfix">
				<h2 class="fl">注册新用户</h2>
				<p class="fr">已有账号？<a href="###">立即登录</a></p>
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
						<li class="sm">注册成功</li>
					</ul>
				</div>
				<!-- step1开始 -->
				<div class="step1">
					<form class="reg_form" action="" method="">
						<table>
							<tr>
								<th>用户名</th>
								<td>
									<div class="input">
										<input type="text" placeholder="请输入用户名" />
										<span>用户名不能为空</span>
									</div>
								</td>
							</tr>
							<tr>
								<th>密码</th>
								<td>
									<div class="input">
										<input type="password" placeholder="请输入密码" />
										<span>sdfsdf</span>
									</div>
								</td>
							</tr>
							<tr>
								<th>确认密码</th>
								<td>
									<div class="input">
										<input type="password" placeholder="请再次输入密码" />
										<span>sdfsdf</span>
									</div>
								</td>
							</tr>
							<tr>
								<th>邮箱</th>
								<td>
									<div class="input">
										<input type="text" placeholder="请输入邮箱" />
										<span>sdfsdf</span>
									</div>
								</td>
							</tr>
							<tr>
								<th>手机号码</th>
								<td>
									<div class="input">
										<input type="text" placeholder="请输入手机号码" />
										<span>sdfsdf</span>
									</div>
								</td>
							</tr>
							<tr>
								<th>验证码</th>
								<td>
									<div class="input clearfix">
										<input type="text" class="fl" style="width: 134px;" placeholder="验证码" />
										<img class="fl" src="" alt="验证码" width="90" height="38" style="margin-right: 10px;" />
										<a class="fl" href="###" style="margin-right: 10px; height: 38px; line-height: 38px;">换一张</a>
										<span class="fl" style="height: 38px; line-height: 38px;">sdfsdf</span>
									</div>
								</td>
							</tr>
							<tr>
								<th></th>
								<td>
									<input class="reg_submit" type="submit" value="免费注册" />
								</td>
							</tr>
						</table>
					</form>
				</div>
				<!-- step1结束 -->
				<!-- step2开始 -->
				<div class="step2">
					<div class="reg_content2">
						<p>
							<i>√BG</i>
							验证码已发送，有效期30分钟，请查收
						</p>
						<table>
							<tr>
								<th>手机号</th>
								<td>
									<span style="margin-right: 20px;">15878787878</span>
									<a href="###">修改手机号码</a>
								</td>
							</tr>
							<tr>
								<th>验证码</th>
								<td>
									<input type="text" />
									<a href="###">再次发送</a>
								</td>
							</tr>
							<tr>
								<th></th>
								<td>
									<input type="sbumit" class="reg_submit2" value="验证" />
								</td>
							</tr>
						</table>
					</div>
				</div>
				<!-- step2结束 -->
				<!-- step3开始 -->
				<div class="step3">恭喜，注册成功！</div>
				<!-- step3结束 -->
			</div>
		</div>
	</div>
	<!-- 注册表单结束 -->
	<!-- 底部模块开始 -->
	<div class="footer">
		<div class="links container">
			<div class="hlinks clearfix">
				<dl class="fl">
					<dt>关于我们</dt>
					<dd>关于我们</dd>
					<dd>联系我们</dd>
					<dd>加入我们</dd>
					<dd>创业大赛</dd>
				</dl>
				<dl class="fl">
					<dt>新手上路</dt>
					<dd>如何操作</dd>
					<dd>如何分辨</dd>
					<dd>新手上路</dd>
				</dl>
				<dl class="fl">
					<dt>常见问题</dt>
					<dd>为什么会审核失败</dd>
					<dd>如何进行</dd>
				</dl>
				<div class="service fl">
					<h3>客服热线</h3>
					<p class="workphone">400-xxx-xxxx</p>
					<p class="worktime">工作时间：9：30-21：30</p>
					<p class="workemail">联系邮箱：contact@xxx.com</p>
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
					<a href="###">百度</a>|
					<a href="###">腾讯</a>|
					<a href="###">新浪</a>|
					<a href="###">优酷</a>|
					<a href="###">土豆</a>|
					<a href="###">爱奇艺</a>
				</p>
			</div>
			<p class="copyright">Copyright @广州朗鑫投资有限公司 备案号 版权所有，未经许可不得复制、转载或摘编，违者必究！</p>
		</div>
	</div>
	<!-- 底部模块结束 -->
	<!-- 右侧浮动框开始 -->
	<div class="floatBox">
		<div class="feedback">
			<a href="###">我要反馈</a>
		</div>
		<div class="musicPlayer">
			<a href="###" class="playBtn music" id="playPause">播放音乐</a>
			<!--
			<div class="playerBox clearfix" id="playerBox">
				<div class="musicControl fl">
					<a href="###" class="pre">上一首</a>
					<a href="###" class="playPause">播放</a>
					<a href="###" class="next">下一首</a>
				</div>
				<div class="songTitle fr">喜欢你</div>
			</div>
			<div class="quickControl">
				<a class="quickPlayPause">暂停</a>
			</div>
			 -->
		</div>
		<div class="scrollTop">
			<a href="#">回到顶部</a>
		</div>
	</div>
	<!-- 右侧浮动框结束 -->

	<script src="${resourcePath}js/jquery.min.js"></script>
	<script src="js/app.js"></script>
	<script>

		/*
		$(function() {
			$(window).scroll(function() {
				if($(window).scrollTop()>30) {
					$('.header').addClass('fixed');
				} else {
					$('.header').removeClass('fixed');
				}
			});
		});
		 */

		$(function() {
			var $audio = $('<audio src="${resourcePath}/media/1.mp3"></audio>');
			$audio.appendTo($('.musicPlayer'));
			$('#playPause').click(function() {
				if($audio[0].paused) {
					$audio[0].play();
					$(this).html('').addClass('play');
				} else {
					$audio[0].pause();
					$(this).removeClass('play').addClass('music');
				}
			});

			$audio.on("ended", function() {
				$(this).removeClass('play').addClass('music');
			});
		});

		/*
		$(function() {
			var flag = true;
			var i = 0;
			$('#showPlayerBox').click(function() {
				if(flag) {
					if(!i) {
						$('#playerBox').fadeIn();
						i++;
					}
					if($audio[0].paused) {
						$('.quickPlayPause').html('播放');
					} else {
						$('.quickPlayPause').html('暂停');
					}
					$('.quickControl').fadeOut(function(){
						$('#playerBox').fadeIn();
					})
					flag = false;
				} else {
					$('#playerBox').fadeOut(function() {
						if($audio[0].paused) {
							$('.quickPlayPause').html('播放');
						} else {
							$('.quickPlayPause').html('暂停');
						}
						$('.quickControl').fadeIn();
					});
					flag = true;
				}
			});


			var $audio = $('<audio src="assets/1.mp3"></audio>');
			$audio.appendTo($('#playerBox'));
			$('.playPause').click(function() {
				if($audio[0].paused) {
					$audio[0].play();
					$(this).html('暂停');
				} else {
					$audio[0].pause();
					$(this).html('播放');
				}
			});
			//$audio.get(0).play();
		});
		*/

	/*
	$(document).ready(function() {
		console.log( $( '#myThumbs .thumb a' ).find( 'span' ).size() );
		$( '#myThumbs .thumb a' ).hover(function() {
			for(var i=0; i<$( '#myThumbs .thumb a' ).find( 'span' ).size(); i++) {
				$( '#myThumbs .thumb a' ).find( 'span' ).stop().animate({
					top: 1
				}, 280);
			}
			$(this).each(function() {
				console.log( $(this).find( 'img' ).attr('src') );
				$( '#img_view' ).attr('src', $(this).find( 'img' ).attr('src'));
				$(this).find( 'span' ).stop().animate({
					top: 72
				}, 280);
			});
		}, function() {});
	});
	*/
	</script>
<script>/*window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"16"},"slide":{"type":"slide","bdImg":"0","bdPos":"left","bdTop":"100"},"image":{"viewList":["qzone","tsina","tqq","renren","weixin"],"viewText":"分享到：","viewSize":"16"},"selectShare":{"bdContainerClass":null,"bdSelectMiniList":["qzone","tsina","tqq","renren","weixin"]}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];*/</script>
</body>
</html>
