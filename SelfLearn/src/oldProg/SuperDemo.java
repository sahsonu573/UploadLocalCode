package oldProg;
public class SuperDemo {

	public static void main(String[] args) {
		A obj = new B();
		//obj.show();
		obj.abc();
	}

}
// using Super keyword to access parent class variable from the child class even though child class overridden the value of i
/*class A {
	int i=5;
	public void show() {
		System.out.println(i);
	}
}
class B extends A{
	int i = 4;
	public void show() {
		System.out.println(super.i);
	}
}*/

class A{
	int a=5;
	public void abc() {
		System.out.println("OneM");
	}
}
class B extends A {
	int a=3;
	public void abc() {
		super.abc(); 						// Calling Super class method using super keyword.
		System.out.println("TwoM "+ super.a);
	}
}