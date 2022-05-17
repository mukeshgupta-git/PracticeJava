package JavaPracticeExampleArray;

public class DuplicatElement {

	public static void main(String[] args) {
		  
        int [] arr = new int [] {3,4,5,2,8,7,6,9,4,5,3,2};  
        System.out.print("Duplicate elements in given array: ");  
         
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.print(" "+arr[j]);  
            }  
        }  
	}

}
