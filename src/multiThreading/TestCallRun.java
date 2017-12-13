package multiThreading;

public class TestCallRun extends Thread {

	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[] args) {
		
		TestCallRun t = new TestCallRun();
		t.run();
	
		

	}

}
