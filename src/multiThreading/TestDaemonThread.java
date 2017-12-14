package multiThreading;

public class TestDaemonThread extends Thread{

	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this is daemon thread");
		}
		else
		{
			System.out.println("usr thread work");
		}
	}
	public static void main(String[] args) {
		
		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 = new TestDaemonThread();
		TestDaemonThread t3 = new TestDaemonThread();
		TestDaemonThread t4 = new TestDaemonThread();
		
		t1.setDaemon(true);
		
		t1.start();
		
		t2.start();
		
		t3.setDaemon(true);
		
		t3.start();
		
		t4.start();
	 
	}

}
