package ru.job4j.array;

public class EndsWith {
	public boolean endsWith(String word, String post) {
		boolean result = true;
		char[] pst = post.toCharArray();
		char[] wrd = word.toCharArray();
		String pst1 = new String(pst);
		String wrd1 = new String(wrd);
		return wrd1.endsWith(pst1);
	}
}
