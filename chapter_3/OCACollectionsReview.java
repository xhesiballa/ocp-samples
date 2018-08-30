
import java.util.*;
import java.lang.UnsupportedOperationException;

/*
* 		Arrays.asList(array[])
*		Arrays.toString(array[])
*		List.toArray()
*		Arrays.sort(array)
*		Collections.sort(List)
*/

public class OCACollectionsReview{
	
	public static void main(String[] args){
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
	}

	public static void case1(){
		System.out.println("");
		System.out.println("------- Case 1 ------");
		
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(new Integer(3));
		list.add(new Integer(5));

		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		list.remove(new Integer(5));
		System.out.println(list);
	}

	public static void case2(){
		System.out.println("");
		System.out.println("------- Case 2 ------");
		
		List<Integer> list = Arrays.asList(3, 1, 5, 7);
		System.out.println(list);

		Integer[] array = (Integer[]) list.toArray();
		System.out.println(Arrays.toString(array));

		array[1] = new Integer(6);

		System.out.println(list);
		System.out.println(Arrays.toString(array));
		
	}

	public static void case3(){
		System.out.println("");
		System.out.println("------- Case 3 ------");
		
		String[] array = {"gerbil", "mouse"};
		System.out.println(Arrays.toString(array));
		
		//array-backed list
		List<String> list = Arrays.asList(array);
		System.out.println(list);

		array[0] = "new";

		//the list gets update too
		System.out.println(Arrays.toString(array));
		System.out.println(list);

		try{
			//does not support resizing
			list.remove(1);
		}catch(UnsupportedOperationException exception){
			exception.printStackTrace();
		}
	}

	//Sorting and searching array
	public static void case4(){
		System.out.println("");
		System.out.println("------- Case 4 ------");

		int[] numbers = {5, 9, 7, 1};
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		//the array needs to be sorted
		System.out.println(Arrays.binarySearch(numbers, 9));
		System.out.println(Arrays.binarySearch(numbers, 4));

	}

	//Sorting and searching array
	public static void case5(){
		System.out.println("");
		System.out.println("------- Case 5 ------");

		List<Integer> numbers = Arrays.asList(5, 9, 7, 1);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);

		//the array needs to be sorted
		System.out.println(Collections.binarySearch(numbers, 9));
		System.out.println(Collections.binarySearch(numbers, 4));

	}

	//Sorting and searching array
	public static void case6(){
		System.out.println("");
		System.out.println("------- Case 6 ------");

		Dogs dogs = new Dogs();
		dogs.names.add("puddle");
		dogs.names.add("husky");

		System.out.println(dogs);

	}

	static class Dogs{

		public List<String> names;

		public Dogs(){
			names = new ArrayList<>(); //matches instance variable
		}

		public void copyNames(){
			ArrayList<String> copyOfNames;
			copyOfNames = new ArrayList<>();//matches local declaration
		}

		@Override
		public String toString(){
			return names.toString();
		}

	}
}
