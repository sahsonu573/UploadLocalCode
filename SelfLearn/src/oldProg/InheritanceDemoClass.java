package oldProg;
import static java.lang.System.out;
public class InheritanceDemoClass {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.num1=5;
		m.num2=3;
		out.println(m.result);		// before calling the method the result value will be 0

		m.add();
		out.println(m.result);
		m.sub();
		out.println(m.result);
		m.mul();
		out.println(m.result);
		Addition s = new Multiplication(2, 5,9);

	}
	static {
		System.out.println("hello will print first");
	}

}

class Addition{
	int num1, num2, result=0;
	public Addition(){
		System.out.println("Add only");
	}
	public Addition(int i){
		System.out.println("Add only with int");
	}
	public void add() {
		result=num1+num2;
	}
}
class Subtraction extends Addition{				// Single Level Inheritance
	public Subtraction(){
												// Call default constructor of super class
		System.out.println("sub only");			// super method will be invoked always for constructor
	}
	public Subtraction(int i, int b){
		System.out.println("sub only with int");
	}
	public void sub() {
		result=num1-num2;
	}
}
class Multiplication extends Subtraction{		// Multi-Level Inheritance
	public Multiplication(){
		System.out.println("mul only");
	}
	public Multiplication(int x, int y, int z){
		System.out.println("mul only with int");
	}

	public void mul() {
		result= num1*num2;
	}
}