
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;


public class PointTest {

	@Test
	public void distance() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 2);
		double expected = 2.0;
		double out = a.distance(b);
		Assert.assertEquals(expected, out, 0);
	}
}
