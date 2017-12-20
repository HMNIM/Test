package multiThreading;

public class DeadLockExample {
	public static void main(String args[])
	{

	 String test= "one";
	 String test1= "two";
	  Thread t = new Thread(){
	public void run()
	{
		synchronized (test) 
		{
			System.out.println("Thread1 : lock");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized (test1) {
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
	Thread t2 = new Thread()
	{
		public void run()
		{
			synchronized (test) {
				System.out.println("Thread t1 : lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			synchronized (test1) {
				
				System.out.println("Thread t2 : lock");
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
	t2.start();
}
}