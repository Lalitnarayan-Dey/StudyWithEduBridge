package dateapi;

import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
	
//		Current Date.
		LocalDate now = LocalDate.now();		
		System.out.println("Today's date : "+now);
		
//		Parse method.
		LocalDate date = LocalDate.parse("1998-02-17");	
		System.out.println("User defined date : "+date);
		
//	Retrieve Yesterday's date
		LocalDate yesterdaysDate = now.minusDays(1);
		System.out.println("Yesterday's Date : "+yesterdaysDate);
// Tomorow's date
		
		LocalDate tomorrowDate = now.plusDays(1);
		System.out.println("Tomorrow's Date : "+tomorrowDate);
		
//		Check LeapYear
		System.out.println("Is leap year ? "+date+" " +date.isLeapYear());
	
//		of()
		LocalDate integerOfDate = LocalDate.of(2020, 01, 12) ;
		System.out.println("of method : "+integerOfDate);
	}
}
