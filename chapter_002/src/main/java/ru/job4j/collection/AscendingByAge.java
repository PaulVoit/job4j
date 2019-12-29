package ru.job4j.collection;

import java.util.Comparator;

public class AscendingByAge implements Comparator<User> {
	@Override
	public int compare(User o2, User o1) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}
}
