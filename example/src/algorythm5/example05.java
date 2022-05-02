package algorythm5;

public class example05 {

	/** 2001년부터 2012년 사이의 윤년을 구하시오 */
	public static void main(String[] args) {
		for (int year = 2001;  year <= 2012; year++) {
			
			if ( year % 4 == 0 && 100 != 0 || year % 400 == 0) {
				System.out.println(year);
			}
		}
	}

}
