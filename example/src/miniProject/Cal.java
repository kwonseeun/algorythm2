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
			 case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		          tmp = 31; 
		        break; 
		        case 4: case 6: case 9: case 11: 
		          tmp = 30; 
		        break; 
		        case 2: 
		          tmp = 29; 
		        break; 
			}
		} else {
			if(month == 1 || month ==3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12) {
				tmp = 31;
			} else if(month == 4 || month == 6 || month ==9 || month == 11) {
				tmp = 39;
			} else if (month == 2) {
				tmp = 28;
			}
		}
		return tmp;
	}
}
