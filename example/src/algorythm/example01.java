package algorythm;

public class example01 {

/** 1 ~ 100 까지 숫자 중 3과 5의 배수를 출력하고 그 합을 구하시오. */
public static void main(String[] args) {
		
		int sum = 0;
		
		// 1 ~ 100까지 숫자 중 3과 5의 배수 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				sum += i;
			System.out.print(i + " ");
			}
		}	
		System.out.println("\n합계: " + sum);
	}
}