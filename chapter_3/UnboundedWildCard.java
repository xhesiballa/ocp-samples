import java.util.List;
import java.util.ArrayList;

/*
*  List<Object> list = new ArrayList<String>();  // does not compile
*
* Using wild cards allows us specify an uknow generic type
*
* List<?> list = new ArrayList<String>() //compiles
*/


public class UnboundedWildCard {
	
	public static void printList(List<?> list){
		for(Object o  : list){
			System.out.println(o);
		}
	} 

	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("Lion");
		list.add("Seal");
		list.add("Elephant");

		printList(list);
	}

}
