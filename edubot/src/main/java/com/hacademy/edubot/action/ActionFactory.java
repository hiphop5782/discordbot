package com.hacademy.edubot.action;

public class ActionFactory {
	public static DiscordAction create(String[] payloads) {
		String cmd = payloads[0];
		
		if(!cmd.startsWith("$")) {
			throw new IllegalArgumentException("not support command type");
		}
		
		switch(cmd) {
		case "$동기부여": return new MotivationAction();
		case "$도움말": return new HelpAction();
		case "$링크": return new LinkAction();
		case "$화이팅": return new FightingAction();
		default: return new OtherAction();
		}
		
	}
}
