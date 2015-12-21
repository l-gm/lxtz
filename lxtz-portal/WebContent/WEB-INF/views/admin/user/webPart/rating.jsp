<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<style>
	.rating img {
		width:20px;
		height: 20px;
	}
</style>

<div class="rating">
	<c:if test="${param.rating == 1}">
		<img src="${resourcePath}/img/admin/star.jpg" />
	</c:if>
	<c:if test="${param.rating == 2}">
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
	</c:if>
	<c:if test="${param.rating == 3}">
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
	</c:if>
	<c:if test="${param.rating == 4}">
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
	</c:if>
	<c:if test="${param.rating == 5}">
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
		<img src="${resourcePath}/img/admin/star.jpg" />
	</c:if>
	<c:if test="${param.rating != 1 && param.rating != 2 && param.rating != 3 && param.rating != 4 && param.rating != 5}">
		未评价
	</c:if>
</div>