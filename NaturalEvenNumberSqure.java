
import java.util.Scanner;

public class NaturalEvenNumberSqure {

	public static void main(String[] args) {
		int Sum = 0;
		int Even = 2;
		Scanner obj = new Scanner(System.in);
		System.out.print("How Many Terms N = ");
		int N = obj.nextInt();
		for (int i = 0; i < N; i++) {
			Sum += Even * Even;
			Even = Even + 2;
		}
		System.out.println("Sum of N Even Natural of Square = " + Sum);
	}

}
