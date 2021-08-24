package com.hacademy.edubot.action;

import com.hacademy.edubot.parser.MarkdownMaker;

public class OtherAction implements DiscordAction{
	@Override
	public String process(String[] payloads) {
		MarkdownMaker maker = new MarkdownMaker();
		
		maker.addLine("지원하지 않는 명령입니다");
		maker.addLine("다음 명령을 이용해 사용 가능한 명령을 확인해보세요");
		maker.startBlock();
		maker.addLine("$도움말");
		maker.endBlock();
		
		return maker.toString();
	}
}
