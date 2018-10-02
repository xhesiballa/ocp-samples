import java.time.Period;
import java.time.LocalDate;

public class WorkingWithPeriods {
	
	public static void main(String[] args) {
		case_1();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");

		System.out.println(Period.ofYears(3));
		System.out.println(Period.ofMonths(7));
		System.out.println(Period.ofMonths(15));
		System.out.println(Period.ofWeeks(7));
		System.out.println(Period.ofDays(17));
		System.out.println(Period.ofDays(62));

		Period period = Period.of(1, 3, 7);
		LocalDate date = LocalDate.now();
		System.out.println(date + " + " + period + " = " + 
			date.plus(period));
	}

}
