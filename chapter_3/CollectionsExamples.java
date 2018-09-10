import java.util.*;

/*
* Common Collections methods examples
* 
* case1: add method for List, Set
* case2: delete method for List, Set
* case3: isEmpty(), size(), clear() methods
* case4: contains() 
*/
public class CollectionsExamples {
	
	public static void main(String[] args) {
		//Run all cases
		case_1();
		case_2();
		case_3();
		case_4();
	}

	public static void case_1() {
		System.out.println("----- Case 1 -----");

		List<String> list = new ArrayList<>();

		System.out.println(list.add("Sparrow"));  //true
		System.out.println(list.add("Sparrow"));  //true
		System.out.println(list);

		Set<String> set = new HashSet<>();
		
		System.out.println(set.add("Sparrow"));  //true
		System.out.println(set.add("Sparrow"));  //false
		System.out.println(set);		
	}

	public static void case_2() {
		
		System.out.println("------ Case 2 -----");
		
		List<String> birds = new ArrayList<>();
		
		birds.add("hawk");
		birds.add("hawk");
		birds.add("sparrow");
		System.out.println(birds);
	
		System.out.println("Removing \"cardinal\": " + 
				birds.remove("cardinal")); //false
		
		System.out.println(birds);

		System.out.println("Removing \"hawk\": " + 
				birds.remove("hawk"));  //true

		System.out.println(birds);	
	}

	public static void case_3(){
		System.out.println("----- Case 3 -----");
		List<String> birds = new ArrayList<>();
		
		System.out.println(birds);		
		System.out.println("Is empty: " + birds.isEmpty());
		System.out.println("Size: " + birds.size());
		
		birds.add("sparrow");
		birds.add("hawk");
		
		System.out.println(birds);
		System.out.println("Is empty: " + birds.isEmpty());
                System.out.println("Size: " + birds.size());

		birds.clear();
		System.out.println(birds);
		System.out.println("Is empty: " + birds.isEmpty());
                System.out.println("Size: " + birds.size());
	}
	
	public static void case_4(){
		System.out.println("----- Case 4 -----");
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("sparrow");
		
		System.out.println(birds);
		
		System.out.println("Contains \"hawk\": " + 
			birds.contains("hawk"));

		System.out.println("Contains \"cardinal\": " + 
                        birds.contains("cardinal"));
	}
} 
