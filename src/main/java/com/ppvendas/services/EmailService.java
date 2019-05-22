package com.ppvendas.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.ppvendas.domain.Cliente;
import com.ppvendas.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	
	//Auteração
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	//Auteração
	void sendHtmlEmail(MimeMessage msg);
	
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
