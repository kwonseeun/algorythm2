package algorythm6;

/** charAt(), indexOf(), length() 예제 */
public class example08 {

	public static void main(String[] args) {
		String a = "aBcD EfGh";
		
		/** charAt */
		System.out.println("기본 문자열"+ a);
		System.out.println("charAt(1)" + a.charAt(1));
		
		/** indexOf */
		System.out.println("indexOf('b') : " + a.indexOf('b'));
		System.out.println("indexOf(\"B\") : " + a.indexOf('B'));
		System.out.println("indexOf(\"B\".2) : " + a.indexOf("B",2));
		
		/**length()*/
		System.out.println("length() :" + a.length());
		System.out.println("toUpperCase() :" + a.toUpperCase());
		System.out.println("toLowerCase()" + a.toLowerCase());
		
		/**char charAt(index index) : index의 문자 가져오기 
		 * 해당 문자열의 입력한 인덱스의 문자를 리턴한다 
		 * 범위 밖의 인덱스를 입력하면 에러가 발생한다 
		 * 
		 * int indexOf(String s [, int index]) : 문자열의 index 구하기 
		 * 인수로 받은 문자(열)을 문자열에서 찾아서 index를 리턴 해준다
		 * 해당 문자열이 없을 경우 -1 리턴 */
	}

}
