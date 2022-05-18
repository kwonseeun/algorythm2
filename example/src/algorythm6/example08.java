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
	}

}
