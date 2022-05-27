package JavaPracticeExample;

import java.util.Scanner;

public class BatterflyPattern {

	public static void main(String[] args) {
		System.out.print("Enter the No of line = ");
		Scanner objScanner = new Scanner(System.in);
		int N = objScanner.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int space = 2 * (N - i);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = N; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int space = 2 * (N - i);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
