import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

	@Test
	public void whenArrayHas5Then0() {
		FindLoop find = new FindLoop();
		int[] input = new int[]{5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}
	@Test
	public void whenArrayHas3Then2() {
		FindLoop find = new FindLoop();
		int[] input = new int[]{5, 10, 3};
		int value = 3;
		int result = find.indexOf(input, value);
		int expect = 2;
		assertThat(result, is(expect));
	}
	@Test
	public void whenArrayHasNoElement() {
		FindLoop find = new FindLoop();
		int[] input = new int[]{5, 10, 3};
		int value = 6;
		int result = find.indexOf(input, value);
		int expect = -1;
		assertThat(result, is(expect));
	}
	@Test
	public void whenArrayHas10Then1() {
		FindLoop find = new FindLoop();
		int[] input = new int[]{5, 10, 3, 57};
		int value = 57;
		int result = find.indexOf(input, value);
		int expect = 3;
		assertThat(result, is(expect));
	}

	@Test
	public void whenArrayHasLength5Then0() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 10, 3};
		int value = 5;
		int result = find.indexOf(input, value);
		int expect = 0;
		assertThat(result, is(expect));
	}

	@Test
	public void whenFind3() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 2, 10, 2, 4};
		int value = 2;
		int start = 2;
		int finish = 4;
		int result = find.indexOf(input, value, start, finish);
		int expect = 3;
		assertThat(result, is(expect));
	}
	@Test
	public void whenHasNoElements() {
		FindLoop find = new FindLoop();
		int[] input = new int[] {5, 2, 10, 2, 4, 54, 2, 13};
		int value = 30;
		int start = 2;
		int finish = 6;
		int result = find.indexOf(input, value, start, finish);
		int expect = -1;
		assertThat(result, is(expect));
	}
}
