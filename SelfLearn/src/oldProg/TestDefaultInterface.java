package oldProg;
public class TestDefaultInterface {

	public static void main(String[] args) {
		TestDefault2 c = new TestDefault2();
		c.show();
		Interface4.display();					// we can call static method of interface as wells
	}

}
class TestDefault implements Interface2, Interface3{
	public void show() {
		System.out.println("Show from Class - Class method is more powerful");
	}

}
class TestDefault2 extends TestDefault implements Interface2{
	// Third Rules in Java

}
