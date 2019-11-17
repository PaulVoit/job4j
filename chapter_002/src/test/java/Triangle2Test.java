import org.junit.Test;
import ru.job4j.strategy.Shape;
import ru.job4j.strategy.Triangle;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Triangle2Test {
	@Test
	public void whenDrawTriangle() {
		String sep = System.lineSeparator();
		Triangle triangle = new Triangle();
		assertThat(
				triangle.draw(),
				is(
						new StringBuilder()
								.append("    0").append(sep)
								.append("   0 0").append(sep)
								.append("  0   0").append(sep)
								.append(" 0     0").append(sep)
								.append("000000000").append(sep)
								.toString()
				)
		);
	}
}
