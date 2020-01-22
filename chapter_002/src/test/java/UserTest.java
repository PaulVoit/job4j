import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class UserTest {
	@Test
	public void whenAsc() {
		Set<User> users = Set.of(new User("Petr", 32), new User("Ivan", 31));
		Iterator<User> it = users.iterator();
		assertThat(it.next(), is(new User("Ivan", 31)));
		assertThat(it.next(), is(new User("Petr", 32)));
	}

	@Test
	public void whenComparePertVSIvan() {
		int rsl = new User("Petr", 32)
				.compareTo(
						new User("Ivan", 31)
				);
		assertThat(rsl, greaterThan(0));
	}

	@Test
	public void whenSortByAge() {
		Set<User> users = Set.of(new User("Pavel", 18), new User("Pavel", 16));
		Iterator<User> it = users.iterator();
		assertThat(it.next(), is(new User("Pavel", 18)));
		assertThat(it.next(), is(new User("Pavel", 16)));
	}

	@Test
	public void whenSortByNameAscending() {
		Comparator<User> ascenName = new AscendingByName();
		int rsl = ascenName.compare(
				new User("Petr", 31),
				new User("Ivan", 27)
		);
		assertThat(rsl, greaterThan(0));
	}

	@Test
	public void whenSortByNameDescendingSort() {
		Comparator<User> descenName = new DescendingByName();
		int rsl = descenName.compare(
				new User("Petr", 31),
				new User("Ivan", 27)
		);
		assertThat(rsl, lessThan(0));
	}

	@Test
	public void whenSortByAgeDescending() {
		Comparator<User> descenAge = new DescendingByAge();
		int rsl = descenAge.compare(
				new User("Petr", 31),
				new User("Ivan", 27)
		);
		assertThat(rsl, lessThan(0));
	}

	@Test
	public void whenSortByAgeAscending() {
		Comparator<User> ascenAge = new AscendingByAge();
		int rsl = ascenAge.compare(
				new User("Petr", 31),
				new User("Ivan", 27)
		);
		assertThat(rsl, lessThan(0));
	}

	@Test
	public void whenCombinedSortByNameAscendingSortAndByAgeDescendingSort() {
		Comparator<User> comb = new AscendingByName().thenComparing(new DescendingByAge());
		int rsl = comb.compare(
				new User("Ivan", 29),
				new User("Ivan", 31)
		);
		assertThat(rsl, greaterThan(0));
	}
}

