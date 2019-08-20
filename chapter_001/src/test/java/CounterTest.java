

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter counter = new Counter();
		int result = counter.add(1, 10);
		assertThat(result, is(30));
	}
}
