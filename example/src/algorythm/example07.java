package algorythm;

import java.util.Scanner;

public class example07 {
	public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
 	int total = 0;
 	for (int i = 0; i <= 50; i++) {
		if (i % 2 == 0) {
			total += i;
		}
	}
 	System.out.println(total);
	}
}
