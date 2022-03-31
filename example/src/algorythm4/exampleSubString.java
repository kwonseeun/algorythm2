package algorythm4;

public class exampleSubString {

	public static void main(String[] args) {
		String date = "2020-12-16 10:30:43";
		
		System.out.println("년:" + date.substring(0, 4) );
		System.out.println("월:" + date.substring(5, 7) );
		System.out.println("일:" + date.substring(8, 10) );
		System.out.println("시:" + date.substring(11, 13) );
		System.out.println("분:" + date.substring(14, 16) );
		System.out.println("초:" + date.substring(17) );
		
	}

}
