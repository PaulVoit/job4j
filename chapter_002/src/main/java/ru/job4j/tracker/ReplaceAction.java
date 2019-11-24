package ru.job4j.tracker;

import ru.job4j.model.Item;

public class ReplaceAction extends BaseAction {

	public ReplaceAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Edit Item ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter Item id: ");
		String id = input.askStr("");
		System.out.print("Enter New Item Name: ");
		String name = input.askStr("");
		Item item2 = new Item(name);
		if (tracker.replace(id, item2)) {
			System.out.println("Item: " + id + " replaced");
		} else {
			System.out.println("Item with ID: " + id + " doesn't exist");
		}
		return true;
	}
}
