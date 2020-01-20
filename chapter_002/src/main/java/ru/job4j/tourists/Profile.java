package ru.job4j.tourists;

public class Profile {
	private Address address;

	public Profile(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
}
