package Thread;

public class RunnableDemo {

	public static void main(String[] args) {
	Runnable obj1= new Aaa();
	Runnable obj2= new Bbb();
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t2.start();	}

}
class Aaa implements Runnable {
	@Override
	public void run() {
		for (int i =0; i<5; i++) {
			System.out.println("Aaaa");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Bbb implements Runnable {
	@Override
	public void run () {
		for(int j =0;j<5; j++) {
			System.out.println("Bbbb");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
