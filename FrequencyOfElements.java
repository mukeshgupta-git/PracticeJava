package JavaPracticeExampleArray;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 4, 3, 3, 2, 2, 2, 5, 3,5,5};

		int[] f = new int[a.length];
		int visit = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					f[j] = visit;
				}
			}
			if (f[i] != visit) {
				f[i] = count;
			}
		}
		System.out.println("-----------------");
		System.out.println("  Element | Frequency  ");
		for (int i = 0; i < f.length; i++) {
			if (f[i] != visit) {
				System.out.println("      " + a[i] + "      " + f[i]);
			}
			
		}
		System.out.println("------------------");
	}
}
