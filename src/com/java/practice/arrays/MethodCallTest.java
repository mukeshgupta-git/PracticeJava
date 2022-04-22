package com.java.practice.arrays;

import java.util.Scanner;

public class MethodCallTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name to get details");
		String actionString = scanner.nextLine();
		if (actionString.equals("Mobile")) {
			int mobileCount = printMobileDetails();
			System.out.print("Total mobile in shop: " + mobileCount);
		} else {
			int laptopCount = printLaptopDetails();
			System.out.print("Total laptop in shop: " + laptopCount);
		}

	}

	private static int printLaptopDetails() {
		return 10;

	}

	private static int printMobileDetails() {
		printShopName();
		return 50;
	}

	private static void printShopName() {
		System.out.println("Shop name: RX Electronic");

	}

}
