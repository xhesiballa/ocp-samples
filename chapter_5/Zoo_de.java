import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Zoo_de extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] {
			{"hello", "Hallo"},
			{"open", "Der Zoo ist geöffnet"}};
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle(
			"Zoo", Locale.GERMAN);
		System.out.println(rb.getObject("hello"));
	}
}
