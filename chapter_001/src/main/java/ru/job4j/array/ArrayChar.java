package ru.job4j.array;

public class ArrayChar {
	public boolean startsWith(String word, String prefix) {
		boolean result = true;
		char[] pref = prefix.toCharArray();
		char[] wrd = word.toCharArray();
		for (int i = 0; i < pref.length; i++) {
			if (pref[i] == wrd[i]) {
				continue;
			} else result = false;
			break;
		}
		return result;
	}
}
