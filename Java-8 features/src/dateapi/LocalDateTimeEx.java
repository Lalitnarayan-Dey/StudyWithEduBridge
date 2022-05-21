package dateapi;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
//		change the format according to user.
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy [ HH:mm:ss ]");
		String formatedDateAndTime = datetime.format(dateTimeFormat);
		System.out.println("Formatted Date : "+formatedDateAndTime);
		
		Month month = datetime.getMonth();
		DayOfWeek day = datetime.getDayOfWeek();
		int daynumber = datetime.getDayOfMonth();
		int year = datetime.getYear();
		int hour = datetime.getHour();
		int min = datetime.getMinute();
		int sec = datetime.getSecond();
		
		System.out.println("Month : "+month);
		System.out.println("Day of week  : "+day +"("+daynumber+")");
		System.out.println("Year  : "+year);
		System.out.println("Hour  : "+hour);
		System.out.println("Minute  : "+min);
		System.out.println("Second  : "+sec);
		
		
		
		
	}
	

}
