package multiThreading;

public class SingletaskMultipleThreads extends Thread{

	public void run()
	{
		System.out.println(" Running multiple Threads by single task");
	}
	public static void main(String[] args) {
		SingletaskMultipleThreads s1 = new SingletaskMultipleThreads();
		SingletaskMultipleThreads s2 = new SingletaskMultipleThreads();
		SingletaskMultipleThreads s3 = new SingletaskMultipleThreads();
		s1.start();
		s2.start();
		s3.start();
		
	}

}
