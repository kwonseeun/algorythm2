package algorythm5;

import java.util.Arrays;
import java.util.Scanner;

public class example17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for (int count : arr) {
			System.out.print(count + "\n");
		}
	}
}
