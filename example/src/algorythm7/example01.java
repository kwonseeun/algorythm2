package algorythm7;

import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = power(a,b);
		
		System.out.println(result);		
		sc.close();
	}
	
	static int power(int n, int b)
	{
		int prod = 1;
		for (int i = 0; i <n; i++) 
			prod *= n;
			
			return prod;
	}
}
