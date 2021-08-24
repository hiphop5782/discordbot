package com.hacademy.edubot.action;

import com.hacademy.edubot.parser.MarkdownMaker;

public class FightingAction implements DiscordAction {

	@Override
	public String process(String[] payloads) {
		MarkdownMaker maker = new MarkdownMaker();
		
		maker.addQuote("과정평가형 수강생 여러분");
		maker.addQuote();
		maker.addQuote("자격증 취득하고 취업하는 그날까지");
		maker.addQuote("오늘 하루도 화이팅입니다~!");
		maker.addQuote("-by 황인빈 강사");
		
		return maker.toString();
	}

}
