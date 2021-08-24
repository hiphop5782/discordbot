package com.hacademy.edubot.parser;

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
		
		String cmd = payloads[0];
		
		if(!cmd.startsWith("$")) {
			throw new IllegalArgumentException("not support command type");
		}
		
		MarkdownMaker maker = new MarkdownMaker();
		
		if(cmd.equals("$동기부여")) {
			Proverb proverb = ProverbMaker.generate();
			maker.addQuote(proverb.getWho());
			maker.startCssBlock();
			maker.addLine(proverb.getContent());
			maker.endCssBlock();
		}
		else if(cmd.equals("$도움말")) {
			maker.startCssBlock();
			maker.addLine("H'academy Edubot 명령어");
			maker.addHighlightValue("$동기부여");
			maker.addSpace(3);
			maker.addLine("동기 부여를 위한 명언을 조회합니다");
			maker.endCssBlock();
			maker.addLine("필요한 명령은 강사에게 문의 바랍니다");
		}
		else {
			maker.addLine("지원하지 않는 명령입니다");
			maker.addLine("다음 명령을 이용해 사용 가능한 명령을 확인해보세요");
			maker.startBlock();
			maker.addLine("$도움말");
			maker.endBlock();
		}
		
		return maker.getString();
	}
}
