package Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		One o = new One();
		Two t = new Two();
		// we use start method to trigger the thread - it will call run method of thread.
		o.start();
		t.start();



	}

}
class One extends Thread {
	// run is the internal method of thread; so we should override run method
	public void run () {
		try {
			for (int i =0; i<5; i++){
				System.out.println("Hi....");
				Thread.sleep(500);
			}
		}
		catch(Exception e) {}
	}
}
class Two extends Thread {
	public void run (){
		try {
			for (int j =0; j<5; j++){
				System.out.println("Hello");
				Thread.sleep(500);
			}
		}
		catch (Exception e) {}

	}}