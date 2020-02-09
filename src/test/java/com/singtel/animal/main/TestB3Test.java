package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.fish.Dolphin;

public class TestB3Test {

	@Test
	public void testB3() {
		// Test scenario 1
		Dolphin dolphin = new Dolphin();
		
		// Positive test cases
		assertEquals("Dolphins are good swimmers", dolphin.swim());
		
		// Negative test cases
		assertNotEquals("Dolphins are not good swimmers", dolphin.swim());
	}
	



}
