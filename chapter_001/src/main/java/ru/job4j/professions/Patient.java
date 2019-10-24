package ru.job4j.professions;

public class Patient {

	private int age;

	private String sex;

	public Patient(int age, String sex) {
		this.age = age;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
}
