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
		
		/**subString, spli*/
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
	
	/**String replace(String old, String new: 문자열 내 문자열 바꾸기
	 * old 문자열을 new 문자열로 변환한다
	 * old 문자열이 없을 경우에는 본래 문자열을 받는다.
	 * 
	 * String substring(int begin [, int end]): 문자열 잘라서 가져오기
	 * begin만 주었을 경우 begin 부터 문자열 끝까지를 잘라서 리턴한다.
	 * end 도 입력 했을때는 index가 begin <= index < end 의 문자열을 가져온다.
	 * 범위를 벗어난 index를 입력했을 때는 StringIndexOutOfBoundsException 에러 발
	 * 
	 * String[] split(String tok): 특정 문자를 경계로 문자열 자르기 
	 * 구분자에 따라 문자열을 분리한 문자열 배열을 리턴한다
	 * 구분자가 여럿 있을 경우 |를 사용하여 추가로 지정하면 된다.
	 * 결과를 보면 ","로 잘랐을 떄와 ",|-"로 잘랐을 시 다른 결과를 갖는다. */
}
