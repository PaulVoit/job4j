package ru.job4j.tracker;

import ru.job4j.model.Item;


public class StartUI {
	public void init(Input input, Tracker tracker, UserAction[] actions) {
		boolean run = true;
		while (run) {
			this.showMenu(actions);
			int select = input.askInt("Select: ");
			UserAction action = actions[select];
			run = action.execute(input, tracker);
		}
	}

	private void showMenu(UserAction[] actions) {
		System.out.println("Menu.");
		for (int index = 0; index < actions.length; index++) {
			System.out.println(index + ". " + actions[index].name());
		}
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
		UserAction[] actions = {
				new CreateAction(),
				new ShowAllItemsAction(),
				new ReplaceAction(),
				new DeleteAction(),
				new FindItemByIdAction(),
				new FindItemByNameAction()
		};
		new StartUI().init(input, tracker, actions);
	}

}
