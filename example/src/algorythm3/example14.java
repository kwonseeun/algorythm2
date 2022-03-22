package algorythm3;

import java.util.Scanner;

public class example14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 12;
		for (int i = 1; i < a; i++) {
			if (a%i==0) {
				System.out.println(i);
			}
		}	
	}
}
