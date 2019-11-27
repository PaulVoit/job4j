package ru.job4j.singleton;

import ru.job4j.model.Item;

public class TrackerSingleWithInnerClass {
	private Item item;

	private TrackerSingleWithInnerClass() {
	}

	public static TrackerSingleWithInnerClass getInstance() {
		return Holder.INSTANCE;
	}

	public Item add(Item model) {
		item = model;
		return item;
	}

	public Item get() {
		return item;
	}

	private static final class Holder {
		private static final TrackerSingleWithInnerClass INSTANCE = new TrackerSingleWithInnerClass();
	}

	public static void main(String[] args) {
		TrackerSingleWithInnerClass tracker = TrackerSingleWithInnerClass.getInstance();
	}
}
