
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
		List<Address> expected = List.of(address, address1, address2, address3);
		assertThat(result, is(expected));
	}
}