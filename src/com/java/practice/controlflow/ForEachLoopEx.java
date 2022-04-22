package com.java.practice.controlflow;

public class ForEachLoopEx {
	public static void main(String args[]) {
		String arr[] = { "buy phone", "buy charger", "buy eraphone", "buy simcard", "do recharge" };
		System.out.println("printing contant of array");
		for (String arra : arr) {
			System.out.println(arra);
		}
	}
}