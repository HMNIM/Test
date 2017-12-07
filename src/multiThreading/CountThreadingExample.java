package multiThreading;

public class CountThreadingExample extends Thread{
	
	CountThreadingExample()
	{   
		
		System.out.println("My thread is created");
		start();
	}
	public void run()
	{
		try {
		for(int i = 0; i <10 ; i++)
		{
			System.out.println("Printing the count" +i);
			
				Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
			
				System.out.println(" Thread interupted ");
			}
		 System.out.println("My thread run is over" );
		
	}
	
	public static void main(String args[])
	{
		CountThreadingExample c = new CountThreadingExample();
		try {
				while(c.isAlive())
			{
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			} 
		}catch (InterruptedException e) {
			System.out.println("my thread interrupted");
				}
		 System.out.println("My main thread run is over" );
			
	}

	

}
