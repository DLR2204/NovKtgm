package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdEx {

	public static void main(String[] args) {
		
		Set<String> set = ZoneId.getAvailableZoneIds();	
		
//		for(String names : set) {
//			System.out.println(names);
//		}
		
		ZoneId zone = ZoneId.of("US/Pacific");
		
		ZonedDateTime date = ZonedDateTime.now(zone);
		
		System.out.println(date);
		
	}
}
