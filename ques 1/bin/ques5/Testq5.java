package com.capgemini.com.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

import ques5.Car;



class CarTest {

	@Test
	void test() {
		HashSet<Car> cr = new HashSet<Car>();
		assertEquals(true, cr.add(new Car("india", "maruti", 2017, 65056000)));
		assertEquals(true, cr.add(new Car("US", "Fiat", 2014, 4354500)));
		
		assertEquals(2, cr.size());
		for (Car c :cr)
		{
			System.out.println(c);
		}
	}
}