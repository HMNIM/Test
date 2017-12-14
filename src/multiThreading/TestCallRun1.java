package multiThreading;

public class TestCallRun1 extends Thread {
	public void run()
	{
		for(int i = 1; i < 7; i++)
		{
			System.out.println("" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestCallRun1 t = new TestCallRun1();
		t.run();// in multiThreading, if u call run method in main 
		// method will just treated as normal object
	
	}

}
