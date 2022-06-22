package miniProject;

public class Cal {
	
	// 윤년 계산
	private static boolean leapyear(int year) {
		boolean leap = false;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { 
		      leap = true; 
		}
		return true;
	}
}
