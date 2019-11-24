package ru.job4j.tracker;

import ru.job4j.model.Item;

public class FindItemByIdAction extends BaseAction {
	public FindItemByIdAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Find Item by Id ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter Item Id: ");
		String id = input.askStr("");
		Item item = tracker.findById(id);
		if (item != null) {
			System.out.println("Item ID " + item.getId());
			System.out.println("Item Name " + item.getName());
		}
		return true;
	}
}
