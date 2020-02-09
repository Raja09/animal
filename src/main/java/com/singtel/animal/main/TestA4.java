package com.singtel.animal.main;

import com.singtel.animal.birds.Parrot;
import com.singtel.animal.ref.BehaviourType;

public class TestA4 {

	public static void main(String[] args) {
		
		Parrot parrotWithDog = new Parrot(BehaviourType.SOUND_WITH_DOG);
		parrotWithDog.sound();
		
		Parrot parrotWithCat = new Parrot(BehaviourType.SOUND_WITH_CAT);
		parrotWithCat.sound();
		
		Parrot parrotWithRooster = new Parrot(BehaviourType.SOUND_WITH_ROOSTER);
		parrotWithRooster.sound();
		
		Parrot parrotWithDuck = new Parrot(BehaviourType.SOUND_WITH_DUCK);
		parrotWithDuck.sound();		
		
		Parrot parrotWithPhone = new Parrot(BehaviourType.SOUND_WITH_PHONE);
		parrotWithPhone.sound();
	}

}
