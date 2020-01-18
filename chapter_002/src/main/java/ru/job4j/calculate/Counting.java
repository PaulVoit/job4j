package ru.job4j.calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Counting {
	public List<Double> diapason(int start, int end, Function<Double, Double> func) {
		List<Double> result = new ArrayList<>();
		for (int index = start; index != end; index++) {
			result.add(func.apply((double) index));
		}
		return result;
	}

	public List<Double> countLine(int start, int end, double n, double c) {
		return diapason(start, end, x -> n * x + c);
	}

	public List<Double> countSqr(int start, int end) {
		return diapason(start, end, x -> Math.pow(x, 2));
	}

	public List<Double> countLog(int start, int end) {
		return diapason(start, end, x -> Math.log(x));
	}
}
