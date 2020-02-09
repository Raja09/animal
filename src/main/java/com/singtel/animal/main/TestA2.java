package com.singtel.animal.main;

import com.singtel.animal.birds.Chicken;
import com.singtel.animal.birds.Duck;

public class TestA2 {

	public static void main(String[] args) {

		Duck duck = new Duck();
		duck.sound();
		duck.swim();
		
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.fly();
	}

}
