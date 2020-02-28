import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class IterateSet {
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		map.put("Sonu", "8527924610");
		map.put("Monu", "8002027597");
		map.put("Papa", "9934877389");

		System.out.println(map);
		// Iterate the map data
		 //1. Using advance for loop
		System.out.println("==========Advance For Loop==========");
		Set<String> v = map.keySet();
		for(String val : v) {
			System.out.println(val + "'s Mobile - " + map.get(val));
		}
		System.out.println("========Iterator============");
		// 2. Using Iterator
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==================Iterate using Entry Set===================");
		// 3. Using the Entry Set
		Set<Map.Entry<String, String>> ent = map.entrySet();
		for(Map.Entry<String, String> e : ent) {
			System.out.println(e.getKey() + " : "+e.getValue());
			// e.setValue("Hello");
		}
		System.out.println("==================Entry Set iteration completed===================");
		// Java 8
		Stream.of(map.keySet()).forEach(System.out::println);
		map.keySet().iterator().forEachRemaining(System.out::println);
		// to get the values
		System.out.println(map.values());
		
		Stream.of(map.values()).forEach(System.out::println);
	}

}
