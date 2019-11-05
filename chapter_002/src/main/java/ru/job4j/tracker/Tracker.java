package ru.job4j.tracker;

import ru.job4j.model.Item;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

	private final Item[] items = new Item[100];
	private int position = 0;

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}

	public boolean replace(String id, Item item) {
		for (int i = 0; i < this.items.length; i++) {
			if (item.getId().equals(id)) {
				items[i] = item;
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i].getId().equals(id) && this.items[i] != null) {
				System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
				return true;
			}
		}
		return false;
	}

	public Item[] findAll() {
		for (Item item : this.items) {
			if (item != null) {
				return Arrays.copyOf(this.items, position);
			}
		}
		return null;
	}

	public Item[] findByName(String key) {
		int index = 0;
		Item[] foundItems = new Item[position];
		for (int i = 0; i < position; i++) {
			Item name = this.items[i];
			if (name != null && this.items[i].getName().equals(key)) {
				foundItems[index] = this.items[i];
				index++;
			}
		}
		return Arrays.copyOf(foundItems, index);
	}

	public Item findById(String id) {
		for (Item item : this.items) {
			if (item.getId().equals(id)) {
				return item;
			}
		}
		return null;
	}

	private String generateId() {
		Random rm = new Random();
		return String.valueOf(rm.nextLong() + System.currentTimeMillis());
	}
}
