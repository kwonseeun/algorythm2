package algorythm7;

import java.util.Scanner;

public class example19 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] data = new int [cnt];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = (i + 1);
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
