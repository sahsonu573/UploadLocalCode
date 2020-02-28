package Thread;
public class LambdaThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {						// Lambda Expression
			for (int i =0; i<5; i++) {
				System.out.println("Aaaa");
				try {
					Thread.sleep(500);
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
					Thread.sleep(500);
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
		}
}