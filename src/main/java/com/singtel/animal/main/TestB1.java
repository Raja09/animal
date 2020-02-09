package com.singtel.animal.main;

import com.singtel.animal.Fish;
import com.singtel.animal.birds.Parrot;
import com.singtel.animal.fish.Shark;
import com.singtel.animal.ref.BehaviourType;

public class TestB1 {

	public static void main(String[] args) {
		
		Fish fish = new Shark();
		fish.sing();
		fish.walk();
		fish.swim();
	}

}
