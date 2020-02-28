 package Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> i = new ArrayList<>();
		i.add(32);
		i.add(21);
		i.add(18);
		i.add(76);
		
		Collections.sort(i,( o1,  o2) -> {
			/*if (o1%10>02%10) 
			return 1;
		return -1;*/
	 return o1%10>o2%10?1:-1;
	});
		// Collections.reverse(i);
		i.forEach(System.out::println);
	}

}

