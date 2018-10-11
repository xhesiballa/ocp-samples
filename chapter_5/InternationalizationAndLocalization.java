import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationAndLocalization {
	
	public static void main(String[] args) {
		case_1();
		case_2();
	}

	public static void case_1(){
		System.out.println("----- Case 1 -----");

		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println(Locale.GERMANY);

		System.out.println(new Locale("fr"));

		System.out.println(new Locale("hi", "IN"));

		Locale l1 = new Locale.Builder()
			.setLanguage("en")
			.setRegion("GB")
			.build();

		System.out.println(l1);
	}

	public static void case_2() {
		Locale us = new Locale("en", "US");
		Locale fr = new Locale("fr", "FR");

		printProperties(us);
		System.out.println();
		printProperties(fr);
	}
	
	private static void printProperties(Locale locale) {
		System.out.println("----- Case 2 -----");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
}
