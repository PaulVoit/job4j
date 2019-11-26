package ru.job4j.singleton;

import ru.job4j.model.Item;

public class TrackerSingleWithStaticField {
	private static TrackerSingleWithStaticField instance;
	private Item item;

	private TrackerSingleWithStaticField() {
	}

	public static TrackerSingleWithStaticField getInstance() {
		if (instance == null) {
			instance = new TrackerSingleWithStaticField();
		}
		return instance;
	}

	public Item add(Item model) {
		item = model;
		return item;
	}

	public Item get() {
		return item;
	}
}
