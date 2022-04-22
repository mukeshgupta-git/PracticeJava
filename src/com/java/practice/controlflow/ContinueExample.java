package com.java.practice.controlflow;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		int i, j, n;
		System.out.println("Enter value of n");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 3 && j == 3)
					continue;
				System.out.print("  " + i + j);
			}

		}

	}
}
