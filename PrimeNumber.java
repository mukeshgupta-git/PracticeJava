import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number = ");
		int Number = obj.nextInt();

		System.out.print("The Seriese Of Prime Number = ");
		for (int i = 2; i <= Number; i++) {
			int n = 1;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					n = n * 0;
				} else {
					n = n * 1;
				}
			}
			if (n == 1)

				System.out.print(i + " ");

		}

	}
}
