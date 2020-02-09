package com.singtel.animal.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.animal.Animal;
import com.singtel.animal.birds.Butterfly;
import com.singtel.animal.birds.Chicken;
import com.singtel.animal.birds.Duck;
import com.singtel.animal.birds.Parrot;
import com.singtel.animal.birds.Rooster;
import com.singtel.animal.fish.Clownfish;
import com.singtel.animal.fish.Dolphin;
import com.singtel.animal.fish.Shark;

public class TestE1Test {

	@Test
	public void testE1() {
		
		int flyCount = 0;
		int swimCount = 0;
		int walkCount = 0;
		int singCount = 0;

		Animal[] animals = new Animal[] { 
									new Duck(), 
									new Chicken(), 
									new Rooster(), 
									new Parrot(), 
									new Shark(),
									new Clownfish(), 
									new Dolphin(),
									new Butterfly(),
							};
		
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].isFly()) {
				flyCount = flyCount + 1;
			}
			if (animals[i].isSing()) {
				singCount = singCount + 1;
			}
			if (animals[i].isWalk()) {
				walkCount = walkCount + 1;
			}
			if (animals[i].isSwim()) {
				swimCount = swimCount + 1;
			}
		}
		
		// Positive test cases
		assertEquals(2, flyCount);
		assertEquals(4, swimCount);
		assertEquals(2, walkCount);
		assertEquals(1, singCount);
		
		// Negative test cases
		assertEquals(3, flyCount);
		assertEquals(3, swimCount);
		assertEquals(3, walkCount);
		assertEquals(2, singCount);
	}

}
