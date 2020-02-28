package Thread;

public class ThreadNamePriority {

	public static void main(String[] args) throws InterruptedException  {
		Thread t1 = new Thread(() -> {
				for (int i=0; i<5; i++) {
					System.out.println("AAAAAA" + Thread.currentThread().getPriority());
					try {Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}, "Thread T1");
		// t1.setPriority(7);
		// or 
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(() ->  {
			for (int i=0; i<5; i++) {
				System.out.println("BBBBB");
				try {Thread.sleep(200);} catch (InterruptedException e) {}
			}
		}, "Thread T2");
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.print (t1.getName() + " : Priority ");
		System.out.println(t1.getPriority());
		System.out.print(t2.getName() + " : Priority ");
		System.out.print(t2.getPriority());
		System.out.println();
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}
