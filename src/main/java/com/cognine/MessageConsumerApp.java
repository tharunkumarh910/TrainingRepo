package com.cognine;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cognine.config.AppConfig;
import com.cognine.receiver.MessageReceiver;

public class MessageConsumerApp 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MessageReceiver messageReceiver = (MessageReceiver) context.getBean(MessageReceiver.class);
		String response = messageReceiver.receiveMessage();
		System.out.println("Messgae Received = " + response);

		((AbstractApplicationContext) context).close();
	}
}
