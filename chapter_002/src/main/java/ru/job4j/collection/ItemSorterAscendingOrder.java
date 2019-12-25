package ru.job4j.collection;

import ru.job4j.model.Item;

import java.util.Comparator;

public class ItemSorterAscendingOrder implements Comparator<Item> {
	@Override
	public int compare(Item item1, Item item2) {
		return item1.getName().compareTo(item2.getName());
	}
}
