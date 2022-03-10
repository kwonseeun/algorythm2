package example;

/**정규표현식 (Regular expressions)를 줄여서 regex라 부른다. 
 * 문자열에 어떤 패턴의 문자들이 있는지 찾는데 도움을 준다. */


public class example05 {

	public static void main(String[] args) {
		final String REGEX = "[0-9]+";
		 String[] testArr = {"20220310", "20220119" , "2882998382:33"};
		 
		 for (int i = 0; i < testArr.length; i++) {
			if (testArr[i].matches(REGEX)) {
				System.out.println("숫자만 있습니다.");
			}else {
				System.out.println("숫자외의 값이 존재합니다.");
			}
		}
	}
}
