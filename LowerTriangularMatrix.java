package JavaPracticeExampleArray;

public class LowerTriangularMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 2, 3, 5 }, { 6, 4, 3 }, { 1, 9, 8 } };

		int rows = arr.length;
		int cols = arr[0].length;

		if (rows != cols)
			System.out.println("For Lower Triangular Matrix It should be Square Matrix ");

		System.out.println("Print Lower Trianguler Matrix ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i < j)
					System.out.print("0"+" ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
