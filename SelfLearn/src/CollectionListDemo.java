import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionListDemo {
	

	public static void main(String[] args) {
		
		//Set <Integer> s = new HashSet<>();		// HashSet will return the data according to the hash value reference nearest value
		
		/*System.out.println(s.add(44));
		System.out.println(s.add(32));
		System.out.println(s.add(44));
		System.out.println(s.add(323));
		System.out.println(s.add(932));*/
		
		/*for ( i : s) {
			System.out.println(i);
		}*/
		
			List l = new ArrayList<>();
			System.out.println(l.add(7));
			System.out.println(l.add(3));
			System.out.println(l.add(2));
			System.out.println(l.add(9));
			System.out.println(l.add(2));
			System.out.println(l.add(5));
			//l.removeAll(l);
			l.add(123);
			l.add(122);
			l.add(123);
			System.out.println(l);
			System.out.println(l);
			Set s = new TreeSet<>(l);
			//l.addAll(s);
			System.out.println(s);
			
		
			
			Map<String, String> m = new LinkedHashMap();
			m.put("Sonu", "8527924610");
			m.put("Monu", "8002027597");
			m.put("Somu", "7838589833");
			m.put("Sonu", "7053674403");
			
			
		//	m.entrySet().stream().map(a,b -> System.out.println(a + "" + b));
			
			
			System.out.println(m);
			System.out.println(m.get("Sonu"));
			Set <String> val =  m.keySet();
		//	val.forEach(System.out::println);
			
			/*for (String v : val) {
				System.out.println(v + "'s Mobile Number : "+ m.get(v));
			}*/
			
	}
}
