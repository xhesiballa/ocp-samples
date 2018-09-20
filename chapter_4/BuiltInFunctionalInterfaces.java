import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import java.lang.Math;

public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {
		case_1();
		case_2();
		case_3();
		case_4();
		case_5();
		case_6();
		case_7();
	}

	public static void case_1(){
		System.out.println("-----Case 1-----");
		Supplier<String> supplier1 = () -> "Supplied string.";
		System.out.println(supplier1.get());

		Supplier<StringBuilder> supplier2 = StringBuilder::new;
		System.out.println(supplier2);
	}

	public static void case_2(){
		System.out.println("-----Case 2-----");

		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = (s) -> System.out.println(s + " - using lambda");

		c1.accept("Consumed String 1");
		c2.accept("Consumed String 2");
	}

	public static void case_3(){
		System.out.println("-----Case 3-----");

		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> bc1 = map::put;
		BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k, v);
		
		bc1.accept("tomatoes", 4);
		bc2.accept("jalapenos", 8);

		System.out.println(map);
		
	}

	public static void case_4(){
		System.out.println("----- Case 4 ----");
		
		Predicate<List<String>> p1 = List::isEmpty;
		Predicate<List<String>> p2 = list -> list.isEmpty();

		List<String> list = new ArrayList<String>();
		System.out.println(p1.test(list));
		
		list.add("dog");
		System.out.println(p2.test(list));

		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (string, prefix) -> string.startsWith(prefix);

		System.out.println(bp1.test("chicken", "chick"));
		System.out.println(bp2.test("chicken", "chick"));
	}

	public static void case_5(){
		System.out.println("----- Case 5 -----");
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();

		String s = "The quick brown fox...";
		System.out.println("length: " + f1.apply(s));
		System.out.println("length: " + f2.apply(s));

		BiFunction<String, String, String> bf1 = String::concat;
		BiFunction<String, String, String> bf2 = (s1, s2) -> s1.concat(s2);

		String s2 = "jumps over the lazy dog";

		System.out.println(bf1.apply(s, s2));
		System.out.println(bf2.apply(s, s2));
	}

	public static void case_6() {
		System.out.println("----- Case 6 ------");
		
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toUpperCase();

		System.out.println(u1.apply("chirp"));
		System.out.println(u2.apply("chirp"));

		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (s1, s2) -> s1.concat(s2);

		System.out.println(b2.apply("baby ", "chick"));
		System.out.println(b2.apply("baby ", "chick"));		
	}

	public static void case_7(){
		Optional<Double> opt = average();
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
	}

	private static Optional<Double> average(int... scores) {
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for (int score: scores) sum += score;
	
		return Optional.of((double) sum / scores.length);
	}
}

	




