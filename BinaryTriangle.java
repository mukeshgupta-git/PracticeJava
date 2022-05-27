package JavaPracticeExample;

import java.util.Scanner;

import JavaPracticeExampleArray.SumOfRowAndColumnOfMatrix;

public class BinaryTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the No of line = ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j,sum =0;
		for(i=0;i<N;i++) {
			for(j=0;j<=i;j++) {
				sum = (i+j);
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
