import org.junit.Test;
import ru.job4j.condition.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	@Test
	public void whenMax1To2Then2() {
		Max max = new Max();
		int result = max.max(1, 2);
		assertThat(result, is(2));
	}

	@Test
	public void whenMax2To1Then2() {
		Max max = new Max();
		int result = max.max(2, 1);
		assertThat(result, is(2));
	}
	@Test
	public void whenMax2To2Then2() {
		Max max = new Max();
		int result = max.max(2, 2);
		assertThat(result, is(2));
	}
	@Test
	public void whenThirdMax() {
		Max max = new Max();
		int result = max.max(2, 2, 3);
		assertThat(result, is(3));
	}
	@Test
	public void whenFourthMax() {
		Max max = new Max();
		int result = max.max(2, 2, 3, 20);
		assertThat(result, is(20));
	}
	@Test
	public void whenFirstMax() {
		Max max = new Max();
		int result = max.max(13, 2, 3, 12);
		assertThat(result, is(13));
	}
	@Test
	public void whenSecondMax() {
		Max max = new Max();
		int result = max.max(2, 24, 3, 20);
		assertThat(result, is(24));
	}
}
