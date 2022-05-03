package algorythm;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		
		// 입력 받은 숫자로 숫자 계단을 출력하기 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		
		int cnt =1;
		
		for (int i = 0; i <= num; i++) { // i=1부터 입력받은 숫자 num 까지 
			for (int j = 0; j <i ; j++) { // j=i 부터 i까지 (i가 1이면 한번 2이면 두번)  
				
				System.out.print(String.format("%3d", cnt));
				cnt++;
			}
			System.out.println();
		}
	}

}
