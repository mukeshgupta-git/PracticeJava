package JavaPracticeExample;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {

		/*
		 * System.out.print("Enter the number = ");
		 *  Scanner objScanner = new
		 * Scanner(System.in);
		 *  int Num = objScanner.nextInt();
		 *   int rev = 0;
		 *   int temp = Num;
		 *  while (Num > 0) { int Rem = Num % 10;
		 *   rev = rev * 10 + Rem;
		 *   Num = Num /10; }
		 *  if (temp == rev)
		 */

		System.out.print("Enter String = ");
		Scanner strScanner = new Scanner(System.in);
		String nameString = strScanner.nextLine();
		String rev="";
		int length = nameString.length();
		for (int i = length-1; i >= 0; i--) {
			rev = rev +nameString.charAt(i);
		}
		if (nameString.equals(rev)) {
			System.out.println("Number is a palindron ");
		} else {
			System.out.println("Number is not a palindron ");
		}
	}

}
