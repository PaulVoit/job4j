package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

	@Test
	public void rubleToEuro() {
		double in = 140;
		double expected = 2;
		double out = Converter.rubleToEuro(in);
		Assert.assertEquals(expected, out, 0);
	}

	@Test
	public void rubleToDollar() {
		double in = 140;
		double expected = 2.3333333333333335;
		double out = Converter.rubleToDollar(in);
		Assert.assertEquals(expected, out, 0.0000000000000001);
	}

	@Test
	public void dollarToRuble() {
		double in = 3.5;
		double expected = 210;
		double out = Converter.dollarToRuble(in);
		Assert.assertEquals(expected, out, 0);
	}

	@Test
	public void euroToRuble() {
		double in = 2;
		double expected = 140;
		double out = Converter.euroToRuble(in);
		Assert.assertEquals(expected, out, 0);
	}
}
