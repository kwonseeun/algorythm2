package algorythm6;

/**replaceAll 사용*/
public class example09 {

	public static void main(String[] args) {
		String str = "Hello \"world\"";
		System.out.println("따옴표 포함 :" + str);
		
		//따옴표 제거 
		str = str.replaceAll("\"", "");
		System.out.println("따옴표 제거 "+ str);
	}
}
