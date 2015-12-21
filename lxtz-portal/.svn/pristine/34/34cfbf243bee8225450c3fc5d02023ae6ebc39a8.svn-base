<%@ page contentType="text/html;charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<title><tiles:insertAttribute name="Html_Title" /></title>


<link href="${resourcePath}/img/favicon.ico" type="image/x-icon" rel="shortcut icon" />
<link href="${resourcePath}/css/bootstrap.min.css" type="text/css" rel="stylesheet" />

<link href="${resourcePath}/css/bootstrap.covering.css" type="text/css" rel="stylesheet" />
<link href="${resourcePath}/css/jquery-ui-1.10.4.custom.min.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${resourcePath}/css/default.css" />
<!--[if lt IE 7]>
    <link href="${resourcePath}/css/bootstrap-ie6.min.css" rel="stylesheet" />
    <link href="${resourcePath}/css/ie.css" rel="stylesheet" />
<![endif]-->
<!--解决breadcrumb在IE8下叠在一起的问题-->
<!--[if lt IE 9]>
    <style>
    .breadcrumb li {
  display: inline-block;
  display: inline;
  text-shadow: 0 1px 0 #ffffff;
  *zoom: 1;
}
    </style>
<![endif]-->
<script>var resourcePath = "${resourcePath}"</script>

<script src="${resourcePath}/js/jquery-1.11.1.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/bootstrap.min.js" type="text/javascript"></script>

<script src="${resourcePath}/js/bootstrap.multiselect.min.js" type="text/javascript"></script>
<script src="${resourcePath}/js/framework.js" type="text/javascript"></script>

<tiles:insertAttribute name="Html_Head" />	

</head>

<body class="default-body">
	<tilesx:useAttribute name="showNameTitlePannel" classname="java.lang.String" ignore="true" />

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="topmenu" />

    <div class="body-container clearfix">

			<div class="aside pull-left" id="asidemenu">
				<tiles:insertAttribute name="leftmenu" /> 
			</div>

			<div class="content pull-right">
			
				<div class="content-container">
					
					<div class="breadcrumbPannel">
						<div class="container-fluid">
							<tiles:insertAttribute name="breadcrumb" />
						</div>	
						<div class="titleToolbarPannel">
							<tiles:insertAttribute name="titleToolbar" ignore="true" />
						</div>
					</div>
					
					<c:choose>
						<c:when test="${showNameTitlePannel}">
							<div class="container-fluid a-margin-15">
								<div class="col-xs-5 viewTitle">
									<tiles:insertAttribute name="nameTitle" ignore="true" />
								</div>	
								<div class="col-xs-7 titleToolbarPannel clearfix">
									<div class="pull-right">
										<tiles:insertAttribute name="toolbar" ignore="true" />
									</div>
								</div>
							</div>
						</c:when>
					</c:choose>
					<div class="container-fluid">
						<tiles:insertAttribute name="body" />
						
					</div>
				</div>
			</div>
	</div>
	
	<script type="text/javascript">
	
	$(document).ready(function() {
		resizeDefault_Container('default-container');
	});
	
	
	$(window).resize(function() {
	    clearTimeout($.data(this, 'resizeTimer'));
	    $.data(this, 'resizeTimer', setTimeout(function() {
	    	resizeDefault_Container('default-container');
	    }, 200));
	});
	
	// toggle leftmenu
	$(function(){
		var flag = true;
		$( "#full-screen" ).click(function() {
			//$( "#asidemenu" ).toggle( "fast" );
			if(flag) {
				flag = false;
				$( "#asidemenu" ).animate({ marginLeft: "-=180" });
				$( ".content-container" ).animate({ marginLeft: "0" });
			} else {
				flag = true;
				$( "#asidemenu" ).animate({ marginLeft: "0" });
				$( ".content-container" ).animate({ marginLeft: "+=180" });
			}
		});
	});
	
	// toggle search-bar
	$(function() {
		$( "#toggle-search" ).click(function() {
			$( "#search-bar" ).toggle();
			$( ".btn-txt" ).toggle();
		});
	});

	</script>
</body>

</html>