package com.java.practice.arrays;

import com.java.practice.constructor.Employee;

public class ArrayExamples {

//	public static void main(String[] args) {
//		int arr[] = { 2, 5, 4 };
//		int a[] = new int[5];
//		
//		
//	}

	// non static method
//	void sayHello() {
//		System.out.println("Hello from non static method");
//		printArray(null);
//	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String args[]) {
		printArray(new int[] { 10, 22, 44, 66 });// passing anonymous array to method
	}
}
