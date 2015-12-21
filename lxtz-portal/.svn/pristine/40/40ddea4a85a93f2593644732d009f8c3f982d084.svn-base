package cn.dosy.platform.config.utils;

import java.util.HashSet;
import java.util.Set;

import javax.mail.MessagingException;

import cn.dosy.platform.config.domain.SimpleEmail;

/**
 * <p>
 * 邮件工具类
 * </p>
 * 
 * <p>
 * Copyright: 2014 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2014年12月08日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2014年12月08日；
 */
public class JavaMailUtil {
	
	/**
	 * 发送单个邮件
	 * 
	 * @param title 
	 * 				邮件标题
	 * @param content 
	 * 				邮件内容
	 * @param from
	 * 				邮件接收账号
	 * @exception MessagingException
	 * 				邮件参数设置异常
	 * */
	public static void setHtmlMail(String title, String content, String from) {
		System.out.println("准备发送邮件。。。。。。");

		SimpleEmail email = new SimpleEmail();
		email.setValidate(true);
		email.setHostName("smtp.163.com");
		email.setAuthentication("lgm361809884", "ming158203448822"); // 用户名和密码

		try {
			Set<String> str = new HashSet<String>(); 
			str.add(from);
			email.setTos(str);// 接收方
			email.setFrom("lgm361809884@163.com"); // 发送方
			email.setSubject(title); // 标题
			email.setMsg(content); // 内容
			email.sendHtml();
		} catch (MessagingException e) {
			System.out.println("!!!---" + "邮箱设置出问题" + "---!!!");
			e.printStackTrace();
		}
	} 
	
	/**
	 * 群发邮件
	 * 
	 * @param title 
	 * 				邮件标题
	 * @param content 
	 * 				邮件内容
	 * @param from
	 * 				邮件接收账号
	 * @exception MessagingException
	 * 				邮件参数设置异常
	 * */
	public static void setHtmlMail(String title, String content, Set<String> from) {
		System.out.println("准备发送邮件。。。。。。");

		SimpleEmail email = new SimpleEmail();
		email.setValidate(true);
		email.setHostName("smtp.163.com");
		email.setAuthentication("lgm361809884", "ming158203448822"); // 用户名和密码

		try {
			email.setTos(from); // 接收方
			email.setFrom("lgm361809884@163.com"); // 发送方
			email.setSubject(title); // 标题
			email.setMsg(content); // 内容
			email.sendHtml();
		} catch (MessagingException e) {
			System.out.println("!!!---" + "邮箱设置出问题" + "---!!!");
			e.printStackTrace();
		}
	} 
	
	public static void main(String[] args) {
		
		//send check mail
		String title = "朗鑫门户用户激活";
		String content = "<div style=\"background-color: #d0d0d0;padding: 40px;text-align: center;width=100%;\">" + 
								"<div style=\"padding:30px;background-color: #ffffff;width:500px;margin: 0 auto;text-align: left;line-height: 1.5;word-wrap: break-word;word-break: break-all;-webkit-border-radius: 10px;-moz-border-radius: 10px;border-radius: 10px;\">" +  
									"您好!<br/><br/>" + 
				"感谢你注册微信公众平台。 <br/>" + 
				"你的登录邮箱为：%s。请点击以下链接激活帐号：<br/><br/>" + 
				"https://mp.weixin.qq.com/cgi-bin/activateemail?email=MzYxODA5ODg0QHFxLmNvbQ%3D%3D&ticket=655940d150d9e7babbd03e49124e3befa598eda0 <br/>" + 
				"如果以上链接无法点击，请将上面的地址复制到你的浏览器(如IE)的地址栏进入微信公众平台。 （该链接在48小时内有效，48小时后需要重新注册）<br/><br/> " +
				"此邮件为系统所发，请勿直接回复。 <br/><br/> " +
				"<div style=\"text-align: right;\">Thanks,<br/>朗鑫门户</div></div></div>";
		
		
		
		setHtmlMail(title, content, "361809884@qq.com");
		
		//System.out.println(String.format(content, "361809884@qq.com"));
		
	}

}
