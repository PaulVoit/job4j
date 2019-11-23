

import org.junit.Test;
import ru.job4j.model.Item;
import ru.job4j.tracker.FindItemByNameAction;
import ru.job4j.tracker.StubInput;
import ru.job4j.tracker.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindItemByNameActionTest {

	@Test
	public void whenCheckOutput() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintStream def = System.out;
		System.setOut(new PrintStream(out));
		StubInput input = new StubInput(
				new String[]{"this name"}
		);
		Tracker tracker = new Tracker();
		Item item = new Item(input.askStr(""));
		tracker.add(item);
		FindItemByNameAction act = new FindItemByNameAction();
		act.execute(new StubInput(new String[]{"this name"}), tracker);
		String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("Enter name: " + "Item ID " + item.getId())
				.add("Item Name " + item.getName())
				.toString();
		assertThat(new String(out.toByteArray()), is(expect));
		System.setOut(def);
	}
}

