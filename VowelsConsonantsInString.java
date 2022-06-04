package javaString;

import java.util.*;

public class VowelsConsonantsInString {

	public static void main(String[] args) {

		System.out.print("Enter the string = ");
		Scanner onjScanner = new Scanner(System.in);
		String string = onjScanner.nextLine();
		int VowelCount = 0, ConsCount = 0;

		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				VowelCount++;
			} else if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
				ConsCount++;
			}
		}
		System.out.println("No.of Consonant = " + ConsCount);
		System.out.println("No.of Vowel = " + VowelCount);

	}

}
