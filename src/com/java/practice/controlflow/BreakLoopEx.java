package com.java.practice.controlflow;

public class BreakLoopEx {
	public static void main(String[] args) {
		int n = 8;

		externalForLoop: for (int j = 0; j < 10; j++) {
			internalForLoop: for (int i = 0; i < n; i++) {
				if (i == 5) {
					break internalForLoop;
				}
				System.out.println(i + " " + j);

			}
		}
	}
}
