package multiThreading;

public class TestSleepThread extends Thread {
	
	public void run()
	{
		for(int i =0; i< 5; i++)
		{
			System.out.println(" Sleeping thread" +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		TestSleepThread t = new TestSleepThread();
		t.start();
	
	}

}
