package cn.dosy.platform.config.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * <p>
 * 邮件
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
public class SimpleEmail {
	
	private String hostName;

	private String port = "25";

	private Authenticator authenticator;

	private boolean isValidate;

	private String from;

	private Set<String> tos;

	private String subject;

	private String msg;
	
	public void send() throws MessagingException {
		for (String to : tos) {
			Properties pro = getProperties();
			Session sendMailSession = Session.getInstance(pro,
					authenticator);

			Message mailMessage = new MimeMessage(sendMailSession);
			Address fromAddress = new InternetAddress(this.from);
			mailMessage.setFrom(fromAddress);
			Address toAddress = new InternetAddress(to);
			mailMessage.setRecipient(Message.RecipientType.TO, toAddress);
			mailMessage.setSubject(this.subject);
			mailMessage.setSentDate(new Date());
			mailMessage.setText(this.msg);
			Transport.send(mailMessage);
		}
	}
	
	public void sendHtml() throws MessagingException {
		for (String to : tos) {
			Properties pro = getProperties();
			Session sendMailSession = Session.getInstance(pro,
					authenticator);

			Message mailMessage = new MimeMessage(sendMailSession);
			Address fromAddress = new InternetAddress(this.from);
			mailMessage.setFrom(fromAddress);
			Address toAddress = new InternetAddress(to);
			mailMessage.setRecipient(Message.RecipientType.TO, toAddress);
			mailMessage.setSubject(this.subject);
			mailMessage.setSentDate(new Date());
			Multipart mainPart = new MimeMultipart(); 
			BodyPart html = new MimeBodyPart();
			html.setContent(this.msg, "text/html; charset=utf-8");    
		    mainPart.addBodyPart(html);
		    mailMessage.setContent(mainPart); 
			Transport.send(mailMessage);
		}
	}

	private Properties getProperties() {
		Properties p = new Properties();
		p.put("mail.smtp.host", this.hostName);
		p.put("mail.smtp.port", this.port);
		p.put("mail.smtp.auth", this.isValidate ? "true" : "false");
		return p;
	}
	
	public void setAuthentication(String userName, String password) {
		if (this.isValidate) {
			this.authenticator = new MyAuthenticator(userName, password);
		}
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Authenticator getAuthenticator() {
		return authenticator;
	}

	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}

	public boolean isValidate() {
		return isValidate;
	}

	public void setValidate(boolean isValidate) {
		this.isValidate = isValidate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Set<String> getTos() {
		if (tos == null) {
			tos = new HashSet<String>();
		}
		return tos;
	}

	public void setTos(Set<String> tos) {
		this.tos = tos;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	class MyAuthenticator extends Authenticator {
		String userName = null;
		String password = null;

		public MyAuthenticator() {
			//
		}

		public MyAuthenticator(String username, String password) {
			this.userName = username;
			this.password = password;
		}

		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(userName, password);
		}
	}
	

}
