package com.java.practice.classblock;

public class InstanceBlockExample {

	String test;
	static String ADDRESS;

	{
		test = "Setting test from instant block";
		System.out.println("Log from instant block1");
	}

	static {
		System.out.println("Log from static block1");
		int a = 7;
		int b = 10;
		int sum = a + b;
		System.out.println("Sum : " + sum);
	}

	{
		System.out.println("Log from instant block2");
	}

	public static void main(String[] args) {
		System.out.println("Hello from main method");
//		InstanceBlockExample iExample = new InstanceBlockExample();
//		iExample.test = "Test";
//		iExample.ADDRESS = "Padrauna";
//
//		System.out.println("test: " + iExample.test);
//		System.out.println("ADDRESS : " + InstanceBlockExample.ADDRESS);
		

		System.out.println("Testing static block code: " + InstanceBlockExample.ADDRESS);
	}

	static {
		System.out.println("Log from static block2");
	}
}
