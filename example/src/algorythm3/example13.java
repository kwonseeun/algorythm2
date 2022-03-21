package algorythm3;

public class example13 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum+= i ;
			}
		}
		System.out.println("3배수의 합 :"+ sum );
	}

}
