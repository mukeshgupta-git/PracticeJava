package JavaPracticeExampleArray;

public class SumOfRowAndColumnOfMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 2, 4, 6 }, { 7, 4, 8 }, { 1, 9, 5 } };
		
		int rows = arr.length;
		int cols = arr[0].length;
		int sum = 0;
		System.out.println("Sum of rows = ");
		for(int i =0;i<rows;i++) {
			sum =0;
			for(int j=0;j<cols;j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of "+(i+1)+" rows is "+sum);
		}

		System.out.println("Sum of cols is = ");
		for(int i =0;i<cols;i++) {
			sum =0;
			for(int j=0;j<rows;j++) {
				sum += arr[j][i];
			}
			System.out.println("Sum of "+(i+1)+" cols is "+sum);
		}
	}

}
