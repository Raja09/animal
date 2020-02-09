package com.singtel.animal.main;

import com.singtel.animal.Animal;
import com.singtel.animal.birds.Butterfly;
import com.singtel.animal.birds.Chicken;
import com.singtel.animal.birds.Duck;
import com.singtel.animal.birds.Parrot;
import com.singtel.animal.birds.Rooster;
import com.singtel.animal.fish.Clownfish;
import com.singtel.animal.fish.Dolphin;
import com.singtel.animal.fish.Shark;

public class TestE1 {

	public static void main(String[] args) {

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
				// new Frog(),
				// new Dog(),
				new Butterfly(),
				// new Cat()
		};
		for (int i = 0; i < animals.length; i++) {
			System.out.println("Animal name:" + animals[i]);
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
		System.out.println("Fly Animals count:" + flyCount);
		System.out.println("Sing Animals count:" + singCount);
		System.out.println("Walk Animals count:" + walkCount);
		System.out.println("Swim Animals count:" + swimCount);

	}

}
