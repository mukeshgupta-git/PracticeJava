package com.java.practice.objects;

public class CustomerAccount {

	static String BANK_NAME;
	long customerAccountNo;
	String customerName;

	public CustomerAccount(long accountNo, String accName) {
		customerAccountNo = accountNo;
		customerName = accName;
	}

	void printAccountHolderDetails() {
		System.out.println("Customer Account Details");
		System.out.println("Customer Account Number" + customerAccountNo);
		System.out.println("Customer Name" + customerName);
	}
}
