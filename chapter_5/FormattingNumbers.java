import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;

public class FormattingNumbers {
	
	public static void main(String[] args) throws ParseException{
		case_1();
		case_2();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
	}

	public static void case_2() throws ParseException {
		System.out.println("----- Case 2 -----");
		
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
	
		String s = "40.45";
		
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));	
	}
}
