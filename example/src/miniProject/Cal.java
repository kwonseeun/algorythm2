package miniProject;

public class Cal {
	
	// 윤년 계산
	private static boolean leapYear(int year) {
		boolean leap = false;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) { 
		      leap = true; 
		}
		return true;
	}
	
	private static int getDate(int year, int month) {
		int tmp = 0;
		
		if(leapYear(year)) {
			switch(year) {
			
			}
		}
	}
}
