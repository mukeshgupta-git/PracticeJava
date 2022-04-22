package com.java.practice.ioexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) throws FileNotFoundException {
		// Input through file
//		Scanner scanner = new Scanner(new FileInputStream("D:\\Data.txt"));
//		String line1 = scanner.nextLine();
//		String line2  = scanner.nextLine();
//		System.out.println("Input num: " + line1 + "\n " + line2);

		// Input through scanner

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("My name is: " + name);

		System.out.println("Enter mobile no: ");
		long mobileNo = Long.valueOf(scanner.nextLine());
		System.out.println("My mobile no is : " + mobileNo);
		
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("My address is : " + address);
	
		System.out.println("you have a iphone or not");
		boolean iphone = Boolean.valueOf(scanner.nextLine());
		System.out.println("Enter y or n : " + iphone);
		scanner.next();
		System.out.println("My friends are : ");
		String friends = scanner.nextLine();
		System.out.println("My friends are : " + " " + friends);
	}

}
