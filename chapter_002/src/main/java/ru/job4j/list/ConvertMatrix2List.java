package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
	public List<Integer> toList(int[][] array) {
		List<Integer> list = new ArrayList<>();
		for (int[] row : array) {
			for (int j = 0; j < array.length; j++) {
				list.add(row[j]);
			}
		}
		return list;
	}
}