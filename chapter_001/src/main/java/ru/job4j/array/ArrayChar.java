package ru.job4j.array;

public class ArrayChar {
	public boolean startsWith(String word, String prefix) {
		boolean result = true;
		char[] pref = prefix.toCharArray();
		String pref1 = new String(pref);
		char[] wrd = word.toCharArray();
		String wrd1 = new String(wrd);
		return wrd1.startsWith(pref1);

	}
}
