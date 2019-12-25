package ru.job4j.collection;

import ru.job4j.model.Item;

import java.util.Comparator;

public class ItemSorterDescendingOrder implements Comparator<Item> {
	@Override
	public int compare(Item item1, Item item2) {
		return item2.getName().compareTo(item1.getName());
	}
}
