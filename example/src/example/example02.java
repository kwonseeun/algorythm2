package example;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1보다크고 10보다 작은 정수를 입력하세요.");
		int input = sc.nextInt();
		
		if (input < 2 || input > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			
		} for (int i = 1; i <= 9; i++) {
			System.out.println("inputInt"+i+"*"+i +"="+ input * 1); 
		}
	}
}
