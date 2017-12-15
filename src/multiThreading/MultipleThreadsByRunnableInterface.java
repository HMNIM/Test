package multiThreading;

public class MultipleThreadsByRunnableInterface {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" First thread ");
			}
		};
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" Second Thread");
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
