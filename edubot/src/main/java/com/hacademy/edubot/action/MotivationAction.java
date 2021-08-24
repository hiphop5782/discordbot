package com.hacademy.edubot.action;

import com.hacademy.edubot.entity.Proverb;
import com.hacademy.edubot.parser.MarkdownMaker;
import com.hacademy.edubot.util.ProverbMaker;

public class MotivationAction implements DiscordAction{
	@Override
	public String process(String[] payloads) {
		MarkdownMaker maker = new MarkdownMaker();
		System.out.println("before");
		Proverb proverb = ProverbMaker.generate();
		System.out.println("after");
		maker.addQuote(proverb.getWho());
		maker.startCssBlock();
		maker.addLine(proverb.getContent());
		maker.endCssBlock();
		
		return maker.toString();
	}
}
