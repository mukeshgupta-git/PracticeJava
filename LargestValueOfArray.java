package JavaPracticeExampleArray;

public class LargestValueOfArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {95, 17, 40, 77,6,98};  
 
        int max = arr[0];  
         int pos = 0;
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
           pos = i;
        }  
        System.out.println("Largest element present in given array: " + max);  
        System.out.println("Position Of Largest Value = "+pos);
	}

}
