import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
	@Test
	public void whenFirstMax() {
		SqMax check = new SqMax();
		int result = check.max(8, 3, 2, 6);
		assertThat(result, is(8));
	}

	@Test
	public void whenSecondMax() {
		SqMax check = new SqMax();
		int result = check.max(3, 7, 2, 6);
		assertThat(result, is(7));
	}

	@Test
	public void whenThirdMax() {
		SqMax check = new SqMax();
		int result = check.max(3, 2, 9, 1);
		assertThat(result, is(9));
	}

	@Test
	public void whenForthMax() {
		SqMax check = new SqMax();
		int result = check.max(3, 2, 9, 12);
		assertThat(result, is(12));
	}

	@Test
	public void whenAllEqual() {
		SqMax check = new SqMax();
		int result = check.max(3, 3, 3, 3);
		assertThat(result, is(3));
	}


}
