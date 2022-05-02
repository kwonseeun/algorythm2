package algorythm5;

public class example09 {

	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i * 2-1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		} 
	} 
}
