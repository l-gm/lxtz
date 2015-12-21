//校区、学校、班级


var page_year = function() {
	
	var year = 2010;
	var html = "";
	var value = $("#value_year").val();
	
	for (var i=year;i<2030;i++) {
		
		if (value == i) {
			html = html + '<option selected="selected" value="' + i + '">' + i + '</option>';
		} else {
			html = html + '<option value="' + i + '">' + i + '</option>';
		}
	}
	
	$("#page_year").append(html);
	
};

var page_semester = function() {
	
	var _semester = new Array("第一学期", "暑假", "第二学期", "寒假");
	var value = $("#value_semester").val();
	var html = "";
	
	for (var i in _semester) {
		if (value == _semester[i]) {
			html = html + '<option selected="selected" value="' + _semester[i] + '">' + _semester[i] + '</option>';
		} else {
			html = html + '<option value="' + _semester[i] + '">' + _semester[i] + '</option>';
		}
	}
	
	$("#page_semester").append(html);
	
};

var page_grade = function() {
	
	var _grade = new Array("一年级", "二年级", "三年级", "四年级","五年级","六年级");
	var value = $("#value_grade").val();
	var html = "";
	
	for (var i in _grade) {	
		var num = parseInt(i) + 1;
		if (value == _grade[i]) {
			html = html + '<option selected="selected" lang="' + i + '"value="' + _grade[i] + '">' + _grade[i] + '</option>';
		} else {
			html = html + '<option lang="' + num + '"value="' + _grade[i] + '">' + _grade[i] + '</option>';
		}
	}
	
	$("#page_grade").append(html);
	
};

var page_degree = function() {
	
	var _degree = new Array("高中", "大学在读", "大学本科", "硕士研究生","博士");
	var value = $("#value_degree").val();
	var html = "";
	
	for (var i in _degree) {
		if (value == _degree[i]) {
			html = html + '<option selected="selected" value="' + _degree[i] + '">' + _degree[i] + '</option>';
		} else {
			html = html + '<option value="' + _degree[i] + '">' + _degree[i] + '</option>';
		}
	}
	
	$("#page_degree").append(html);
	
	
};

var page_timeType = function() {
	
	var _timeType = new Array("上午第一节", "上午第二节", "下午第一节", "下午第二节");
	var value = $("#value_timeType").val();
	var html = "";
	
	for (var i in _timeType) {
		if (value == _timeType[i]) {
			html = html + '<option selected="selected" value="' + _timeType[i] + '">' + _timeType[i] + '</option>';
		} else {
			html = html + '<option value="' + _timeType[i] + '">' + _timeType[i] + '</option>';
		}
	}
	
	$("#page_timeType").append(html);
	
	
};

var page_political = function() {
	
	var _political = new Array("中共党员", "共青团员", "群众");
	var value = $("#value_political").val();
	var html = "";
	
	for (var i in _political) {
		if (value == _political[i]) {
			html = html + '<option selected="selected" value="' + _political[i] + '">' + _political[i] + '</option>';
		} else {
			html = html + '<option value="' + _political[i] + '">' + _political[i] + '</option>';
		}
	}
	
	$("#page_political").append(html);
	
	
};

var page_paymentName = function() {
	
	var _paymentName = new Array("校车费", "课时费");
	var value = $("#value_paymentName").val();
	var html = "";
	
	for (var i in _paymentName) {
		if (value == _paymentName[i]) {
			html = html + '<option selected="selected" value="' + _paymentName[i] + '">' + _paymentName[i] + '</option>';
		} else {
			html = html + '<option value="' + _paymentName[i] + '">' + _paymentName[i] + '</option>';
		}
	}
	
	$("#page_paymentName").append(html);
	
	
};

var page_paymentLogName = function() {
	
	var _paymentName = new Array("校车费", "课时费", "工资");
	var value = $("#value_paymentName").val();
	var html = "";
	
	for (var i in _paymentName) {
		if (value == _paymentName[i]) {
			html = html + '<option selected="selected" value="' + _paymentName[i] + '">' + _paymentName[i] + '</option>';
		} else {
			html = html + '<option value="' + _paymentName[i] + '">' + _paymentName[i] + '</option>';
		}
	}
	
	$("#page_paymentName").append(html);
	
	
};