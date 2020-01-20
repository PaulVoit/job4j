package ru.job4j.tourists;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
	public List<Address> collect(List<Profile> profiles) {
		return profiles.stream().map(adr -> adr.getAddress()).distinct().sorted(new SortByCity()).collect(Collectors.toList());
	}
}