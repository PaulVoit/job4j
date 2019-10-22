import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleTest {
	@Test
	public void whenAreaSetThreePointsThenTriangleArea() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 1.9;
		assertThat(result, closeTo(expected, 0.1));
	}
}


