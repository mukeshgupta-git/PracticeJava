package JavaPracticeExample;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		System.out.print("Enter the Num : ");
		Scanner objScanner = new Scanner(System.in);
		int Num = objScanner.nextInt();
		int count = 0;
		int square = Num * Num;
		while(Num>0) {
			count++;
			Num=Num/10;
		}
		while(count>0) {
			if(Num%10==square%10){
				Num = Num/10;
				square= square/10;
			}
		}

	}

}
