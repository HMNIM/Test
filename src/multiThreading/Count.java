package multiThreading;

public class Count implements Runnable {
	
	public void run()
	{
		System.out.println(" my thread is running through Runnable Interface");
	}
	
	public static void main(String args[])
	{
		Count c = new Count();
		Thread t = new Thread(c);
		t.start();
		
	}

/*public class Count extends Thread {
	
	public void run()
	{
		System.out.println(" my thread is running through Runnable Interface");
	}
	
	public static void main(String args[])
	{
		Count c = new Count();
		Thread t = new Thread(c);
		t.start();
		
	}*/

}
