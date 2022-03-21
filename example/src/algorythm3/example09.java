package algorythm3;

import java.util.Scanner;

/** scanner로 입력받은 값 갯수만큼 * 출력하기*/
public class example09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("출력한 *의 갯수");
	int result = sc.nextInt();
	sc.close();
	
	for (int i = 0; i < result;
			i++) {
		System.out.print("*");
		}
	}
}
