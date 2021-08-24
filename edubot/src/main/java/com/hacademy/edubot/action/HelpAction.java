package com.hacademy.edubot.action;

import com.hacademy.edubot.parser.MarkdownMaker;

public class HelpAction implements DiscordAction{
	@Override
	public String process(String[] payloads) {
		MarkdownMaker maker = new MarkdownMaker();
		maker.startCssBlock();
		
		maker.addLine("H'academy Edubot 명령어");
		
		maker.addHighlightValue("$동기부여");
		maker.addSpace(3);
		maker.addLine("동기 부여를 위한 명언을 조회합니다");
		
		maker.addHighlightValue("$링크");
		maker.addSpace(7);
		maker.addLine("수업에 도움이 되는 링크를 조회합니다");
		
		maker.addHighlightValue("$화이팅");
		maker.addSpace(5);
		maker.addLine("???");
		
		maker.endCssBlock();
		maker.addLine("필요한 명령은 강사에게 문의 바랍니다");
		
		return maker.toString();
	}
}
