package com.hacademy.edubot.action;

import com.hacademy.edubot.parser.MarkdownMaker;

public class LinkAction implements DiscordAction{
	@Override
	public String process(String[] payloads) {
		MarkdownMaker maker = new MarkdownMaker();
		
		maker.addQuote("Zoom 강의장");
		maker.addLine("https://us06web.zoom.us/j/9772158310?pwd=Q2EwVHlCT2NhSmtOV1FLNVVETkRmQT09");
		maker.startBlock();
		maker.addLine("회의 ID: 977 215 8310");
		maker.addLine("암호: 123456");
		maker.endBlock();
		
		maker.addQuote("학원");
		maker.addLine("KH 정보교육원 : https://iei.or.kr/main/main.kh");
		maker.addLine("영상 다시보기 : https://www.iei.or.kr/login/mediaBoard.kh");
		maker.nextLine();
		
		maker.addQuote("수업 자료");
		maker.addLine("Github : https://github.com/hiphop5782/kh8");
		maker.addLine("Gitbook : http://docs.sysout.co.kr");
		maker.addLine("홈페이지 : http://www.sysout.co.kr");
		maker.nextLine();
		
		maker.addQuote("기타 사이트 정보");
		maker.addLine("http://www.sysout.co.kr");
		
		return maker.toString();
	}
}
