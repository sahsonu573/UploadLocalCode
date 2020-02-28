package oldProg;
public class MakerInstanceDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		if (d instanceof MarkerIf) {
			d.show();
		}
		else 
			System.out.println("No permission");

	}

}

class Demo implements MarkerIf{
	public void show() {
		System.out.println("hello - with permission");
	}
}
