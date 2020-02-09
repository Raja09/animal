package com.singtel.animal.birds;

import com.singtel.animal.Bird;
import com.singtel.animal.behaviour.SoundBehaviour;
import com.singtel.animal.behaviour.SwimBehaviour;

public class Duck extends Bird implements SoundBehaviour, SwimBehaviour {

	public Duck() {
		setSwim(true);

	}

	public String sound() {
		System.out.println("A duck says : Quack, quack");
		return "Quack, quack";
	}

	public String swim() {
		System.out.println("A duck can swim");
		return "A duck can swim";
	}

}
