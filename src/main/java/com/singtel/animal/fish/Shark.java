package com.singtel.animal.fish;

import com.singtel.animal.Fish;

public class Shark extends Fish {
	
	public Shark() {
		setSwim(true);
	}
	
	public String getColourAndSize() {
		System.out.println("Sharks are large and grey");
		return "Sharks are large and grey";
	}

	public String getBehaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}
}
