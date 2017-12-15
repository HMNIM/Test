package multiThreading;

public class SingleTaskMultipleThreadsInterface implements Runnable{

	public void run()
	{
		System.out.println("Running multple threads by single task by runnable");
	}
	public static void main(String[] args) {
		SingleTaskMultipleThreadsInterface s = new SingleTaskMultipleThreadsInterface();
		Thread t = new Thread(s);
		t.start();
		Thread t2 = new Thread(new SingleTaskMultipleThreadsInterface());
		t2.start();
		Thread t3 = new Thread(new SingleTaskMultipleThreadsInterface());
		t3.start();
	}

}
