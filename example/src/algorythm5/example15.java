package algorythm5;

import java.util.Scanner;

public class example15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		
		
		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int j = 0; j < N ; j++) {
				arr[j] = sc.nextInt();
			}
			
			int sum = 0;
			
			for (int j = 0; j < N; j++) {
				sum+= arr[j];
			}
			
			double avg = sum / N ;
			
			int cnt = 0; 
			
			for (int j = 0; j < N; j++) {
				if ( arr[j] > avg ) {
					cnt ++;
				}
			}
			double ans =  ((double) cnt/ N) * 100;
			System.out.printf("%.3f%s \n",ans,"%");
			
			
		}
	}
}

 