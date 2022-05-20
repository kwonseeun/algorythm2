package algorythm6;

import java.util.Arrays;

public class example12 {

	public static void main(String[] args) {
		int[]values = { 3,23,16,5,15,65 };
		System.out.println( "ORIGINAL: " );
		for (int i : values) {
			System.out.print("[" + i + "]");
		}
		
		Arrays.sort(values);
		
		System.out.println("\nSorted: ");
		for (int i : values) {
			System.out.print("[" + i + "]");
		}
	}

}
