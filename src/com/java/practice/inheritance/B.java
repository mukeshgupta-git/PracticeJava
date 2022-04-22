package com.java.practice.inheritance;

public class B {
	void show() {
		System.out.println("Welcome");
	}
}

class c extends B {
	@Override
	void show() {
		System.out.println("To Java");
	}
}
