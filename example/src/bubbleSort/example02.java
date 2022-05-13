package bubbleSort;

public class example02 {
	public static void main(String[] args) {
		int[] arr = {30, 5, 21, 10, 4, 13, 8, 25, 19, 1};
		
		// -i 는 제일 큰 수가 맨 마지막에 정렬이 된다 (마지막은 비교를 안해도 됨) 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr [j + 1];
					arr[j +  1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d " , arr[i]);
		}
		
	}
}
