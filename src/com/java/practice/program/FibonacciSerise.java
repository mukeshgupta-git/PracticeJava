package com.java.practice.program;

import java.util.Scanner;

public class FibonacciSerise {
	static int n1=0,n2=1,n3;
	static void printFibinacci(int count) {
		if(count>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			printFibinacci(count-1);
		}
	}
	public static void main(String[] args) {
	/*	int n1 = 0, n2 = 1, n3, count, i;
		System.out.println("Enter Value Of n");
		Scanner obj = new Scanner(System.in);
		count = obj.nextInt();
		System.out.print("Print Fibonacci Serise\n");

		System.out.print(n1 + " " + n2);
		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
		*/
		
		int count=8;
		System.out.print(n1+" "+n2);
		printFibinacci(count-2);
		
	}

}
