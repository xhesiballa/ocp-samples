import java.util.*;

public class ComparatorExamples {
	
	public static void main(String[] args) {
		Comparator<Product> byId = new Comparator<Product>() {
			
			@Override
			public int compare(Product product1, Product product2) {
				return product1.id - product2.id;
			}
		};

		//Comparator<Product> multiFieldComparator = (Product p1, Product p2) -> {
		//	int result = p1.id - p2.id;
		//	if(result != 0) return result;
		//	return p1.name.compareTo(p2.name);
		//};

		Comparator<Product> multiFieldComparator =  
			Comparator.<Product>comparingInt(p -> p.id)
			.thenComparing( p -> p.name);

		Product pen = new Product(1, "Pen");
		Product rubber = new Product(3, "Rubber");
		Product fountainPen = new Product(1, "Fountain Pen");
		Product cup = new Product(2, "Cup");

		List<Product> products = Arrays.asList(rubber, pen, cup, fountainPen);
		System.out.println(products);
		
		System.out.println("Order using the comparable interface:");
		Collections.sort(products);
		System.out.println(products);

		System.out.println("Order using the comparator interface:");
		Collections.sort(products, byId);
                System.out.println(products);

		System.out.println("Order using the multiproperty interface:");
                Collections.sort(products, multiFieldComparator);
                System.out.println(products);
	}
}


