package com.java.practice.controlflow;

import java.util.Scanner;

public class DoWhileLoopEx {
	public static void main(String args[]) {
		int amount;
		System.out.println("Enter amount");
		Scanner obj = new Scanner(System.in);
		amount = obj.nextInt();
		int totalLaptop = 0;
		do {
			amount = amount - 40000;
			totalLaptop++;
		} while (amount > 20000);
		System.out.println("You bought => " + totalLaptop + " laptop");
	}
}
