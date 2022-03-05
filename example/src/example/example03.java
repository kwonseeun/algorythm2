package example;

public class example03 {

	public static void main(String[] args) {
		int limit = 100;
		boolean prime = false;
		
		for (int i = 2; i < limit; i++) {
		
			prime = true;
			
			 for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					prime=false;
					break;
				}
			}
			 if (prime) {
				System.out.println(i);
			}
		}
	}
}
