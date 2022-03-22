package algorythm3;

import java.util.Scanner;

/**피라미드 역순으로 출력하기
 *****
 ****
 ***
 **
 **/
public class example11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < sum; i++) {
			for (int j = sum; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
