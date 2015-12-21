<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<tiles:insertDefinition name="defaultTemplate">
	
	<tiles:putAttribute name="Html_Head">
		<script>
		$(document).ready(function() {
			
			/* 添加全部 */
			$("#pickList #addAll").click(function(){
				$("#pickList #available option").clone().appendTo("#pickList #selected");
				$("#pickList #available option").remove();
				setBoxValue();
			});
			
			/* 添加一项 */
			$("#pickList #add").click(function(){
				$("#pickList #available option:selected").clone().appendTo("#pickList #selected");
				$("#pickList #available option:selected").remove();
				setBoxValue();
			});
			
			/* 移除一项 */
			$("#pickList #remove").click(function(){
				$("#pickList #selected option:selected").clone().appendTo("#pickList #available");
				$("#pickList #selected option:selected").remove();
				setBoxValue();
			});
			
			/* 移除全部 */
			$("#pickList #removeAll").click(function(){
				$("#pickList #selected option").clone().appendTo("#pickList #available");
				$("#pickList #selected option").remove();
				setBoxValue();
			});
			
			/* 双击添加一项 */
			$("#pickList #available").on("dblclick", "option", function(){
				$(this).clone().appendTo("#pickList #selected");
				$(this).remove();
				setBoxValue();
			});
			
			/* 双击移除一项 */
			$("#pickList #selected").on("dblclick", "option", function(){
				$(this).clone().appendTo("#pickList #available");
				$(this).remove();
				setBoxValue();
			});
			
			/* 重新设置值 */
			function setBoxValue(){
				var value = "";
				$("#pickList #selected").children().each(function(index){
					value += $(this).val() + ',';
				});
				value = value.substring(0,value.length-1);
				$("#pickList #multiBoxValue").val(value);
			}
			
			$.ajax({
				type : "GET",
				async : false,
				url : '${ctx}/admin/advertisement/getStudentPhone',
				timeout : 2000,
				contentType : "application/json;charset=UTF-8;",
				dataType : "json",
				success : function(data) {
					var value = $("#pickList #multiBoxValue").val();
					var selected = value != null ? value.split(",") : "";
					var html = '';
					$.each(data, function(){
						var flag = true;
						for(var i=0; i<selected.length; i++){
							if(this.value == selected[i]){
								flag = false;
								break;
							}
						}
						if(flag){
							html += '<option value="'+ this.value + '">' + this.label + '</option>';
						}
					});
					$("#pickList #available").append(html);
				},  
				error : function(e) {  
					alert('error');  
				 } 
			});
			
		});
		</script>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<form:form modelAttribute="entity" id="form" method="post" enctype="multipart/form-data"
			action="${ctx}/admin/advertisement/advShortMessage/save" class="form-horizontal">
			<div class="panel panel-info">
				<div class="panel-heading text-left">
					<h4>编辑短信</h4>
				</div>
				
					<table class="table table-bordered">
				<colgroup>
					<col width="250px">
					<col>
					<col width="250px">
					<col>
				</colgroup>
				<tr>
					<td class="text">短信内容</td>
					<td colspan="3">
						<textarea cols="100" rows="8" name="content" style="height:100px;"></textarea>
					</td>
				</tr>
				<tr>
					<td class="text">短信接收人</td>
					<td colspan="3">
						<div id="pickList" align="center" data-url="" data-reRenderUrl="">
							<table>
								<tr>
									<td><select id="available" multiple="multiple" style="height:200px; width: 350px; margin-right: 20px;"></select></td>
									<td style="width:50px">
										<p><button id="addAll" type="button" class="btn btn-block">&gt;&gt;</button></p>
										<p><button id="add" type="button" class="btn btn-block">&gt;</button></p>
										<p><button id="remove" type="button" class="btn btn-block">&lt;</button></p>
										<p><button id="removeAll" type="button" class="btn btn-block">&lt;&lt;</button></p>
									</td>
									<td><select id="selected" multiple="multiple" style="height:200px; width: 350px; margin-left: 20px;"></select></td>
								</tr>
							</table>
							<input id="multiBoxValue" name="multiBoxValue" type="text" style="display:none" value="${value}">
						</div>
					</td>
				</tr>
				
			</table>
					
			<div class="panel-footer text-center">
				<a href="${ctx}/admin/advertisement/advShortMessage" class="btn btn-default">返回列表</a>
				<button type="submit" class="btn btn-primary" id="save">确认发送</button>
			</div>
		
		</div>		
	</form:form>
	
			
</tiles:putAttribute>
</tiles:insertDefinition>