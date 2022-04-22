package com.java.practice.controlflow;

import java.util.Iterator;
import java.util.Scanner;

public class ForLoopExample {
	public static void main(String args[]) {
		int n, i, j;
		System.out.println("Enter value of n");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
