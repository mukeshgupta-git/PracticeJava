package JavaPracticeExampleArray;

import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.print("Enter The No. Of Element = ");
		Scanner objScanner = new Scanner(System.in);
		int n = objScanner.nextInt();
		System.out.println("Enter The Element  = ");
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = objScanner.nextInt();
			}
		}
		System.out.println("print original matrix = ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("print transpose of matrix = ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
