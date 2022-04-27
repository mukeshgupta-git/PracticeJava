import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		//System.out.println("Enter time in year ");
		//Scanner.sc = new Scanner(System.in);
	   //int time = sc.nextInt();
		double principla = 34343.0;
		double rate = .07;
		int year = 1;
		while (year<5) {
		double Interest = principla * rate ;
		principla = principla + Interest;
		System.out.println("The interest earned is Rs=" + Interest);
		System.out.println("The value of the investment after " + year +" "+ "year is Rs." + principla);
		year = year+1;
		}
	}

}
