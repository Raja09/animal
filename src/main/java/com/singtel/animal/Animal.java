package com.singtel.animal;

public abstract class Animal {

	public boolean isFly = false;
	public boolean isSwim = false;
	public boolean isWalk = false;
	public boolean isSing = false;

	public String walk() {
		System.out.println("I am walking");
		return "I am walking";
	}

	public String sing() {
		System.out.println("I am Singing");
		return "I am Singing";
	}

	public boolean isFly() {
		return isFly;
	}

	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}

	public boolean isSwim() {
		return isSwim;
	}

	public void setSwim(boolean isSwim) {
		this.isSwim = isSwim;
	}

	public boolean isWalk() {
		return isWalk;
	}

	public void setWalk(boolean isWalk) {
		this.isWalk = isWalk;
	}

	public boolean isSing() {
		return isSing;
	}

	public void setSing(boolean isSing) {
		this.isSing = isSing;
	}

}
