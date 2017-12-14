package multiThreading;

<<<<<<< HEAD
public class TestCallRun {
	public void run()
	{
		System.out.println("Running");
=======
public class TestCallRun extends Thread {

	public void run()
	{
		System.out.println("running");
>>>>>>> 4a58bdf16cd3657476966618bd826cf8ddd8a475
	}
	public static void main(String[] args) {
		
		TestCallRun t = new TestCallRun();
		t.run();
<<<<<<< HEAD
		
		
=======
	
		

>>>>>>> 4a58bdf16cd3657476966618bd826cf8ddd8a475
	}

}
