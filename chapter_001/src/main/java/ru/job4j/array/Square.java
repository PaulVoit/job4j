package ru.job4j.array;

public class Square {

	public int[] calculate(int bound) {
		int[] rst = new int[bound];
		for (int i = 0; i <= bound - 1; i++) {
			rst[i] = (i + 1) * (i + 1);
		}
		return rst;
	}
}
