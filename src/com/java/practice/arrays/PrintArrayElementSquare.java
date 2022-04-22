package com.java.practice.arrays;

import java.util.Scanner;

public class PrintArrayElementSquare {

	public static void main(String[] args) {
		System.out.print("Enter No Of Elements In Arrays:");
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int arr[] = new int[arraySize];
		System.out.println("Enter elements of arrays:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int s = 0;
		System.out.print("Array:" + "" + "[");

		// 1, 2, 3, 4, 5, 6
		// 1, 1*1+2*2, 5*5+3*3, ...
		// 1, 5, 34, ....
		for (int i = 0; i < arr.length; i++) {
			s = s * s + arr[i]*arr[i];
			System.out.print(s);
			if (i == arr.length - 1) {
				System.out.print("");
			} else {
				System.out.print(",");
			}

		}
		System.out.print("]");
	}

}
