import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import java.util.Comparator;

/*
*	case 1: Average
* 	case 2: Counting
*	case 3: Grouping 
*	case 4: Join
*	case 5: Max / Min
*	case 6: Mapping
*	case 7: Map 
*/
public class CollectingResults {
	
	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
		case_4();
		case_5();
		case_6();
		case_7();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		Stream<Integer> stream = Stream.of(2, 5, 9, 23);
		Double avg = stream
			.peek( i -> System.out.print(i + " "))
			.collect(Collectors.averagingInt( i -> i));
		System.out.println("");
		System.out.println(avg);
	}

	public static void case_2() {
		System.out.println("----- Case 2 -----");
		Stream<Integer> s = Stream.iterate(1, i -> i + 1);
		
		Long count = s.limit(5)
			.peek( i -> System.out.print(i + " ") )
			.collect(Collectors.counting());
		
		System.out.println();
		System.out.println("Size: " + count);	
	}

	public static void case_3() {
		System.out.println("----- Case 3 -----");
		Stream<String> stream = Stream.of("Monkey", "Bonobo", "Chimp");
		
		Map<Integer, List<String>> map = stream
			.peek( s-> System.out.print( s + " "))
			.collect(Collectors.groupingBy( s -> s.length()));
		
		System.out.println("");
		System.out.println(map);
	}

	public static void case_4() {
		System.out.println("----- Case 4 -----");
		
		Stream<String> stream = Stream.of("The quick Brown fox ", 
			"jumps over ", "the lazy dog");

		String s = stream.collect(Collectors.joining());
		System.out.println(s);
	}

	public static void case_5() {
		List<Integer> list = Arrays.asList(1, 5, 2, 15, -6);
		
		Comparator<Integer> c = (i1, i2) -> i1 - i2;
		list.stream().collect(Collectors.maxBy(c)).ifPresent(System.out::println);
		list.stream().collect(Collectors.minBy(c)).ifPresent(System.out::println);

	}

	public static void case_6() {
		List<Employee> employees = Arrays.asList(
			new Employee(1, "John"),
			new Employee(2, "Richard"), 
			new Employee(3, "Grace")
		);

		List<String> employeeNames = employees
			.stream()
			.collect(Collectors.mapping( e -> e.name, 
				Collectors.toList()));
		System.out.println(employeeNames);
	}
		
	public static void case_7() {
		System.out.println("----- Case 7 -----");
		List<String> list = Arrays.asList("lions", "tigers", "bears");
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s->s, String::length));
		System.out.println(map);

		Map<Integer, String> reversedMap = list.stream().collect(
			Collectors.toMap(String::length, s->s, (s1, s2) -> s1 +", " + s2));
		System.out.println(reversedMap);

		
	}
}

class Employee{
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString(){
		return "{ id: " + id + ", name: " + name + " }";
	}
}
