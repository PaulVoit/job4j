import org.junit.Test;
import ru.job4j.stream.ConversionMatrixToList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConversionMatrixToListTest {
	@Test
	public void whenMatrixThenList() {
		Integer[][] matrix = {{1, 5, 8}, {9, 45, 54}};
		List<Integer> expected = Arrays.asList(1, 5, 8, 9, 45, 54);
		List<Integer> result = new ConversionMatrixToList().convertMatrixToList(matrix);
		assertThat(result, is(expected));
	}
}
