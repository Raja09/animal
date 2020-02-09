package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.birds.Caterpillar;
import com.singtel.animal.fish.Dolphin;

public class TestD2Test {

	@Test
	public void testB3() {
		// Test scenario 1
		Caterpillar caterpillar = new Caterpillar();
		
		// Positive test cases
		assertEquals("A caterpillar can walk (crawl)", caterpillar.walk());
		assertEquals("A caterpillar cannot fly", caterpillar.fly());
		
		// Negative test cases
		assertNotEquals("A caterpillar can not walk (crawl)", caterpillar.walk());
		assertNotEquals("A caterpillar can fly", caterpillar.fly());
	}

}
