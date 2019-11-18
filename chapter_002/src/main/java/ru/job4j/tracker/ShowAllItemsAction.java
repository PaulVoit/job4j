package ru.job4j.tracker;

import ru.job4j.model.Item;

public class ShowAllItemsAction implements UserAction {
	@Override
	public String name() {
		return "=== Show all Items ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		Item[] allItems = tracker.findAll();
		for (Item allItem : allItems) {
			System.out.println("Name: " + allItem.getName());
		}
		return true;
	}
}
