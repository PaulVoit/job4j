
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.collection.ConvertList2Array;
import ru.job4j.list.ConvertMatrix2List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
	@Test
	public void when2on2ArrayThenList4() {
		ConvertMatrix2List list = new ConvertMatrix2List();
		int[][] input = {
				{1, 2},
				{3, 4}
		};
		List<Integer> expect = Arrays.asList(
				1, 2, 3, 4
		);
		List<Integer> result = list.toList(input);
		assertThat(result, is(expect));
	}
	@Test
	public void when2ArraysToOneList() {
		ConvertMatrix2List list = new ConvertMatrix2List();
		List<int[]> list1 = new ArrayList<>();
		list1.add(new int[]{1, 2});
		list1.add(new int[]{3, 4, 5, 6});
		List<Integer> result = list.convert(list1);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertArrayEquals(expected.toArray(new Integer[0]), result.toArray(new Integer[0]));
	}
}
