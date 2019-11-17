import org.junit.Test;
import ru.job4j.strategy.Shape;
import ru.job4j.strategy.Square;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Square2Test {
	@Test
	public void whenDrawSquare() {
		Square square = new Square();
		String sep = System.lineSeparator();
		assertThat(
				square.draw(),
				is(
						new StringBuilder()
								.append("_______").append(sep)
								.append("|     |").append(sep)
								.append("|     |").append(sep)
								.append("_______").append(sep)
								.toString()
				)
		);
	}
}
