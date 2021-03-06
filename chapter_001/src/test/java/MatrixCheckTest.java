

import org.junit.Test;
import ru.job4j.array.MatrixCheck;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
	@Test
	public void whenDataMonoByTrueThenTrue() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = new boolean[][] {
				{true, true, true},
				{false, true, true},
				{true, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(true));
	}

	@Test
	public void whenDataNotMonoByTrueThenFalse() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = new boolean[][] {
				{false, true, false},
				{true, true, true},
				{true, false, false}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	@Test
	public void whenDataNotMonoByTrueThenFalse1() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = new boolean[][] {
				{false, true, false},
				{true, false, true},
				{false, false, true}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	@Test
	public void whenDataNotMonoByTrueThenFalse2() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = new boolean[][] {
				{false, true, true},
				{true, false, true},
				{false, false, false}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
	@Test
	public void whenDataNotMonoByTrueThenFalse3() {
		MatrixCheck check = new MatrixCheck();
		boolean[][] input = new boolean[][] {
				{true, true, false},
				{true, false, true},
				{false, false, false}
		};
		boolean result = check.mono(input);
		assertThat(result, is(false));
	}
}
