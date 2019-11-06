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
		boolean result = false;
		for (int i = 0; i < this.items.length; i++) {
			if (item.getId().equals(id) && this.items[i] != null) {
				this.items[i] = item;
				item.setId(id);
				break;
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i].getId().equals(id) && this.items[i] != null) {
				System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
				this.items[this.items.length - 1] = null;
				position--;
				break;
			}
		}
		return result;
	}

	public Item[] findAll() {
		Item[] itemsWithoutNull = null;
		for (Item item : this.items) {
			if (item != null) {
				itemsWithoutNull = Arrays.copyOf(this.items, position);
				break;
			}
		}
		return itemsWithoutNull;
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
		Item result = null;
		for (Item item : this.items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}

	private String generateId() {
		Random rm = new Random();
		return String.valueOf(rm.nextLong() + System.currentTimeMillis());
	}
}
