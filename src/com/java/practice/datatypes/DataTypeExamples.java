package com.java.practice.datatypes;

import java.util.Arrays;

import com.java.practice.variables.VariableExamples;

public class DataTypeExamples {
	
	public static void main(String[] args) {
	
		// Numeric data type examples
		long indiaPopulation = 948878787878787878L;
		int mobileNumber = 1985748356;
		short districtPopulation = (short)84844;
		byte roomNumber = (byte)7474;
		
		byte oilRate = 100;
		short fiveLitterOilRate =  (short)(oilRate * 5);
		int fiveLitterOilRate1 = oilRate*5;
		long fiveLitterOilRate2 = oilRate*5;
		
		short familyCount = 5550;
		int indiaFamilyCount = familyCount * 10000000;
		long indiaFamilyCount1 = familyCount * 10000000;
		
		int mob11 = 98444444;
		long allMob11 = mob11*10;
		
		
		byte ddd = (byte) 200;
		byte ddd1 = 120;
		
		System.out.println("ddd=" + ddd);
		System.out.println("ddd1=" + ddd1);
		
		// Decimal data type examples
		float totalStoreRiceRate = 8474774744.44f;
		double totalStoreRiceRate1 = 8474774744.44;
		
		// Non numeric character data type
		char vowels = 'a';
		boolean isVowels = true; // false
		
		// User defined data type
		String employeeName = "Venkatesh";
		int[] arr = new int[5];
		String[] arr1 = new String[5];
		VariableExamples[] variableExamples = new VariableExamples[33];
		

	}

}
