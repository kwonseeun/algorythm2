package algorythm4;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int building = 5;
		
		int result = building * a ;
		System.out.println("입력한 건물의 층 수는 " + a + "층 입니다.");
		System.out.println("높이는" + result + "m 입니다.");
	}
}
