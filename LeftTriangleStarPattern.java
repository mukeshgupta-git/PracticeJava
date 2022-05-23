package JavaPracticeExample;

import java.util.*;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {

		System.out.print("Enter the No of line to print star = ");
		Scanner objScanner = new Scanner(System.in);
		int N = objScanner.nextInt();
		int i, j;
		for (i = 0; i < N; i++) {
			for (j = 0; j < 2 * (N - i); j++) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}