package com.capgemini.com.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import org.junit.jupiter.api.Test;

import ques5.Car;



class CarComparableTest {

	@Test
	void test() {
		HashSet<Car> cr = new HashSet<Car>();
		assertEquals(true, cr.add(new Car("Europe", "Hyundai", 2007, 650000)));
		assertEquals(true, cr.add(new Car("US", "Maruthi", 2004, 434000)));
		assertEquals(true, cr.add(new Car("China", "Hyundai", 2000, 560000)));
		assertEquals(true, cr.add(new Car("US", "Hyundai", 2004, 434000)));
		assertEquals(true, cr.add(new Car("China", "Maruthi", 2007, 434000)));
		assertEquals(false, cr.add(new Car("US", "Maruthi", 2004, 434000)));
		assertEquals(5, cr.size());
		for (Car c :cr)
		{
			System.out.println(c);
		}
	}
}