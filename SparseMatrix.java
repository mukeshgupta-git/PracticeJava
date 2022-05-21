package JavaPracticeExampleArray;

public class SparseMatrix {

	public static void main(String[] args) {
		
		int arr[][] = { { 1,0,3},{6,0,0},{0,5,0}};
		
		int rows = arr.length;
		int cols = arr[0].length;
		int size = rows*cols;
		int count = 0;
		
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==0) {
					count+=1;
				}
			}
		}
		if(count>size/2) {
			System.out.println("Given Matrix is Sparse Matrix ");
		}
		else {
			System.out.println("Given Matrix is Not a Sparse Matrix ");
		}

	}

}
