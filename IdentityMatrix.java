package JavaPracticeExampleArray;

import java.util.*;

public class IdentityMatrix {

	public static void main(String[] args) {
		
	       System.out.print("Enter rows = ");
	       Scanner objScanner = new Scanner(System.in);
	       int rows = objScanner.nextInt();
	       System.out.print("Enter cols = ");
	       int cols = objScanner.nextInt();
	       
	        boolean flag = true; 
	        int a[][] = new int[rows][cols];
	        System.out.println("Enter the Element of Matrix ");
	     for(int i=0;i<rows;i++) {
	    	 for(int j=0;j<cols;j++) {
	    		 a[i][j] = objScanner.nextInt();
	    	 }
	     }
	     System.out.println("Given Matrix is = ");
	              for(int i=0;i<rows;i++) {
	            	  for(int j =0;j<cols;j++) {
	            		  System.out.print(" "+a[i][j]+" ");
	            	  }
	            	  System.out.println();
	              }
	        if(rows != cols){    
	            System.out.println("Matrix should be a square matrix");
	            System.out.println("Mstrix not an Identity Matrix ");
	        }    
	        else {    
	          
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i == j && a[i][j] != 1){    
	                      flag = false;    
	                      break;    
	                  }    
	                  if(i != j && a[i][j] != 0){    
	                      flag = false;    
	                      break;    
	                  }    
	                }    
	            }    
	                
	            if(flag)    
	                System.out.println("Given matrix is an identity matrix");    
	            else    
	                System.out.println("Given matrix is not an identity matrix");    
	        }    
	}

}
