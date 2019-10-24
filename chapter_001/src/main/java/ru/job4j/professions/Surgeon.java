package ru.job4j.professions;

public class Surgeon extends Doctor {

	private int operations;

	public Surgeon(String name, int age, int numberOfpatients, int operations) {
		super(name, age, numberOfpatients);
		this.operations = operations;
	}

	public int getOperations() {
		return operations;
	}

	public boolean makesSuccessOperation(){
		return false;
	}

}
