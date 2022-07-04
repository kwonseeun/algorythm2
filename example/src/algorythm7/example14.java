package algorythm7;

import java.util.Arrays;

public class example14 {
	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		int answer = 0;
		Arrays.parallelSort(arr);
		int tmp = arr[0];		
		for ( int i=0; i<arr.length; i++ ) {
			tmp = lcm(tmp, arr[i]);
		}
		answer = tmp;
		System.out.println(answer);
		
	}
	static int lcm( int a, int b ) {
		return a*b / gcd(a, b);
	}
	static int gcd( int a, int b ) {
		
		while (b!=0) {
			int c = a%b;
			a=b;
			b=c;
		}
		
		return a;
	}

}
