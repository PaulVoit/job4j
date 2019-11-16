package ru.job4j.tracker;

import ru.job4j.model.Item;


public class StartUI {
	public void init(Input input, Tracker tracker) {
		boolean run = true;
		while (run) {
			this.showMenu();
			System.out.print("Select: ");
			int select = Integer.parseInt(input.askStr(""));
			if (select == 0) {
				StartUI.createItem(input, tracker);
			} else if (select == 1) {
				StartUI.showAllItems(tracker);
			} else if (select == 2) {
				StartUI.replaceItem(input, tracker);
			} else if (select == 3) {
				StartUI.deleteItem(input, tracker);
			} else if (select == 4) {
				StartUI.findItemById(input, tracker);
			} else if (select == 5) {
				StartUI.findItemByName(input, tracker);
			} else if (select == 6) {
				System.out.println("=== Exit programme ===");
				run = false;
			}
		}

	}

	private void showMenu() {
		System.out.println("Menu.");
		System.out.println("0. Add new Item\n" +
				"1. Show all items\n" +
				"2. Edit item\n" +
				"3. Delete item\n" +
				"4. Find item by Id\n" +
				"5. Find items by name\n" +
				"6. Exit Program");
	}

	public static void createItem(Input input, Tracker tracker) {
		System.out.println("=== Create a new Item ====");
		System.out.print("Enter name: ");
		String name = input.askStr("");
		Item item = new Item(name);
		tracker.add(item);
	}

	public static void showAllItems(Tracker tracker) {
		System.out.print("=== Show all Items ====");
		Item[] allItems = tracker.findAll();
		for (Item allItem : allItems) {
			System.out.println("Name: " + allItem.getName());
		}
	}

	public static void replaceItem(Input input, Tracker tracker) {
		System.out.print("=== Edit Item ====");
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
	}

	public static void deleteItem(Input input, Tracker tracker) {
		System.out.println("=== Delete Item ====");
		System.out.print("Enter Item id: ");
		String id = input.askStr("");
		if (tracker.delete(id)) {
			System.out.println("Item " + id + "deleted");
		}
	}

	public static void findItemById(Input input, Tracker tracker) {
		System.out.println("=== Find Item by Id ====");
		System.out.print("Enter Item Id: ");
		String id = input.askStr("");
		Item item = tracker.findById(id);
		if (item != null) {
			System.out.println("Item ID " + item.getId());
			System.out.println("Item Name " + item.getName());
		}
	}

	public static void findItemByName(Input input, Tracker tracker) {
		System.out.println("=== Find Item by Name ====");
		System.out.print("Enter name: ");
		String name = input.askStr("");
		Item[] items = tracker.findByName(name);
		for (int i = 0; i < items.length; i++) {
			System.out.println("Item ID " + items[i].getId());
			System.out.println("Item Name " + items[i].getName());
		}
	}

	public static void main(String[] args) {
		Input input = new ConsoleInput();
		Tracker tracker = new Tracker();
		new StartUI().init(input, tracker);
	}

}
