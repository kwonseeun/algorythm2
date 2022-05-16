package ArrayExample;

import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int [] data = new int[n]; // 입력받은 배열을 저장할 공간 
		
		// n 개의 정수를 출력해야한다 .
		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int sum = 0; // 정수들의 합을 구할때는 항상 합을 먼저 0 으로 초기화
		int max = data[0]; // 최대값을 구하기위해 선언 
		
		for (int i = 0; i < n; i++) {  // 각각의 정수를 순서대로 각각의 정수들을 더해준다 
			sum += data[i]; // sum += data[i] 같은 뜻이다. 
		if (data[i] > max) 
			max = data[i];
		}
		
		System.out.println("the sum is " +sum);
		System.out.println("the max is " + max);
	}

}
