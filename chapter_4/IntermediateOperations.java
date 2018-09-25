import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

import java.util.Comparator;

public class IntermediateOperations {

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
		case_4();
		case_5();	
		case_6();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");

		Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
		stream.filter( m -> m.startsWith("m")).forEach(System.out::println);
	}

	public static void case_2() {
		System.out.println("----- Case 2 -----");

		Stream<String> stream = Stream.of("duck", "duck", "goose", "duck");
		stream.distinct().forEach(System.out::println);
	}

	public static void case_3() {
		System.out.println("----- Case 3 -----");
		
		Stream<Integer> s = Stream.iterate(1, n -> n+1);
		s.skip(5).limit(2).forEach(System.out::println);
	}

	public static void case_4() {
		System.out.println("----- Case 4 -----");

		Stream<String> s = Stream.of("gorilla", "bonobo", "monkey");
		s.map(String::length).forEach(System.out::println);
	}

	public static void case_5() {
		System.out.println("----- Case 5 -----");
		
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama gorilla", "Baby gorilla");

		Stream<List<String>> animals = Stream.of(zero, one, two);

		animals.flatMap( l-> l.stream()).forEach(System.out::println);
	}

	public static void case_6() {
		System.out.println("----- Case 6 -----");

		List<String> list = Arrays.asList("brown bear ", "black bear ");
		
		list.stream().sorted().forEach(System.out::print);

		list.stream().peek(System.out::println).sorted(Comparator.reverseOrder()).forEach(System.out::print);

	}
}
