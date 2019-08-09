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
}
