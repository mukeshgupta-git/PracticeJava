package javaString;

import java.util.Scanner;

public class CountCharactersInString {

	public static void main(String[] args) {
		System.out.print("Enter the string = ");
		Scanner objsScanner = new Scanner(System.in);
		String string = objsScanner.nextLine();
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);

	}

}
