package ru.job4j.tracker;

import ru.job4j.model.Item;

public class DeleteAction extends BaseAction {
	public DeleteAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Delete Item ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.print("Enter Item id: ");
		String id = input.askStr("");
		if (tracker.delete(id)) {
			System.out.println("Item " + id + "deleted");
		}
		return true;
	}
}
