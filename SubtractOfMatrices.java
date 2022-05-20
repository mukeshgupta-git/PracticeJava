package JavaPracticeExampleArray;

public class SubtractOfMatrices {

	public static void main(String[] args) {
		int rows, cols;

		int a[][] = { { 4, 5, 6 }, { 3, 4, 11 }, { 1, 2, 6 } };

		int b[][] = { { 2, 10, 3 }, { 2, 3, 1 }, { 8, 1, 4 } };

		rows = a.length;
		cols = a[0].length;

		int c[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}

		System.out.println("Subtraction of two matrices: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(" "+c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
