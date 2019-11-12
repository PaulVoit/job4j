package ru.job4j.tracker;

import ru.job4j.model.Item;

import java.util.Scanner;

public class StartUI {
	public void init(Scanner scanner, Tracker tracker) {
		boolean run = true;
		while (run) {
			this.showMenu();
			System.out.print("Select: ");
			int select = Integer.parseInt(scanner.nextLine());
			if (select == 0) {
				System.out.println("=== Create a new Item ====");
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				Item item = new Item(name);
				tracker.add(item);
				System.out.println("New Item " + item.getName() + "added");
			} else if (select == 1) {
				System.out.print("=== Show all Items ====");
				Item[] allItems = tracker.findAll();
				for (Item allItem : allItems) {
					System.out.println("Name: " + allItem.getName());
				}
			} else if (select == 2) {
				System.out.print("=== Edit Item ====");
				System.out.print("Enter Item id: ");
				String id = scanner.nextLine();
				System.out.print("Enter New Item Name: ");
				String name = scanner.nextLine();
				Item item = tracker.findById(id);
				Item item2 = new Item(name);
				if (tracker.replace(id, item2)) {
					System.out.println("Item: " + id + " replaced");
				} else {
					System.out.println("Item with ID: " + id + " doesn't exist");
				}
			} else if (select == 3) {
				System.out.println("=== Delete Item ====");
				System.out.print("Enter Item id: ");
				String id = scanner.nextLine();
				if (tracker.delete(id)) {
					System.out.println("Item " + id + "deleted");
				}
			} else if (select == 4) {
				System.out.println("=== Find Item by Id ====");
				System.out.print("Enter Item Id: ");
				String id = scanner.nextLine();
				tracker.findById(id);
				Item item = tracker.findById(id);
				if (item != null) {
					System.out.println("Item ID " + item.getId());
					System.out.println("Item Name " + item.getName());
				}
			} else if (select == 5) {
				System.out.println("=== Find Item by Name ====");
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				Item[] items = tracker.findByName(name);
				for (int i = 0; i < items.length; i++) {
					System.out.println("Item ID " + items[i].getId());
					System.out.println("Item Name " + items[i].getName());
				}
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


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tracker tracker = new Tracker();
		new StartUI().init(scanner, tracker);
	}

}
