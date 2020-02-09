package com.singtel.animal;

import com.singtel.animal.behaviour.SwimBehaviour;

public abstract class Fish extends Animal implements SwimBehaviour{

	public abstract String getColourAndSize();
	public abstract String getBehaviour();
	
	@Override
	public String walk() {
		System.out.println("Fishes don’t walk");
		return "Fishes don’t walk";
	}
	
	@Override
	public String sing() {
		System.out.println("Fishes don’t sing");
		return "Fishes don’t sing";
	}

	public String swim() {
		System.out.println("Fishes can swim");
		return "Fishes can swim";
	}

}
