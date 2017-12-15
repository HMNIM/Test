package multiThreading;

public class MultipleThreads  {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run()
			{
				System.out.println(" first thread running");
			}
		};
		Thread t2 = new Thread(){
			public void run()
			{
				System.out.println("Second thread running");
			}
		};
		t1.start();
		t2.start();
	
	}
}
