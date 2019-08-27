import  org.junit.Test;
import ru.job4j.loop.Mortgage;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
	@Test
	public void when1Year() {
		Mortgage mortgage = new Mortgage();
		double year =  mortgage.year(1000, 100, 1);
		assertThat(year, is(1.0));
	}

	@Test
	public void when2Year() {
		Mortgage mortgage = new Mortgage();
		double year =  mortgage.year(100, 10, 50);
		assertThat(year, is(2.0));
	}
}
