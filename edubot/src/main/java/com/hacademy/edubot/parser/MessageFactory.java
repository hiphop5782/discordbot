package com.hacademy.edubot.parser;

import com.hacademy.edubot.action.ActionFactory;
import com.hacademy.edubot.action.DiscordAction;
import com.hacademy.edubot.entity.Proverb;
import com.hacademy.edubot.util.ProverbMaker;

import discord4j.core.object.entity.Message;

public class MessageFactory {
	public static String createMessage(Message message) {
		if(message == null) 
			throw new IllegalArgumentException("message is emtpy");
		
		String[] payloads = message.getContent().toLowerCase().split("\\s");
		if(payloads == null || payloads.length == 0) 
			throw new IllegalArgumentException("payload is empty");

		DiscordAction action = ActionFactory.create(payloads);
		System.out.println(action);
		System.out.println(action.process(payloads));
		return action.process(payloads);
	}
}
