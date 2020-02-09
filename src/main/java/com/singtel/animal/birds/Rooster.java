package com.singtel.animal.birds;

import com.singtel.animal.Bird;
import com.singtel.animal.behaviour.FlyBehaviour;

public class Rooster extends Bird implements FlyBehaviour{
	
	public Rooster() {
		setWalk(true);
	}
	
	public void sound(String birdName) {
		if (birdName != null && "rooster".equalsIgnoreCase(birdName) == true) {
			System.out.println("A rooster says : Cock-a-doodle-doo");
		} else {
			System.out.println("A chicken says: Cluck, cluck");
		}

	}

	public String fly() {
		System.out.println("A rooster cannot fly");
		return "A rooster cannot fly";
	}
	
	
}
