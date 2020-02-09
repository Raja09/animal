package com.singtel.animal.birds;

import com.singtel.animal.Animal;
import com.singtel.animal.behaviour.FlyBehaviour;

public class Caterpillar extends Animal implements FlyBehaviour {

	public Caterpillar() {
		setWalk(true);
	}

	@Override
	public String walk() {
		System.out.println("A caterpillar can walk (crawl)");
		return "A caterpillar can walk (crawl)";
	}

	public String fly() {
		System.out.println("A caterpillar cannot fly");
		return "A caterpillar cannot fly";
	}

}
