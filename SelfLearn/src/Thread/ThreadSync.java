package Thread;

public class ThreadSync {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		Thread t1 = new Thread(() -> { 
		for(int i=0; i<1000;i++) {
			c.increment();
		}
		}, "Thread T1");
		Thread t2 = new Thread(() -> { 
			for(int i=0; i<1000;i++) {
				c.increment();
			}
			}, "Thread T2");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("count "+c.count);
	}
}

class Counter{
	int count;
	public synchronized void increment() {				// make method as sync -> thread sync 
		count++;
	}
}