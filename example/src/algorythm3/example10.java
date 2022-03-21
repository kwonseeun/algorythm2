package algorythm3;

import java.util.Scanner;

public class example10 {
	/**scanner로 입력받은 수 만큼 피라미드 만들기
	 * 
	 **
	 ****
	 *****
	 ******
	 **/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("* 갯수:");
		int sum = sc.nextInt();
		sc.close();
		
		for (int i = 0; i <= sum ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
