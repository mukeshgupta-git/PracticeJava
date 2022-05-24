package JavaPracticeExample;
import java.util.*;
public class DiamondShapePattern {

	public static void main(String[] args) {
		
		System.out.print("Enter the No. of line = ");
		Scanner objScanner = new Scanner(System.in);
		int N = objScanner.nextInt();
	    int i,j,k;
	    for(i=0;i<N;i++) {
	    	for(j=0;j<N-i;j++) {
	    		System.out.print(" ");
	    	}
	    	for(k=0;k<=i;k++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	    
	    for(i=N;i>=0;i--) {
	    	for(j=0;j<N-i;j++) {
	    		System.out.print(" ");
	    	}
	    	for(k=0;k<=i;k++) {
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	}

}
