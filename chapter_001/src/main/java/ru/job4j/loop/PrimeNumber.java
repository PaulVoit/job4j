package ru.job4j.loop;

public class PrimeNumber {

	public int calc(int finish)
	{
		int result = 1;
		for(int count = 3; count <= finish; count += 2)
		{
			boolean isPrime = true;
			for(int j = 3; j*j <= count; j+=2)
			{
				if (count % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) ++result;
		}
		return result;
	}
}
