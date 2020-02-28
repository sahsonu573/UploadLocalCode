package oldProg;
public class ConstructorTest {

	public static void main(String[] args) {
		TestConstructor ref = new TestConstructor(5);
		
	}

}
class TestConstructor{

	public TestConstructor (){
		System.out.println("Default Constructor");
	}
	/*public TestConstructor (int parameter1){
		System.out.println("parameteriez Constructor - Int");
		System.out.println(parameter1);
	}*/
	public TestConstructor (int parameter1, String Name){
		System.out.println("parameteriez Constructor - Int & String");
		System.out.println(parameter1 +" : " + Name);
	}
	public TestConstructor (double parameter1){
		System.out.println("parameteriez Constructor - Double");
		System.out.println(parameter1);
	}
}
