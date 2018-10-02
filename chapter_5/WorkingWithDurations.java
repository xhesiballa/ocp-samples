import java.time.Duration;
import java.time.LocalTime;
import java.time.ChronoUnit;

public class WorkingWithDurations {

	public static void main(String[] args) {
		case_1();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(3));
		System.out.println(Duration.ofMinutes(30));
		System.out.println(Duration.ofSeconds(100));
		System.out.println(Duration.ofMillis(500));
		System.out.println(Duration.ofNanos(500000));
		
		System.out.println(Duration.of(1, ChronoUnit.DAYS);
	}

}
