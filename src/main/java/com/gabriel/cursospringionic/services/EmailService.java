package com.gabriel.cursospringionic.services;

import org.springframework.mail.SimpleMailMessage;

import com.gabriel.cursospringionic.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
