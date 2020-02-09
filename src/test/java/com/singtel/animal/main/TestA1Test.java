package com.singtel.animal.main;

import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.animal.Bird;

public class TestA1Test {

	@Test
	public void testA1() {
		// Test scenario 1
		Bird bird = new Bird();
		
		// Positive test cases
		assertEquals("I am walking", bird.walk());
		assertEquals("I am flying", bird.fly());
		assertEquals("I am singing", bird.sing());
		
		// Negative test cases
		assertNotEquals("unable to walking", bird.walk());
		assertNotEquals("unable to fly", bird.fly());
		assertNotEquals("unable to sing", bird.sing());

	}
	



}
