package cn.dosy.platform.config.utils;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import cn.dosy.platform.config.domain.SimpleSms;

/**
 * <p>
 * 短信工具类
 * </p>
 * 
 * <p>
 * Copyright: 2015 . All rights reserved.
 * </p>
 * <p>
 * Company: dosy
 * </p>
 * <p>
 * CreateDate:2015年01月08日
 * </p>
 * 
 * @author MM
 * @history 创建文档；Mender:MM；Date:2015年01月08日；
 */
public class SmsUtil {

	private static String SUBMIT = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	
	private static String NUM = "http://106.ihuyi.cn/webservice/sms.php?method=GetNum";
	
	public static SimpleSms getSubmit(String content, String phone) {
		SimpleSms sms = new SimpleSms();
		
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(SUBMIT); 
			
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

	//	int mobile_code = (int)((Math.random()*9+1)*100000);
		
	//    String content1 = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。"); 

		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", "cf_xinji"), 
			    new NameValuePair("password", "xinji0810"), //密码可以使用明文密码或使用32位MD5加密
			    new NameValuePair("mobile", phone), 
			    new NameValuePair("content", content),
		};
		
		method.setRequestBody(data);		
		
		try {
			client.executeMethod(method);	
			
			String SubmitResult =method.getResponseBodyAsString();

			Document doc = DocumentHelper.parseText(SubmitResult); 
			Element root = doc.getRootElement();

			String code = root.elementText("code");	
			String msg = root.elementText("msg");	
			String smsid = root.elementText("smsid");	
			
			System.out.println(code);
			System.out.println(msg);
			System.out.println(smsid);
						
			sms.setCode(code);
			sms.setMsg(msg);
			sms.setSmsid(smsid);
			
			if("2".equals(code)){
				System.out.println("短信提交成功");
			}
			
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}	
		return sms;
	}
	
	public static SimpleSms getNum() {
		SimpleSms sms = new SimpleSms();
		
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(NUM); 
			
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");

		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", "cf_xinji"), 
			    new NameValuePair("password", "xinji0810"), //密码可以使用明文密码或使用32位MD5加密
		};
		
		method.setRequestBody(data);		
		
		try {
			client.executeMethod(method);	
			
			String SubmitResult =method.getResponseBodyAsString();

			Document doc = DocumentHelper.parseText(SubmitResult); 
			Element root = doc.getRootElement();

			String code = root.elementText("code");	
			String msg = root.elementText("msg");	
			String num = root.elementText("num");	
			
			System.out.println(code);
			System.out.println(msg);
			System.out.println(num);
			
			sms.setCode(code);
			sms.setMsg(msg);
			sms.setNum(num);
						
			if("2".equals(code)){
				System.out.println("查询成功");
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}	
		return sms;
	}
	
	public static void main(String[] args) {
		//getNum();
		//getSubmit("金柳师兄，你能收到我短信吗？你回复我没用的。。。");
	}
	
}
