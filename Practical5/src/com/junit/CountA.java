package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountA {

	@Test
	void test() {
		
		JUnitTesting test = new JUnitTesting();
		int count = test.countA("abc");
		
		assertEquals(1, count);
		
//		fail("Not yet implemented");
	}

}
