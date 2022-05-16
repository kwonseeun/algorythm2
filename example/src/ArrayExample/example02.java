package ArrayExample;

import java.util.Scanner;

/** n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런다음 모든 정수들을 한 칸씩 오른쪽으로 shift하라
 * 마지막 정수는 배열의 첫 칸으로 이동하라 */
public class example02 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] data = new int[n];

		
	// 맨 끝에 숫자를 앞으로 
	for (int i = 0; i < data.length; i++) 
			data[i] = kb.nextInt();
		kb.close();
		
		int temp = data[n-1];
		// 거꾸로 1씩 감소 역순으로 
		for (int i = n-1; i <= 0; i--) {
			
		}
		
	}

}
