<%@ tag pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="page" type="cn.dosy.platform.core.web.vo.Page" required="true"%>

<div class="pagination" align="center" style="width:100%;">
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
			
			<%-- <div style="width: 100%; text-align: center;">
				<a href="javascript:void(0)" class="ooooo" lang="1">首页</a>
				<c:choose>
					<c:when test="${page.pageNo - 1 < 1}">
						上一条
					</c:when>
					<c:otherwise>
						<a href="javascript:void(0)" class="ooooo" lang="${page.pageNo - 1}">上一条</a>
					</c:otherwise>
				</c:choose>
				
				当前页${page.pageNo}
				
				<c:choose>
					<c:when test="${page.pageNo + 1 > page.totalPages}">
						下一条
					</c:when>
					<c:otherwise>
						<a href="javascript:void(0)" class="ooooo" lang="${page.pageNo + 1}">下一条</a>
					</c:otherwise>
				</c:choose>
				<a href="javascript:void(0)" class="ooooo" lang="${page.totalPages}">尾页</a>
				总记录数${page.total}
			
			</div> --%>
			<input type="hidden" id="pageNo" name="pageNo" value="${page.pageNo}" />
			
			
			<ul class="pager" style="margin: 0;">
				<li><a href="javascript:void(0)" class="ooooo" lang="1">首页</a></li>
				<c:choose>
					<c:when test="${page.pageNo - 1 < 1}">
						<li class="disabled"><a href="javascript:void(0)">上一页</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="javascript:void(0)" class="ooooo" lang="${page.pageNo - 1}">上一页</a></li>
					</c:otherwise>
				</c:choose>
				<li class="disabled"><a href="javascript:void(0)">当前页${page.pageNo}/${page.totalPages}</a></li>
				<c:choose>
					<c:when test="${page.pageNo + 1 > page.totalPages}">
						<li class="disabled"><a href="javascript:void(0)">下一页</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="javascript:void(0)" class="ooooo" lang="${page.pageNo + 1}">下一页</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="javascript:void(0)" class="ooooo" lang="${page.totalPages}">尾页</a></li>
				<li class="disabled"><a href="javascript:void(0)">总记录数${page.total}</a></li>
			</ul>
</div>