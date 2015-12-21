<%@ tag pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="page" type="cn.dosy.platform.core.web.vo.Page" required="true"%>

<div class="pages">
			<script>
				$(document).ready(function() {
					
					$(".ooooo").click(function() {
						
						var pageNo = $(this).attr("lang");
						$("#pageNo").val(pageNo);
						$("#form").submit();
						
						console.warn($("#pageNo").val());
					});
					
					$("#searchButton").click(function(e) {
						
						e.preventDefault();
						
						$("#pageNo").val("1");
						$("#form").submit();
					});
					
				});
			</script>
			
			<a href="javascript:void(0)" lang="1">首页</a>
			<c:choose>
				<c:when test="${page.pageNo - 1 < 1}">
					<a href="javascript:void(0)" class="disable">上一页</a>
				</c:when>
				<c:otherwise>
					<a href="javascript:void(0)" class="ooooo" lang="${page.pageNo - 1}">上一页</a>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${page.pageNo + 1 > page.totalPages}">
					<a href="javascript:void(0)" class="disable">下一页</a>
				</c:when>
				<c:otherwise>
					<a href="javascript:void(0)" class="ooooo" lang="${page.pageNo + 1}">下一页</a>
				</c:otherwise>
			</c:choose>
			<a href="javascript:void(0)" class="ooooo" lang="${page.totalPages}">尾页</a>
			<span class="page_count">${page.pageNo}/${page.totalPages}</span>
			
</div>