package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
	public List<Student> collect(List<Student> students, Predicate<Student> predict) {
		return students.stream().filter(predict).collect(Collectors.toList());
	}


	public Map<String, Student> listToMap(List<Student> students) {
		return students.stream().collect(Collectors.toMap(x -> x.getName(), x -> x));
	}

	public List<Student> levelOf(List<Student> students, int bound) {
		return students.stream()
				.flatMap(Stream::ofNullable)
				.sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore()))
				.takeWhile(stud -> stud.getScore() > bound)
				.collect(Collectors.toList());
	}
}
