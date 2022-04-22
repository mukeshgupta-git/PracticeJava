package com.java.practice.controlflow;

import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		int ch;
		System.out.println("Enter you choise");
		Scanner obj = new Scanner(System.in);
		ch = obj.nextInt();
		switch (ch) {
		case 1:
			System.out.println("buy AC");
			break;
		case 2:
			System.out.println("buy laptop");
			break;
		case 3:
			System.out.println("buy tablet");
			break;
		case 4:
			System.out.println("buy phone");
		default:
			System.out.println("you can not buy any electronic device");
		}
	}
}
