package com.singtel.animal.birds;

import com.singtel.animal.Bird;
import com.singtel.animal.behaviour.SoundBehaviour;
import com.singtel.animal.ref.BehaviourType;

public class Parrot extends Bird implements SoundBehaviour {

	private BehaviourType behaviourType;

	public Parrot() {
		setFly(true);
		setSing(true);

	}
	
	public Parrot(BehaviourType behaviourType) {
		this.behaviourType = behaviourType;
	}

	public String sound() {
		
		switch (behaviourType) {
		case SOUND_WITH_DOG:
			System.out.println(behaviourType.getSoundType());
			break;
		case SOUND_WITH_CAT:
			System.out.println(behaviourType.getSoundType());
			break;
		case SOUND_WITH_ROOSTER:
			System.out.println(behaviourType.getSoundType());
			break;
		case SOUND_WITH_DUCK:
			System.out.println(behaviourType.getSoundType());
			break;
		case SOUND_WITH_PHONE:
			System.out.println(behaviourType.getSoundType());
			break;
		default:
			break;
		}

		return null;
	}

}
