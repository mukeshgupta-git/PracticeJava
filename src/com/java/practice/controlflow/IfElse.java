package com.java.practice.controlflow;

import java.util.Scanner;

public class IfElse {
	public static void main(String args[]) {
		System.out.println("Enter You Amount");
		Scanner obj = new Scanner(System.in);
		int amount = obj.nextInt();
		if (amount > 80000) {
			System.out.println("You Can Buy Iphone");
		} else if (amount > 0) {
			System.out.println("You Can Buy Android Phone");
		} else {
			System.out.println("You can't buy anthing without money");
		}

	}
}
