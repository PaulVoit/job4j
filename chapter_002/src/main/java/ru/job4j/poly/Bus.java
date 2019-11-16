package ru.job4j.poly;

public class Bus implements Transport {

	private int fuelQuantity = 0;
	private int passengers = 0;


	@Override
	public void drive() {
		System.out.println("Автобус выезждает на маршрут ");
	}

	@Override
	public void takePassengers(int passengers) {
		if (this.passengers != 0) {
			System.out.println("Можно выезжать на маршрут ");
			drive();
		} else {
			System.out.println("Стоять в автопарке ");
		}
	}

	@Override
	public int takeFuel(int fuelQuantity) {
		int price = 0;
		return this.fuelQuantity * 50;
	}
}
