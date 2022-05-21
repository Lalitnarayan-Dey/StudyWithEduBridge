package dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDAteTimeEx {

	public static void main(String[] args) {
			ZonedDateTime current  =  ZonedDateTime.now();
			
			System.out.println("Current time with zone : "+current);
			System.out.println("Current Zone : "+current.getZone());
			
			ZoneId tokyo = ZoneId.of("Asia/Tokyo");
			ZonedDateTime tokyoZone = current.withZoneSameInstant(tokyo);
			System.out.println("Tokyo zone : "+tokyoZone);
	}
}
