package ru.job4j.professions;

public class Profession {
	private String name;
	private int age;

	public Profession(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
