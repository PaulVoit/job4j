


import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.ItemSorterAscendingOrder;
import ru.job4j.collection.ItemSorterDescendingOrder;
import ru.job4j.model.Item;

import java.util.*;

public class ItemSorterTest {
	@Test
	public void comparatorItemSortByNameASC() {

		List<Item> items = new ArrayList<>();
		Item first = new Item("Item2");
		Item second = new Item("Item1");
		Item third = new Item("Item4");
		Item fourth = new Item("Item3");
		items.add(first);
		items.add(second);
		items.add(third);
		items.add(fourth);

		Item[] input = new Item[]{second, first, fourth, third};
		List<Item> expect = new ArrayList<>(Arrays.asList(input));
		items.sort(new ItemSorterAscendingOrder());
		Assert.assertEquals(expect, items);
	}

	@Test
	public void comparatorItemSortByNameDES() {

		List<Item> items = new ArrayList<>();
		Item first = new Item("Item2");
		Item second = new Item("Item1");
		Item third = new Item("Item4");
		Item fourth = new Item("Item3");
		items.add(first);
		items.add(second);
		items.add(third);
		items.add(fourth);

		Item[] input = new Item[]{third, fourth, first, second};
		List<Item> expect = new ArrayList<>(Arrays.asList(input));
		items.sort(new ItemSorterDescendingOrder());
		Assert.assertEquals(expect, items);
	}

}
