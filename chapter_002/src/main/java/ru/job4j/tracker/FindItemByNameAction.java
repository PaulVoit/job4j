package ru.job4j.tracker;

import ru.job4j.model.Item;

import java.util.List;

public class FindItemByNameAction extends BaseAction {
	public FindItemByNameAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Find Item by Name ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter name: ");
		String name = input.askStr("");
		List<Item> items = tracker.findByName(name);
		for (Item item : items) {
			System.out.println("Item ID " + item.getId());
			System.out.println("Item Name " + item.getName());
		}
		return true;
	}
}
