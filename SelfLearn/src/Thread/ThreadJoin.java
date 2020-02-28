package Thread;
public class ThreadJoin {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() -> {						// Lambda Expression
			for (int i =0; i<5; i++) {
				System.out.println("Aaaa");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
				);
		Thread t2 = new Thread(() ->{						// Lambda Expression
			for(int j =0;j<5; j++) {
				System.out.println("Bbbb");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();	
		// System.out.println("Executed All");			// Executing just after the thread trigger this line will exceite by main thread.
		// To execute any line post thread completion we should use join() methods
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Executed All");
		}
}