package multiThreading;

public class TestCallRun {
	public void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args) {
		
		TestCallRun t = new TestCallRun();
		t.run();
		
		
	}

}
