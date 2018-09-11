import java.util.*;

public class ComparableExamples {
	
	public static void main(String[] args) {
		Product book = new Product(1, "Book");
                Product stickyNotes = new Product(2, "Sticky Notes");
                Product eraser = new Product(3, "Eraser");

                List<Product> products = Arrays.asList(book, stickyNotes, eraser);

                System.out.println(products);
		
		Collections.sort(products);
		System.out.println(products);
	}
}

class Product implements Comparable<Product> {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Product p){
		return name.compareTo(p.name);
	}

	@Override
	public String toString() {
		return "{ id: " + id + ", name: " + name + "}";
	}

}
