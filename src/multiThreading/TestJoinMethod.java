package multiThreading;

public class TestJoinMethod extends Thread {

	/*public void run()
	{
		System.out.println("Running");
	}*/
	public static void main(String[] args) {
		
		TestJoinMethod t1 = new TestJoinMethod();
		TestJoinMethod t2 = new TestJoinMethod();
		System.out.println(" Name is " +t1.getName());
		System.out.println(" Name is " +t2.getName());
		System.out.println(" Id is " +t1.getId());
		t1.start();
		t2.start();
		t1.setName("Haritha");
	
		System.out.println("After adding name " +t1.getName());
	
	}

}
