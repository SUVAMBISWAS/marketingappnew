package com.Marketing.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {
	@Autowired
	JavaMailSender mailsender;

	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mailmessage= new SimpleMailMessage();
		mailmessage.setTo(to);
		mailmessage.setSubject(subject);
		mailmessage.setText(message);
		mailsender.send(mailmessage);

	}

}
