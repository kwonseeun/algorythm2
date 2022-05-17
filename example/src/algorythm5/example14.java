package algorythm5;

public class example14 {
		
	public static int recursive(int n) {
		int i;
		if (n < 1 ) return 2;
		else {
			i = ( 2 * recursive( n - 1 )) + 1;
			System.out.printf("%d\n", i);
			return i; 
		}
	}
	
	public static void main(String[] args) {
		recursive(8);
	}

}
