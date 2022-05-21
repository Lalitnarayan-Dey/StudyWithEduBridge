package dateapi;


import java.time.LocalTime;

public class LocalTimeEx {
	public static void main(String[] args) {
	
//		Current Time.
		LocalTime now = LocalTime.now();		
		System.out.println("Today's date : "+now);
		
//		Parse method.
		LocalTime time = LocalTime.parse("10:06:03");	
		System.out.println("User defined date : "+time);
		
		LocalTime minusHours = time.minusHours(2);
		LocalTime minusMinutes = time.minusMinutes(30);
		LocalTime plusHours = time.plusHours(5);
		LocalTime plusMins = time.plusMinutes(20);
		
		System.out.println(time+" minus with 2hrs : "+minusHours);
		System.out.println(time+" minus with 30min : "+minusMinutes);
		System.out.println(time+" plus with 5hrs : "+plusHours);
		System.out.println(time+" plus with 20min : "+plusMins);
	}
}
