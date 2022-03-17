package algorythm3;

public class example03 {

	public static void main(String[] args) {

		String str = "aaabbbcccddd";
		
		String reverse = "";
		for (int i = str.length() - 1 ; i > 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
