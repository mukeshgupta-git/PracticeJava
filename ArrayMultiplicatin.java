package JavaPracticeExample;

import java.util.*;

public class ArrayMultiplicatin {

	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 6, 7, 8 } };
		int b[][] = { { 2, 3, 5 }, { 5, 7, 9 },  { 3, 1, 2 } };
		int c[][] = new int[3][3];
		System.out.println("Multiplication Of Array ");
		for (int i = 0; i < 2; i++) { // row
			for (int j = 0; j < 3; j++) { // column
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(" "+c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
