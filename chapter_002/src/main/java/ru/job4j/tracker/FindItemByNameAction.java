package ru.job4j.tracker;

import ru.job4j.model.Item;

public class FindItemByNameAction implements UserAction {
	@Override
	public String name() {
		return "=== Find Item by Name ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter name: ");
		String name = input.askStr("");
		Item[] items = tracker.findByName(name);
		for (int i = 0; i < items.length; i++) {
			System.out.println("Item ID " + items[i].getId());
			System.out.println("Item Name " + items[i].getName());
		}
		return true;
	}
}
