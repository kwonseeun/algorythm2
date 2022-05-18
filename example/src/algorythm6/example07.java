package algorythm6;

/**replace, subString, split 비교 문제*/
public class example07 {

	public static void main(String[] args) {
		String a = "aaaabbbb";
		String b = "aa-aa,bb-bb";
		
		/** replace 예제*/
		System.out.println("문자열" + a);
		System.out.println("a를 c로 바꾸기" + a.replace("a", "c"));
		System.out.println("ab를 c로 바꾸기" + a.replace("ab", "c"));
		
		/**subString*/
		System.out.println("subString(4)" + a.substring(4));
		System.out.println("subString(0,4)" + a.substring(0, 4));
		System.out.println("\n문자열 :" +b+ "\n---,로 문자열 분리---");
		String[] str = b.split(",");
		for (String temp : str) 
			System.out.println(temp);
		
		System.out.println("\n문자열 : " + b + "\n---와 -로 문자열 분리 ");
		String[] str2 = b.split(",|-");
		for (String temp : str2) 
			System.out.println(temp);
	}

}
