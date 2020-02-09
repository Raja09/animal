package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.singtel.animal.birds.Chicken;
import com.singtel.animal.birds.Parrot;
import com.singtel.animal.ref.BehaviourType;

public class TestA4Test {

	@Test
	public void testA4() {
		// Test scenario 1
		Parrot parrotWithDog = new Parrot(BehaviourType.SOUND_WITH_DOG);
		Parrot parrotWithCat = new Parrot(BehaviourType.SOUND_WITH_CAT);
		Parrot parrotWithRooster = new Parrot(BehaviourType.SOUND_WITH_ROOSTER);
		Parrot parrotWithDuck = new Parrot(BehaviourType.SOUND_WITH_DUCK);
		Parrot parrotWithPhone = new Parrot(BehaviourType.SOUND_WITH_PHONE);
		
		// Positive test cases
		assertEquals("A parrot living with dogs says: Woof, woof", parrotWithDog.sound());
		assertEquals("A parrot living with cats says: Meow", parrotWithCat.sound());
		assertEquals("A parrot living near the rooster says: Cock-a-doodle-doo", parrotWithRooster.sound());
		assertEquals("A parrot living with duck says: Quack, quack", parrotWithDuck.sound());
		assertEquals("A parrot living near the phone says: Ring Ring", parrotWithPhone.sound());
		
		// Negative test cases
		assertNotEquals("A parrot not living with dogs says: Woof", parrotWithDog.sound());
		assertNotEquals("A parrot not living with cats says: Meowwww", parrotWithCat.sound());
		assertNotEquals("A parrot not living near the rooster says: Cock-a-doodle", parrotWithRooster.sound());
		assertNotEquals("A parrot not living with duck says: Quack", parrotWithDuck.sound());
		assertNotEquals("A parrot not living near the phone says: Ring", parrotWithPhone.sound());
	}
	



}
