package JavaPracticeExample;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number to chake armstrong or not = ");
		Scanner objScanner = new Scanner(System.in);
		int num = objScanner.nextInt();
		int temp = num;
		int original=num;
		int count = 0,rem =0;
		int armstrong =0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		for(int i=0;i<count;i++) {
			rem = temp%10;
			armstrong +=Math.pow(rem,count);
			temp=temp/10;
		}
		if(armstrong==original) {
			System.out.println(" Armstrong number ");
		}
		else {
			System.out.println("Not a armstrong number ");
		}
	}

}
