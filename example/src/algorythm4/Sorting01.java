package algorythm4;

public class Sorting01 {

	public static void main(String[] args) {
		int[] arr = {42, 456, 7898, 156, 123, 77, 9, 498, 2142, 2, 3, 241, 65756, 553, 767};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; 
					
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (i+1 != arr.length) {
				System.out.println(",");
			}
		}
	}

}
