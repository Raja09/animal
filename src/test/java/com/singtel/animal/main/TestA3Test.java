package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.birds.Rooster;

public class TestA3Test {

	@Test
	public void testA3() {
		
		// Test scenario 1
		Rooster rooster = new Rooster();
		
		// Positive test cases
		assertEquals("A rooster says : Cock-a-doodle-doo", rooster.sound("rooster"));
		assertEquals("A rooster cannot fly", rooster.fly());
		
		// Negative test cases
		assertNotEquals("A rooster says : Cock-a-doodle", rooster.sound("rooster"));
		assertNotEquals("A rooster can fly", rooster.fly());

	}
}
