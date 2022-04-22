package com.java.practice.animal;

public abstract class Animal {

	protected String name;
	protected String colour;
	protected int weight;
	
	public boolean canBeLifted() {
		return this.weight < 100000;
	}
}
