package JavaPracticeExampleArray;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int a[][] = { {3,4,7},{8,2,9},{8,3,5}};
		int b[][] = {{3,2,5},{4,6,8},{4,3,6}};
		int c[][] = new int [3][3];
		for(int i =0;i<3;i++) {
			for(int j =0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print( " "+c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
