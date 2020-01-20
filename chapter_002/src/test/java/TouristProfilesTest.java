
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import ru.job4j.tourists.Address;
import ru.job4j.tourists.Profile;
import ru.job4j.tourists.Profiles;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TouristProfilesTest {
	@Test
	public void whenSeveralAddresses() {
		Profiles profiles = new Profiles();
		Address address = new Address("Санкт-Петербург", "Среднерогатская", 9, 746);
		Address address1 = new Address("Москва", "Козмодамианская", 60, 100);
		Address address2 = new Address("Урюпинск", "Изенгардская", 23, 3);
		Address address3 = new Address("Жмеринка", "Бобруйская", 10, 85);
		List<Profile> profilesList = List.of(new Profile(address), new Profile(address1), new Profile(address2), new Profile(address3));
		List<Address> result = profiles.collect(profilesList);
		List<Address> expected = List.of(address3, address1, address, address2);
		assertThat(result, is(expected));
	}

	@Test
	public void whenSortedAndUniqueAddresses() {
		Profiles profiles = new Profiles();
		Address address = new Address("Санкт-Петербург", "Среднерогатская", 9, 746);
		Address address1 = new Address("Москва", "Козмодамианская", 60, 100);
		Address address2 = new Address("Жмеринка", "Бобруйская", 10, 85);
		Address address3 = new Address("Жмеринка", "Бобруйская", 10, 85);
		List<Profile> profilesList = List.of(new Profile(address3), new Profile(address1), new Profile(address2), new Profile(address));
		List<Address> expected = List.of(address2, address1, address);
		List<Address> result = profiles.collect(profilesList);
		assertThat(result, is(expected));
	}
}