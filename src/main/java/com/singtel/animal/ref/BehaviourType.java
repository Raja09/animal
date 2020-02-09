package com.singtel.animal.ref;

public enum BehaviourType {

	SOUND_WITH_DOG("A parrot living with dogs says: Woof, woof"), 
	SOUND_WITH_CAT("A parrot living with cats says: Meow"), 
	SOUND_WITH_ROOSTER("A parrot living near the rooster says: Cock-a-doodle-doo") ,
	SOUND_WITH_DUCK("A parrot living with duck says: Quack, quack"), 
	SOUND_WITH_PHONE("A parrot living near the phone says: Ring Ring");

	private String soundType;

	BehaviourType(String soundType) {
		this.soundType = soundType;
	}
	
	public String getSoundType() {
        return soundType;
    }
}
