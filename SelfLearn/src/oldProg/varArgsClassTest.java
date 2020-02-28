package oldProg;
public class varArgsClassTest {

	 static public void main(String ... args) { // we can write the main class in multiple ways
		demovarArgs d = new demovarArgs();
		//d.argu(2);
		d.argu(4,5,5,56,543);

	}
	

}
 class demovarArgs {
	public void argu(int a) {
		System.out.println(a + " 1st method");
	}
	public void argu(int a, int b) {
		System.out.println(a + " 2nd method");
		System.out.println(b + " 2nd method");
	}
	
	public void argu(int ...a) {  // var args - using array
		for (int i : a) {
			System.out.println(i + " 3rd method");
		}
	}
}
