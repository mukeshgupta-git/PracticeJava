package com.java.practice.variables;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int a;
		boolean b = false;
		boolean c = true;
		int d = 3;
		System.out.println("Enter Number ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		System.out.println(~a);	//prefix operator = ~,!
		System.out.println(!c);
		System.out.println(!b);
		System.out.println(a*d/a%a*d*d/a);
		System.out.println(a<<d);	//a*2^d
		System.out.println(a>>d);	// a/2^d
		System.out.println(a%d);
		System.out.println(a<d?a:d);
		System.out.println(b&&a>d);	//Retrun type is boolean
		System.out.println(c&a>d);	//Retutrn type is int,Lang,short,byte...
		System.out.println(b||a>d);

	}

}
