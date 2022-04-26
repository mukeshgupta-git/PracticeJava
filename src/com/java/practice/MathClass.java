
public class MathClass {

	public static void main(String[] args) {
		float A = 57;
		double B = 45.34;
		System.out.println("Max value is :" + Math.max(A, B));
		System.out.println("Min value is : " + Math.min(A, B));
		System.out.println("Square root  of A :" + Math.sqrt(A));
		System.out.println("Power of A and B :" + Math.pow(A, B));
		System.out.println("Logrithem of A :" + Math.log(A));
		System.out.println("Log of 10(A):" + Math.log10(A));
		System.out.println("Return tangent of A :" + Math.tan(A));
		System.out.println("Return sin of B :" + Math.sin(B));
		System.out.println(Math.abs(Math.abs(B)));
		
		// A constant holding the minimum value an int can have, -2^31.
		System.out.println(Math.abs(Integer.MIN_VALUE));
	}

}
