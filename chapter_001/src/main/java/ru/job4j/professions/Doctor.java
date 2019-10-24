package ru.job4j.professions;

public class Doctor extends Profession {

	private int numberOfpatients;


	public Doctor(String name, int age, int numberOfpatients) {
		super(name, age);
		this.numberOfpatients = numberOfpatients;

	}

	public int getNumberOfpatients() {
		return numberOfpatients;
	}



}
