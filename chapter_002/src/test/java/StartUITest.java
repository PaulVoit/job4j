
import org.junit.Test;
import ru.job4j.model.Item;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.StartUI;
import ru.job4j.tracker.StubInput;
import ru.job4j.tracker.Tracker;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
	@Test
	public void whenAddItem() {
		String[] answers = {"Fix PC"};
		Input input = new StubInput(answers);
		Tracker tracker = new Tracker();
		StartUI.createItem(input, tracker);
		Item created = tracker.findAll()[0];
		Item expected = new Item("Fix PC");
		assertThat(created.getName(), is(expected.getName()));
	}

	@Test
	public void whenReplaceItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("new item");
		tracker.add(item);
		String[] answers = {
				item.getId(),
				"replaced item"
		};
		StartUI.replaceItem(new StubInput(answers), tracker);
		Item replaced = tracker.findById(item.getId());
		assertThat(replaced.getName(), is("replaced item"));
	}

	@Test
	public void whenDeleteItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("new item");
		tracker.add(item);
		String[] answers = {item.getId(), null};
		StartUI.deleteItem(new StubInput(answers), tracker);
		Item[] result = tracker.findAll();
		assertThat(result, is(answers[1]));
	}
}
