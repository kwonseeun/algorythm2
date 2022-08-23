package algorythm7;

import java.util.Scanner;

public class example25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt =  sc.nextInt();
		
		int arr[] = new int[1000];
		int min = 1000;
		int max = 0;
		
		for (int i = 0; i <= 4; i++) {
			arr[i] = (int)Math.round(Math.random()* 1000 +1 );
			System.out.println((i+1)+"번째 값:" + arr[i]);
			
			if (arr[i] > max) 
				max = arr[i]; 
			if (arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("최대 값: " + max);
		System.out.println("최소 값: " + min);
	}

}
