package javaString;

import java.util.Scanner;

public class SubsetsOfString {

	public static void main(String[] args) {

		System.out.print("Enter the String = ");
		Scanner objScanner = new Scanner(System.in);
		String str = objScanner.next();

		int len = str.length();
		int temp = 0,count = 0;

		String arr[] = new String[len * (len + 1) / 2]; // Total Posibale substring

		for (int i = 0; i < len; i++) {

			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}

		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
			count++;
		}
		System.out.println("Total No of substring is = "+count);

	}

}
