
import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
	@Test
	public void whenFindByName() {
		PhoneDictionary phones = new PhoneDictionary();
		phones.add(
				new Person("Pavel", "Pupkin", "57655", "Moscow")
		);
		List<Person> persons = phones.find("Pavel");
		assertThat(persons.iterator().next().getSurname(), is("Pupkin"));
	}
}
