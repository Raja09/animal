package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.Fish;
import com.singtel.animal.fish.Clownfish;
import com.singtel.animal.fish.Shark;

public class TestB2Test {

	@Test
	public void testB2() {
		// Test scenario 1
		Fish sharkFish = new Shark();
		Fish clownfish = new Clownfish();

		// Positive test cases
		assertEquals("Sharks are large and grey", sharkFish.getColourAndSize());
		assertEquals("Clownfish are small and colourful (orange)", clownfish.getColourAndSize());
		assertEquals("Clownfish make jokes", clownfish.getBehaviour());
		assertEquals("Sharks eat other fish", sharkFish.getBehaviour());
		
		// Negative test cases
		assertNotEquals("Sharks are not large and grey", sharkFish.getColourAndSize());
		assertNotEquals("Clownfish are not small and colourful (orange)", clownfish.getColourAndSize());
		assertNotEquals("Clownfish not make jokes", clownfish.getBehaviour());
		assertNotEquals("Sharks are not eat other fish", sharkFish.getBehaviour());
	}
	



}
