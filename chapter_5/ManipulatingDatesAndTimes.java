import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ManipulatingDatesAndTimes {

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		
		LocalDate date = LocalDate.now();
		System.out.println(date);

		date = date.plusYears(3);
		System.out.println(date);

		date = date.plusMonths(5);
		System.out.println(date);

		date = date.plusWeeks(2);
		System.out.println(date);

		date = date.plusDays(6);
		System.out.println(date);
	}

	public static void case_2(){
		System.out.println("----- Case 2 -----");

		LocalTime time = LocalTime.now();
		System.out.println(time);

		time = time.plusHours(1);
		System.out.println(time);
	
		time = time.plusMinutes(15);
		System.out.println(time);
	
		time = time.plusSeconds(58);
		System.out.println(time);

		time = time.plusNanos(500000000);
		System.out.println(time);
		
	}

	public static void case_3() {
		System.out.println("----- Case 3 -----");
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.of(15, 30);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);

		dateTime = dateTime.minusYears(1);
		System.out.println(dateTime);

		dateTime = dateTime.minusMonths(3);
		System.out.println(dateTime);

		dateTime = dateTime.minusWeeks(5);
		System.out.println(dateTime);

		dateTime = dateTime.minusDays(13);
		System.out.println(dateTime);

		dateTime = dateTime.minusHours(7);
		System.out.println(dateTime);
	
		dateTime = dateTime.minusMinutes(35);
		System.out.println(dateTime);

		dateTime = dateTime.minusSeconds(45);
		System.out.println(dateTime);
		
	}
	
}
