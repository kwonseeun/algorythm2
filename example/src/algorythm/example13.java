package algorythm;

import java.util.Scanner;

public class example13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("값을 입력하세요:");
	int dan = sc.nextInt();
	for (int i = 0; i <= 9 ; i++) {
		System.out.println(dan + "*" + i + "=" + dan * i );
	}
	sc.close();
	}
}

/** 무한으로 입력받아 구구단 출력 while문 사용 
 * 
 * boolean confirm = true;
 * while(confirm) {
 * 	System.out.println("값을 입력하세요:");
 * int num = sc.nextInt();
 * 
 * for(int i = 1; i< 10; i++){
 * 	System.out.println(num + "*" + i + "=" + i * num);
 * }
 * System.out.println("계속 진행할까요? y/n")
 * String check = sc.next();
 * 	if(check.equals("n")){
 * 		confirm = false;
 * 	 }
 * }
 * 		System.out.println("프로그램을 종료합니다.")
 * 		sc.close 
 * 		}
 * };
 * */
