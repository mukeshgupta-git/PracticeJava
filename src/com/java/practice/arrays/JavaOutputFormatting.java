package com.java.practice.arrays;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");

		for (int i = 0; i < 3; i++) {
			String s1 = sc.nextLine();
			int x = sc.nextInt();
			System.out.println( "s1"+ "               " + x);
		}
		System.out.println("================================");

	}
}
