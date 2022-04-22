package com.java.practice.inheritance;

import java.util.ArrayList;

class TestAAA {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList<>();
		arrayList.add(34);
		arrayList.add(35);
		boolean have35 = arrayList.contains(35);
		System.out.println("List contains 35: " + have35);
		System.out.println(arrayList);

	}

}
