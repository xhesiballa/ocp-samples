import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8Additions {
	
	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
		case_4();
		case_5();
		case_6();
		case_7();
	}
	
	//method refference
	public static void case_1() {
		System.out.println("-----Case 1-----");

		Comparator<Duck> lambda = (d1, d2) -> d1.weight - d2.weight;
		Comparator<Duck> methodRef = DuckHelper::compareByWeight;

		Duck d1 = new Duck();
		d1.weight = 1;

		Duck d2 = new Duck();
		d2.weight = 2;

		System.out.println(methodRef.compare(d1, d2));
	}
	
	//List.removeIf method
	public static void case_2(){
		System.out.println("-----Case 2-----");
		
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list);

		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list);
	}

	public static void case_3() {
		System.out.println("-----Case 3 -----");
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println(list);
		
		list.replaceAll(x-> x*x);
		System.out.println(list);
	}

	public static void case_4() {
		System.out.println("-----Case 4-----");
		
		List<String> list = Arrays.asList("Cat", "Dog");
		list.forEach(System.out::println);
	}

	public static void case_5() {
		System.out.println("-----Case 5-----");
	
		Map<String, String> map = new HashMap<>();
	
		map.put("Jenny", "Bus Tour");
		map.put("Tom", null);
		System.out.println(map);
		map.putIfAbsent("Jenny", "Tram");
		map.putIfAbsent("Tom", "Tram");
		map.putIfAbsent("Sam", "Tram");
		System.out.println(map);
	}
	
	public static void case_6() {
		System.out.println("----- Case 6 -----");
		BiFunction<String, String, String> mapper = (v1, v2) 
			-> v1.length() > v2.length() ? v1: v2;
		
		Map<String, String> map = new HashMap<>();
		map.put("Jenny", "Bus Tour");
		map.put("Tom", "Tram");
		
		System.out.println(map);
		
		String jenny = map.merge("Jenny", "Skyride", mapper);
		String tom = map.merge("Tom", "Skyride", mapper);
		String john = map.merge("John", "Skyride", mapper);

		System.out.println(jenny);
		System.out.println(tom);
		System.out.println(john);

		System.out.println(map);		
	}		

	public static void case_7(){

		System.out.println("-----Case 7-----");
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v+1;
		Function<String, Integer> functionMapper = (k) -> 1;
 
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);

		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		
		System.out.println(counts);
		System.out.println(jenny);
		System.out.println(sam);

		counts.computeIfAbsent("James", functionMapper);
		counts.computeIfAbsent("Jenny", functionMapper);
		System.out.println(counts);
	}
}

class Duck { int weight; }

class DuckHelper {
	
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.weight - d2.weight;
	}
}
