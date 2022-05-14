package selectSort;

public class example03 {

	public static void main(String[] args) {
		int[] arr = {30,10,40,20,50};
		System.out.print("정렬 전 \n");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("\n 정렬 후 ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i]; 
					arr[i] = arr[j];
				} 
			}
		}
		for (int i : arr) {
			System.out.println(" " +i);
		}
	}

}
