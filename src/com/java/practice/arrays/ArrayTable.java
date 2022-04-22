package com.java.practice.arrays;

import java.util.Scanner;

public class ArrayTable {
	public static void main(String args[]) {
		System.out.print("Give input No:=");
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt();
		System.out.println(" ---Table---");
		for (int i = 1; i <= Number; i++) {

			System.out.println(" "+"10" + "*" + i + "=" + 10 * i);
		}
	}
}
