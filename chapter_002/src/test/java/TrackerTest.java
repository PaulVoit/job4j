import org.junit.Test;
import ru.job4j.model.Item;
import ru.job4j.tracker.Tracker;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {

	@Test
	public void whenAddNewItemThenTrackerHasSameItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1");
		tracker.add(item);
		Item result = tracker.findById(item.getId());
		assertThat(result.getName(), is(item.getName()));
	}

	@Test
	public void whenItemIdEqualsOurId() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1");
		tracker.add(item);
		Item result = tracker.findById(item.getId());
		assertThat(result.getId(), is(item.getId()));
	}

	@Test
	public void whenFindAllItemsWithoutNull() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1");
		Item item1 = new Item("test2");
		tracker.add(item);
		tracker.add(item1);
		Item[] result = tracker.findAll();
		assertThat(result.length, is(2));
	}

	@Test
	public void whenItemDeleted() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1");
		Item item1 = new Item("test2");
		tracker.add(item);
		tracker.add(item1);
		tracker.delete(item.getId());
		Item[] result = tracker.findAll();
		assertThat(result[0], is(item1));
	}

	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1");
		tracker.add(previous);
		Item next = new Item("test2");
		next.setId(previous.getId());
		tracker.replace(previous.getId(), next);
		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
	}

	@Test
	public void whenFindByName() {
		Tracker tracker = new Tracker();
		Item first = new Item("test1");
		tracker.add(first);
		assertThat(tracker.findByName("test1")[0].getName(), is("test1"));
	}
}