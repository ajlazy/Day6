package com.capgemini.com.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.q2.Car;
import com.capgemini.day6.q2.Cellphone;
import com.capgemini.day6.q2.Laptop;
import com.capgemini.day6.q2.School;
import com.capgemini.day6.q2.Television;


class ProductsTest {

	@Test
	void testCar() {
		HashSet<Car> car1 =new HashSet<Car>();
		assertEquals(true, car1.add(new Car("Audi","A7",2010,3000000)));
		assertEquals(false, car1.add(new Car("Audi","A7",2000,2000000)));
		assertEquals(1, car1.size());
		for (Car car : car1) {
			System.out.println(car);
		}

		
	}
	@Test
	void testCellphone() {
		HashSet<Cellphone> cellphone1 =new HashSet<Cellphone>();
		assertEquals(true, cellphone1.add(new Cellphone("Audi","A7","windows","good",3000000)));
		assertEquals(false, cellphone1.add(new Cellphone("Audi","A7","Symbian","good",2000000)));
		assertEquals(1, cellphone1.size());
		for (Cellphone car : cellphone1) {
			System.out.println(car);
		}

		
	}
	@Test
	void testLaptop() {
		HashSet<Laptop> laptop1 =new HashSet<Laptop>();
		assertEquals(true, laptop1.add(new Laptop("Audi","A7","Windows","3000000")));
		assertEquals(false, laptop1.add(new Laptop("Audi","A7","ios","2000000")));
		assertEquals(1, laptop1.size());
		for (Laptop laptop : laptop1) {
			System.out.println(laptop);
		}

		
	}
	@Test
	void testtelevision() {
		HashSet<Television> television1 =new HashSet<Television>();
		assertEquals(true, television1.add(new Television("Audi","A7",true,20)));
		assertEquals(false, television1.add(new Television("Audi","A7",false,20)));
		assertEquals(1, television1.size());
		for (Television television : television1) {
			System.out.println(television);
		}

		
	}
	@Test
	void testSchool() {
		HashSet<School> school1 =new HashSet<School>();
		assertEquals(true, school1.add(new School("VIS","Delhi","Dwarka",300)));
		assertEquals(false,school1.add(new School("VIS","Delhi","Dwarka",300)));
		assertEquals(1, school1.size());
		for (School school : school1) {
			System.out.println(school);
		}

		
	}

}
