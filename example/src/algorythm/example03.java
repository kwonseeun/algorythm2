package algorythm;

public class example03 {

	public static void main(String[] args) {
	
		for (int h = 1; h <= 23 ; h++) {
			for (int m = 1; m < 59; m++) {
				for (int s = 1; s < 59; s++) {
					System.out.printf(h+"시"+m+ "분"+ s+"초");
				}
			}
		}
	}

}
