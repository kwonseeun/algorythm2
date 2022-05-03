package algorythm;

import java.util.Scanner;

// 1부터 5의 배수 구하기 
public class example15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 요구사항 10개의 정수를 입력받아, 3의 배수인 숫자만 결과로 출력하기 
		int num[] = new int[10];
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(i+1)+"번 째 정수 입력 >> ");
			num[i] = sc.nextInt();
		}
		// 3의 배수 필터링
		for (int i = 0; i <10; i++) {
			if (num[i]%3 == 0) {
				arr[i] = num[i];
				// 값이 0 일때는 성공 
			}
		}
		// 3의 배수 출력
		System.out.println("3의 배수: ");
		for (int i = 0; i < 10; i++) {
			if (arr[i]!=0) {
				System.out.println(arr[i]+ "");
			}
		}
	}

}
