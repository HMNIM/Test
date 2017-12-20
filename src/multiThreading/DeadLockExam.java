package multiThreading;

public class DeadLockExam {

	public static void main(String[] args) {
		String test1 = "ONE";
		String test2 = "TWO";
		Thread t = new Thread()
		{
			public void run()
			{
				synchronized (test1) {
					System.out.println("Thread1 : lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				synchronized (test2) {
					System.out.println("Thread2 : lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized (test1) {
					
					System.out.println("Thread1 first: lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				synchronized (test2) {
					System.out.println("Thread2 second : lock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t.start();
		t1.start();
	}

}
