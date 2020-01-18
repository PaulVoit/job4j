import org.junit.Test;
import ru.job4j.calculate.Counting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CountingTest {
	@Test
	public void whenLinearFunction() {
		List<Double> result = new Counting().countLine(6, 9, 1, 1);
		List<Double> expected = new ArrayList<>(Arrays.asList(7D, 8D, 9D));
		assertThat(result, is(expected));
	}

	@Test
	public void whenSquareFunction() {
		List<Double> result = new Counting().countSqr(1, 4);
		List<Double> expected = new ArrayList<>(Arrays.asList(1D, 4D, 9D));
		assertThat(result, is(expected));
	}

	@Test
	public void whenLogFunction() {
		List<Double> result = new Counting().countLog(1, 2);
		List<Double> expected = new ArrayList<>(Arrays.asList(0D));
		assertThat(result, is(expected));
	}
}

