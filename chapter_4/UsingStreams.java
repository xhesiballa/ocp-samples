import java.util.stream.Stream;
import java.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.Comparator;

import java.util.function.Predicate;

import java.lang.StringBuilder;

public class UsingStreams {
	
	public static void main(String[] args) {

		case_1();
		case_2();
		case_3();
		case_4();
		case_5();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		Stream<Integer> emptyStream = Stream.empty();
		System.out.println(emptyStream.count());

		Stream<Integer> integerStream = Stream.of(1, 3, 5);
		System.out.println(integerStream.count());
		
		List<Integer> list = Arrays.asList(5, 34, -1);
		Comparator<Integer> c = (i1, i2) -> i1 - i2;

		Stream<Integer> s = list.stream();
		Optional<Integer> min = s.min(c);
		min.ifPresent(System.out::println);
				
		Optional<Integer> max = list.stream().max(c);
		max.ifPresent(System.out::println);

		//comparator is never called on empty stream
		Optional<Object> emptyOptional = Stream.empty().max( (s1, s2) -> 0);
		System.out.println(emptyOptional.isPresent());
	}

	public static void case_2(){
		System.out.println("----- Case 2 -----");
		Stream<String> s = Stream.of("mokey", "gorilla", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		s.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
	}

	public static void case_3() {
		System.out.println("----- Case 3 -----");

		List<String> list = Arrays.asList("chimpanzee", "monkey", "gorilla");
		Predicate<String> predicate = s -> s.length() > 6 ;

		list.stream().forEach(System.out::println);

		System.out.println(list.stream().anyMatch(predicate));
		System.out.println(list.stream().allMatch(predicate));
		System.out.println(list.stream().noneMatch(predicate));		
	}

	public static void case_4() {
		System.out.println("----- Case 4 -----");

		List<String> list = Arrays.asList("w", "o", "l", "f");
		String word = list.stream().reduce("", (s, c) -> s + c);
		System.out.println(word);
	}

	public static void case_5() {
		System.out.println("----- Case 5-----");
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder sb= stream.collect(
			StringBuilder::new, // supplier
			StringBuilder::append, //accumulator
			StringBuilder::append //combiner
		);
		System.out.println(sb);
	}

}
