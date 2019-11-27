package ru.job4j.singleton;

import ru.job4j.model.Item;

public class TrackerSingleWithFinalStaticField {
	private static final TrackerSingleWithFinalStaticField INSTANCE = new TrackerSingleWithFinalStaticField();
	private Item item;


	private TrackerSingleWithFinalStaticField() {
	}

	public static TrackerSingleWithFinalStaticField getInstance() {
		return INSTANCE;
	}

	public Item add(Item model) {
		item = model;
		return item;
	}

	public Item get() {
		return item;
	}

	public static void main(String[] args) {
		TrackerSingleWithFinalStaticField tracker = TrackerSingleWithFinalStaticField.getInstance();
	}
}
