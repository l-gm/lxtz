/* Begin: framework windows control */
if(resourcePath == null)
	resourcePath = '';
contextPath=resourcePath;
function toggleImg16(obj, img)
{
	var e = document.getElementById(obj);
	var i = document.getElementById(img);
	
	if(!e) return;
	if(e.style.display == "none")
	{
		e.style.display = "block";	
		if(i) i.src = contextPath+"/img/ar_b16_up.gif";
	}
	else
	{
		e.style.display = "none";
		if(i) i.src = contextPath+"/img/ar_b16_down.gif";
	}	
	
};

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

	//校验日期 格式：yyyy-MM-dd
	$.validator.addMethod("date_yyyy_MM_dd", function(value, element) {
		return this.optional(element) || /^\d{4}-\d{2}-\d{2}$/.test(value);
	}, "请输入正确的日期格式，如：2010-03-09");
	
	//校验身份证件号码
	$.validator.addMethod("isIdCardNo", function(value, element) {
		 return this.optional(element) || isIdCardNo(value);
	}, "请输入正确的身份证号码");

	
	
});
//增加身份证验证
function isIdCardNo(num) {
    var factorArr = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1);
    var parityBit = new Array("1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2");
    var varArray = new Array();
    
    var lngProduct = 0;
    var intCheckDigit;
    var intStrLen = num.length;
    var idNumber = num;
    // initialize
    if ((intStrLen != 15) && (intStrLen != 18)) {
        return false;
    }
    // check and set value
    for (var i = 0; i < intStrLen; i++) {
        varArray[i] = idNumber.charAt(i);
        if ((varArray[i] < '0' || varArray[i] > '9') && (i != 17)) {
            return false;
        } else if (i < 17) {
            varArray[i] = varArray[i] * factorArr[i];
        }
    }

    if (intStrLen == 18) {
        //check date
        var date8 = idNumber.substring(6, 14);
        if (isDate8(date8) == false) {
            return false;
        }
        // calculate the sum of the products
        for (var i = 0; i < 17; i++) {
            lngProduct = lngProduct + varArray[i];
        }
        // calculate the check digit
        intCheckDigit = parityBit[lngProduct % 11];
        // check last digit
        if (varArray[17] != intCheckDigit) {
            return false;
        }
    }
    else {        //length is 15
        //check date
        var date6 = idNumber.substring(6, 12);
        if (isDate6(date6) == false) {
            return false;
        }
    }
    return true;
};
function isDate6(sDate) {
    if (!/^[0-9]{6}$/.test(sDate)) {
        return false;
    }
    
    
    var year, month, day;
    year = '19' + sDate.substring(0, 2);
    month = sDate.substring(2, 4);
    day = sDate.substring(4, 6);
    var iaMonthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (year < 1700 || year > 2500) return false;
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) iaMonthDays[1] = 29;
    if (month < 1 || month > 12) return false;
    if (day < 1 || day > iaMonthDays[month - 1]) return false;
    return true;
};

function isDate8(sDate) {
    if (!/^[0-9]{8}$/.test(sDate)) {
        return false;
    }
    var year, month, day;
    year = sDate.substring(0, 4);
    month = sDate.substring(4, 6);
    day = sDate.substring(6, 8);
    var iaMonthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    if (year < 1700 || year > 2500) return false;
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) iaMonthDays[1] = 29;
    if (month < 1 || month > 12) return false;
    if (day < 1 || day > iaMonthDays[month - 1]) return false;
    return true;
};


$((function($){
    $.datepicker.regional['zh-CN'] = {
        clearText: '清除',
        clearStatus: '清除已选日期',
        closeText: '关闭',
        closeStatus: '不改变当前选择',
        prevText: '<上月',
        prevStatus: '显示上月',
        prevBigText: '<<',
        prevBigStatus: '显示上一年',
        nextText: '下月>',
        nextStatus: '显示下月',
        nextBigText: '>>',
        nextBigStatus: '显示下一年',
        currentText: '今天',
        currentStatus: '显示本月',
        monthNames: ['一月','二月','三月','四月','五月','六月', '七月','八月','九月','十月','十一月','十二月'],
        monthNamesShort: ['一月','二月','三月','四月','五月','六月', '七月','八月','九月','十月','十一月','十二月'],
        monthStatus: '选择月份',
        yearStatus: '选择年份',
        weekHeader: '周',
        weekStatus: '年内周次',
        dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
        dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
        dayNamesMin: ['日','一','二','三','四','五','六'],
        dayStatus: '设置 DD 为一周起始',
        dateStatus: '选择 m月 d日, DD',
        dateFormat: 'yy-mm-dd',
		firstDay: 0,
        initStatus: '请选择日期',
        isRTL: false,
		showMonthAfterYear: true,
		yearSuffix: ''};
    $.datepicker.setDefaults($.datepicker.regional['zh-CN']);
})(jQuery));

$(document).ready(function () {
    $(".datePicker").datepicker({
        numberOfMonths: 1,  //显示两个月
        /*minDate: 0,*/  //从当前日期起可选
		showStatus: true,
		/*设置什么事件触发显示日期插件的面板，可选值：focus, button, both*/
        showOn: "both",
        
        buttonImage: contextPath+"/img/tb_calendar.gif",
        buttonImageOnly: true,
		buttonText: '点击设置日期',
		showAnim: "fadeIn",
		/*是否在当前面板显示上、下两个月的一些日期数*/
		showOtherMonths: true,
		selectOtherMonths: true,
		/* 月份下拉选择 */
		changeMonth: true,
		/* 月份下拉选择 */
		changeYear: true,
		showButtonPanel:false,
		showWeek: false
		
		/*  minDate: +20, maxDate: "+1M +10D",*/


    });
});

(function($) {
	$.date = (function() {
		function strDay(value) {
			switch (parseInt(value)) {
			case 0:
				return "Sunday";
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			default:
				return value;
			}
		}

		function strMonth(value) {
			switch (parseInt(value)) {
			case 1:
				return "Jan";
			case 2:
				return "Feb";
			case 3:
				return "Mar";
			case 4:
				return "Apr";
			case 5:
				return "May";
			case 6:
				return "Jun";
			case 7:
				return "Jul";
			case 8:
				return "Aug";
			case 9:
				return "Sep";
			case 10:
				return "Oct";
			case 11:
				return "Nov";
			case 12:
				return "Dec";
			default:
				return value;
			}
		}

		var parseMonth = function(value) {
			switch (value) {
			case "Jan":
				return "01";
			case "Feb":
				return "02";
			case "Mar":
				return "03";
			case "Apr":
				return "04";
			case "May":
				return "05";
			case "Jun":
				return "06";
			case "Jul":
				return "07";
			case "Aug":
				return "08";
			case "Sep":
				return "09";
			case "Oct":
				return "10";
			case "Nov":
				return "11";
			case "Dec":
				return "12";
			default:
				return value;
			}
		};

		var parseTime = function(value) {
			var retValue = value;
			var millis = "";
			if (retValue.indexOf(".") !== -1) {
				var delimited = retValue.split('.');
				retValue = delimited[0];
				millis = delimited[1];
			}

			var values3 = retValue.split(":");

			if (values3.length === 3) {
				hour = values3[0];
				minute = values3[1];
				second = values3[2];

				return {
					time : retValue,
					hour : hour,
					minute : minute,
					second : second,
					millis : millis
				};
			} else {
				return {
					time : "",
					hour : "",
					minute : "",
					second : "",
					millis : ""
				};
			}
		};

		var regexp = "([0-9]{4})(-([0-9]{2})(-([0-9]{2})" + "(T([0-9]{2}):([0-9]{2})(:([0-9]{2})(\.([0-9]+))?)?" + "(Z|(([-+])([0-9]{2}):?([0-9]{2})))?)?)?)?";

		var setISO8601 = function(string) {
			var d = string.match(new RegExp(regexp));

			var offset = 0;
			var date = new Date(d[1], 0, 1);

			if (d[3]) {
				date.setMonth(d[3] - 1);
			}
			if (d[5]) {
				date.setDate(d[5]);
			}
			if (d[7]) {
				date.setHours(d[7]);
			}
			if (d[8]) {
				date.setMinutes(d[8]);
			}
			if (d[10]) {
				date.setSeconds(d[10]);
			}
			if (d[12]) {
				date.setMilliseconds(Number("0." + d[12]) * 1000);
			}
			if (d[14]) {
				offset = (Number(d[16]) * 60) + Number(d[17]);
				offset *= ((d[15] == '-') ? 1 : -1);
			}

			offset -= 0;//不算时区 date.getTimezoneOffset();
			var time = (Number(date) + (offset * 60 * 1000));
			date.setTime(Number(time));
			return date;
		};
		return {
			format : function(value, format) {
				if (value == null) {
					return '';
				}
				// value = new java.util.Date()
				// 2009-12-18 10:54:50.546
				try {
					var date = null;
					var year = null;
					var month = null;
					var dayOfMonth = null;
					var dayOfWeek = null;
					var time = null; // json, time, hour, minute, second
					if (typeof value.getFullYear === "function") {
						year = value.getFullYear();
						month = value.getMonth() + 1;
						dayOfMonth = value.getDate();
						dayOfWeek = value.getDay();
						time = parseTime(value.toTimeString());
					} else if (value.search(regexp) != -1) { // 2009-04-19T16:11:05+02:00
						var iso = setISO8601(value);
						year = iso.getFullYear();
						month = iso.getMonth() + 1;
						dayOfMonth = iso.getDate();
						dayOfWeek = iso.getDay();
						time = parseTime(iso.toTimeString());
					} else {
						var values = value.split(" ");
						switch (values.length) {
						case 6:
							// Wed Jan 13 10:43:41 CET 2010
							year = values[5];
							month = parseMonth(values[1]);
							dayOfMonth = values[2];
							time = parseTime(values[3]);
							date = new Date(year, month - 1, dayOfMonth);
							dayOfWeek = date.getDay();
							break;
						case 2:
							// 2009-12-18 10:54:50.546
							var values2 = values[0].split("-");
							year = values2[0];
							month = values2[1];
							dayOfMonth = values2[2];
							time = parseTime(values[1]);
							date = new Date(year, month - 1, dayOfMonth);
							dayOfWeek = date.getDay();
							break;
						case 7:
							// Tue Mar 01 2011 12:01:42 GMT-0800 (PST)
						case 9:
							// added by Larry, for Fri Apr 08 2011 00:00:00
							// GMT+0800 (China Standard Time)
						case 10:
							// added by Larry, for Fri Apr 08 2011 00:00:00
							// GMT+0200 (W. Europe Daylight Time)
							year = values[3];
							month = parseMonth(values[1]);
							dayOfMonth = values[2];
							time = parseTime(values[4]);
							date = new Date(year, month - 1, dayOfMonth);
							dayOfWeek = date.getDay();
							break;
						/*
						 * case 7: // Tue Mar 01 2011 12:01:42 GMT-0800 (PST)
						 * year = values[3]; month = parseMonth(values[1]);
						 * dayOfMonth = values[2]; time = parseTime(values[4]);
						 * break;
						 */
						default:
							return value;
						}
					}

					var pattern = "";
					var retValue = "";
					// Issue 1 - variable scope issue in format.date
					// Thanks jakemonO
					for ( var i = 0; i < format.length; i++) {
						var currentPattern = format.charAt(i);
						pattern += currentPattern;
						switch (pattern) {
						case "ddd":
							retValue += strDay(dayOfWeek);
							pattern = "";
							break;
						case "dd":
							if (format.charAt(i + 1) == "d") {
								break;
							}
							if (String(dayOfMonth).length === 1) {
								dayOfMonth = '0' + dayOfMonth;
							}
							retValue += dayOfMonth;
							pattern = "";
							break;
						case "MMM":
							retValue += strMonth(month);
							pattern = "";
							break;
						case "MM":
							if (format.charAt(i + 1) == "M") {
								break;
							}
							if (String(month).length === 1) {
								month = '0' + month;
							}
							retValue += month;
							pattern = "";
							break;
						case "yyyy":
							retValue += year;
							pattern = "";
							break;
						case "HH":
							retValue += time.hour;
							pattern = "";
							break;
						case "hh":
							// time.hour is "00" as string == is used instead of
							// ===
							retValue += (time.hour == 0 ? 12 : time.hour < 13 ? time.hour : time.hour - 12);
							pattern = "";
							break;
						case "mm":
							retValue += time.minute;
							pattern = "";
							break;
						case "ss":
							// ensure only seconds are added to the return
							// string
							retValue += time.second.substring(0, 2);
							pattern = "";
							break;
						// case "tz":
						// //parse out the timezone information
						// retValue += time.second.substring(3,
						// time.second.length);
						// pattern = "";
						// break;
						case "SSS":
							retValue += time.millis.substring(0, 3);
							pattern = "";
							break;
						case "a":
							retValue += time.hour >= 12 ? "PM" : "AM";
							pattern = "";
							break;
						case " ":
							retValue += currentPattern;
							pattern = "";
							break;
						case "/":
							retValue += currentPattern;
							pattern = "";
							break;
						case ":":
							retValue += currentPattern;
							pattern = "";
							break;
						default:
							if (pattern.length === 2 && pattern.indexOf("y") !== 0 && pattern != "SS") {
								retValue += pattern.substring(0, 1);
								pattern = pattern.substring(1, 2);
							} else if ((pattern.length === 3 && pattern.indexOf("yyy") === -1)) {
								pattern = "";
							}
							else if (i == format.length-1)
							{
								retValue += pattern.substring(0, 1);
							}
						}
					}
					return retValue;
				} catch (e) {
					return value;
				}
			}
		};
	}());
	$.string = (function() {
		return {
			format : function(str) {
			if(null === str) return '';
		    var args = arguments, re = new RegExp("%([1-" + args.length + "])", "g");
		    return String(str).replace(
		    re,
		    function($1, $2) {
		        return args[$2];
		    }
		    );
		}
		};
		
	}());
}(jQuery));

function resizeDefault_Container(id){
	
	var container = $('#'+id);
	
	container.css("min-height",(document.documentElement.clientHeight-105));
	if((document.documentElement.clientHeight-105)>container.height())
	{
		// IE8
		container.height(document.documentElement.clientHeight-105);
	}
	
};
function jQueryErrorMessage(jqXHR, textStatus, exception) {
	
	var message = '系统错误，请与管理员联系';
	var statusErrorMap = {
		//'400' : "jqXHR.400",//"Server understood the request but request content was invalid.",
		//'401' : "jqXHR.401",//"Unauthorised access.",
		'403' : "您没有数据访问权限",//"Forbidden resouce can't be accessed",
		'404' : "系统错误，请与管理员联系",//"Forbidden resouce can't be accessed",
		'500' : "系统错误，请与管理员联系",//"Internal Server Error.",
		'503' : "系统错误，请与管理员联系" //"Service Unavailable"
	};

	if (jqXHR.status === 0) {
		message = "系统繁忙，请稍后再试";//"jqXHR.timeout";
	} else if (jqXHR.status) {
		message = statusErrorMap[jqXHR.status];
	}
	if(!message){
		if (textStatus == 'parsererror') {
			message =  "系统错误，请与管理员联系";//"jqXHR.parsererror";// "Error.\nParsing JSON Request failed.";
		} else if (textStatus == 'timeout') {
			message = "系统繁忙，请稍后再试";//"jqXHR.timeout"; // "Request Time out.";
		} else if (textStatus == 'abort') {
			message =  "系统错误，请与管理员联系";//"jqXHR.abort";//"Request was aborted by the server";
		}
		else if (textStatus == 'error') {
			message =  "系统错误，请与管理员联系";//"jqXHR.abort";//"Request was aborted by the server";
		}
		else
		{
			message = '系统错误，请与管理员联系';
		}
		
	}
	
	return message;
};

function setImgAutoSize(img){ 
	
	
	if(img != null)
	{

	 	var MaxWidth=195;   //设置图片宽度界限 
	    var MaxHeight=300;    //设置图片高度界限 
	    
	    if(document.body.clientWidth>1200)
		{
			MaxWidth=395;   //设置图片宽度界限 
	    	MaxHeight=450;
		}
	
	    try
	    {
	    	var width =img.offsetWidth;
		    var height = img.offsetHeight;
		    var bili = width/height;
		    var A=MaxWidth/width;
		    var B=MaxHeight/height;
		
		    if(A<1||B<1)
		    {
		        if(A<B)
		        {
		       
		            img.width=MaxWidth;
		            img.height=MaxWidth/bili;
		        }
		        if(A>B)
		        {
		        
		            img.width=MaxHeight*bili;
		            img.height=MaxHeight;
		        }
		    }
	    }
	    catch(e)
	    {
	    	alert(e);
	    }
		
	}
};

function setPostURL(button, formId){
	if(formId == '' || formId == null)
		formId = "form";
	$("#"+formId).prop("action", button.value);
}