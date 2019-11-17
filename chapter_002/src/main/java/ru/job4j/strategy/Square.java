package ru.job4j.strategy;

public class Square implements Shape {
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("_______").append(sep);
		pic.append("|     |").append(sep);
		pic.append("|     |").append(sep);
		pic.append("_______").append(sep);
		return pic.toString();
	}
}

