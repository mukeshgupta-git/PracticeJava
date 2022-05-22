

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Enter Decimal Number ");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.print("Equal Binary Number is ");
		int a[] = new int[100];
		int index = 0;
		while (num!=0) {
			int k = num % 2;
			num=num/2;
			a[index++] = k;
		}
		for(int i =0;i<index;i++)
		System.out.print(a[i]);
	}
}
