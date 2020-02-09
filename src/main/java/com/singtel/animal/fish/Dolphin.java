package com.singtel.animal.fish;

import com.singtel.animal.Animal;
import com.singtel.animal.behaviour.SwimBehaviour;

public class Dolphin extends Animal implements SwimBehaviour{

	public Dolphin() {
		setSwim(true);
	}
	
	public String swim() {
		System.out.println("Dolphins are good swimmers");
		return "Dolphins are good swimmers"; 
	}

}
