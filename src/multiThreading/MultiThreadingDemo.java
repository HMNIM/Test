package multiThreading;

public class MultiThreadingDemo extends Thread {
	
	public void run()
	{
		System.out.println("Thread is in running state");
		
	}
	public static void main(String[] args) {
		
		MultiThreadingDemo m = new MultiThreadingDemo();
		m.start();
		m.getName();
		m.isAlive();
	}

}
