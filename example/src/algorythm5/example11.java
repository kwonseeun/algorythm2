package algorythm5;

import java.util.Scanner;

public class example11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	// 사람의 수를 입력받는다. 
	int num = sc.nextInt();
	
	int [] time = new int[num];
			
	// 걸리는 시간을 입력받는다 
	for (int i = 0; i < num; i++) {
			time[i] = sc.nextInt();
		}
	
	int min = 0; // 각 사람들이 인출하는데 필요한 시간 
	int sum = 0; // 총 합을 저장할 변수 
	
	// 걸리는 시간이 누적되므로 시간이 짧은 순으로 오름차순 정렬
	for (int i = 0; i < time.length; i++) {
		min+=time[i];
		sum+=min;
	}
	System.out.println(sum);
	}
}