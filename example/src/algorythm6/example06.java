package algorythm6;

public class example06 {

	public static void main(String[] args) {
		String str1 ="1";
		String str2 = new String("1");
		String str3 = "1";
		
		if (str1 == str2) {
			System.out.println("str1과 str2는 같습니다. ");
		}else {
			System.out.println("str1과 str2는 다릅니다.");
		}
		if (str1 == str3) {
			System.out.println("str1과 str3은 같습니다.");
		}else {
			System.out.println("str1과 str3은 다릅니다.");
		}
		
		if (str1.equals(str3)) {
			System.out.println("equals함수 이용 str1과 str3은 같습니다.");
		}else {
			System.out.println("equals 함수 이용 str1과 str3은 다릅니다.");
		}
	}
} 
   