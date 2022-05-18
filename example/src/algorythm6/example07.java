package algorythm6;

/**replace, subString, split 비교 문제*/
public class example07 {

	public static void main(String[] args) {
		String a = "aaaabbbb";
		String b = "aa-aa,bb-bb";
		
		System.out.println("문자열" + a);
		System.out.println("a를 c로 바꾸기" + a.replace("a", "c"));
		System.out.println("ab를 c로 바꾸기" + a.replace("ab", "c"));
	}

}
