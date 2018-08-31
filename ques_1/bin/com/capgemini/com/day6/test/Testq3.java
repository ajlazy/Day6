package com.capgemini.com.day6.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.capgemini.day6.q3.Names;


class Testq3 {

	@Test
	void Nametest() {
		ArrayList<Names> name = new ArrayList<Names>();
	
		assertEquals(true,name.add(new Names("Akshit",156067,"ECE")));
		assertEquals(true,name.add(new Names("John Doe",12467,"BSC")));
		assertEquals(true,name.add(new Names("Sam",105458,"Civil")));	
		Names.printName(name);
		for (Names names : name) {
			System.out.println(names);
			
		}
		assertEquals(3,name.size());
	}

}