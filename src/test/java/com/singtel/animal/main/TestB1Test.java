package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.Fish;
import com.singtel.animal.fish.Shark;

public class TestB1Test {

	@Test
	public void testB1() {
		// Test scenario 1
		Fish fish = new Shark();
		
		// Positive test cases
		assertEquals("Fishes don’t sing", fish.sing());
		assertEquals("Fishes don’t walk", fish.walk());
		assertEquals("Fishes can swim", fish.swim());
		
		// Negative test cases
		assertNotEquals("Fishes can sing", fish.sing());
		assertNotEquals("Fishes can walk", fish.walk());
		assertNotEquals("Fishes can not swim", fish.swim());
	}
	



}
