
import org.junit.Test;
import ru.job4j.model.Item;
import ru.job4j.singleton.TrackerSingleEnum;
import ru.job4j.singleton.TrackerSingleWithFinalStaticField;
import ru.job4j.singleton.TrackerSingleWithStaticField;
import ru.job4j.singleton.TrackerSingleWithInnerClass;



import static org.junit.Assert.assertSame;


public class TrackerSingleTest {
	@Test
	public void trackerSingleEnumTest() {
		TrackerSingleEnum tse = TrackerSingleEnum.INSTANCE;
		Item item = tse.add(new Item("EnumItem"));
		TrackerSingleEnum tse2 = TrackerSingleEnum.INSTANCE;
		assertSame(tse2.get().getId(), item.getId());
	}

	@Test
	public void trackerSingleWithFinalStaticFieldTest() {
		TrackerSingleWithFinalStaticField tse = TrackerSingleWithFinalStaticField.getInstance();
		Item item = tse.add(new Item("Evolution"));
		TrackerSingleWithFinalStaticField tse2 = TrackerSingleWithFinalStaticField.getInstance();
		assertSame(tse2.get().getId(),item.getId());
	}

	@Test
	public void trackerSingleWithStaticFieldTest() {
		TrackerSingleWithStaticField tse = TrackerSingleWithStaticField.getInstance();
		Item item = tse.add(new Item("Robbery"));
		TrackerSingleWithStaticField tse2 = TrackerSingleWithStaticField.getInstance();
		assertSame(tse2.get().getId(), item.getId());
	}


	@Test
	public void trackerSingleWithInnerClassTest() {
		TrackerSingleWithInnerClass tse = TrackerSingleWithInnerClass.getInstance();
		Item item = tse.add(new Item("the silence was the answer"));
		TrackerSingleWithInnerClass tse2 = TrackerSingleWithInnerClass.getInstance();
		assertSame(tse.get().getId(), item.getId());
	}
}
