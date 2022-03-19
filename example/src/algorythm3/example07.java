package algorythm3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class example07 {

	public static void main(String[] args) {
		
		// 일단위 비교
		LocalDateTime date1 = LocalDateTime.of(2021, 6, 19, 1, 15, 0);
		LocalDateTime date2 = LocalDateTime.of(2021,6, 19, 4 ,15, 30);
		
		compareDay(date1, date2);
	}
	
		public static int compareDay(LocalDateTime date1, LocalDateTime date2) {
			LocalDateTime dayDate1 = date1.truncatedTo(ChronoUnit.DAYS);
			LocalDateTime dayDate2 = date1.truncatedTo(ChronoUnit.DAYS);
			
			int compareResult = dayDate1.compareTo(dayDate2);
			
			System.out.println("=== 일 단위 비교 === ");
			System.out.println("date1.truncatedTo(ChronoUnit.DAYS): " + dayDate1);
			System.out.println("date1.truncatedTo(ChronoUnit.DAYS): " + dayDate2);
			System.out.println("결과" + compareResult);
			
			return compareResult;
		}
		
		public static int compareHour(LocalDateTime date1, LocalDateTime date2) {
			LocalDateTime dayDate1 = date1.truncatedTo(ChronoUnit.HOURS);
			LocalDateTime dayDate2 = date1.truncatedTo(ChronoUnit.HOURS);
			
			int compareResult = dayDate1.compareTo(dayDate2);
			
			System.out.println(" == 시간 단위 비교 == ");
			System.out.println("date1.truncatedTo(ChronoUnit.HOURS" + dayDate1);
			System.out.println("date2.truncatedTo(ChronoUnit.HOURS" + dayDate2);
			
			return compareResult;
		}
	}

