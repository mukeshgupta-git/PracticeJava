package JavaPracticeExampleArray;

public class LeftRotateElements {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 7, 1, 9, 8 };
		System.out.println("Given Array Are = ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		int start = arr[0];
		for (int j = 0; j < arr.length-1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[arr.length - 1] = start;

		System.out.println(" \n Array Ofter Rotated = ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
