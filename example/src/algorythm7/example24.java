package algorythm7;

import java.util.Scanner;

public class example24 {

	public static void main(String[] args) {
		int max = 0;
		int min = 1000;
		
		int ran = 0;
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for (int i = 1; i <= count ; i++) {			
			int random = (int)(Math.random() * 1000) +1;
			System.out.println( i + "번째 난수: " + random );
			if ( max < ran ) {
				max = ran;
			}
			
		}
		System.out.println( "최대값:" + max + "최소값: " + min );
		
	}

}
