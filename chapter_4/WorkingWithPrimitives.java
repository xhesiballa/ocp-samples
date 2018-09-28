import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

import java.util.OptionalDouble;

import java.util.List;
import java.util.Arrays;

/*
*	case_1 : converting to primitive stream
*	case_2: creating primitive streams
*/
public class WorkingWithPrimitives {
	private static void printer(Object o){ System.out.print(o + " ");}

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");
		
		List<String> list  = Arrays.asList("Gorilla", "Bonobo", "Chimp");	
		IntStream intStream = list.stream().mapToInt(String::length);
		LongStream longStream = list.stream().mapToLong(String::length);
		DoubleStream doubleStream = list.stream().mapToDouble(String::length);

		intStream.forEach(System.out::println);
		longStream.forEach(System.out::println);		
		doubleStream.forEach(System.out::println);
		
	} 

	public static void case_2() {
		System.out.println("----- Case 2 -----");
		IntStream intStream = IntStream.of(1, 5, 7);
		LongStream longStream = LongStream.iterate(2, l -> l * 2);
		DoubleStream doubleStream = DoubleStream.generate(Math::random);

		intStream.forEach(WorkingWithPrimitives::printer);
		System.out.println();
		longStream.limit(3).forEach(WorkingWithPrimitives::printer);
		System.out.println();
		doubleStream.limit(3).forEach(WorkingWithPrimitives::printer);
		System.out.println();
	} 

	public static void case_3() {
		System.out.println("----- Case 3 -----");		

		IntStream intStream = IntStream.of(1, 5, 14);
		OptionalDouble optional = intStream.average();
	
		optional.ifPresent(System.out::println);
	}
}
