import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ResverseNumber {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(32);
		num.add(87);
		num.add(97);
		num.forEach(System.out::println);
		System.out.println("=============Shorting==========");
		Collections.sort(num);
		num.forEach(System.out::println);
		System.out.println("============Reverese============");
		Collections.reverse(num);
		num.forEach(System.out::println);
		
		TreeSet <Integer>treereverse = new TreeSet<Integer>();
		Set <Integer> numSet = new HashSet<>();
		numSet.add(12);
		numSet.add(32);
		numSet.add(87);
		numSet.add(97);
		numSet.forEach(System.out::println);
		System.out.println("=============Shorting==========");
	//	Collections.sort(numSet);
		
		
		numSet.forEach(System.out::println);
	}

}
