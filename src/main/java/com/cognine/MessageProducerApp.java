package com.cognine;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cognine.config.AppConfig;
import com.cognine.sender.MessageSender;

public class MessageProducerApp {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageSender messageSender = context.getBean(MessageSender.class);

		messageSender.sendMessage("Hi Tharun, How are you?");
		System.out.println("Message has been sent successfully...");

		((AbstractApplicationContext) context).close();
	}
}
