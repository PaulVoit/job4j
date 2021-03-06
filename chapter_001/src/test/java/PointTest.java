
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;


public class PointTest {

	@Test
	public void distance() {

		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		double expected = 2.0;
		double out = a.distance(b);
		Assert.assertEquals(expected, out, 0);
	}

	@Test
	public void distance3D() {

		Point a = new Point(0, 0, 0);
		Point b = new Point(0, 3, 4);
		double expected = 5.0;
		double out = a.distance3d(b);
		Assert.assertEquals(expected, out, 0);
	}
}
