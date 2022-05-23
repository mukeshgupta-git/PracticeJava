package JavaPracticeExample;

import java.util.*;

public class PyramidStarPattern {

	public static void main(String[] args) {

		System.out.print("Enter No. of lines in yramid = ");
		Scanner objScanner = new Scanner(System.in);
		int N = objScanner.nextInt();
		int i, j;
		for (i = 0; i < N; i++) {
			for (j = 0; j <= (N - i); j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
