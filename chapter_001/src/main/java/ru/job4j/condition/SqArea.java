package ru.job4j.condition;

public class SqArea {
	public static int square(int p, int k) {
		int h = p / (2 * (k + 1));
		return (int) (k * Math.pow(h, 2));
	}

	public static void main(String[] args) {
		int result1 = square(6, 2);
		System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
	}


}
