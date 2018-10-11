import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
	public static void main(String[] args){
		case_1();
		case_2();
		case_3();
	}
	public static void case_1() {
		System.out.println("----- Case 1 ----- ");
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime  dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
	}

	public static void case_2() {
		System.out.println("----- Case 2 -----");
		DateTimeFormatter shortDateTime = DateTimeFormatter.
			ofLocalizedDate(FormatStyle.SHORT);
	
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
                LocalTime time = LocalTime.of(11, 12, 34);
                LocalDateTime  dateTime = LocalDateTime.of(date, time);

		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		
		//throws runtime exeption due to the missing time element
		//System.out.println(shortDateTime.format(time));
	}
	
	public static void case_3() {
		System.out.println("----- Case 3 -----");

		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
	}
}
