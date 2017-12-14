package multiThreading;

public class ThreadGroupDemo implements Runnable {

	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());  
	}
	public static void main(String[] args) {
		ThreadGroupDemo demo = new ThreadGroupDemo();
		ThreadGroup tg = new ThreadGroup("Main group");
		Thread t1 = new Thread(tg,  demo,"one");
		Thread t2 = new Thread(tg, demo, "two");
		Thread t3 = new Thread(tg, demo, "Three");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(" group name of thread is" +tg.getName());
		tg.list();
		
	}

}
