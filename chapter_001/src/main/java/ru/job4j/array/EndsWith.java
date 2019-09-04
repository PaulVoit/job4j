package ru.job4j.array;

public class EndsWith {
	public boolean endsWith(String word, String post) {
		boolean result = true;
		char[] pst = post.toCharArray();
		char[] wrd = word.toCharArray();
		int max1 = pst.length - 1;
		int max2 = wrd.length - 1;
		for (int i = 0; i < max1 + 1; i++) {
			if (pst[i] == wrd[max2 - max1 + i]) {
				continue;
			} else result = false;
			break;
		}
		return result;
	}

}