package com.java.practice.objects;

import java.util.Date;

public class TestExamples {

	public static void main(String[] args) throws Exception {
//		Account account = new Account();
//		account.insert(75020079,"abhishek",1000);
//		account.display();
//		account.checkBalanc();
//		account.deposit(10500);

		Delivery delivery = new Delivery("Aagra", "Gorakhpur", 10, 500, "UPI"
				,"AWS", new Date(), "Mukesh", 8767876L, "Plastic");
		
		System.out.println(delivery);

	}

}
