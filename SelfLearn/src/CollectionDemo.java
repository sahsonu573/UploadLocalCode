import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(2);
		c.add(44);
		
		System.out.println(c.size());
		
		ArrayList l = new ArrayList();
		l.add(32);
		
		System.out.println(l.size());
		
		Vector v = new Vector();
		v.add(2);
		v.add(3);
		v.add(222);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("====================");
		v.forEach(System.out::println);
	}

}
