package com.hacademy.edubot.parser;

public class MarkdownMaker {

	private StringBuffer buffer;

	public MarkdownMaker() {
		buffer = new StringBuffer();
	}

	public void startBlock() {
		endBlock();
	}

	public void endBlock() {
		addLine("```");
	}

	public void startCssBlock() {
		addLine("```css");
	}

	public void endCssBlock() {
		endBlock();
	}

	public void startCsBlock() {
		addLine("```cs");
	}

	public void endCsBlock() {
		endBlock();
	}

	public void add(String str) {
		buffer.append(str);
	}

	public void add(String... str) {
		for (String s : str) {
			add(s);
			addSpace();
		}
		nextLine();
	}

	public void addLine(String str) {
		add(str);
		nextLine();
	}

	public void nextLine() {
		buffer.append('\n');
	}

	@Override
	public String toString() {
		return buffer.toString();
	}

	public void addQuote(String... str) {
		add("> ");
		for (String s : str) {
			add(s);
			addSpace();
		}
		nextLine();
	}

	public void addSpace() {
		addSpace(1);
	}

	public void addSpace(int size) {
		for (int i = 0; i < size; i++) {
			add(" ");
		}
	}

	public void addHighlightValue(Object... objs) {
		add("[");
		for (Object o : objs) {
			add(String.valueOf(o));
		}
		add("]");
	}

	public void addNormalValue(Object... objs) {
		add("(");
		for (Object o : objs) {
			add(String.valueOf(o));
		}
		add(")");
	}

	public boolean hasText() {
		return !isEmpty();
	}

	public boolean isEmpty() {
		return buffer.length() == 0;
	}

}