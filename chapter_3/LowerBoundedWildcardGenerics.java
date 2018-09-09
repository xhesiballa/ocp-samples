import java.util.List;
import java.util.ArrayList;

/*
* Upperbounded wildcards are not immutable
*/

public class LowerBoundedWildcardGenerics {
	
	public static void main(String[] args){
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<Object>(strings);
		addSound(strings);
		addSound(objects);
		System.out.println(strings);
		System.out.println(objects);
	}

	public static void addSound(List<? super String> list) {
		list.add("quack");
	}
}
