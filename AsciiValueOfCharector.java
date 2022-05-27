package JavaPracticeExample;

import java.util.*;

public class AsciiValueOfCharector {

	public static void main(String[] args) {
		System.out.print("Enter a charector = ");
		Scanner objScanner = new Scanner(System.in);
		char  ch = objScanner.next().charAt(0);
		int asciiaValue = ch;
		System.out.println("print ascii value of "+ch+ " is = "+asciiaValue);
	}

}
