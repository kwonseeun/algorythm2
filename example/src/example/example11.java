package example;

public class example11 {
	
	public static void main(String[] args) {
		
		// 마지막 3글자 자르기 
		String str = "ABCDEFG";
		String result = str.substring(str.length()-3, str.length());
		System.out.println(result);
		
		
		// 특정문자 이후 문자열 제거 
		String str2 = "ABCD/DEFGH";
		String result2 = str.substring(str.lastIndexOf("/")+1);
		System.out.println(result2);
	
	}
}
