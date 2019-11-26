package ru.job4j.singleton;

import ru.job4j.model.Item;

public enum TrackerSingleEnum {
	INSTANCE;

	private Item item;


	public Item add(Item model) {
		item = model;
		return item;
	}

	public Item get() {
		return item;
	}
}

