package oldProg;
public class AbstrachDemoPhone {
	public static void main(String[] args) {
		Phone p =new iPhone();
		Phone p1 = new OnePlus();
		show(p);
		show(p1);
	}
	public static void show(Phone obj) {
		obj.configShow();
	}
}

abstract class Phone {							// Abstract Class
	public abstract void configShow();			// Abstract Method - declare the method
}

class iPhone extends Phone{						// Concrete Class - Defining the method
	public void configShow() {
		System.out.println("IOS-13.V, 128 GB");
	}
}
class OnePlus extends Phone{					// Concrete Class - Defining the method
	public void configShow() {
		System.out.println("Android-Latest, 264 GB");
	}
}