package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.Bird;
import com.singtel.animal.birds.Butterfly;
import com.singtel.animal.fish.Dolphin;

public class TestD1Test {

	@Test
	public void testD1() {
		// Test scenario 1
		Bird butterfly = new Butterfly();

		butterfly.fly();
		butterfly.sing();
		
		// Positive test cases
		assertEquals("A butterfly can fly", butterfly.fly());
		assertEquals("A butterfly does not make a sound", butterfly.sing());
		
		// Negative test cases
		assertNotEquals("A butterfly can not fly", butterfly.fly());
		assertNotEquals("A butterfly does make a sound", butterfly.sing());
	}

}
