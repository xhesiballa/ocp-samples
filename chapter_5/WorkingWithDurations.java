import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.time.ZonedDateTime;

public class WorkingWithDurations {

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
		case_4();
		case_5();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(3));
		System.out.println(Duration.ofMinutes(30));
		System.out.println(Duration.ofSeconds(100));
		System.out.println(Duration.ofMillis(500));
		System.out.println(Duration.ofNanos(500000));
		
		System.out.println(Duration.of(1, ChronoUnit.DAYS));
	}

	public static void case_2() {
		System.out.println("----- Case 2 -----");
		
		Instant now = Instant.now();
		System.out.println(now);

		for(int i = 0; i<100000; i++);

		Instant later = Instant.now();
		System.out.println(later);

		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
	}
	
	public static void case_3() {
		System.out.println("----- Case 3 -----");
		
		LocalDate date = LocalDate.of(2018, Month.OCTOBER, 30);
		LocalTime time = LocalTime.of(14, 0);
		ZoneId zone = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		
		System.out.println(zonedDateTime);
		
		Instant instant = zonedDateTime.toInstant();
		System.out.println(instant);			
	}

	public static void case_4() {
		System.out.println("----- Case 4 -----");
		
		Instant instant = Instant.ofEpochSecond(1000000000);
		System.out.println(instant);

		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);

		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
		
		//throws exception
		//Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);
		//System.out.println(nextWeek);
	}

	public static void case_5() {
		System.out.println("----- Case 5 -----");

		LocalDate date = LocalDate.of(2018, Month.MARCH, 11);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);

		System.out.println(dateTime);

		dateTime = dateTime.plusHours(1);

		System.out.println(dateTime);
	}
}
