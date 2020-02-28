package oldProg;
public class AbstractDemo {

	public static void main(String[] args) {
		ResearchOne r1= new ResearchThree();
		r1.law1();
		r1.law2();
		r1.law3();
	}

}
abstract class ResearchOne{							// Abstract class
	public void law1() {
		System.out.println("law 1...");
	}
	public abstract void law2();					// Abstract methods
	public abstract void law3();
}
abstract class ResearchTwo extends ResearchOne {	// Abstract class
	public void law2() {
		System.out.println("law 2...");
	}
}
class ResearchThree extends ResearchTwo {		// Concrete class
	public void law3() {
		System.out.println("law 3...");
	}
}