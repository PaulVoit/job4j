package ru.job4j.professions;

public class Programmer extends Engineer {

	private int commits;

	public Programmer(String name, int age, int commits) {
		super(name, age);
		this.commits = commits;
	}

	public int getCommits() {
		return commits;
	}

}
