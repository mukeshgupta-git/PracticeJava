package com.java.practice.bank;

class Bicycle {

	protected int gear;
	public int speed;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public Bicycle() {
	}

	public void applyBrake(int decrement) {
		speed = speed - decrement;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
}

class MountainBike extends Bicycle {

	private int seatHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		this(gear, speed);
//		super(gear, speed);
		seatHeight = startHeight;
	}
	
	

	public MountainBike(int gear, int speed) {
		super(gear, speed);
		System.out.println("Gear : " + gear + " & speed : " + speed);
		this.seatHeight = 20;
	}



	// the MountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
	
	
}
