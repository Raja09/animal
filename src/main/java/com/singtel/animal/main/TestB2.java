package com.singtel.animal.main;

import com.singtel.animal.Fish;
import com.singtel.animal.fish.Clownfish;
import com.singtel.animal.fish.Shark;

public class TestB2 {

	public static void main(String[] args) {

		Fish sharkFish = new Shark();
		Fish clownfish = new Clownfish();

		sharkFish.getColourAndSize();
		clownfish.getColourAndSize();
		clownfish.getBehaviour();
		sharkFish.getBehaviour();
		

	}

}
