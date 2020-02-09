package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.birds.Chicken;
import com.singtel.animal.birds.Duck;

public class TestA2Test {

	@Test
	public void testA2() {
		// Test scenario 1
		Duck duck = new Duck();
		
		// Positive test cases
		assertEquals("A duck says : Quack, quack", duck.sound());
		assertEquals("A duck can swim", duck.swim());
		
		// Negative test cases
		assertNotEquals("A duck says : Cluckv, quack", duck.sound());
		assertNotEquals("A duck can not swim", duck.swim());

		Chicken chicken = new Chicken();
		
		// Positive test cases
		assertEquals("A chicken says: Cluck, cluck", chicken.sound());
		assertEquals("A chicken cannot fly", chicken.fly());
		
		// Negative test cases
		assertNotEquals("A chicken says: Cluck, quack", chicken.sound());
		assertNotEquals("A chicken can fly", chicken.fly());
	}
	



}
