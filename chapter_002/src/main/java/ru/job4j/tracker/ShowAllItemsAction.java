package ru.job4j.tracker;

import ru.job4j.model.Item;

import java.util.List;

public class ShowAllItemsAction extends BaseAction {
	public ShowAllItemsAction(int key, String name) {
		super(key, name);
	}

	@Override
	public String name() {
		return "=== Show all Items ====";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		List<Item> allItems = tracker.findAll();
		for (Item allItem : allItems) {
			System.out.println(allItem.getId() + " " + allItem.getName());
		}
		return true;
	}
}
