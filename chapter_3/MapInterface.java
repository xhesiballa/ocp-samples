import java.util.Map;
import java.util.HashMap;

public class MapInterface {
	

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		System.out.println("Is empty: " + map.isEmpty());
		
		System.out.println(map.put("species", "sparrow"));
		System.out.println(map.put("flight", "no"));
		System.out.println(map.put("flight", "yes"));
	
		System.out.println(map);
		
		System.out.println("Is empty: " + map.isEmpty());
		System.out.println("Size: " + map.size());

		System.out.println("Contains key(species): " + 
			map.containsKey("species"));

		System.out.println(map.keySet());
                System.out.println(map.values());

		System.out.println(map.get("flight"));
		System.out.println(map.remove("species"));	
		System.out.println(map);
		
		map.clear();
		System.out.println("Is empty: " + map.isEmpty());
		System.out.println("Size: " + map.size());	
	}
}
