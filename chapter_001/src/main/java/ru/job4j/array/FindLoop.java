package ru.job4j.array;

public class FindLoop {
	public int indexOf(int[] data, int el) {
		int rst = -1;
		boolean isInArray = false;
		for (int index = 0; index < data.length; index++) {
			if (data[index] == el) {
				rst = index;
				break;
			}
		}
		return rst;
	}
}
