package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Departments {
	public static List<String> fillGaps(List<String> deps) {
		HashSet<String> tmp = new HashSet<>();
		for (String value : deps) {
			String start = "";
			for (String el : value.split("/")) {
				if (start == "") {
					tmp.add(el);
					start = start + el;
				} else {
					tmp.add(start + "/" + el);
					start = start + "/" + el;
				}
			}
		}
		ArrayList<String> rsl = new ArrayList<>(tmp);
		rsl.sort(new DepDescComp());
		return rsl;
	}
}
