<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<link href="${resourcePath}/img/favicon.ico" type="image/x-icon" rel="shortcut icon" />
<link href="${resourcePath}/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="${resourcePath}/css/bootstrap.datetimepicker.min.css" type="text/css" rel="stylesheet" />
<link href="${resourcePath}/css/bootstrap.covering.css" type="text/css" rel="stylesheet" />
<style type="text/css">
body {
	background-color: #f8f8f8;
} 

.login-container {
	
	width: 100%;
	height: 100%;
	margin: 0 auto;
}
.login-form-pannel {
	position: absolute;
	width: 500px;
	height: 280px;
	left: 50%;
	top: 50%;
	margin-top: -140px;
	margin-left: -250px;
	background-color: #ffffff;
	text-align: center;
	-webkit-border-radius: 40px;
    -moz-border-radius: 40px;
    border-radius: 40px;
}
.input-group {
	margin-left: 90px;
	margin-top: 10px;
}

.login-button {
	width: 140px;
} */
</style>

<script>var resourcePath = "${resourcePath}"</script>
<script src="${resourcePath}/js/jquery.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/bootstrap.datetimepicker.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/bootstrap.multiselect.min.js" type="text/javascript"></script>


<script type="text/javascript">
	$(function() {
		$("form").validate();
	});
</script>
</head>
<body>
	<div class="container login-container">
		<div class="login-form-pannel">
		     <form action="${ctx}/login" method="post" autocomplete="off" class="form-horizontal">
		      <br/>
		       <br/>
		     	<h2 class="form-signin-heading">Please sign in</h2>
		     	 <br/>
		     	  <br/>
		     	 <div class="input-group">
		        	<span class="input-group-addon">账号</span>
		        	<input type="text" name="account" class="form-control" placeholder="请输入账号" required="" autofocus="" style="width: 70%;"/>
		       	 </div>
		       	 <div class="input-group">
		       		 <span class="input-group-addon">密码</span>
		        	<input type="password" name="password" class="form-control" placeholder="请输入密码" required="" style="width: 70%;"/>
		       	 </div>
		       	 
		        <br/>
		        <button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 50%;margin-left: 120px;">确认登陆</button>
		    	<c:if test="${not empty loginMessage}">
					<div class="alert alert-danger" style="color: red;">${loginMessage}</div>
				</c:if>
		     </form>
		</div>
    </div>
</body>
</html>
