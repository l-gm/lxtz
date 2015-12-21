$(function() {
	/*
	 * Translated default messages for the jQuery validation plugin. Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
	 */
	jQuery.extend(jQuery.validator.messages, {
		required: "必填项",
		remote: "必须唯一",
		email: "请输入正确格式的电子邮件",
		url: "请输入合法的网址",
		date: "请输入合法的日期",
		dateISO: "请输入合法的日期 (ISO).",
		number: "请输入合法的数字",
		digits: "只能输入整数",
		creditcard: "请输入合法的信用卡号",
		equalTo: "请再次输入相同的值",
		accept: "请输入拥有合法后缀名的字符串",
		maxlength: jQuery.validator.format("请输入一个长度最多是 {0} 的字符串"),
		minlength: jQuery.validator.format("请输入一个长度最少是 {0} 的字符串"),
		rangelength: jQuery.validator.format("请输入一个长度介于 {0} 和 {1} 之间的字符串"),
		range: jQuery.validator.format("请输入一个介于 {0} 和 {1} 之间的值"),
		max: jQuery.validator.format("请输入一个最大为 {0} 的值"),
		min: jQuery.validator.format("请输入一个最小为 {0} 的值")
	});

	jQuery.extend(jQuery.validator.defaults, {
		errorElement: "div",
		errorClass: "error",
		errorPlacement: function(error, element) {
			error.appendTo(element.closest("td"));
		}
	});

	$.validator.addMethod("other", function(value, element, param) {
		return this.optional(element) || param;
	}, "不符合业务逻辑!");

	$.validator.addMethod("numberAndCharacter", function(value, element, param) {
		return this.optional(element) || isNumberAndCharacter(value);
	}, "必须包含数字和字母");

	$.validator.addMethod("notAllEmpty", function(value, element, param) {
		return value || notAllEmpty(param);
	}, "至少输入一个查询条件");

	$.validator.addMethod("projectName", function(value, element, param) {
		return this.optional(element) || isProjectNameValid(value);
	}, "必须包含最少2个连续的汉字");

	$.fn.datetimepicker.dates['zh'] = {
		days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		daysMin: ["日", "一", "二", "三", "四", "五", "六", "日"],
		months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		today: "今日",
		suffix: [],
		meridiem: []
	};

	$("div[data-plugin='datePicker']").datetimepicker({
		format: "yyyy-mm-dd",
		minView: 2,
		viewSelect: "month",
		language: "zh",
		autoclose: true,
		forceParse: true,
		todayBtn: true,
		todayHighlight: true,
		pickerPosition: "bottom-left"
	}).on("changeDate", function() {
		$(this).find("input").blur();
	});

	$("div[data-plugin='timepicker']").datetimepicker({
		format: "yyyy-mm-dd hh:ii:ss",
		minView: 0,
		viewSelect: "month",
		language: "zh",
		autoclose: true,
		forceParse: true,
		todayBtn: true,
		todayHighlight: true,
		pickerPosition: "bottom-left"
	}).on("changeDate", function() {
		$(this).find("input").blur();
	});

	$("select[data-plugin='multiselect']").multiselect({
		nonSelectedText: "0个选中",
		nSelectedText: "个选中",
		buttonContainer: "<div class='btn-group row-fluid' />",
		buttonClass: "btn span12",
		selectedClass: "",
		includeSelectAllOption: true,
		selectAllText: "全选",
		selectAllValue: "",
		numberDisplayed: 5
	});
});
