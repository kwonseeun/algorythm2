package ArrayExample;

import java.util.Scanner;

/**n개의 정수를 입력받아 배열에 저장한다. 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는최대값을 구하여 
 * 출력하는 프로그램을 작성하라. */
public class example05 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) 
			data[i] = kb.nextInt();
		kb.close();

		int max = 0;
		for (int i = 0; i < n; i++) {
			for(int j=i; j<n; j++) {

				int sum = 0;
				for(int k=i; k<=j; k++)
					sum += data[k];

				if(sum > max)
					max = sum;
			}
		}
		
		System.out.println("최대값" + max);
	}

}
