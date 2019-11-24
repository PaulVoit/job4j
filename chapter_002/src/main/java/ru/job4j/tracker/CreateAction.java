package ru.job4j.tracker;

import ru.job4j.model.Item;

public class CreateAction extends BaseAction {
	public CreateAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Create a new Item ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter name: ");
		String name = input.askStr("");
		Item item = new Item(name);
		tracker.add(item);
		return true;
	}
}
