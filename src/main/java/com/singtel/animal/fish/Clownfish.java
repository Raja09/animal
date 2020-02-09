package com.singtel.animal.fish;

import com.singtel.animal.Fish;

public class Clownfish  extends Fish{
	
	public Clownfish() {
		setSwim(true);
	}
	
	@Override
	public String getColourAndSize() {
		System.out.println("Clownfish are small and colourful (orange)");
		return "Clownfish are small and colourful (orange)";
	}

	@Override
	public String getBehaviour() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}
	
}
