package algorythm7;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int [] data = new int[n];
		for (int i = 0; i < n; i++) 
			data[i] = sc.nextInt();
		sc.close();
		
		bubbleSort( n, data );
		
		System.out.println("Sorted data");
		for (int i = 0; i < n; i++) ;
		
	}
	
	static void  bubbleSort(int n,  int[] data ) 
	{
		for (int i=n-1; i > 0; i--) {
			for (int j = 0; j < 1; j++) {
				if (data[j] > data[j-1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
	}
}
