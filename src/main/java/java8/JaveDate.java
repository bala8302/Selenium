package java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class JaveDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate ld11= LocalDate.now(Clock.systemDefaultZone());
		LocalDate ld12= LocalDate.now(Clock.systemUTC());
		System.out.println(ld11);
		System.out.println(ld12);
		LocalDate ld13= LocalDate.now(ZoneId.of("GMT+02:30"));
		System.out.println(ld13);
		LocalTime ld14= LocalTime.now(ZoneId.of("GMT+02:30"));
		System.out.println(ld14);
		
		Instant instant = Instant.now();
		long timeStampMillis = instant.toEpochMilli();
		System.out.println("timeStampMillis"+timeStampMillis);
		
		Instant instant1 = Instant.now();
		long timeStampSeconds = instant1.getEpochSecond();
		System.out.println("timeStampSeconds"+timeStampSeconds);
		
		LocalDateTime ldtime = LocalDateTime.now();
		System.out.println("sdsd"+ldtime);
		
		
		
		
	}

}
