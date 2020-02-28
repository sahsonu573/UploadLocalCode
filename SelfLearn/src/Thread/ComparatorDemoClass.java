package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


/*public class ComparatorDemoClass {
	public static void main(String[] args) {
		List <Integer> i = new ArrayList<>();
		i.add(16);
		i.add(12);
		i.add(78);
		i.add(91);

		Collections.sort(i, (i1, i2) ->{
			return i1%10>i2%10?1:i1%10<i2%10?-1:0;
		});
		i.forEach(System.out::println);
	}
}*/

public class ComparatorDemoClass {
	public static void main(String[] args) {
		List <Integer> i = new LinkedList<>();
		i.add(16);
		i.add(12);
		i.add(78);
		i.add(91);
		Comparator com = new Demo();
		Collections.sort(i, com);
		
		i.forEach(System.out::println);
	}
}

class Demo implements Comparator<Integer>{
@Override
public int compare(Integer i1, Integer i2) {
	if (i1<i2)
		return 1;
	return -1;
}


}