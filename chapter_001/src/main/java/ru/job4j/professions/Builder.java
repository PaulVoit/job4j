package ru.job4j.professions;

public class Builder extends Engineer {

	private String brickType;

	private int hammers;

	public Builder(String name, int age, int hammers, String brickType) {
		super(name, age);
		this.brickType = brickType;
		this.hammers = hammers;
	}

	public String getBrickType() {
		return brickType;
	}

	public int getHammers() {
		return hammers;
	}

	public void build(double amountOfMaterial){

	}
}
