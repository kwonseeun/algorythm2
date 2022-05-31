package algorythm7;

import java.util.Random;

/**Q. 1부터 10 사이의 랜덤 값을 3행 3열의 2차원 배열에 넣어보자.
단, 랜덤 값은 중복을 제거하여 2차원 배열에 대입해보세요.*/

public class example03 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num[][] = new int[3][3];
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				num[i][j] = ++sum;
//				System.out.printf("%2d ", num[i][j]);
			}
//			System.out.println();
		}
		Random random = new Random();
		for(int i = 0; i < num.length; i++) {
			int ran1 = random.nextInt(3);
			int ran2 = random.nextInt(3);
			int temp = num[0][0];
			num[0][0] = num[ran1][ran2];
			num[ran1][ran2] = temp;
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
}
