import java.util.*;

public class ComparatorExamples {
	
	public static void main(String[] args) {
		Comparator<Product> byId = new Comparator<Product>() {
			
			@Override
			public int compare(Product product1, Product product2) {
				return product1.id - product2.id;
			}
		};

		Product rubber = new Product(3, "Rubber");
		Product pen = new Product(1, "Pen");
		Product noteBook = new Product(2, "Nontebook");

		List<Product> products = Arrays.asList(rubber, pen, noteBook);
		System.out.println(products);
		
		System.out.println("Order using the comparable interface:");
		Collections.sort(products);
		System.out.println(products);

		System.out.println("Order using the comparator interface:");
		Collections.sort(products, byId);
                System.out.println(products);
	}
}
