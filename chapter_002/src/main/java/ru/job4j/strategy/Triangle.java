package ru.job4j.strategy;

public class Triangle implements Shape {
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("    0").append(sep);
		pic.append("   0 0").append(sep);
		pic.append("  0   0").append(sep);
		pic.append(" 0     0").append(sep);
		pic.append("000000000");
		return pic.toString();
	}
}
