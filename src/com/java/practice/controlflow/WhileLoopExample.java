package com.java.practice.controlflow;

import java.util.Scanner;

public class WhileLoopExample {
	public static void main(String args[]) {
		int amount;
		System.out.println("Enter the amount");
		Scanner obj = new Scanner(System.in);
		amount = obj.nextInt();
		while (amount >= 5000) {
			System.out.println("buy can phone");
			amount = amount - 10000;
		}
		System.out.println("you can not buy phone");
	}
}
