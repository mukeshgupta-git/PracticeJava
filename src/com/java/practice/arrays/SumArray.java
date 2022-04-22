// Print array like: [1, 2, 3, 4]

package com.java.practice.arrays;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		System.out.print("Enter No Of Elements In Arrays:");
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int arr[] = new int[arraySize];
		System.out.println("Enter elements of arrays:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		System.out.print("Array:" + "" + "[");
		// Program to print sum till number
		// 1, 2, 3, 4, 5, 6
		// 1, 3, 6, 10, 15, 21

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(sum);
			if (i == arr.length - 1) {
				System.out.print("");
			} else {
				System.out.print(",");
			}

		}
		System.out.print("]");
	}
}
