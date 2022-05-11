package algorythm5;

public class example09 {

	public static void main(String[] args) {
		String str ="수학;영어;과학";
		String[] result = str.split(";");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	} 
}
