package algorythm6;

public class Array1 {

	public static void main(String[] args) {
		int [] arr = new int[100];
		arr[0] = 1;
		arr[1] = 2;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}

}
