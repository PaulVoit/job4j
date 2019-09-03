package ru.job4j.array;

public class MatrixCheck {
	public boolean mono(boolean[][] data) {
		boolean result = true;
		int max = data.length - 1;
		for (int i = 0; i < max; i++) {
			if ((data[i][i] != data[i + 1][i + 1]) || (data[max - i][i] != data[i][max - i])) {
				result = false;
				break;
			}
		}
		return result;
	}
}