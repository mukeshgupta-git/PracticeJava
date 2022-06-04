package javaString;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagram {

	public static void main(String[] args) {
		System.out.print("Enter the first string = ");
		Scanner strScanner = new Scanner(System.in);
		String str1 = strScanner.nextLine();
		System.out.print("Enter the second string = ");
		String str2 = strScanner.nextLine();
		/*
		 * str1 = str1.toLowerCase(); str2 = str2.toLowerCase();
		 * 
		 * int n1 = str1.length(); int n2 = str2.length(); if (n1 != n2) {
		 * System.out.println("Given string not an Anagram "); } else {
		 * 
		 * char str, str3; int count = 0; for (int i = 0; i < n1; i++) { str =
		 * str1.charAt(i); for (int j = 0; j < n2; j++) { str3 = str2.charAt(j); if
		 * (str== str3) { count++; } else {
		 * 
		 * } } } if (n1 == count) { System.out.println("Yes it is an Anagram"); } else {
		 * System.out.println("Not an Anagram"); } }
		 * 
		 * }
		 */

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array

			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort ()

			Arrays.sort(string1);
			Arrays.sort(string2);

			// Comparing both the arrays using in-built function equals ()

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}
