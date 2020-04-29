package com.cappuchino.services;

import org.springframework.mail.SimpleMailMessage;

import com.cappuchino.domain.Cliente;
import com.cappuchino.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
