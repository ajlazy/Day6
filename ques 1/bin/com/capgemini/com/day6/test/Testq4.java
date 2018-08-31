package com.capgemini.com.day6.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

import com.capgemini.day6.q4.Names;

class TreeSetTest {

	@Test
	void test() {
		TreeSet<Names> name = new TreeSet<Names>();
		
		assertEquals(true,name.add(new Names("Akshit",156067,"ECE")));
		assertEquals(true,name.add(new Names("John Doe",12467,"BSC")));
		assertEquals(true,name.add(new Names("Sam",105458,"Civil")));
		assertEquals(3,name.size());
		for(Names n: name)
		{
			System.out.println(n);
		}
	}

}