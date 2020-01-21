package ru.job4j.stream;

import java.util.Objects;

public class Student {
	private int score;
	private String name;

	public Student(int score) {
		this.score = score;
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student{"
				+ "score=" + score
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student = (Student) o;
		return score == student.score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(score);
	}
}
