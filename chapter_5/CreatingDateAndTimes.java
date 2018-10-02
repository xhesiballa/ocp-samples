import java.time.*;

public class CreatingDateAndTimes {

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
	}

	public static void case_1() {
		System.out.println("-----Case 1-----");

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
	}

	public static void case_2() {
		System.out.println("----- Case 2 -----");
		
		LocalTime time1 = LocalTime.of(16, 54);
		System.out.println(time1);

		LocalTime time2 = LocalTime.of(14, 12, 30, 500);
		System.out.println(time2);

		LocalDate date1 = LocalDate.of(2018, 10, 2);
		System.out.println(date1);

		LocalDate date2 = LocalDate.of(2018, Month.OCTOBER, 31);
		System.out.println(date2);

		LocalDateTime dateTime = LocalDateTime.of(date1, time1);
		System.out.println(dateTime);

		ZoneId zone = ZoneId.of("Europe/Paris");
		ZonedDateTime zoned = ZonedDateTime.of(dateTime, zone);
		System.out.println(zoned);
	}

	public static void case_3() {
		System.out.println("----- Case 3 -----");
		
		ZoneId defaultZone = ZoneId.systemDefault();
		System.out.println("Default Time zone: " + defaultZone);
	
		System.out.println("Available time zones: ");

		ZoneId.getAvailableZoneIds()
			.stream()
			.sorted()
			.forEach(System.out::println);
	}
}
