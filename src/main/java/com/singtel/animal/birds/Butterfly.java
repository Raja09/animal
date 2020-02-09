package com.singtel.animal.birds;

import com.singtel.animal.Bird;

public class Butterfly extends Bird {
	
	public Butterfly() {
		setFly(true);
	}
	
	@Override
	public String fly() {
		System.out.println("A butterfly can fly");
		return "A butterfly can fly";
	}

	@Override
	public String sing() {
		System.out.println("A butterfly does not make a sound");
		return "A butterfly does not make a sound";
	}
}
