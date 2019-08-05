package ru.job4j.converter;

public class Converter {

	public static double rubleToEuro(double value) {
		return value / 70;
	}

	public static double rubleToDollar(double value) {
		return (value / 60);
	}

	public static double euroToRuble(double value) {
		return (value * 70);
	}

	public static double dollarToRuble(double value) {
		return (value * 60);
	}

	public static void main(String[] args) {
		double euro = rubleToEuro(140);
		double dollar = rubleToDollar(140);
		double ruble = euroToRuble(2);
		double ruble1 = dollarToRuble(3.5);
		System.out.println("140 rubles are " + euro + " euro.");
		System.out.println("140 rubles are " + dollar + " dollars.");
		System.out.println("2 euro are " + ruble + " rubles.");
		System.out.println("3.5 dollars are " + ruble1 + " rubles.");
//tests
		double inRuble = 140;
		double inEuro = 2;
		double inDollar = 3.5;

		double expected = 2;
		double expected2 = 2.3333333333333335;
		double expected3 = 140;
		double expected4 = 210;

		double out = rubleToEuro(inRuble);
		double out2 = rubleToDollar(inRuble);
		double out3 = euroToRuble(inEuro);
		double out4 = dollarToRuble(inDollar);

		boolean passed = expected == out;
		boolean passed2 = expected2 == out2;
		boolean passed3 = expected3 == out3;
		boolean passed4 = expected4 == out4;

		System.out.println("140 rubles are 2 euro. Test result : " + passed);
		System.out.println("140 rubles are 2.3333333333333335 dollars Test result : " + passed2);
		System.out.println("2 euro are 140 rubles Test result : " + passed3);
		System.out.println("3.5 dollars are 210 rubles Test result : " + passed4);
	}

}
