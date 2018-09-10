import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.NavigableSet;

public class SetInterface {
	
	public static void main(String[] args) {
			
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(66));
		System.out.println(set.add(10));
		System.out.println(set.add(66));
		System.out.println(set.add(8));

		System.out.println(set);

		Set<Integer> treeSet = new TreeSet<>();

		System.out.println(treeSet.add(66));
                System.out.println(treeSet.add(10));
                System.out.println(treeSet.add(66));
                System.out.println(treeSet.add(8));

                System.out.println(treeSet); 

		//NavigableSet Interface
		NavigableSet<Integer> navSet = (NavigableSet<Integer>) treeSet;
		System.out.println(navSet.lower(15));
		System.out.println(navSet.lower(8));

		System.out.println(navSet.floor(8));
		System.out.println(navSet.floor(7));

		System.out.println(navSet.higher(15));
		System.out.println(navSet.higher(66));

		System.out.println(navSet.ceiling(66));
		
	}
}
