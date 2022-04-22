package com.java.practice.objects;

public class Account {
	int accountNo;
	String name;
	float amount;

	public void insert(int a, String n, float amt) {
		accountNo= a;
		name = n;
		amount = amt;
	}

	public void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposit");
	}

	public void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("insufficient amount ");
		} else {
			amount = amount - amt;
			System.out.println(amt + "withdrawn");
		}
	}
	public void checkBalanc() {
		System.out.println("balance is"+amount);
	}
	public void display() {
		System.out.println(accountNo+""+name+""+amount);
	}
	
}
