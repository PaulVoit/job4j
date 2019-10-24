package ru.job4j.professions;

public class Dentist extends Doctor {

	private String teethType;

	public Dentist(String name, int age, int numberOfpatients, String teethType) {
		super(name, age, numberOfpatients);
		this.teethType = teethType;
	}

	public String getTeethType() {
		return teethType;
	}

	public void makeTooth() {

	}

}
