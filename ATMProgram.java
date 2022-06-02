package JavaPracticeExample;

import java.util.*;

public class ATMProgram {

	public static void main(String[] args) {

		int Bailence = 50000, withdraw, diposite;
		System.out.println("Welcome To Automated Teller Machine ");
		System.out.println("choose 1 for withdraw mony");
		System.out.println("choose 2 for diposite mony");
		System.out.println("choose 3 for check bailence");
		System.out.println("choose 4 for exit");
		System.out.print("Enter Your Choice = ");

		Scanner objScanner = new Scanner(System.in);
		int choice = objScanner.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter withdraw amount = ");
			int amount = objScanner.nextInt();
			if (Bailence >= amount) {
				Bailence = Bailence - amount;
				System.out.print("Please collect your money ");
				System.out.print("\nYour available bailence is = "+Bailence);
			} else {
				System.out.print("Enter Suficient amount ");
			}
			System.out.println();
			break;
		case 2: {
			System.out.print("Enter Deposite Mony = ");
			int depositeMeny = objScanner.nextInt();

			Bailence = Bailence + depositeMeny;
			System.out.println("Now your courrent Bailece is = "+Bailence);
		}
			break;
		case 3: {
			System.out.print("Your abailable bailence is = " + Bailence);

		}
			break;
		case 4:
			System.exit(0);
			break;
		}
	}
}
