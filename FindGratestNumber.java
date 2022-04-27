import java.util.Scanner;

import javax.crypto.Mac;

public class FindGratestNumber {
	public static void main(String[] args) {

		// When Use In Input Number
		/*
		 * Scanner obj = new Scanner(System.in);
		 * System.err.println("Enter the value of a = "); int a = obj.nextInt();
		 * System.out.println("Enter the value of b ="); int b = obj.nextInt();
		 * System.out.println("Enter the value of c = "); int c = obj.nextInt(); if (a >
		 * b && b > c) { System.out.println("a is gratest"); } else if (b > a && b > c)
		 * { System.out.println("b is gratest"); } else {
		 * System.out.println("c is gratest"); }
		 *
		 */
		
		/*
		 * int a= 23, b = 34, c = 89; int max,min; max = min = a; if(max<b)max = b;
		 * if(max<c)max = c;
		 * 
		 * if(min>b)min = b; if(min>c)min = c; System.out.println("Maximum Number =" +
		 * max); System.out.println("Minimum Number =" + min);
		 */
		
		// Find Max. And Min. Using Ternary Operator
		int a = 23, b = 34, c = 9;
		int max, min;
		max = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		min = (a < b ? (a < c ? a : c) : (b < c ? b : c));
		System.out.println("Maximum Number = "+max);
		System.out.println("Minimum Number = "+min);
	}
}
