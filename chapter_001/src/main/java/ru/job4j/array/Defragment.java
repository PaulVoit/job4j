package ru.job4j.array;

public class Defragment {
	public static String[] compress(String[] array) {
		for (int index = 0; index < array.length; index++) {
			String cell = array[index];
			if (cell == null) {
				int j = index + 1;
				while (j < array.length && array[j] == null)
					j++;
				if (j < array.length) {
					array[index] = array[j];
					array[j] = null;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
		String[] compressed = compress(input);
		System.out.println();
		for (int index = 0; index < compressed.length; index++) {
			System.out.print(compressed[index] + " ");
		}
	}
}

