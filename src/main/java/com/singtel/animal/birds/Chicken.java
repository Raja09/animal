package com.singtel.animal.birds;

import com.singtel.animal.Bird;
import com.singtel.animal.behaviour.FlyBehaviour;
import com.singtel.animal.behaviour.SoundBehaviour;

public class Chicken extends Bird implements SoundBehaviour, FlyBehaviour {

	public Chicken() {
		setWalk(true);
	}
	
	public String sound() {
		System.out.println("A chicken says: Cluck, cluck");
		return "Cluck, cluck";
	}

	public String fly() {
		System.out.println("A chicken cannot fly");
		return "A chicken cannot fly";
	}

}
