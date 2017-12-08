package multiThreading;

public class CountRunnable implements Runnable {
	
	Thread mythread;
	CountRunnable()
	{
		System.out.println("Thread is running in runnable interface");
		mythread = new Thread(this, "My runnable interface Thread" + mythread);
		mythread.start();
	}
	
	public void run()
	{
		
		for(int i = 0; i<7; i++)
		{
			System.out.println(" Printing thread" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  System.out.println("mythread run is over" );
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		CountRunnable c = new CountRunnable();
		while(c.mythread.isAlive())
		{
			//System.out.println(" Main thread printing");
			Thread.sleep(1500);
		}
	}

}
