package com.hacademy.edubot.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hacademy.edubot.App;
import com.hacademy.edubot.entity.Proverb;

public class ProverbMaker {
	private static List<Proverb> list;
	static {
		try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream in = App.class.getResourceAsStream("/proverb.json");
			list = mapper.readValue(in, new TypeReference<List<Proverb>>() {});
		}
		catch(Exception e) {
			list = new ArrayList<Proverb>();
		}
//		list.add(Proverb.builder().who("").content("").build());
	}
	
	public static Proverb generate() {
		int index = (int)(Math.random() * list.size());
		return list.get(index);
	}
}
