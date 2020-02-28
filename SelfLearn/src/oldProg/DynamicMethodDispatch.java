package oldProg;
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		One o= new One();
		Two t= new Two();
		One a;
		a=o;
		a.mOne();					// it will print one 11111111
		a=t;
		a.mOne();					// it will print tow 22222222
	}

}
class One{
	public void mOne() {
		System.out.println("one 111111111111");
	}
}

class Two extends One {
	public void mOne() {
		System.out.println("Two 2222222222222");
	}
}