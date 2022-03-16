package algorythm;

public class example06 {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i<10 ; i++) {
			for (j = 1; j < i; j++) {
				if (j > 5) break; 
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

