package ru.job4j.array;

public class MatrixCheck {
	public boolean mono(boolean[][] data) {
		boolean result = false;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[i][j] == data[i + 1][j + 1]) {
					if (data[i][data.length - 1] == data[i + 1][j + 1]) {
						if (data[data.length - 1][j] == data[i + 1][j + 1])
							if(data[data.length - 1][data.length - 1] == data[i + 1][j + 1])
							result = true;
						break;
					}
				}
			}
		}

		return result;
	}
}