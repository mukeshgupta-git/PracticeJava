package com.java.practice.animal;

public class TestAnimal {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.name = "Heavy black dog";
//		dog.colour = "black";
//		dog.speakType = "barking";
//		System.out.println(dog.name);

//		Lion lion = new Lion();
//		lion.name = "Tiger";
//		lion.colour = "Black";
//		lion.livingPlace = "Jungle";
//		lion.weight = 500;
//
//		System.out.println(lion.canBeLifted());

		Animal animal = new Lion();
		animal.name = "Tiger";
		animal.colour = "Black";
//		animal.livingPlace = "Jungle";
		animal.weight = 500;
//		animal.speakType = "Shouting";

		Lion lion = (Lion) animal;
		lion.livingPlace = "Jungle";
		lion.speakType = "Shouting";

		System.out.println(animal.canBeLifted());

	}
}
