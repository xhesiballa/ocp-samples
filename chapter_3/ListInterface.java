import java.util.*;

/*
* void add(E element)
* void add(int index, E element)
* E get(int index)
* indexOf(Object o)
* lastIndexOf(Object o)
* void remove(Object)
* E set(int index, E e)
*/

public class ListInterface {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list);
		
		list.add("NY");
		System.out.println(list);
		
		list.add(0, "SD");
		System.out.println(list);
		
		System.out.println(list.get(1));

		System.out.println(list.indexOf("SD"));
		System.out.println(list.indexOf("LA"));

		list.add("SD");
		System.out.println(list);
		System.out.println(list.lastIndexOf("SD"));
		
		list.remove(0);
		// list.remove(2); throws IndexOutOfBoundException
		System.out.println(list);

		System.out.println(list.set(1, "LA"));
		System.out.println(list);
	}
}
