package oldProg;
public class InterfaceDemoClass {
	public static void main(String[] args) {
		/*RegularClass rc= new RegularClass();
		rc.show();
		rc.display();
		// to restrict display method create interface obj reference
		InterfaceOne rc1= new RegularClass();
		rc1.show();
		// rc1.display(); 			// ERROR - as display method is there in interface
*/	
	// Creating the object of Interface without creating any extra class
		/*InterfaceOne interfaceObj = new InterfaceOne() {
			public void show() {
				System.out.println("Hello without creating class");
			}
		};*/
		// in Java 8 We can write the above set of code in very simple manner using lambda
		InterfaceOne interfaceObj = () -> System.out.println("Hello without creating class"); // () is used in case if we pass anything.
		interfaceObj.show();
	}
}

/*class RegularClass implements InterfaceOne{

	@Override
	public void show() {

		System.out.println("Hello from Show Method");
	}
	public void display() {

		System.out.println("Hello from Display Method");
	}
}*/