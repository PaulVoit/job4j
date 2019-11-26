import org.junit.Test;
import ru.job4j.model.Item;
import ru.job4j.singleton.TrackerSingleEnum;
import ru.job4j.singleton.TrackerSingleWithFinalStaticField;
import ru.job4j.singleton.TrackerSingleWithStaticField;
import ru.job4j.singleton.TrackerSingleWithInnerClass;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
	@Test
	public void trackerSingleEnumTest() {
		TrackerSingleEnum tse = TrackerSingleEnum.INSTANCE;
		Item item = tse.add(new Item("EnumItem"));
		assertThat(tse.get().getId(), is(item.getId()));
	}

	@Test
	public void trackerSingleWithFinalStaticFieldTest() {
		TrackerSingleWithFinalStaticField tse = TrackerSingleWithFinalStaticField.getInstance();
		Item item = tse.add(new Item("Evolution"));
		assertThat(tse.get().getId(), is(item.getId()));
	}

	@Test
	public void trackerSingleWithStaticFieldTest() {
		TrackerSingleWithStaticField tse = TrackerSingleWithStaticField.getInstance();
		Item item = tse.add(new Item("Robbery"));
		assertThat(tse.get().getId(), is(item.getId()));
	}


	@Test
	public void trackerSingleWithInnerClassTest() {
		TrackerSingleWithInnerClass tse = TrackerSingleWithInnerClass.getInstance();
		Item item = tse.add(new Item("the silence was the answer"));
		assertThat(tse.get().getId(), is(item.getId()));
	}
}
