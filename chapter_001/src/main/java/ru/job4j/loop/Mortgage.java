package ru.job4j.loop;

public class Mortgage {
	public double year(int amount, int monthly, double percent) {
		double i = 0;
		double amountWithPercent = amount * (1 + percent / 100);
		while (amountWithPercent > i * monthly) {
			i++;
		}
		return Math.ceil(i / 12);
	}

}