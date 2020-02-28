package oldProg;
public class FinalKwDemo {

	public static void main(String[] args) {
		/*final int i;							// can't change the value of any variable once we use final; it can't be changed.
		i=2;
		System.out.println(i);
		 */
		Xyz obj = new Xyz();
		obj.mOne();
	}

}

// final class Abc {
class Abc {
	// final	public void mOne() {
	public void mOne() {
		System.out.println("one");
	}
}
class Xyz extends Abc {					// ERROR---- can't inherit the final class
	public void mOne() {				// ERROR---- because we can't override the final method

		System.out.println("two");
	}
}