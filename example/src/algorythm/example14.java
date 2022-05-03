package algorythm;

import java.util.Scanner;

public class example14 {

	public static void main(String[] args) {
		
		int sum = 0; // 총 합을 저장할 변수 선언 	
		int num = 0; // 범위가 될 숫자를 저장할 변수 선언 
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // 입력받은 숫자를 num에 저장 
	
	for (int i = 0; i < num; i++) { // 1부터 입력받은 변수(Num)의 범위까지 반복문 실행 
		
		if( i%2==0 ) { // 숫자가 2의 배수 (2로 나누어 떨어지면) 
			continue; //반복문을 빠져나간다. 
		}else if ( i%3==0) {
			continue;
		}else {
			System.out.println(i + "");
			sum += i; // sum에 더해서 총 합을 구함 
		}
	}
	System.out.println();
	
	System.out.println("총합: " + sum ); // 결과 출력 
  }
}
